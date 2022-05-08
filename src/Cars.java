
import java.util.*;

public class Cars {
    private String marca; 
    private String modelo;
    private String color;
    private double medidaLargo;
    private double medidaAlto; 
    
    public Cars (){}
    public Cars (String marca, String modelo, String color, double medidaLargo, double medidaAlto) {
       this.marca = marca; this.modelo = modelo; this.color = color; this.medidaLargo = medidaLargo; this.medidaAlto = medidaAlto; 
}


//Getters and Setters

public void setMarca (String marca){} public String getMarca (String marca){return this.marca = marca;} 
 
public void setModelo (String modelo){} public String getModelo (String modelo){ return this.modelo = modelo;}

public void setColor (String color){} public String getColor (String color) { return this.color;}

public void setMedidaLargo (Double medidaLargo){} public Double getMedidaLargo (Double medidaLargo) { return this.medidaLargo = medidaLargo;}

public void setMedidaAlto (Double medidaAlto){} public Double getMedidaAlto (Double medidaAlto){ return this.medidaAlto = medidaAlto;}

}
