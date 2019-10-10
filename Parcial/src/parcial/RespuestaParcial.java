
package parcial;

import javax.swing.JOptionPane;


public class RespuestaParcial {
    public static void main(String[] args) {
        
    
    Parcial RespuestaParcial=new Parcial();
    int opcion=0;
   
   do{
    try{
           //menu principal
       opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la pregunta ha responder"
               +"\n 1 Qué es un commit?"
               +"\n 2 Qué es un push?  "
               +"\n 3 Qué es un pull?"
               +"\n 4 Qué es una clase?"
               +"\n 5 Qué es un objeto? "
               +"\n 6 nombre del estudiante"
               +"\n 7 fecha"
               +"\n 8 salir"));
    }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
       }
       switch(opcion){
           case 1:
           opcion=1;   
           Parcial a =new Parcial();
           JOptionPane.showMessageDialog(null,"Consolidar, confirmar​ o hacer un commit se refiere, en el contexto de la ciencia de la computación y la gestión de datos, a la idea de confirmar un conjunto "
                                             + "de cambios provisionales de forma permanente. ");
      
           break; 
           
           case 2:
            opcion=2;   
            Parcial b =new Parcial ();
            JOptionPane.showMessageDialog(null,"es un comando que sube los cambios hechos en tu ambiente de "
                                              + " trabajo a una rama de trabajo tuya y/o de tu equipo remota. ");
           break;
           
           case 3:
             opcion=3;  
            Parcial c =new Parcial ();
            JOptionPane.showMessageDialog(null,"es una abreviación de git fetch seguido de git merge FETCH_HEAD . "
                             + "Es decir, git fetch trae los cambios, pero los deja en otro branch, hasta que se hace el git merge para traerlos al branch local.. ");
      
           break;
           
           case 4:
            opcion=4;
            Parcial d =new Parcial (); 
            JOptionPane.showMessageDialog(null,"son plantillas para la creación de objetos, en lo que se conoce como programación orientada a objetos,"
                                  + " la cual es una de los principales paradigmas de desarrollo de software en la actualidad ");
           break; 
           
           case 5:
           opcion=5;    
           Parcial e =new Parcial ();
           JOptionPane.showMessageDialog(null,"un objeto es una unidad dentro de un programa de computadores que consta de un estado y de un comportamiento, "
                                   + "que a su vez constan respectivamente de datos almacenados y de tareas realizables durante el tiempo de ejecución.");
           break;
           
           case 6:
            Parcial f =new Parcial (); 
            f.setNombre("Luisa Rey");
            JOptionPane.showMessageDialog(null,f.getNombre());
           break;
           
           case 7:
           Parcial g =new Parcial ();
           JOptionPane.showMessageDialog(null,"10/10/2019");
           g.setFecha("10/10/2019");
           break; 
           case 8:
            Parcial h =new Parcial ();    
            JOptionPane.showMessageDialog(null,"salir del programa"); 
           default:
           JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");
               break;    
       }
               
}while(opcion>0 && opcion <=8);  
}
}    
