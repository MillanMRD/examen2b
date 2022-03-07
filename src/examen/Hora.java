package examen;

/** Esta clase se encargara de comprobar si la hora introducida es correcta */

public class Hora {

	public static final boolean HoraValida = true;

	/**
	 * Como variable local de la clase se declara
	 * 
	 * @param HoraValida que inicialmente es true
	 * 
	 */

	/**
	 * El metodo validarHora es el encargado de comprobar la hora mediante una serie
	 * de if
	 * 
	 * @return horaValida se encarga de devolver true o false en funcion de que la
	 *         hora sea o no valida
	 * @param segundos en el se introducen los segundos
	 * @param minutos  en el se introducen los minutos
	 * @param horas    en el se introduce la hora
	 */

	public static boolean validarHora(int segundos, int minutos, int horas) {
		boolean horaValida = HoraValida;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}