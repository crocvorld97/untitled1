import javax.swing.*;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Hello
{

    public static void main( String[] args ) throws Exception
    {
        Class clazz = Test.class;
        Test test = (Test) clazz.newInstance();

        clazz.getConstructors();

        Method method = clazz.getMethod("foo");
        System.out.println(method.toString());
        method.invoke(test);

        Field field0 = clazz.getDeclaredField("field");
        field0.setAccessible(true);
        field0.set(test, 100);
        System.out.println(test);

        Package pack = clazz.getPackage();
        //System.out.println("Package: " + pack.getName() +  ";");

        int modifiers = clazz.getModifiers();
        //System.out.print(getModifiers(modifiers));
        System.out.print("class " + clazz.getSimpleName() + " ");
        System.out.print("extend " + clazz.getSuperclass().getSimpleName() + " ");
    }
}

class Test implements Serializable, Cloneable{
    private int field;
    public Test(){

    }

    public Test(Object field) { }

    @Deprecated
    protected static void method(String [] params){

    }

    public void foo(){
        System.out.println("FOO");
    }

    @Override
    public String toString(){
        return "Test{" + " field=" + field + '}';
    }

}

enum Members {Andrey, Roma, Dima};

class Person
{
    static void next(int ... a)
    {
        for (int b : a)
        {
            System.out.print(b + " ");
        }
        System.out.println("Было передано " + a.length + " аргументов");
    }

    Person(int age, String name)
    {
        this.name = name;
        this.name = name;
    }

    int age;
    String name;
    void hello()
    {
        System.out.println("Hello, my name is " + name + " , I'm " + age + " years old.");
    }
}

class class1
{
    int member;
    void printer()
    {
        System.out.println("Hello");
    }
}

class class2 extends class1
{
    double member;
    @Override void printer()
    {
        System.out.println("Hello again");
    }
}

interface Mebel
{
    boolean isBought();
    boolean isBroken();
    int getPrice();
}

class Divan implements Mebel
{
    private boolean isBroken = false;
    private boolean isBought= false;
    private int price;
    Divan(int price)
    {
        this.price = price;
    }
    public boolean isBroken()
    {
        return isBroken;

    }

    public boolean isBought()
    {
        return isBought;
    }

    public int getPrice()
    {
        return this.price;
    }
}

class Parent{
    void text(){
        System.out.println("Parent text!");
    }
}

class Child extends Parent{
    @Override
    void text()
    {
        System.out.println("Child text!");
    }
}