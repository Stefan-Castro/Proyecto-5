package dej1castro;
public class Coche {
        private String Color;
        private TIPAU Tipau; 
        private TIPSE Tipseg;
        private int Nump;
        private COMB Comb;
     
        public Coche(TIPAU tipau, String color, TIPSE tipseg, int nump, COMB comb) {
		this.Color = color;
		Nump = nump;
		this.Tipau = tipau;
		this.Tipseg = tipseg;
                this.Comb = comb;
	}
        
    public Coche() {
	}

 

    
    public String getColor() {
		return Color;
	}
    public void setColor(String color) {
		Color = color;
    }
    
    public int getNump() {
		return Nump;
	}
    public void setNump(int nump) {
		Nump = nump;
    }
    
    public TIPAU getTIPAU() {
            return Tipau;
    }
    public void setTIPAU(TIPAU Tipau) {
            this.Tipau = Tipau;
    }

    public TIPSE getTIPSE() {
            return Tipseg;
    }
    public void setTIPSE(TIPSE Tipseg) {
            this.Tipseg = Tipseg;
    }
    
    public COMB getCOMB() {
            return Comb;
    }
    public void setCOMB(COMB Comb) {
            this.Comb = Comb;
    }
    
    @Override
    public String toString(){
		
	return 	"Los datos de la persona son:\n" +
			"TIPO AUTO  : " + this.Tipau + "\n" +
			"COLOR      : " + this.Color + "\n" +
			"TIP SEGURO : " + this.Tipseg + "\n"  +
			"N. PUERTAS : " + this.Nump + "\n" +
			"COMBUSTIBLE: " + this.Comb + "\n";
	}    
        
        
}
