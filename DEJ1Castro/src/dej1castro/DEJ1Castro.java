package dej1castro;
public class DEJ1Castro {

    public static void main(String[] args) {
        
        Coche c1 = new Coche();
        Coche c2= new Coche();
        Coche c3= new Coche();
        
        c1.setTIPAU(TIPAU.FAMILIAR);
        c1.setColor("VERDE");
        c1.setTIPSE(TIPSE.Todo_Riesgo);
        c1.setNump(4);
        c1.setCOMB(COMB.Disel);
        
        c2.setTIPAU(TIPAU.UTILITARIO);
        c2.setColor("ROJO");
        c2.setTIPSE(TIPSE.Terceros_Ampliado);
        c2.setNump(4);
        c2.setCOMB(COMB.Gasolina_Extra);
       
        c3.setTIPAU(TIPAU.DEPORTIVO);
        c3.setColor("ROJO");
        c3.setTIPSE(TIPSE.Todo_Riesgo);
        c3.setNump(4);
        c3.setCOMB(COMB.Disel);
        
        Coche c4 = new Coche(TIPAU.UTILITARIO, "BLANCO", TIPSE.Terceros_Ampliado, 4, COMB.Gasolina_Super);
        
        Coche c5 = new Coche(TIPAU.DEPORTIVO, "NEGRO", TIPSE.Terceros, 2, COMB.Gasolina_Extra);
        
        Coche c6 = new Coche(TIPAU.FAMILIAR, "AMARILLO", TIPSE.Todo_Riesgo, 6, COMB.Gasolina_Super);
        
        Coche c7 = new Coche(TIPAU.FAMILIAR, "AZUL", TIPSE.Terceros, 5, COMB.Gasolina_Super);
       
        Coche c8 = new Coche(TIPAU.DEPORTIVO, "VERDE", TIPSE.Terceros_Ampliado, 4, COMB.Disel);
        
        Coche c9 = new Coche(TIPAU.FAMILIAR, "ROJO", TIPSE.Terceros_Ampliado, 6, COMB.Gasolina_Extra);
        
        Coche c10 = new Coche(TIPAU.UTILITARIO, "BLANCO", TIPSE.Todo_Riesgo, 3, COMB.Gasolina_Extra);
        
        System.out.println("COCHE 1");
        System.out.println(c1.toString());
        
        System.out.println("COCHE 2");
        System.out.println(c2.toString());
       
        System.out.println("COCHE 3");
        System.out.println(c3.toString());
        
        System.out.println("COCHE 4");
        System.out.println(c4.toString());
        
        System.out.println("COCHE 5");
        System.out.println(c5.toString());
        
        System.out.println("COCHE 6");
        System.out.println(c6.toString());
        
        System.out.println("COCHE 7");
        System.out.println(c7.toString());
       
        System.out.println("COCHE 8");
        System.out.println(c8.toString());
        
        System.out.println("COCHE 9");
        System.out.println(c9.toString());
        
        System.out.println("COCHE 10");
        System.out.println(c10.toString());
        
    }
    
}
