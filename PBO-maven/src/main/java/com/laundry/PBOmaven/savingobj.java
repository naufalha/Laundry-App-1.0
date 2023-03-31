package com.laundry.PBOmaven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Permissions;
public class savingobj {
public savingobj(String namaobjek,String namafile) throws Exception{
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(namafile));

    }
}