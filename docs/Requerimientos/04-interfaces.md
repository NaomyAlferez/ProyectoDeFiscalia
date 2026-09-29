# 3.1 Requisitos comunes de los interfaces

El sistema deberá proporcionar interfaces que permitan la interacción entre los usuarios y el sistema de evaluación de desempeño, así como la comunicación con los equipos y recursos tecnológicos de la Fiscalía General del Estado de Yucatán.

Las entradas principales al sistema serán las credenciales de acceso de los usuarios, los datos de los servidores públicos y las respuestas proporcionadas durante las evaluaciones y autoevaluaciones.

Las salidas principales serán la confirmación del registro de las evaluaciones y autoevaluaciones, así como los resultados obtenidos y los reportes generados por el sistema. Los resultados podrán visualizarse mediante tablas, gráficas, comparativos y reportes, además de permitir su generación en formatos PDF y Excel para el usuario administrador.

## 3.1.1 Interfaces de usuario

El sistema deberá contar con una interfaz de usuario sencilla, clara y organizada, que permita a los usuarios realizar las funciones correspondientes a su rol.

La interfaz deberá contemplar, como mínimo, las siguientes pantallas:

- **Inicio de sesión:** permitirá al usuario ingresar su nombre de usuario y contraseña.
- **Página principal:** mostrará las opciones disponibles de acuerdo con el tipo de usuario.
- **Página de evaluación:** permitirá a los jefes inmediatos responder la evaluación correspondiente al personal asignado.
- **Página de autoevaluación:** permitirá a los servidores públicos responder su propia evaluación.
- **Página de resultados:** permitirá a la Directora de Administración consultar los resultados obtenidos.
- **Módulo de administración de usuarios:** permitirá al usuario administrador registrar, modificar, eliminar y consultar usuarios.

La interfaz deberá diferenciar las funciones disponibles para cada tipo de usuario, evitando que los usuarios sin permisos administrativos puedan acceder a los resultados de las evaluaciones.

El diseño visual del sistema deberá apegarse al modelo proporcionado por la Institución, considerando los colores, tipografía, distribución y estilo visual establecidos para el proyecto.

## 3.1.2 Interfaces de hardware

El sistema deberá funcionar en equipos de cómputo conectados a la red institucional de la Fiscalía General del Estado de Yucatán.

La interacción con el sistema se realizará mediante los dispositivos de entrada y salida disponibles en los equipos de cómputo, principalmente teclado, mouse y monitor.

El usuario administrador deberá contar con un equipo que permita visualizar los resultados y generar, guardar o imprimir los reportes correspondientes.

No se requiere, de acuerdo con la información proporcionada, una interfaz directa con dispositivos especializados de hardware.

## 3.1.3 Interfaces de software

*El sistema deberá interactuar con los recursos de software necesarios para permitir el almacenamiento, consulta y generación de información relacionada con las evaluaciones de desempeño.*

- **Producto software utilizado:** Sistema de gestión de base de datos que se determine para el desarrollo del proyecto.
- **Propósito del interfaz:** Permitir el almacenamiento, consulta y recuperación de la información de usuarios, evaluaciones, autoevaluaciones y resultados.
- **Definición del interfaz:** La información deberá intercambiarse entre el sistema y la base de datos mediante estructuras de datos compatibles con el sistema desarrollado.

*Asimismo, el sistema deberá permitir la generación y almacenamiento de resultados en formatos PDF y Excel, de acuerdo con las funciones establecidas para el usuario administrador.*

*El sistema deberá ser compatible con el entorno de software disponible en los equipos de la Fiscalía General del Estado de Yucatán.*

## 3.1.4 Interfaces de comunicación

El sistema deberá utilizar la red institucional de la Fiscalía General del Estado de Yucatán para permitir la comunicación entre los equipos de los usuarios y el servidor donde se encuentre alojado el sistema.

El acceso al sistema deberá estar restringido a los equipos conectados a la red de la Fiscalía, de acuerdo con las políticas de acceso establecidas por la Institución.

La comunicación deberá permitir el envío y recepción de información relacionada con:

- Autenticación de usuarios.
- Consulta y registro de información.
- Respuestas de evaluaciones y autoevaluaciones.
- Consulta de resultados.
- Generación y recuperación de reportes.

El sistema deberá utilizar los mecanismos y protocolos de comunicación disponibles en la infraestructura de red de la Fiscalía General del Estado de Yucatán. Los protocolos específicos deberán definirse de acuerdo con la infraestructura tecnológica disponible y las políticas de seguridad de la Institución.
