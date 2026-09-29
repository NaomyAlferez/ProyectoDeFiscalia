# 3.3 Requisitos no funcionales

## 3.3.1 Requisitos de rendimiento

El sistema deberá proporcionar un tiempo de respuesta adecuado para permitir que los servidores públicos puedan realizar las evaluaciones y autoevaluaciones sin interrupciones durante el periodo establecido.

Los requisitos de rendimiento serán los siguientes:

- El sistema deberá permitir el acceso simultáneo de los usuarios autorizados conectados a la red institucional de la Fiscalía General del Estado de Yucatán.
- El sistema deberá procesar el inicio de sesión y mostrar el resultado de la autenticación en un tiempo máximo de 3 segundos, siempre que la infraestructura de red y el servidor se encuentren disponibles.
- El sistema deberá mostrar las páginas de evaluación y autoevaluación en un tiempo máximo de 3 segundos después de que el usuario solicite su acceso, bajo condiciones normales de operación.
- El registro de una respuesta deberá completarse en un tiempo máximo de 3 segundos después de que el usuario confirme la operación, siempre que exista disponibilidad de la conexión con el servidor.
- El sistema deberá generar la consulta de resultados en un tiempo máximo de 5 segundos para consultas que no requieran procesar un volumen extraordinario de información.
- La generación de reportes en PDF o Excel deberá completarse en un tiempo máximo de 10 segundos para una consulta correspondiente a un proceso de evaluación.
- El sistema deberá permitir que los usuarios continúen con el proceso de evaluación dentro del periodo establecido sin que sea necesario mantener una sesión activa durante todo el periodo de 30 días.
- El sistema deberá mantener el rendimiento requerido durante el periodo de aplicación de las evaluaciones y autoevaluaciones.
- La cantidad máxima de usuarios conectados simultáneamente deberá ser determinada de acuerdo con el número de servidores públicos que participen en cada proceso de evaluación y con la capacidad de la infraestructura tecnológica proporcionada por la Fiscalía.

## 3.3.2 Seguridad

El sistema deberá implementar mecanismos de seguridad que permitan proteger la información de los usuarios, las evaluaciones, las autoevaluaciones y los resultados obtenidos, evitando accesos no autorizados, modificaciones accidentales o maliciosas y pérdida de información.

Los requisitos de seguridad serán los siguientes:

**Autenticación de usuarios.**

El sistema deberá requerir un nombre de usuario y contraseña para permitir el acceso a las funciones del sistema.

**Control de acceso.**

El sistema deberá asignar permisos de acuerdo con el tipo de usuario. La Directora de Administración tendrá acceso a las funciones administrativas y a los resultados, mientras que los demás usuarios únicamente podrán acceder a las evaluaciones y autoevaluaciones que les correspondan.

**Protección de resultados.**

Los resultados de las evaluaciones deberán mantenerse privados y no deberán estar disponibles para usuarios que no cuenten con los permisos correspondientes.

**Restricción de acceso por red.**

El sistema deberá permitir el acceso únicamente desde equipos conectados a la red institucional de la Fiscalía General del Estado de Yucatán.

**Protección de las evaluaciones finalizadas.**

Una vez que una evaluación o autoevaluación haya sido enviada y registrada correctamente, el sistema deberá impedir que el usuario vuelva a modificar sus respuestas.

**Validación de datos.**

El sistema deberá validar la información proporcionada por los usuarios antes de almacenarla, con el propósito de evitar registros incompletos o con formatos no válidos.

**Protección contra accesos no autorizados.**

El sistema deberá impedir que un usuario acceda directamente a funciones o información que no correspondan a sus permisos.

**Integridad de la información.**

El sistema deberá mantener la integridad de los registros almacenados, evitando que las operaciones realizadas por los usuarios modifiquen o eliminen información para la cual no cuentan con autorización.

**Respaldo de información.**

La información correspondiente a las evaluaciones y autoevaluaciones deberá conservarse en el servidor institucional, de acuerdo con las políticas de respaldo y conservación de información establecidas por la Fiscalía.

**Cumplimiento de disposiciones institucionales.**

Las medidas de seguridad implementadas deberán considerar el Aviso de Privacidad, el Reglamento del Servicio Profesional de Carrera y el Reglamento Interior de la Fiscalía General del Estado de Yucatán, en lo que resulte aplicable.

