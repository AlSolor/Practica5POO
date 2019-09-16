public class Prisma {
    private double largo,ancho,altura;
    double area, volumen;
    //constructor
    public Prisma(){}
    //Metodo setter
    public void setMedidas(double largo, double ancho,double altura){
        this.largo=largo;
        this.ancho=ancho;
        this.altura=altura;
    }
    //Metodo getter
    public double getLargo(){
        return largo;
    }
    public double getAncho(){
        return ancho;
    }
    public double getAltura(){
        return altura;
    }
    //Metodo para el calculo del area
    public double calculoArea(){
        area=(2*largo*ancho)+(2*altura*largo)+(2*altura*ancho);
        return area;
    }
    //Metodo para el calculo del volumen
    public double calculoVolumen(){
        volumen= largo * ancho * altura;
        return volumen;
    }
}
