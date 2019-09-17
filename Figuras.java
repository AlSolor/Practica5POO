public class Figuras {
    public static void main(String args[]){
        Esfera esfera = new Esfera();
		Prisma prisma = new Prisma(4,4,4);
		Cono cono = new Cono(3,4);
        esfera.setRadio(5);
		System.out.println("---Esfera---\nRadio de la esfera:" + esfera.getRadio());
        System.out.println("Area de la esfera: " + esfera.calculoArea());
        System.out.println("Volumen de la esfera: " + esfera.calculoVolumen());
		System.out.println("---Prisma---\nMedidas del prisma:\nLargo:" + prisma.getLargo() +
							"\nAncho: " + prisma.getAncho() + "\nAltura: " + prisma.getAltura());
		System.out.println("Area del prisma: " + prisma.calculoArea());
		System.out.println("Volumen del prisma:" + prisma.calculoVolumen());
		System.out.println("---Cono---\nRadio del cono:" + cono.getR() +
							"\nAltura del cono: " + cono.getH() +
							"\nGeneratriz del cono: " + cono.getG());
		System.out.println("Area del cono: " + cono.area());
		System.out.println("Volumen del cono:" + cono.volumen());
    }
}