/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class principal {
    
    public static void main(String[] args) {
        LDobleN n1 = new LDobleN();
        n1.adicion("Muere evo", "se murió evo", "16:30", "pepe");
        n1.adicion("Arce escapa", "se escapó arce", "18:30", "toño");
        n1.adicion("Perú explota", "explotó perú", "10:30", "Susan");
        n1.adicion("Bolivia gana", "bolivia ganó las elecciones", "08:10", "Esmeralda");
        
        LDobleN n2 = new LDobleN();
        n2.adicion("Tecnología avanza", "Se presenta un nuevo dispositivo que revoluciona el mercado.", "09:15", "Carlos");
        n2.adicion("Descubrimiento espacial", "Científicos encuentran un exoplaneta con condiciones similares a la Tierra.", "14:20", "Laura");
        
        LDobleN n3 = new LDobleN();
        n3.adicion("Crisis climática", "El cambio climático acelera el deshielo en los polos.", "12:45", "María");
        n3.adicion("Nuevo récord deportivo", "Atleta rompe récord mundial en los 100 metros planos.", "20:30", "Andrés");
        
        LSimpleP p1 = new LSimpleP();
        p1.adifinal("¿Quién debería ganar las elecciones?", "youtube.com", "10:00", "Arti");
        p1.adifinal("¿Es el cambio climático reversible?", "climate.org", "12:30", "Laura");
        p1.adifinal("Top 10 tecnologías del futuro", "techworld.com", "16:45", "Carlos");
        p1.adifinal("La verdad detrás de Marte", "spaceexplorer.com", "20:15", "Andrea");
        
        LSimpleP p2 = new LSimpleP();
        p2.adifinal("¿Cómo empezar en la inteligencia artificial?", "ai-guide.com", "11:00", "Juan");
        
        LSimpleP p3 = new LSimpleP();
        p3.adifinal("El impacto de la educación en el desarrollo", "educationnow.com", "09:30", "María");
        p3.adifinal("El futuro del transporte público", "urbanmobility.org", "14:00", "Sofía");
        
        LSimpleS A = new LSimpleS();
        A.adicion("Politica", n1, p1);
        A.adicion("Deportes", n2, p2);
        A.adicion("Tecnología", n3, p3);
        
        A.mostrar();
        
        System.out.println("\n - Mostrar noticas de la sección Politica -");
        mostrarNoticiasSeccionX(A, "Politica");
        
        System.out.println("\n - En qué sección se publicó la publicidad Top 10 tecnologías del futuro -");
        EnQueSeccionSePublicoX(A, "Top 10 tecnologías del futuro");
        
        System.out.println("\n - Cuantas Noticias publicó Laura -");
        CuantasNoticiasPublicoX(A, "Laura");
        
        System.out.println("\n - Eliminar publicaciones del autor Laura en la seccion Deportes -");
        EliminarNoticiasAutorXSeccionY(A, "Laura", "Deportes");
        A.mostrar();
    }
    
    public static void mostrarNoticiasSeccionX(LSimpleS A, String x) {
        NodoS w = A.getP();
        while (w != null) {
            if (w.getNombre().equals(x)) {
                System.out.println("\n" + w.getNombre() + " > ");
                w.getNoti().mostrar();
                w.getPub().mostrar();
            }
            w = w.getSig();
        }
        System.out.println();
    }
    
    public static void EnQueSeccionSePublicoX(LSimpleS A, String x) {
        NodoS w = A.getP();
        while (w != null) {
            NodoP r = w.getPub().getP();
            if (r != null) {
                while (r.getSig() != w.getPub().getP()) {
                    if (r.getTitulo().equals(x)) {
                        System.out.println("En la sección " + w.getNombre());
                    }
                    r = r.getSig();
                }
            }
            w = w.getSig();
        }
        System.out.println();
    }
    
    public static void CuantasNoticiasPublicoX(LSimpleS A, String x) {
        NodoS w = A.getP();
        int c;
        while (w != null) {
            c = 0;
            NodoN r = w.getNoti().getP();
            while (r != null) {
                if (r.getAutor().equals(x)) {
                    c++;
                }
                r = r.getSig();
            }
            System.out.println(x + " publicó " + c + " en " + w.getNombre());
            w = w.getSig();
        }
        System.out.println();
    }
    
    public static void EliminarNoticiasAutorXSeccionY(LSimpleS A, String x, String y) {
        NodoS w = A.getP();
        while (w != null) {
            if (w.getNombre().equals(y)) {
                NodoN r = w.getNoti().getP();
                while (r != null) {
                    if (r.getAutor().equals(x)) {
                        if (r == w.getNoti().getP()) {
                            w.getNoti().setP(null);
                        } else {
                            r.getAnt().setSig(r.getSig());
                            if (r.getSig() != null) {
                                r.getSig().setAnt(r.getAnt());
                            }
                        }
                    }
                    r = r.getSig();
                }
            }
            w = w.getSig();
        }
        System.out.println();
    }
}
