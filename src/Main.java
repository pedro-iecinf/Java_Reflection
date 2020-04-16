import javax.management.relation.Relation;
import java.lang.reflect.*;


public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        //Info
        System.out.println("Clase: "+ReflectionInfo.getClassName());
        ReflectionInfo.showAttributes();;
        ReflectionInfo.showMethods();

        //Llamadas
        ReflectionInfo.callMethodGetName();
        ReflectionInfo.callMethodSetName();

        /* Ejemplos aplicables */
        ReflectionInfo.showDataAnyObject(new Person("Pedro", "Aguayo","Chileno"));
        ReflectionInfo.showDataAnyObject(new Car("Pick Up Truck",4,4,2015,"Chevrolet","D-Max"));


    }
}
