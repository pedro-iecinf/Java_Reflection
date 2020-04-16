import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionInfo {

    public static Person person;

    public static Person initialize(){
       return person = new Person("Artour", "Garaev", "Ruso");
    }

    public static String getClassName(){

        initialize();
        return person.getClass().getName();
    }

    public static void showAttributes(){

        initialize();
        System.out.println("\nProperties / Attributes");
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\nName: " + field.getName());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("Return Type: " + field.getType());
        }

    }

    public static void showMethods(){

        initialize();
        System.out.println("\nMETHODS");
        Method[] methods = person.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("\nName: "+method.getName());
            System.out.println("Return Type: "+method.getReturnType());
            System.out.println("Modifier: "+Modifier.toString(method.getModifiers()));
            System.out.println("PARAMS");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Name: "+parameter.getName());
                System.out.println("Type: "+parameter.getType());
            }

        }
    }

    public static void callMethodGetName()  {

        initialize();
        try {
            Method method = person.getClass().getMethod("getName");
            String name = String.valueOf(method.invoke(person));
            System.out.println("NAME : " + name);
        }
        catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void callMethodSetName(){

        initialize();

        try {
            Method method = person.getClass().getMethod("setName", String.class, String.class);
            method.invoke(person, "Artour", "Diego");
            System.out.println("NAME : " + person.getName());
        }
        catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    //With Generic

    public static <T> void showDataAnyObject(T object) throws InvocationTargetException, IllegalAccessException {
        System.out.println("\n" + object.getClass().getName() + "INFO");
        Method[] methods = object.getClass().getDeclaredMethods();
        List<Method> listMethods = new ArrayList<Method>();
        listMethods.addAll(Arrays.asList(methods));
        listMethods = listMethods.stream().filter(p -> p.getName().contains("get")).collect(Collectors.toList());

        for (Method m: listMethods) {
            System.out.println(m.getName().substring(3) + " : " + m.invoke(object));
        }

    }
}