## 3.3.3 Fiabilidad

El sistema deberá funcionar de manera estable y consistente durante el periodo de aplicación de las evaluaciones y autoevaluaciones, procurando que los errores o fallos del sistema no ocasionen pérdida de información registrada por los usuarios.

Los requisitos de fiabilidad serán los siguientes:

- El sistema deberá conservar las respuestas que hayan sido registradas correctamente, incluso cuando posteriormente se presente un error en la aplicación.
- El sistema deberá informar al usuario cuando una operación no pueda completarse correctamente, evitando mostrar como registrada una información que no haya sido almacenada.
- En caso de producirse un error durante el registro de una evaluación o autoevaluación, el sistema deberá permitir al usuario volver a intentar la operación sin duplicar las respuestas previamente almacenadas.
- El sistema deberá impedir la duplicación de una evaluación o autoevaluación que haya sido registrada correctamente.
- El sistema deberá mantener disponibles los registros históricos de las evaluaciones realizadas desde la puesta en funcionamiento del sistema.
- Ante una interrupción temporal de comunicación con el servidor, el sistema deberá mostrar un mensaje informando al usuario que la operación no pudo completarse y deberá evitar la pérdida de información previamente almacenada.
- El sistema deberá garantizar que las evaluaciones y autoevaluaciones registradas correctamente puedan ser consultadas posteriormente por el usuario autorizado.
- El sistema deberá tener una disponibilidad mínima del 99 % durante el periodo establecido para la aplicación de las evaluaciones, excluyendo los periodos de mantenimiento programado.
- El sistema deberá recuperarse de una interrupción del servicio y volver a estar disponible en un tiempo máximo de 30 minutos, siempre que la infraestructura del servidor y de la red institucional se encuentren operativas.

## 3.3.4 Disponibilidad

El sistema deberá mantenerse disponible para los usuarios autorizados durante el periodo establecido por la Fiscalía General del Estado de Yucatán para la realización de las evaluaciones y autoevaluaciones.

Los requisitos de disponibilidad serán los siguientes:

- El sistema deberá presentar una disponibilidad mínima del 99 % durante el periodo de aplicación de las evaluaciones y autoevaluaciones, excluyendo los periodos de mantenimiento programado previamente establecidos.
- El sistema deberá estar disponible durante el horario de operación definido por la Fiscalía General del Estado de Yucatán.
- Los periodos de mantenimiento programado deberán realizarse, preferentemente, fuera del horario establecido para la aplicación de las evaluaciones, con el propósito de reducir la afectación a los usuarios.
- En caso de presentarse una interrupción inesperada del servicio, el sistema deberá restablecer su funcionamiento en un periodo máximo de 30 minutos, siempre que la interrupción corresponda al sistema y no a una falla externa de la infraestructura de red o del servidor institucional.
- El sistema deberá informar al usuario cuando el servicio no se encuentre disponible y evitar que una operación incompleta sea registrada como exitosa.
- La disponibilidad del sistema deberá poder verificarse mediante los registros de funcionamiento correspondientes durante el periodo de aplicación.

**Criterio de aceptación:**

Se considerará que el requisito se cumple cuando el sistema mantenga una disponibilidad igual o superior al 99 % durante el periodo de aplicación, sin considerar los periodos de mantenimiento programado.

## 3.3.5 Mantenibilidad

[Inserte aquí el texto]

> Identificación del tipo de mantenimiento necesario del sistema.
>
> Especificación de quien debe realizar las tareas de mantenimiento, por ejemplo usuarios, o un desarrollador.
>
> Especificación de cuando debe realizarse las tareas de mantenimiento. Por ejemplo, generación de estadísticas de acceso semanales y mensuales.

## 3.3.6 Portabilidad

[Inserte aquí el texto]

> Especificación de atributos que debe presentar el software para facilitar su traslado a otras plataformas u entornos. Pueden incluirse:

- *Porcentaje de componentes dependientes del servidor.*
- *Porcentaje de código dependiente del servidor.*
- *Uso de un determinado lenguaje por su portabilidad.*
- *Uso de un determinado compilador o plataforma de desarrollo.*
- *Uso de un determinado sistema operativo.*
