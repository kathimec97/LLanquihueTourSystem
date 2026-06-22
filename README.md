![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1 y 2- Caso: Agencia de Turismo – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** [Katherine del Carmen Avila Mecia]
- **Sección:** [002A]
- **Carrera:** Analista Programador Computacional
- **Sede:** [Campus Virtual]

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación sumativa N°1 y 2 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de diseñar e implementar un sistema basico compuesto por multiples clases relacionadas.
cuyo objetivo es modelar entidades representativas de un dominio real, aplicando los principios de encapsulamiento, composicion  reutilizacion de clases.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱 Estructura general del proyecto

```plaintext
### 1. Herencia
Para evitar la duplicación de estructuras, se implementó una única súper clase base abstracta llamada `Contacto`. De ella extienden de manera directa y en un solo nivel las clases especializadas:
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
LLanquihueTourSystem/
── src/
    ├── main/
    │   ├── java/
    │   │   └── cl.duoc.llanquihuetoursystem/
    │   │       ├── app/
    │   │       │   └── Main.java
    │   │       ├── component/
    │   │       │   ├── Correo.java
    │   │       │   ├── Direccion.java
    │   │       │   ├── Rut.java
    │   │       │   └── Telefono.java
    │   │       ├── datamanager/
    │   │       │   └── RegistroAgencia.java
    │   │       ├── model/                               
    │   │       │   ├── Cliente.java                                                
    │   │       │   ├── Contacto.java                
    │   │       │   ├── Empleado.java
    │   │       │   └── Empresa.java
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

4. Navegar el arbol del proyecto hasta la ruta `src/app/Main.java`

5. Hacer clic derecho sobre el archivo `Main.java` y seleccionar la opción *Run Main.main()* (o presionar Shift + F10).

6. Observa los resultados impresos en la pestaña *Run* de la consola inferior, donde se desplegaran las listas completas 

---

**Fecha de entrega:** \[21/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa 1 y 2



