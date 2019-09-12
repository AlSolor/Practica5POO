public class Esfera {
    static final double PI = 3.1416;
    private double radio;
    double area, volumen;
    //constructor
    public Esfera(){}
    //Metodo setter
    public void setRadio(double radio){
        this.radio=radio;
    }
    //Metodo getter
    public double getRadio(){
        return radio;
    }
    //Metodo para el calculo del area
    public double calculoArea(){
        area=4*PI*radio*radio;
        return area;
    }
    //Metodo para el calculo del volumen
    public double calculoVolumen(){
        volumen= (4*PI*radio*radio*radio)/3;
        return volumen;
    }
}