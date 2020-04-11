/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Thole
 */
public class Copy {

    public static void main(String[] args) {
        try{
            //lokasi file untuk di baca
            FileReader fr = new FileReader("e:/copy.txt");
            BufferedReader br = new BufferedReader(fr);
            //lokasi file untuk di tiru
            FileWriter fw = new FileWriter("e:/paste.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            String line;
            line=br.readLine();
            //proses
            while(line !=null){
                try{
                    bf.write(line,0,line.length());
                    bf.newLine();
                    line=br.readLine();
                    System.out.println("data berhasil di copy");
                } catch(Exception e){
                    System.out.println("data gagal di copy");
            }      
        }
        //menutup    
        br.close();
        bf.close();
        } catch(Exception e){
        e.printStackTrace();
        }
    }
}
