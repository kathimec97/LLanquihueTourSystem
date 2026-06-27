![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Caso: Agencia de Turismo – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** [Katherine del Carmen Avila Mecía]
- **Sección:** [002A]
- **Carrera:** Analista Programador Computacional
- **sede:** [Campus Virtual]

---
## ⬆️ semana 6: Creando Jerarquías de clases con herencia simple

### Descripción del objetivo
El objetivo de esta semana es implementar una clase base con atributos comunes y subclases que extiendan su funcionalidad
aplicando conceptos como atributos heredados, sobrescritura de métodos y composición entre clases.

### Clases creadas
 El proyecto ha sido organizado en el paquete model\ de forma siguiente:

* `ServicioTuristico` (superclase): Modela la información básica compartida por todos los servicios de la agencia.
* `RutaGastronomica`(subclase):especialización para los tours culinarios.
* `PaseoLacustre`(subclase):especialización para las navegaciones
* `ExcursionCultural`(subclase):especialización para recorridos históricos y patrimoniales.


*Nota: Todas las subclases heredan de la superclase


## Instrucciones para ejecutar la entrega actual (semana 6)
1. Abrir proyecto `LlanquihueTourSystem` en su IDE.
2. Navegue a traves del árbol de directorios hasta el paquete `ui\` (antiguo paquete 'app/').
3. Haga clic derecho sobre el archivo `Main.java`.
4. seleccione la opción ***Run `Main.main()`.
5. Verifique en la consola del sistema la salida impresa de los 6 servicios turísticos generados en el gestor de pruebas (`data/GestorServicios.java`).
---

**Fecha de entrega:** \[27/06/2026]

---
## 📘 Historial de entregas anteriores 

##  Descripción general
Este proyecto corresponde a la **Evaluación sumativa N.º 1 y 2** de la asignatura *Desarrollo Orientado a Objetos I*. correspondiente a las **semanas N° 1 y Semana N.º 5**. Se trata de diseñar e implementar un sistema basico compuesto por multiples clases relacionadas.
cuyo objetivo es modelar entidades representativas de un dominio real, aplicando los principios de encapsulamiento, composicion reutilizacion de clases.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱Componentes clave implementados


### 1. Herencia
Para evitar la duplicación de estructuras, se implementó una única superclase base abstracta llamada `Contacto`. De ella extienden de manera directa y en un solo nivel las clases especializadas:
* `Cliente`: Enfocado en registrar turistas e información útil para rutas gastronómicas.
* `Empleado`: Diseñado para la gestión interna de trabajadores y guías logísticos.
* `Empresa`: Aplica generalización y alta cohesión para unificar bajo una misma entidad jurídica tanto a los *Proveedores* (alojamiento/transporte) como a los *Operadores Locales*.

### 2. Composición (Objetos de Valor)
La clase raíz `Contacto` se compone de forma estricta mediante relaciones fuertes que amarran el ciclo de vida de los siguientes componentes encapsulados:
* `Rut`: Centraliza la identidad legal de personas y empresas.
* `Telefono` y `Correo`: Aseguran la integridad de los canales de comunicación digital.
* `Direccion`: Modela la ubicación geográfica (calle, número y comuna).

### 3. Encapsulamiento y Validaciones (Capa Util)
Todos los atributos se definieron como `private`. El acceso y modificación se realiza exclusivamente por métodos accesores públicos (`get` y `set`). 
Adicionalmente, se configuró un paquete de utilidades que aloja excepciones personalizadas (`RutInvalidException`, `TelefonoInvalidException`, `CorreoInvalidException`) que controlan mediante métodos nativos de cadenas (`.contains()`, `.length()`) e instrucciones lógicas que no ingresen datos corruptos o informales.


## 📂 Estructura General del Proyecto (Paquetes Actualizados)

```plaintext

LLanquihueTourSystem/
── src/
    ├── main/
    │   ├── java/
    │   │   └── cl.duoc.llanquihuetoursystem/
    │   │       ├── ui/                 
    │   │       │   └── Main.java
    │   │       ├── component/
    │   │       │   ├── Correo.java
    │   │       │   ├── Direccion.java
    │   │       │   ├── Rut.java
    │   │       │   └── Telefono.java
    │   │       ├── data/
    │   │       │   ├──GestorServicios.java
    │   │       │   └── RegistroAgencia.java
    │   │       ├── model/                               
    │   │       │   ├── Cliente.java                                                
    │   │       │   ├── Contacto.java                
    │   │       │   ├── Empleado.java
    │   │       │   ├──Empresa.java
    │   │       │   ├──ServicioTuristico.java
    │   │       │   ├──RutaGastronomica.java
    │   │       │   ├──PaseoLacustre.java
    │   │       │   └── ExcursionCultural.java
    │   │       └── util/
    │   └── resources/
    │       ├── cliente.txt
    │       ├── empleado.txt
    │       └── empresa.txt


````

---



## ⚙️ Instrucciones para ejecutar el proyecto


1. Clonar o descargar el repositorio en tu computadora local.

2. Abre el proyecto  `LlanquihueTourSystem` en IntelliJ IDEA.

3. Verifica que los archivos `.txt` estén correctamente ubicados.

4. Navegar el árbol del proyecto hasta la ruta `src/app/Main.java`

5. Hacer clic derecho sobre el archivo `Main.java` y seleccionar la opción *Run Main.main()* (o presionar Shift + F10).

6. Observa los resultados impresos en la pestaña *Run* de la consola inferior, donde se desplegaran las listas completas 

---

**Fecha de entrega:** \[21/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |



