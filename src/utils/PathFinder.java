/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * @author PYTHON1
 */
public class PathFinder {
  /*  private static String filepath;
    
    public static String getImage(){
         System.out.println(filepath);
       return filepath; 
       
    }
     public String setImage(String p){
           PathFinder.filepath = p;    
       return p;
     
     }*/
    private static long c;
    private static Object obj;
    private static String str;
    //for Long
   public static long getCount(){
       return c;
   }
   public static void setCount(long p){
       PathFinder.c = p;
     }
  //for Object
   public static Object getCounter(){
       return obj;
   }
    public static void setCounter(Object selected) {
        PathFinder.obj = selected;
    }
    public static String getnum(){
        return str;
    }
    public static void setnum(String st){
        PathFinder.str = st;
    }
}

    

