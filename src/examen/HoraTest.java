package examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HoraTest {

	Hora pruebaHora = new Hora();

	@Test
	void CP1() {
		boolean CadenaTest = pruebaHora.validarHora(5, 3, -1);
		boolean CadenaEsperada = false;
		assertEquals(CadenaEsperada, CadenaTest);
	}

	@Test
	void CP2() {
		boolean CadenaTest = pruebaHora.validarHora(3, -1, 1);
		boolean CadenaEsperada = false;
		assertEquals(CadenaEsperada, CadenaTest);
	}

	@Test
	void CP3() {
		boolean CadenaTest = pruebaHora.validarHora(-1, 3, 1);
		boolean CadenaEsperada = false;
		assertEquals(CadenaEsperada, CadenaTest);
	}

	@Test
	void CP4() {
		boolean CadenaTest = pruebaHora.validarHora(7, 5, 3);
		boolean CadenaEsperada = true;
		assertEquals(CadenaEsperada, CadenaTest);
	}

}
