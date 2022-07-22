package com.lgy.demo30;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class HK01{
    public static void main(String[] args)throws Exception {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTest = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTest, "content of rewrite");
        System.out.println(privateTest.getName());

        Method getName = privateTestClass.getMethod("getName");
        System.out.println(getName.invoke(privateTest));

        Class<File> fileClass = File.class;
        Constructor<?>[] constructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<File> declaredConstructor = fileClass.getDeclaredConstructor(String.class);
        File file = declaredConstructor.newInstance("d:\\mynew.txt");
        file.createNewFile();

//        List list = new LinkedList();
//        list.add("111");
    }
}

class PrivateTest {
    private String name = "prepare for content of replace";

    public String getName() {
        return name;
    }
}
