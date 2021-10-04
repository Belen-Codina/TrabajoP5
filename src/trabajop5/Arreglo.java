/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop5;



/**
 *
 * @author Escritorio
 */
public class Arreglo {
 int[] arreglo;
 int mayor;

    public Arreglo(int[] arreglo) {
        this.arreglo = arreglo;
    } 

    public int getMayor() {
        return mayor;
    }
    
 
 
    
    static void sumarLista(int[] arreglo){ 
           int  suma=0;
         for (int i = 0; i <arreglo.length ; i++) {
          suma+=arreglo[i];
             }
        int promedio= suma/ arreglo.length;
        
         System.out.println("La suma del arreglo: "+ suma +"\n Promedio: "+promedio);}
    
            
     
    static int buscarMayor(int[][] arreglo){ 
          int mayor=0;
          
          for (int[] fila: arreglo){
              for(int x=0; x<fila.length; x++){
                  if (mayor<fila[x]){
                      mayor=fila[x];
                  }
                  
              }
}
         return mayor;

}




static int cuentaVocales(String  string){ 
      int  cantVocales=0;
      
      char[] x= string.toCharArray();
      
            for (int i = 0; i <x.length ; i++) {
      
            switch (x[i]){ 

  case 'a': 
  case 'A':  cantVocales++ ;
      break;
  case 'e': 
  case 'E':  cantVocales++; 
     break;
  case 'i':  
     case 'I':  cantVocales++;
 break;
  case 'o':  
  case 'O':  cantVocales++; 
   break;
  case 'u': 
   case 'U':  cantVocales++; 

   }
              
}
              return cantVocales;
}
 static int cuentaCaracter(String string, char c){ 
     int cuenta=0;
     for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i)==c){
            cuenta++;
        }
          }
     return cuenta;
 }

}




        
    
   

