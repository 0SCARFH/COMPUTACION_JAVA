
public class ACTIVIDAD_6 {
	
	public static void main(String[] args) 
	{
		
		Alumno alumno = new Alumno();
		alumno.nombre = " Oscar ";
		Double promedio = promedio(alumno.notas);
	    String calificacion = calificacion(promedio);
	    imprimirCalificacion(alumno, promedio,calificacion);
	}
	
	 public static Double promedio(Double[] notas) 
	 {
		 
		 Double promedio = (notas[0] + 
				           notas[1] + 
				           notas[2] + 
				           notas[3] +
				           notas[4]) / 5;
		 return promedio;
		 
		 
	 }
	 
	 public static String calificacion(Double promedio)
	 {
		 
		 String calificacion = "";
		 
		 if (promedio <= 50)
		 {
			 calificacion = "F";
		 }
		 
		 if (promedio >= 51 && promedio <= 60)
		 {
			 calificacion = "E";
		 }
		 
		 
		 if (promedio >= 61 && promedio <= 70)
		 {
			 calificacion = "D";
		 }
		 
		 
		 if (promedio >= 71 && promedio <= 80)
		 {
			 calificacion = "C";
		 }
		 
		 
		 if (promedio >= 81 && promedio <= 90)
		 {
			 calificacion = "B";
		 }
		
		 
		 if (promedio >= 91 && promedio <= 100)
		 {
			 calificacion = "A";
		 }
		 return calificacion;
	 }
	 
	 public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion)
	 {
		 System.out.println("Nombre del estudiante" + alumno.nombre);
		 
		 for (int c= 0; c<=4; c++)
		 {
		 
		 System.out.println("Calificaciones: " + alumno.notas[c]);
		 }
		 System.out.println("Promedio: " + promedio);
		
	 }
	 
 
}
