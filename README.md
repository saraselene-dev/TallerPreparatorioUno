# TallerPreparatorioUno

Taller preparatorio de la asignatura **Estructuras de Datos**
Instituto Tecnológico Metropolitano (ITM).

Este repositorio contiene la solución a 10 ejercicios sobre manejo de matrices, objetos y estructuras de datos en Java. Siguiendo estos
paramétros:

- Atributos con nombre en mayúscula inicial (`Nombre`, `Precio`, `Fila`).
- `Scanner` recibido como parámetro en los métodos, nunca creado dentro de ellos.
- Métodos no estáticos agrupados en una clase `Metodos`, invocados desde una clase `Menu` con el método `main`.
- Constructores sobrecargados (vacío y completo) en cada clase de objeto.

## Flujo de trabajo (Git)

Cada punto del taller se desarrolla en su propia rama, creada a partir de `Develop`, y se integra mediante Pull Request:
Develop → feature/puntoN → Pull Request → Develop

## Estructura del repositorio

Cada punto está compuesto por tres clases: un objeto (`Obj...`), una clase de métodos (`Metodos...`) y un menú principal (`Menu...`).

| Punto |         Tema                | Clases principales |
| 1     | Gestión básica de productos | ObjProducto, Metodo, Menu |
| 2     | Gestión de productos        | ObjProducto2, Metodos2, Menu2|
| 3     | Búsqueda del libro más caro en una librería | ObjLibreria3, Metodos3, Menu3|
| 4     | Teatro: matriz de asientos ordenada por precio/fila | ObjAsiento4, Metodos4, Menu4|
| 5     | Unificación de dos almacenes en una sola matriz | ObjAlmacen5, Metodos5, Men5u |
| 6     | Filtrado de productos disponibles en una estantería | ObjProducto6, Metodos6, Menu6 |
| 7     | Agrupación de estudiantes según calificación | ObjEstudiante7, Metodos7, Menu7|
| 8     | Organización de productos en estanterías por categoría | ObjProducto8, Metodos8, Menu8 |
| 9     | Vendedor con mayor total de ventas anuales | Metodos9, Menu9|
| 10    | Conteo de productos en oferta | ObjProducto10, Metodos10, Menu10|

## Conceptos aplicados

- Recorrido de matrices con `m.length` / `m[i].length`.
- Patrón de referencia para búsqueda de máximo/mínimo.
- Detección de categorías únicas y agrupación dinámica.
- Selection sort para ordenamiento por fila.
- Manejo de `null` y prevención de `NullPointerException`.
- Separación de responsabilidades entre clases de objeto, métodos y menú.

## Autora

**Sara Urrego - saraselene-Dev**
