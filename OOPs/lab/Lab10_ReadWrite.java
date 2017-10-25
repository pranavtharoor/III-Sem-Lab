/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copy a file
 * @author Pranav Tharoor
 */
public class Lab10_ReadWrite {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        String path = "E:\\160911222";
        FileInputStream fi = new FileInputStream(path + "\\fileio.txt");
        FileOutputStream fo = new FileOutputStream(path + "\\fileio-out.txt");
        int c;
        do {
            c = fi.read();
            fo.write((char) c);
        } while(c != -1);
    }
}
