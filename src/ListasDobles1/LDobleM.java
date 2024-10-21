/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class LDobleM {
    private NodoM p;
    LDobleM(){
        p=null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    
    public void adiprincipio(int a, String b, int c, int d){
        NodoM nue=new NodoM();
        nue.setNro(a);
        nue.setNombre(b);
        nue.setKm2(c);
        nue.setNhabitantes(d);
        if(getP()==null){
            setP(nue);
        }else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    
    public void mostrar(){
        NodoM r=getP();
        System.out.println(" - Mostrando Municipios -");
        while(r!=null){
            System.out.println("<"+r.getNro()+" "+r.getKm2()+" "+r.getNombre()+ " "+r.getNhabitantes());
            r=r.getSig();
        }
    }
}
