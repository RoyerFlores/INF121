/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class ListaR {
    private NodoR p;
    
    public ListaR(){
        p=null;
    }

    public NodoR getP() {
        return p;
    }

    public void setP(NodoR p) {
        this.p = p;
    }
    
    public void adicion(String a, String b){
        NodoR nue=new NodoR();
        nue.setFecha(a);
        nue.setTema(b);
        
        if(getP()==null){
            setP(nue);
        }else{
            NodoR p=getP();
            while(p.getSig()!=null){
                p=p.getSig();
            }
            p.setSig(nue);
        }
    }
    
    public void mostrar(){
        NodoR p = getP();
        while (p != null) {
            System.out.println(p.getTema()+" "+p.getFecha());
            p = p.getSig();
        }
    }
}
