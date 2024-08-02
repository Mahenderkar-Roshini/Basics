import java.util.Scanner;
public class InstanceVariable {
    int id = 101;
    public static void main(String[] args) {
        //syntax: classname variable = new constructor/classname();
        InstanceVariable instancevariable = new InstanceVariable();
        System.out.println(instancevariable.id);

    }
}