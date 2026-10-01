# 3.2 Requisitos funcionales

*El sistema deberá proporcionar las funciones necesarias para gestionar el proceso de evaluación de desempeño de los servidores públicos de la Fiscalía General del Estado de Yucatán, desde el registro y autenticación de los usuarios hasta la aplicación de evaluaciones y autoevaluaciones, almacenamiento de respuestas, consulta de resultados y generación de reportes.*

*El sistema deberá validar los datos introducidos por los usuarios, controlar el acceso de acuerdo con los permisos establecidos y garantizar que las evaluaciones sean realizadas de acuerdo con las reglas definidas por la Institución.*

*Los requisitos funcionales se dividen en las siguientes categorías:*

- *Gestión y autenticación de usuarios.*
- *Gestión de evaluaciones y autoevaluaciones.*
- *Validación y almacenamiento de información.*
- *Consulta y generación de resultados.*
- *Generación y exportación de reportes.* 


---

## RF 01 (RE 01 / RE 02 / RE 05 / RE 18) — Registro y Administración de Usuarios

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir al usuario administrador registrar y administrar la información de los servidores públicos que participarán en el proceso de evaluación. |
| **Entradas** | Nombre del servidor público, Código de empleado, RFC sin homoclave, Cargo, Puesto, Área de adscripción, Usuario, Contraseña, Tipo de usuario. |
| **Procesamiento** | • El administrador deberá ingresar la información correspondiente al usuario.<br>• El sistema deberá comprobar que los campos obligatorios hayan sido proporcionados.<br>• El sistema deberá validar que el código de empleado contenga únicamente caracteres numéricos.<br>• El sistema deberá validar que el RFC sin homoclave tenga formato alfanumérico.<br>• El sistema deberá determinar los permisos correspondientes al tipo de usuario.<br>• El sistema deberá almacenar la información validada.<br>• El sistema deberá mostrar una confirmación cuando el registro se haya realizado correctamente. |
| **Salidas** | Confirmación del registro, Información del usuario registrado, Mensajes de error cuando la información sea inválida o incompleta. |
| **Operaciones permitidas al administrador** | Agregar usuarios, Modificar usuarios, Eliminar usuarios, Consultar usuarios. |
| **Información almacenada** | El sistema deberá almacenar la información necesaria para identificar al usuario y determinar sus permisos dentro del sistema. |

---

## RF 02 (RE 03 / RE 04) — Autenticación y Control de Acceso por Tipo de Usuario

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir que los usuarios ingresen mediante sus credenciales y deberá limitar las funciones disponibles de acuerdo con su tipo de usuario. |
| **Entradas** | Usuario, Contraseña. |
| **Procesamiento** | • El usuario deberá introducir sus credenciales.<br>• El sistema deberá comprobar que ambos campos hayan sido proporcionados.<br>• El sistema deberá verificar que las credenciales correspondan con un usuario registrado.<br>• Si las credenciales son correctas, el sistema deberá identificar el tipo de usuario.<br>• El sistema deberá mostrar únicamente las funciones correspondientes a los permisos asignados.<br>• Si las credenciales son incorrectas, el sistema deberá impedir el acceso y mostrar un mensaje indicando que los datos proporcionados no son válidos. |
| **Salidas (Directora de Administración)** | Administrar usuarios, Consultar resultados, Visualizar gráficas, Consultar comparativos, Generar reportes, Exportar resultados, Imprimir resultados. |
| **Salidas (Demás Usuarios)** | Acceder a la evaluación que les corresponda, Acceder a su autoevaluación, Completar y enviar sus respuestas.<br>*(Nota: El sistema no deberá permitir que los usuarios sin permisos administrativos consulten los resultados generales)* |

---

## RF 03 (RE 06 / RE 08) — Aplicación de Evaluación de Desempeño

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir que los directores y jefes de área realicen las evaluaciones correspondientes al personal que tengan asignado. |
| **Entradas** | Identificación del evaluador, Identificación del evaluado, Indicadores de evaluación, Respuestas del evaluador. |
| **Procesamiento** | • El sistema deberá identificar al usuario que inició sesión.<br>• El sistema deberá determinar las personas que puede evaluar de acuerdo con su relación jerárquica.<br>• El sistema deberá mostrar la evaluación correspondiente.<br>• El evaluador deberá responder los indicadores establecidos.<br>• El sistema deberá validar las respuestas proporcionadas.<br>• El sistema deberá permitir guardar las respuestas durante el periodo disponible para completar el proceso.<br>• Una vez enviado, registrará que la evaluación fue completada e impedirá modificaciones o reevaluaciones. |
| **Regla de evaluación** | • Los directores de área evaluarán a los jefes de área.<br>• Los jefes de área evaluarán al personal administrativo u operativo que corresponda.<br>• Un evaluador podrá asignar la misma calificación a un indicador para diferentes evaluados cuando así lo considere. |
| **Salida** | El sistema deberá mostrar una confirmación indicando que la evaluación fue registrada correctamente. |

---

