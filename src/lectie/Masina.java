package lectie;

public class Masina {
    private String culoare;
    private double litraju;
    private String marca;
    //getter
    public String getCuloare(){
        return  culoare;
    }
    //setter
    void setCuloare(String culoare){
        this.culoare = culoare;
    }
    //constructors
    //constructor by default
    Masina(){
        this.setCuloare("Red");
    }
    //constructor with taking parameter
    Masina (String culoare){
        this.setCuloare(culoare);
    }
    }

