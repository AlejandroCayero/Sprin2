public class Main {
    public static void main(String[] args) {
        int largo1 =300;
        int ancho1 =150;
        int profundidad1 = 20;

        int largo2= 300;
        int ancho2= 80;
        int profundidad2=35;


        //Calcular el area de cada una de las piscinas
        int area1= largo1*ancho1;
        int area2= largo2*ancho2;
        System.out.println("el area de la piscina 1 es = "+area1+" y el area de la piscina 2 es = "+area2);

        //Calcular el volumen de cada una de las piscinas
        int volumen1=area1*profundidad1;
        int volumen2=area2*profundidad2;
        System.out.println("el volumen de la piscina 1 es = "+volumen1+ " y el volumen de la piscina 2 es = "+volumen2);

        //calcular los valores de la piscina juntas una al lado de la otra
        int anchototal= ancho2+ancho1;
        System.out.println("el valor de largo de las piscinas juntas es = "+largo1+ " y el valor de ancho es = "+anchototal);

        //el area que ocupan las dos piscina una al lado de la otra
        int areatotal =(ancho2+ancho1)+largo1;
        System.out.println("El area total de las dos piscinas juntas es = "+areatotal);

        //el volumen que ocupan las dos piscinas
        int volumentotal= volumen1+volumen2;
        System.out.println("El volumen total que ocupan las piscinas es = "+volumentotal);

        // nuevo volumen cambian la profundidad de las piscinas entre si
        int intercambioprofundidad = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = intercambioprofundidad;

        int nuevoarea1 = area1*profundidad1;
        int nuevoarea2 = area2*profundidad2;

        System.out.println("el nuevo area de la piscina 1 es = "+nuevoarea1+" el nuevo area de la piscina 2 es = "+nuevoarea2);


    }
}
