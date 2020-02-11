import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProgram {
    public static void main(String args[]) {

        Person person = new Person(
                "Ryan",30,"male",
                new String[] {"being a hardarse", "agile", "ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);



    }
}
