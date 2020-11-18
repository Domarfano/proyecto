/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Files {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        readFile accediendo = new readFile();
       
        
        accediendo.read();
       
        
        
    }
    
}

class readFile{
    
    public void read() throws FileNotFoundException {
        lista listas = new lista();
        try (FileReader input = new FileReader("C:/Users/Usuario/Desktop/Proyecto/jugadoresin.txt")) { //Direccion del archivo 
            int c = 0;
            
            while (c!=-1){
                
                c = input.read();
                
                char letra = (char)c;
                listas.insertar(letra);
                listas.mostrarLista();
             
                
                
                
            }
        }catch(IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }

    

   
    
}


class NodoLC {
    
        char dato;
        NodoLC  siguiente;
        public NodoLC (char d){
            
            dato = d;
            siguiente = this;
            
        }
    
    
    
}


class lista {
    NodoLC ultimo;
    
    public lista(){
        
        ultimo = null;
        
    }
    public boolean estaVacia(){
        
        return ultimo == null;
    }
    
    public lista insertar(char elemento){
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo!= null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        
        ultimo = nuevo;
        return this;
    }
    
    
    public void mostrarLista(){
        
        NodoLC auxiliar = ultimo.siguiente;
      //  String cadena = "";
        
       do{
            
            
            auxiliar = auxiliar.siguiente;
            System.out.print(auxiliar.dato);
            
        }while(auxiliar != ultimo.siguiente);
        
        
    }
}

            /*  
        
        * /

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */