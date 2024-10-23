/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleDoble;

/**
 *
 * @author Royer
 */
public class LDobleI {
    private NodoI p;
    LDobleI(){
        p=null;
    }

    public NodoI getP() {
        return p;
    }

    public void setP(NodoI p) {
        this.p = p;
    }
    
    public void adiprincipio(String b, int c){
        NodoI nue=new NodoI();
        nue.setNom(b);
        nue.setNroG(c);
        if(getP()==null){
            setP(nue);
        }else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    
    public void mostrar(){
        NodoI r=getP();
        System.out.println(" - Mostrando Integrantes -");
        while(r!=null){
            System.out.println("<"+r.getNroG()+" "+r.getNom());
            r=r.getSig();
        }
    }
    
    public void adifinal(String b, int c){
        NodoI nue=new NodoI();
        nue.setNroG(c);
        nue.setNom(b);
        if(getP()==null){
            setP(nue);
        }else{
            NodoI r=getP();
            while(r.getSig()!=null){
                r=r.getSig();
            }
            nue.setAnt(r);
            r.setSig(nue);
        }
    }
    
    public NodoI elifinal(){
        NodoI r;
        r=getP();
        while(r.getSig()!=null){
            r=r.getSig();
        }
        NodoI q=r.getAnt();
        q.setSig(null);
        r.setAnt(null);
        return r;
    }
}
