/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Compilador;




import jflex.exceptions.SilentExit;


public class GerarLexer {
    public static void main(String[] args) throws SilentExit {        
        String[] arg = new String[1];
        arg[0] = "C:\\Users\\Botel\\Documents\\NetBeansProjects\\Compiladores2\\src\\Compilador\\especificacao.flex";
        jflex.Main.generate(arg);
    }
    
             
}
        
    




