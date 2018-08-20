/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lndavis6
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[80];
        int [] scores = new int[80];
        
        readPlayernames(names, scores, args[0]);
        
        System.out.println(names[0] + " " + scores[0]);
        System.out.println(names[1] + " " + scores[1]);
        System.out.println(names[2] + " " + scores[2]);
        System.out.println(names[3] + " " + scores[3]);
        System.out.println(names[4] + " " + scores[4]);
        
    }
    /**
     * 
     * @param names -  names of players
     * @param scores - scores of players
     * @param filename - name of the file that we utilize 
     */
    public static void readPlayernames(String[] names, int[] scores, String filename){
            
            
            
        
            try {
            // TODO code application logic here
            Scanner reader = new Scanner(new File(filename));
            
            int counter = 0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(" ");
                names[counter] = line[0];
                scores[counter] = Integer.parseInt(line[1]);
                counter++;
            }
            
            //Anything that depends on the 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File was not found in main method.");
        }
}
}
