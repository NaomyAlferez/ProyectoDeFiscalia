# Plan de verificación de requisitos funcionales y no funcionales

### 1. Introducción

El presente documento establece el plan de verificación de los requisitos funcionales (RF) y no funcionales (RNF) del Sistema de Evaluación del Desempeño de la Fiscalía General del Estado de Yucatán.

Su propósito es definir los métodos y procedimientos que se utilizarán para comprobar que el sistema cumple con las funcionalidades solicitadas y con los atributos de calidad establecidos.

Para ello, se utilizarán métodos de verificación formales e informales, de acuerdo con la naturaleza de cada requisito, estableciendo criterios que permitan determinar si se cumple con lo especificado.

------

### 2. Métodos de verificación

Para comprobar el cumplimiento de los requisitos del sistema se utilizarán dos métodos de verificación:


**2.1. Método formal**

Consiste en realizar pruebas estructuradas mediante procedimientos, datos de entrada y resultados esperadosm los cuales, nos permitiran comprobar de manera objetiva si el sistema cumple con los requisitos establecidos.

Se plantea utilizar principalmente para la verificación de funcionalidades, permisos, validaciones, tiempos de respuesta, seguridad y comportamiento del sistema.

**2.2.  Método informal**

Se realizarán revisiones visuales, documentales u observaciones del funcionamiento del sistema, sin requerir necesariamente casos de prueba.

Se plantea utulizar para la evaluación de la laridad de la interfaz, facilididad de navegación, documentación y organización de las actividades de mantenimiento.

_____

### 3. Verificación de requisitos funcionales

La verificación de los requisitos funcionales se realizará principalmente mediante el método formal.

| **ID** | **Método de verificación** | **Procedimiento de verificación** | **Criterio de aceptación** |
|--|--|--|--|
|RE01| Formal | Intentar registrar servidores públicos con datos válidos e inválidos. | El sistema registra los usuarios con información válida y rechaza los datos incorrectos.
|RE02 | Formal | Probar las operaciones de consulta, modificación y eliminación de usuarios. | Las operaciones se realizan correctamente y respetan los permisos establecidos|
|RE03  | Formal | Iniciar sesión utilizando credenciales correctas e incorrectas. | El acceso se permite únicamente con credenciales válidas. |
|RE04|Formal|Ingresar al sistema con diferentes tipos de usuario.|Cada usuario accede únicamente a las funciones correspondientes a su rol.|
|RE05|Formal|Consultar información de usuarios con diferentes permisos.| La información se muestra únicamente a usuarios autorizados.|
|RE06|Formal| Realizar una evaluación a un servidor público asignado.| El evaluador puede evaluar al personal que tiene asignado.|
|RE07|Formal|Intentar realizar una autoevaluación con la cuenta del usuario.|El usuario puede realizar su propia evaluación.
|RE08| Formal|Probar asignaciones de evaluadores y evaluadis según la estructura organizacional.|Las asignaciones respetan los niveles jerárquicos establecidos.|
|RE09|Formal|Probar usuarios con menos de seis meses y con seis meses o más antigüedad.|Solo los usuarios que cumplen la antigüedad mínima pueden participar en la evaluación correspondiente.|
|RE10|Formal|Intentar registrar una segunda evaluación para la misma asifnación y modificar una evaluación enviada.| No se permiten evaluaciones duplicadas ni modificaciones después del envío.|
|RE11|Formal|Probar periodos de evaluación con diferentes duraciones y fechas de acceso.|El periodo no supera los 30 días y solo permite participar dentro de las fechas establecidas.|
|RE12|Formal|Registrar respuestas y consultar su asociación con el evaluador, evaluado y proeso.|Las respuestas quedan almacenadas y relacionadas correctamente. |
|RE13|Formal|Consultar los resultados de evaluaciones realizadas.|El sistema muestra los resultados correspondientes a los registros existentes.|
|RE14|Formal|General gráficas de barras y circulares a partir de resultados registrados.| Las gráficas representan correctamente los datos obtenidos. |
|RE15|Formal| Comparar los resultados de una evaluación con los de una autoevaluación.|El sistema presenta correctamente ambos resultados para su comparación.|
|RE16|Formal|onsultar evaluaciones correspondientes a periodos anterioes.|Los resultados históricos se conservan y pueden consultarse.|
|RE17|Formal|Intentar consultar resultados con cuentas de diferentes roles.|Únicamente la Directora de Administración puede acceder a los resultados.|
|RE18|Formal|Introducir códigos de empleado y RFC con formatos  válidos e inválidos.|El código de empleado acepta únicamente valores numéricos y el RFC valores alfanuméricos.|
|RE19|Formal|Intentar ingresar al sistema con campos de usuario o contraseña vacíos.|El sistema exige ambos campos para permitir el acceso.|
|RE20|Informal|Revisar la disponivilidad de los avisos de privacidad y reglamentos institucionales correspondientes.|Documentos requeridos se encuentran disponibles para su consulta por los usuarios.

