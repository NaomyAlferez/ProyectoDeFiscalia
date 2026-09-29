# 2. Descripción general

## 2.1 Perspectiva del producto

**Producto independiente o parte de un sistema mayor**

> El **Sistema de Evaluación del Desempeño de la Fiscalía General del Estado de Yucatán (SEDFGEY)** será desarrollado como un producto independiente, destinado a la gestión y evaluación del desempeño laboral de los servidores públicos de la institución.
>
> El sistema será implementado como una página web y estará enfocado específicamente en las funciones relacionadas con el proceso de evaluación del desempeño.

## 2.2 Funcionalidad del producto

El **Sistema de Evaluación del Desempeño de la Fiscalía General del Estado de Yucatán (SEDFGEY)** permitirá gestionar el proceso de evaluación del desempeño laboral de los servidores públicos de la institución.

Entre sus principales funcionalidades se encuentran:

- Permitir a los jefes inmediatos realizar la evaluación del desempeño de los servidores públicos bajo su responsabilidad.
- Permitir a los servidores públicos realizar una autoevaluación de su desempeño.
- Recopilar y organizar la información obtenida mediante las evaluaciones.
- Facilitar la consulta y obtención de los datos generados por el sistema.
- Proporcionar información que permita identificar fortalezas y áreas de mejora en el desempeño de los servidores públicos.
- Facilitar la obtención de información clara y objetiva para apoyar el seguimiento del desempeño laboral en relación con los objetivos y estándares establecidos por la institución.

## 2.3 Características de los usuarios

| Tipo de usuario | Administrador |
|---|---|
| Formación | Formación profesional acorde con las funciones administrativas que desempeña dentro de la institución. |
| Habilidades | Conocimientos básicos en el manejo de equipos de cómputo, navegación en sistemas web y gestión de información administrativa. |
| Actividades | • Agregar, modificar y eliminar información del sistema.<br>• Administrar la información relacionada con los usuarios y las evaluaciones.<br>• Consultar los resultados de las evaluaciones realizadas al personal.<br>• Visualizar los resultados de las evaluaciones de todo el personal. |

| Tipo de usuario | Usuarios evaluadores y evaluados |
|---|---|
| Formación | La correspondiente al puesto que desempeñan dentro de la Fiscalía General del Estado de Yucatán. No se requiere una formación técnica especializada para utilizar el sistema. |
| Habilidades | Conocimientos básicos en el manejo de equipos de cómputo y navegación en páginas web. |
| Actividades | • Los directores de área evaluarán a los jefes de área bajo su responsabilidad.<br>• Los jefes de área evaluarán al personal administrativo y operativo a su cargo.<br>• Los servidores públicos realizarán su autoevaluación.<br>• Los usuarios responderán las evaluaciones que les correspondan de acuerdo con su puesto y nivel de responsabilidad. |

## 2.4 Restricciones

> El desarrollo y funcionamiento del sistema estará sujeto a las siguientes restricciones:

- El acceso al sistema estará limitado a usuarios que se encuentren conectados a la red de la Fiscalía General del Estado de Yucatán.
- El sistema deberá contar con diferentes niveles de acceso de acuerdo con el tipo de usuario. La directora de Administración tendrá permisos de administración y consulta de resultados, mientras que el resto de los usuarios tendrá acceso únicamente a las evaluaciones y autoevaluaciones que les correspondan.
- Solo la directora de Administración podrá consultar, imprimir o guardar los resultados de las evaluaciones.
- Cada usuario podrá realizar una evaluación una sola vez por cada proceso de evaluación establecido.
- Los usuarios podrán ingresar al sistema las veces que sean necesarias para completar una evaluación, siempre que se encuentren dentro del periodo establecido.
- El periodo máximo para completar las evaluaciones y autoevaluaciones será de 30 días, de acuerdo con el plazo determinado por la organización.
- Solo podrán ser evaluados y autoevaluados los servidores públicos que cuenten con una antigüedad mínima de seis meses en la organización.
- El código de empleado deberá estar compuesto únicamente por caracteres numéricos.
- El RFC utilizado como contraseña deberá corresponder a un formato alfanumérico y se utilizará sin homoclave.
- El sistema deberá considerar las disposiciones establecidas en el Aviso de Privacidad, el Reglamento del Servicio Profesional de Carrera y el Reglamento Interior de la Fiscalía General del Estado de Yucatán.

## 2.5 Suposiciones y dependencias

- Se asume que el servidor de la red de la Fiscalía destinado al sistema estará disponible para almacenar y gestionar la información generada por las evaluaciones.
- El funcionamiento del sistema dependerá de la disponibilidad y conectividad de la red institucional de la Fiscalía, debido a que el acceso estará limitado a los equipos conectados a dicha red.
- Se asume que la información necesaria para el registro de los usuarios será proporcionada y se mantendrá actualizada.
- El funcionamiento de las evaluaciones dependerá de que se mantenga actualizada la relación jerárquica entre directores de área, jefes de área y personal a su cargo, ya que esta determinará quién puede evaluar a cada servidor público.
- Se asume que la organización establecerá los periodos correspondientes para la aplicación de las evaluaciones y autoevaluaciones.
- El sistema dependerá de contar con información actualizada sobre la antigüedad de los servidores públicos para determinar si cumplen con el requisito mínimo de seis meses para participar en el proceso de evaluación.
- Se asume que las disposiciones y normativas institucionales aplicables al proceso de evaluación permanecerán vigentes durante el desarrollo y funcionamiento del sistema.

## 2.6 Evolución previsible del sistema

- Incorporar un historial de evaluaciones que permita consultar y comparar los resultados obtenidos en diferentes periodos.
- Ampliar las opciones de generación y visualización de reportes y estadísticas.
- Incorporar notificaciones y recordatorios para informar a los usuarios sobre evaluaciones pendientes o próximas a concluir.
- Automatizar la generación de reportes a partir de los resultados obtenidos.
- Integrar el sistema con otros sistemas o bases de datos institucionales, en caso de que se requiera y sea técnicamente viable.
- Incorporar nuevos roles y permisos de usuario de acuerdo con las necesidades futuras de la institución.
- Ampliar las herramientas de análisis para facilitar la identificación de tendencias, fortalezas y áreas de mejora en el desempeño del personal.

Estas funcionalidades serán consideradas como posibles mejoras y no forman parte del alcance inicial del sistema.
