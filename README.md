![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1- Caso: Agencia de Turismo – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** [Katherine del Carmen Avila Mecia]
- **Sección:** [002A]
- **Carrera:** Analista Programador Computacional
- **Sede:** [Campus Virtual]

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación sumativa N°1 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de diseñar e implementar un sistema basico compuesto por multiples clases relacionadas.
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
````

---



## ⚙️ Instrucciones para ejecutar el proyecto


1. Abrir el proyecto en **IntelliJ IDEA**.
2. Asegurar que las dependencias compilen correctamente.
3. Navegar hasta el paquete `app` y abrir `Main.java`.
4. Hacer clic en el botón de **Run** (Play verde) para ejecutar las pruebas del sistema por consola.
---

**Fecha de entrega:** \[08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa 1