-----


### 4. Verificación de requisitos no funcionales.

La verificación de los requisitos no funcioanles se realizará mediante pruebas técnicas, mediciones y revisiones documentales.

|**ID**|**Método de verificación**|**Procedimiento de verificación**|**Criterio de aceptación**|
|--|--|--|--|
|RNF01|Formal|Medir los tiempos de autenticación, navegación, guardado, consultas y generación de reportes.|Las operaciones no superan los tiempos establecidos: 3, 5 y 10 segundos, respectivamente.
|RNF02|Formal|Simular el acceso simultáneo de varios servidores públicos al sistema.|El sistema permite el acceso concurrente sin errores ni pérdida de información. |
|RNF03|Formal|Realizar pruebas con cuentas de diferentes roles y verifiar los permisos disponibles.|Cada usuario accede únicamente a las funciones autorizadas para su rol.|
|RNF04|Formal|Probar las validaciones, el bloqueo de modificaciones después del envío y la recuperación de respaldos.|Los datos se mantienen su integridad, las evaluaciones enviadas no pueden modificarse.
|RNF05|Informal|Realizar revisiones de la interfaz y evaluaciones con usuarios sobre la facilidad de navegacipon y compresión.|La interfaz es clara, comprensible y facilita la realización de las actividades.|
|RNF06|Formal|Simular interrupciones de red o fallos del sistema durante las operaciones.|No se producen pérdidas  ni duplicaciones de información.|
|RNF07|Formal|Consultar registros de evaluaciones de periodos anteriores.|La información histórica se conserva y está disponible para consulta.|
|RNF08|Formal|Monitorear la disponibilidad del sistema durante el periodo de evaluación.|El sistema mantiene una disponibilidad mínima del 99% considerando las condiciones de mantenimiento establecidas.|
|RNF09|Formal|Simular una falla interna y medir el tiempo necesario para restablecer el servicio.|El servicio se restablece en un máximo de 30 minutos.|
|RNF10|Formal|Revisar la documentación de mantenimiento, las responsabilidades y los registros de actividades técnicas y administrativas.|Las tareas de mantenimiento y operación cuentan con responsabilidades y procedimientos definidos.
|RNF11|Formal|Ejecutar pruebas en diferentes navegadores y comprobar la compatibilidad con la infraestructura de servidores de la fiscalía.|El sistema funciona correctamente en los entornos compatibles establecidos. 

----

### 5. Criterios generales y evidencias de verificación

**5.1. Criterios generales**

- Cada requisito deberá verificarse mediante el método establecido  en su correspondiente matriz.
- Los resultados obtenidos deberán compararse con los criterios de aceptación definidos.
- Un requisito se considerará cumplido cuando las pruebas o revisiones demuestren que satisface las condiciones establecidas.
- Si se identifican incumplimientos, deberán registrarse para su corrección y posterior verificación.

**5.2. Evidencias de verificación**

Como evidencia del proceso de verificación se podrán utilizar:

- Capturas de pantalla del funcionamiento del sistema.
- Resultados de ejecución de casos de prueba.
- Registros de tiempos de respuesta y disponibilidad.
- Evidencias de pruebas de acceso y permisos.
- Registros de respaldos y recuperación de información.