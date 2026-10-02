# 3. Requisitos específicos

## RE 01 — Registro de usuarios

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto / Directora de Administración | Alta/Esencial |

**Descripción:** El sistema deberá permitir al usuario administrador registrar a los servidores públicos que participarán en el proceso de evaluación de desempeño. El registro deberá incluir, como mínimo, nombre del servidor público, código de empleado, RFC sin homoclave, cargo, puesto y área de adscripción.

## RE 02 — Administración de usuarios

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto / Directora de Administración | Alta/Esencial |

**Descripción:** El sistema deberá permitir al usuario administrador agregar, modificar, eliminar y consultar la información de los usuarios registrados en el sistema.

## RE 03 — Inicio de sesión

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá permitir a los usuarios acceder mediante un nombre de usuario y una contraseña. El sistema deberá validar las credenciales proporcionadas antes de permitir el acceso a las funciones correspondientes al tipo de usuario.

## RE 04 — Control de acceso por tipo de usuario

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Restricción | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá diferenciar los permisos de acceso de acuerdo con el tipo de usuario. La Directora de Administración tendrá permisos para administrar usuarios y consultar los resultados de las evaluaciones. Los demás usuarios únicamente tendrán acceso a las funciones de evaluación y autoevaluación que les correspondan.

## RE 05 — Consulta de información del usuario

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Restricción | Personal responsable del proyecto | Media/Deseado |

**Descripción:** El sistema deberá permitir consultar la información correspondiente a los usuarios registrados de acuerdo con los permisos establecidos para cada tipo de usuario.

## RE 06 — Aplicación de evaluación de desempeño

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá permitir a los jefes inmediatos evaluar el desempeño del personal que se encuentre bajo su responsabilidad, de acuerdo con los indicadores y criterios establecidos por la Fiscalía General del Estado de Yucatán.

## RE 07 — Aplicación de autoevaluación

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá permitir que los servidores públicos realicen una autoevaluación de su desempeño mediante los indicadores y criterios establecidos por la Institución.

## RE 08 — Asignación de evaluadores y evaluados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá establecer la relación entre evaluadores y evaluados de acuerdo con la estructura organizacional definida. Los directores de área deberán evaluar a los jefes de área, mientras que los jefes de área deberán evaluar al personal administrativo u operativo que corresponda. Cada servidor público podrá realizar su propia autoevaluación.

## RE 09 — Validación de antigüedad del personal

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá permitir que únicamente los servidores públicos que cuenten con una antigüedad mínima de seis meses en la organización participen en el proceso de evaluación y autoevaluación.

## RE 10 — Control de evaluaciones

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Restricción | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá permitir que cada usuario realice una sola evaluación correspondiente a cada persona asignada y deberá impedir que una evaluación previamente enviada sea contestada nuevamente o modificada.

## RE 11 — Control del periodo de evaluación

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Restricción | Personal responsable del proyecto | Media/Deseado |

**Descripción:** El sistema deberá permitir establecer un periodo determinado por la Institución para la realización de las evaluaciones y autoevaluaciones. El periodo de aplicación no deberá exceder de 30 días. Durante dicho periodo, los usuarios podrán ingresar al sistema las veces que sean necesarias para completar el proceso, siempre que no hayan enviado previamente la evaluación correspondiente.

## RE 12 — Registro de respuestas

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá almacenar las respuestas proporcionadas por los usuarios durante las evaluaciones y autoevaluaciones, asociándolas con el evaluador, evaluado y proceso correspondiente.

## RE 13 — Consulta de resultados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto / Directora de Administración | Media/Deseado |

**Descripción:** El sistema deberá permitir a la Directora de Administración consultar los resultados obtenidos de las evaluaciones realizadas al personal de la Fiscalía General del Estado de Yucatán.

## RE 14 — Visualización gráfica de resultados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto / Directora de Administración | Baja/ Opcional |

**Descripción:** El sistema deberá permitir visualizar los resultados obtenidos mediante representaciones gráficas, incluyendo gráficas de barras y gráficas de pastel.

## RE 15 — Comparación de resultados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto / Directora de Administración | Baja/ Opcional |

**Descripción:** El sistema deberá permitir realizar comparativos de los resultados obtenidos en las evaluaciones y autoevaluaciones, de acuerdo con los criterios establecidos por la Institución.

## RE 16 — Conservación histórica de resultados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Media/Deseado |

**Descripción:** El sistema deberá conservar los registros de las evaluaciones realizadas a partir de la puesta en funcionamiento del sistema, permitiendo mantener un historial de los procesos de evaluación realizados.

## RE 17 — Restricción de acceso a resultados

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Restricción | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** Los resultados de las evaluaciones deberán mantenerse privados y únicamente podrán ser consultados por la Directora de Administración mediante los permisos establecidos por el sistema.

## RE 18 — Validación de datos de entrada

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá validar que los datos ingresados cumplan con los formatos establecidos. El código de empleado deberá estar compuesto únicamente por caracteres numéricos y el RFC sin homoclave deberá aceptar caracteres alfanuméricos.

## RE 19 — Validación de campos obligatorios

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá validar que los campos obligatorios, incluyendo usuario y contraseña, hayan sido proporcionados antes de permitir el acceso al sistema.

## RE 20 — Cumplimiento de disposiciones institucionales

| Tipo | Fuente del requisito | Prioridad |
|---|---|---|
| Requisito | Personal responsable del proyecto | Alta/Esencial |

**Descripción:** El sistema deberá considerar las disposiciones establecidas en el Aviso de Privacidad, el Reglamento del Servicio Profesional de Carrera y el Reglamento Interior de la Fiscalía General del Estado de Yucatán, en lo que resulte aplicable al proceso de evaluación.
