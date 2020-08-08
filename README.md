# Taller Ejercicio Maven - GIT
 
 Este programa calcula algunas medidas estadísticas utilizando una lista encadenada básica creada en la aplicación.
 
 ## Prerequisitos
 
 Conocimientos básicos sobre estadística, media, mediana y desviación estándar.
 
 ## Comandos 
  Para compilar y correr las pruebas: ```mvn package```
  
  Para ejecutar y utilizar el programa: ```java -cp target/classes com.arep.App```

  Para ejecutar las pruebas: ```mvn test```
  
  Para generar javadoc con maven: ```mvn javadoc:javadoc```
  
  Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```
  
  **NOTA:** Para poder utilizar el programa es necesario haber compilado primero el proyecto con **mvn package**.
 
 ## Operaciones
 - Media: Calcula la media de una lista de n números ingresados por consola.
 - Desviación estándar: Calcula la desviación estándar de una lista de n números ingresados por consola.
 
 **NOTA:** Para realizar estas operaciones se utilizo una lista encadenada propia del programa, no se utilizo ninguna implementación por defecto como ArrayList.

## Intalación 
Si quieres saber como funciona el programa, tienes que seguir los siguientes pasos:
1. Descargar eclipse (última versión) o cualquier editor de JAVA.
2. Abra el proyecto en el editor.
3. Corra el programa y verifique que no tiene errores.
4. Ingrese los parámetros deseados que desea ver para visualizar las funcionalidades del sistema.

## Instalación (Proyecto Maven)
Para tener una mejor experiencia con el programa, es recomendable tener instalado maven en el sistema operativo,
de esta forma se puede visualizar de una mejor manera las pruebas y ejecutarlas desde consola.
Para instalar maven seguimos los siguientes pasos:
1. En eclipse vamos al menu que dice help.
2. Ahí le damos a install new software.
3. Nos abrirá una nueva pestaña, allí le damos donde aparece "add".
4. En "Name" escribimos lo siguiente: M2Eclipse
5. En "Location" escribimos la siguiente dirección: http://download.eclipse.org/technology/m2e/releases
6. Le damos Add, señalamos los plugins que aparecieron.
7. Aceptamos los terminos y condiciones, y se instalará automáticamente.
8. Reiniciamos eclipse y ya está instalado maven en eclipse.

## Pruebas
Para poder ejecutar sus pruebas siga los siguientes pasos:
1. Cambie los valores de case1, case2, case3, ..., casen por los valores deseados o cree uno nuevo.
2. Elija la prueba que desea y cambie el resultado por el esperado.
3. Corra las pruebas y verifique que el resultado esperado es igual al valor dado por el programa.


## Ejemplo de prueba de desviación estándar
```java
public static final double MAXERROR = 0.00000000000001;
ListaEncadenada lista = new ListaEncadenada();
double[] caso1 = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
  
/**
* Llena la lista encadenada con los valores dados en una lista de numeros decimales. 
* @param listaDoubles Es la lista de valores que queremos que tenga nuestra lista encadenada.
*/
public void llenarLista(double[] listaDoubles) {
	lista = new ListaEncadenada();
	for (int i = 0; i < listaDoubles.length; i++) {
		double value = listaDoubles[i];
		lista.addRight(new Node(value));
	}
}

/**
* Prueba que la desviación estándar calculada por la aplicación es 572.03 con los valores del caso 1.
*/
@Test
public void shouldCalculateStandardDeviationCorrectlyCase1() {
	double resultadoEsperado = 572.03;
	llenarLista(caso1);
	Calculator c = new Calculator(lista);
	assertEquals(c.getDesviacionEstandar(), resultadoEsperado, MAXERROR);
}
```

## Ejemplos de uso
Habrá el proyecto en el editor de su preferencia:
1. Busque el directorio src\main\java\com\arep\.
2. Habrá la clase App que es la clase principal.
3. Ejecutela desde Eclipse o el programa de su preferencia.
4. Digite la lista de números con la que le gustaría realizar las operaciones.
6. Cuando termine digite dos enter.
7. El resultado se muestra en pantalla, comparelo con el esperado.

## Ejemplos de uso con maven
Para ello nos dirigimos a la carpeta principal del proyecto, dependiendo de lo que queramos hacer.

Si queremos compilar el proyecto y ver que no tiene fallos, utilizamos el comando **mvn package**.

Si queremos ejecutar las pruebas y ver que todo está perfecto, utilizamos el comando **mvn test**.

**NOTA:** El comando **mvn package** compila y ejecuta las pruebas al mismo tiempo.

## Construido 
[Eclipse](https://www.eclipse.org/) Editor de JAVA donde se puede compilar el proyecto. 

## Autor
Johann Sebastian Páez Campos - Trabajo Programación AREP 07/08/2020

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.

