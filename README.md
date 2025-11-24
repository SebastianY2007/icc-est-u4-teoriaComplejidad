
# **INFORME DE INVESTIGACION**


![alt text](assets/ups-icc.png) 


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

## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

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

*(Aquí el estudiante explica por qué es O(1))*

---
**PARA CADA COMPLEJIDAD, REPETIR LA ESTRUCTURA ANTERIOR**


# **Conclusiones**

*(Aquí el estudiante agrega conclusiones propias del trabajo)*

**POR ESTUDIANTE**: *(Nombre completo del estudiante)*

---

