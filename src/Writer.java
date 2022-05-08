
import java.util.*;

public class Writer extends Cars {
    Scanner sc = new Scanner(System.in);
    Cars cars = new Cars();
    

    public void escribir() {
        String scanM = sc.nextLine();
        String scanMo = sc.nextLine();
        String scanC = sc.nextLine();
        cars.setMarca(scanM);
        cars.setModelo(scanMo);
        cars.setColor(scanC);
        Double scanAl = sc.nextDouble();
        Double scanLar = sc.nextDouble();
        cars.setMedidaAlto(scanAl);
        cars.setMedidaLargo(scanLar);
        System.out.println("Ingrese marca: " + scanM + "\n" + "Ingrese modelo: " + scanMo + "\n" + "Ingrese color: "
                + scanC + "\n" + "Ingrese medida de alto: " + scanAl + "\n" + "Ingese medida de largo: " + scanLar);

    }


    //Metodo para lectura de datos
            
}
