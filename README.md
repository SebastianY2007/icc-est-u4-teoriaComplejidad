
# **INFORME DE INVESTIGACION**

<img src="assets/ups-icc.png" alt="Logo" width="400">


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Derlis Sebastian Yupangui Buestan - https://github.com/SebastianY2007
- Javier Andree Barrezueta Ordoñez - https://github.com/JavierBzt17

# Objetivos:

- Familiarizar a los estudiantes con los conceptos básicos de la teoría de la complejidad.

- Investigar, analizar y exponer conceptos fundamentales relacionados con la eficiencia algorítmica, centrándose en la teoría de la complejidad, análisis de algoritmos y la notación Big O.


# Marco Teórico: 

## **1. Teoría de la Complejidad**
#### Sebastian Yupangui: 
Es una de las carias ramas de la computación que analiza y clasifica los algoritmos según la cantidad de recursos que consumen a la hora de resolver un problema. Se centra principalmente en medir la eficiencia en función del crecimiento de los datos de entrada (n).
Tiene cono finalidad minimizar el uso de dos recursos criticos:
- Coste temporal o el tiempo de CPU.
- Coste espacial o la memoria RAM.

#### Javier Barrezueta:
 La Teoria de la complejidad es una rama que clasifica los algoritmos que tenemos dependiendo de los recursos que estos requieren para poder ejecutarse según crece el tamaño de la entrada, es decir, se basa en el si un problema se puede resolver mas no en cuanto nos cuesta resolverlo

### 1.1 Definición general
La Teoría de la Complejidad es la rama de la computación que estudia los recursos (tiempo y espacio) requeridos por un algoritmo para resolver un problema en función del tamaño de la entrada. Permite clasificar problemas según su dificultad inherente.
### 1.2 Importancia en la resolución de problemas
Es fundamental para determinar si una solución es viable. Un algoritmo eficiente permite resolver problemas grandes en tiempos razonables, minimizando el uso de recursos como tiempo de CPU y memoria RAM, lo cual es crítico en sistemas con recursos limitados o grandes volúmenes de datos.
### 1.3 Eficiencia de algoritmos
La eficiencia se mide observando cómo escala el consumo de recursos al aumentar los datos de entrada:Coste temporal: Se refiere al tiempo de ejecución del algoritmo, generalmente medido en número de operaciones elementales en lugar de segundos exactos. Coste espacial: Se refiere a la cantidad de memoria adicional (RAM) que necesita el algoritmo para ejecutarse, aparte del espacio ocupado por los propios datos de entrada.
### 1.4 Factores de tiempo de ejecución
Factores propios: Dependen del diseño del algoritmo y las estructuras de datos seleccionadas (listas, árboles, arreglos). Factores circunstanciales: Son externos al código, como la potencia del hardware (CPU, RAM), el compilador utilizado, el sistema operativo y la carga del sistema en ese momento. Análisis teórico: Es una estimación matemática (a priori) del rendimiento, independiente del hardware, usando notaciones asintóticas. Análisis experimental: Consiste en ejecutar el algoritmo (a posteriori) con diferentes tamaños de entrada y medir el tiempo real transcurrido para validar la teoría.
### 1.5 Notación de complejidad
- Big O: Es la notación estándar para describir el límite superior del crecimiento de una función. Nos dice qué tan rápido crece el tiempo de ejecución en relación con la entrada en el peor escenario posible.
### Tipos de notaciones (Escenarios):
- Mejor caso: La situación ideal donde el algoritmo realiza el mínimo trabajo (ej. encontrar un dato en la primera posición).
- Peor caso: La situación donde el algoritmo realiza el máximo trabajo posible. Es la medida más importante para garantizar rendimiento16.
- Caso promedio: El rendimiento esperado con entradas aleatorias típicasx.
### Big O, Omega (Ω), Theta (Θ):
- O(n) (Big O): Cota superior (peor caso).
- Ω(n) (Omega): Cota inferior (mejor caso).
- Θ(n) (Theta): Cota exacta (cuando el límite superior e inferior coinciden).

---

# **2. Ejemplos de Complejidad en Java**

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```

### **Explicación resumida**

Esta complejidad es O(1) porque el número de instrucciones a ejecutar es fijo y no hay bucles ni recursión; simplemente se asignan variables y se realiza una suma. Si 'x' o 'y' fueran números de un millón, el tiempo de cálculo sería idéntico.

## **2.2 Complejidad O(n^2) – Cuadrática**

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(n^2)");
    int n = 3; 
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
    System.out.println("Total de operaciones: " + (n * n));
}
```

### **Explicación resumida**

Es O(n²) debido a la presencia de dos bucles anidados. El bucle externo se ejecuta $n$ veces, y por cada una de esas veces, el bucle interno también se ejecuta $n$ veces. Esto resulta en un total de 'n' x 'n' operaciones. Es común en algoritmos de ordenamiento simples como el Bubble Sort.

## **2.3 Complejidad O(n) – Lineal**

### **Archivo** `ComplejidadLineal.java`

### **Codigo del ejemplo**

```java
public void ejemploLineal(int n) {
    System.out.println("Ejemplo O(n)");
    for (int i = 0; i < n; i++) {
        System.out.println("Iteración: " + i);
    }
}
```

### **Explicacion Resumida**

El tiempo de ejecución crece de manera proporcional al tamaño de la entrada n. Si n se duplica, el tiempo de ejecución también se duplica

## **2.4 Complejidad O(log n) – Logarítmica**

### **Archivo** `ComplejidadLogaritmica.java`

### **Codigo del ejemplo**

```java
public void ejemploLogaritmico(int n) {
    System.out.println("Ejemplo O(log n)");
    for (int i = 1; i < n; i = i * 2) {
        System.out.println("Valor actual: " + i);
    }
}
```

### **Explicacion Resumida**

El número de operaciones crece muy lentamente. En cada paso, el problema se reduce a la mitad (o el índice se duplica), como en una búsqueda binaria

## **2.5 Complejidad O(n log n) – Lineal-Logarítmica**

### **Archivo** `ComplejidadNLogN.java`

### **Codigo del ejemplo**

```java
public void ejemploNLogN(int n) {
    System.out.println("Ejemplo O(n log n)");
    for (int i = 0; i < n; i++) { 
        for (int j = 1; j < n; j = j * 2) { 
            System.out.println("Procesando: " + i + ", " + j);
        }
    }
}
```

### **Explicacion Resumida**

Es el producto de una complejidad lineal y una logarítmica. Es muy común en algoritmos de ordenamiento eficientes como Merge Sort o Quick Sort

---

# **Conclusiones**

Al desarrollar estos ejemplos, he llegado a la conclusión de que la Notación Big O no es únicamente una noción teórica, sino una herramienta fundamental para valorar el desempeño real y la calidad de mi código. Está claro que no basta con que una solución funcione; es necesario prever cómo se comportará al incrementar el volumen de datos, dándole prioridad a los algoritmos eficientes, como los lineales o logarítmicos, en lugar de los cuadráticos, para garantizar que mis aplicaciones sean escalables y no fallen en un contexto real.

**POR ESTUDIANTE**: *Javier Barrezueta*

Como conclusión puedo decir que pude comprender la complejidad de los algoritmos y me permitió elegir soluciones más eficientes, lo cual es escencial para que los programas funcionen correctamente y de manera efectiva cuando los datos aumenten.

**POR ESTUDIANTE**: *Sebastian Yupangui*


---

