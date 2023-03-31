package com.laundry.PBOmaven;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Saver {

    private static Set<String> PRIMITIVES = new HashSet<String>();
    static{
        PRIMITIVES.add("int");

        PRIMITIVES.add("float");

        PRIMITIVES.add("String");

        PRIMITIVES.add("double");

        PRIMITIVES.add("char");

        PRIMITIVES.add("byte");

        PRIMITIVES.add("long");
    }



    public void SaveObject(Object o) throws Exception{
        Method[] methods = o.getClass().getMethods();
        for (Method m : methods){
            if (m.getName().indexOf("get")==0){
                System.out.println(m.invoke(o));
            }
            else{
                SaveObject(m.invoke(o));
            }
        }
    }
}
