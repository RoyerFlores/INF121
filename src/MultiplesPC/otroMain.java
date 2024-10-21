/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class otroMain {
    public static void main(String[] args) {
        MultiCE A=new MultiCE();
        A.adicionar(new Estudiante("Maria", 65), 1);
        A.adicionar(new Estudiante("Lucy", 99), 1);
        A.adicionar(new Estudiante("Pedro", 22), 1);
        A.adicionar(new Estudiante("Luis", 67), 1);

        A.adicionar(new Estudiante("Jorge", 100), 2);
        A.adicionar(new Estudiante("Rocio", 89), 2);

        A.adicionar(new Estudiante("Nora", 11), 3);
        A.adicionar(new Estudiante("Saul", 68), 3);
        A.adicionar(new Estudiante("Rene", 10), 3);

        A.adicionar(new Estudiante("Fanny", 51), 4);
        A.adicionar(new Estudiante("Roberto", 92), 4);
        A.setN(4);
        
        A.mostrar();
        MayorNota(A);
    }
    
    public static void MayorNota(MultiCE A){
        int m=0;
        CCircularE aux=new CCircularE();
        for(int i=1;i<=A.getN();i++){
            while(!A.esVacia(i)){
                Estudiante e=A.eliminar(i);
                if(e.getNota()>m)
                    m=e.getNota();
                aux.adicionar(e);
            }
            A.vaciar(aux, i);
        }
        System.out.println("Mayor nota: "+m);
    }
}