## RF 04 (RE 07) — Aplicación de Autoevaluación

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir que cada servidor público realice su propia autoevaluación. |
| **Entradas** | Identificación del usuario, Indicadores de autoevaluación, Respuestas del usuario. |
| **Procesamiento** | • El sistema deberá identificar al usuario que inició sesión.<br>• El sistema deberá verificar que el usuario sea elegible para realizar la autoevaluación.<br>• El sistema deberá mostrar los indicadores correspondientes.<br>• El usuario deberá proporcionar sus respuestas.<br>• El sistema deberá validar las respuestas y almacenarlas.<br>• Una vez enviada la autoevaluación, la marcará como completada e impedirá modificaciones posteriores. |
| **Salida** | El sistema deberá mostrar una confirmación de que la autoevaluación fue registrada correctamente. |

---

## RF 05 (RE 09) — Validación de Antigüedad del Personal

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá verificar que los servidores públicos participantes cuenten con una antigüedad mínima de seis meses en la organización. |
| **Procesamiento** | • El sistema deberá consultar la información de antigüedad registrada para el servidor público.<br>• El sistema deberá determinar si cumple con el mínimo de seis meses.<br>• Si cumple con la antigüedad requerida, podrá participar en el proceso de evaluación y autoevaluación.<br>• Si no cumple con el requisito, el sistema deberá impedir su participación. |
| **Salida** | En caso de no cumplir con la antigüedad requerida, el sistema deberá mostrar un mensaje indicando que el usuario no cumple con las condiciones establecidas para participar en el proceso. |

---

## RF 06 (RE 10 / RE 11) — Control del Periodo de Evaluación

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá controlar el periodo establecido por la Institución para realizar las evaluaciones y autoevaluaciones. |
| **Procesamiento** | • El administrador deberá establecer el periodo de aplicación.<br>• El sistema deberá registrar la fecha de inicio y la fecha de finalización.<br>• El sistema deberá permitir el acceso a las evaluaciones durante el periodo establecido.<br>• El sistema deberá permitir que los usuarios ingresen las veces necesarias para completar una evaluación que aún no haya sido enviada.<br>• Al finalizar el periodo, el sistema deberá impedir el registro de nuevas respuestas.<br>• El periodo de aplicación no deberá superar los 30 días. |
| **Salida** | Cuando el periodo haya finalizado, el sistema deberá informar al usuario que ya no es posible responder o modificar evaluaciones pendientes. |

---

## RF 07 (RE 12 / RE 16) — Almacenamiento de Respuestas e Historial

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá almacenar las respuestas proporcionadas durante las evaluaciones y autoevaluaciones y conservar un historial de procesos. |
| **Relaciones almacenadas** | Evaluador, Evaluado, Tipo de evaluación, Indicador evaluado, Respuesta proporcionada, Fecha de realización, Estado de la evaluación. |
| **Regla de conservación** | El sistema deberá conservar los registros correspondientes a los procesos de evaluación realizados desde la puesta en funcionamiento del sistema. |

---

## RF 08 (RE 13 / RE 14 / RE 15 / RE 17) — Consulta de Resultados

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir a la Directora de Administración consultar los resultados obtenidos durante el proceso de evaluación. |
| **Medios de información** | Tablas, Gráficas de barras, Gráficas de pastel, Comparativos, Sábanas de resultados, Reportes. |
| **Reglas de consulta** | • Los resultados deberán poder consultarse de acuerdo con los criterios definidos por la Institución.<br>• El resto de los usuarios no deberá tener acceso a los resultados generales de las evaluaciones. |

---

## RF 09 (RE 13 / RE 14) — Generación de Reportes

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir a la Directora de Administración generar reportes a partir de la información almacenada. |
| **Procesamiento** | Los reportes deberán presentar los resultados obtenidos de manera organizada y comprensible. |
| **Formatos permitidos** | El sistema deberá permitir la generación de reportes en los formatos establecidos para el proyecto, incluyendo PDF y Excel. |

---

## RF 10 (RE 13 / RE 17) — Impresión y Exportación de Resultados

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá permitir a la Directora de Administración imprimir los resultados de las evaluaciones y guardar los reportes generados en su equipo o en medios de almacenamiento autorizados. |
| **Regla de integridad** | El sistema deberá mantener la información original almacenada en el servidor institucional y la exportación de resultados no deberá modificar los registros originales. |

---

## RF 11 (RE 03 / RE 19) — Recuperación de Credenciales

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá proporcionar un mecanismo para que los usuarios puedan recuperar sus datos de acceso en caso de olvidar su contraseña. |
| **Procesamiento / Seguridad** | El mecanismo de recuperación deberá validar la identidad del usuario antes de permitir la recuperación o modificación de sus credenciales. |

---

## RF 12 (RE 18 / RE 19) — Gestor de Mensajes de Error y Validaciones

| Sección | Detalle |
|---|---|
| **Descripción** | El sistema deberá proporcionar mensajes de error cuando se presenten situaciones que impidan completar correctamente una operación. |
| **Situaciones contempladas** | • Campos obligatorios sin completar.<br>• Credenciales incorrectas.<br>• Datos con formato inválido.<br>• Intento de realizar una evaluación previamente enviada.<br>• Intento de acceder a información sin permisos.<br>• Intento de realizar una evaluación fuera del periodo establecido.<br>• Usuario que no cumpla con la antigüedad mínima requerida.<br>• Errores durante el almacenamiento de información. |
| **Regla de almacenamiento** | Ante un error de almacenamiento o comunicación, el sistema deberá informar al usuario que la operación no pudo completarse y evitará presentar la información como registrada. |