3.3.5 Mantenibilidad

El sistema deberá estar diseñado y estructurado de forma modular y documentada para facilitar su soporte, corrección de incidentes, actualización de componentes y adaptación a futuras normativas de la Fiscalía General del Estado de Yucatán, minimizando el impacto en la operación continua.

Los requisitos de mantenibilidad serán los siguientes:

Identificación de los tipos de mantenimiento.

Mantenimiento correctivo: El sistema deberá facilitar la detección, diagnóstico y resolución de errores imprevistos en la lógica de negocio o en el almacenamiento de datos, permitiendo desplegar parches de corrección en un plazo máximo de 24 horas tras la notificación de un fallo crítico reportado durante el periodo de evaluación.

Mantenimiento preventivo: El sistema deberá permitir la depuración de archivos temporales, la revisión de bitácoras de auditoría y la optimización de índices de bases de datos de forma periódica para asegurar el rendimiento continuo.

Mantenimiento adaptativo y evolutivo: La arquitectura del sistema deberá permitir la incorporación de nuevas métricas de desempeño, adecuación a reformas en el Reglamento del Servicio Profesional de Carrera y la integración de nuevos catálogos de puestos o departamentos sin requerir una reestructuración completa del código fuente.

Roles y responsabilidades de mantenimiento.

Equipo de desarrollo / Soporte TI especializado: Será el responsable exclusivo de la modificación del código fuente, aplicación de parches de seguridad, optimización de consultas a la base de datos, actualización de librerías dependientes y ejecución de respaldos a nivel servidor.

Administrador del sistema (Dirección de Administración / TI interna): Podrá ejecutar tareas de mantenimiento operativo y de configuración sin tocar código, tales como la activación/desactivación de periodos de evaluación, gestión de roles de usuarios, asignación de dependencias jerárquicas y parametrización de catálogos institucionales.

Usuarios finales (servidores públicos y evaluadores): No intervendrán en tareas técnicas; su responsabilidad se limitará a la notificación de inconsistencias mediante los canales de soporte establecidos por la institución.

Periodicidad y ventanas de mantenimiento.

Tareas semanales: Generación y revisión de bitácoras de errores, monitoreo de cuotas de almacenamiento e inspección del estado de los servicios del servidor.

Tareas mensuales: Generación y análisis de estadísticas de acceso, evaluación de tiempos de respuesta en reportes y revisión de la integridad de los respaldos automatizados.

Ventanas de mantenimiento programado: Las labores de mantenimiento que requieran la suspensión temporal del servicio deberán ejecutarse fuera del horario laboral y fuera de los 30 días fijados para la aplicación de evaluaciones (preferentemente en fines de semana o turnos nocturnos, con previo aviso institucional de al menos 48 horas).

Estándares de modularidad y documentación técnica.

El código fuente deberá organizarse bajo una arquitectura en capas o modular que desacople la interfaz de usuario, la lógica de negocio y el acceso a datos.

El sistema deberá contar con manuales técnicos actualizados (arquitectura, diccionario de datos, procedimientos de despliegue) y manuales de usuario dirigidos a evaluadores y administradores.

El código deberá incluir comentarios técnicos claros en módulos críticos y apegarse a convenciones estándar de desarrollo para reducir la curva de aprendizaje de futuros desarrolladores.

3.3.6 Portabilidad

El sistema deberá contar con una arquitectura web desacoplada y estandarizada que garantice su correcta visualización, ejecución y posible migración entre diferentes entornos tecnológicos, servidores y navegadores web empleados dentro de la infraestructura de la Fiscalía General del Estado de Yucatán.

Los requisitos de portabilidad serán los siguientes:

Compatibilidad en el lado del cliente (Navegadores y dispositivos).

El sistema deberá operar y renderizarse de manera uniforme en los navegadores web modernos más utilizados en las estaciones de trabajo institucionales (Google Chrome, Microsoft Edge, Mozilla Firefox) en sus versiones vigentes o con hasta 2 versiones anteriores de soporte.

La interfaz de usuario deberá basarse en estándares web abiertos (HTML5, CSS3 y JavaScript moderno), evitando el uso de extensiones propietarias o plugins de terceros que requieran instalación local en los equipos de los servidores públicos.

El diseño de la interfaz deberá ser responsivo (responsive design), adaptándose a resoluciones de pantalla estándar de equipos de escritorio y computadoras portátiles institucionales (resoluciones mínimas de 1366x768 píxeles).

Independencia y portabilidad en el lado del servidor.

Porcentaje de código dependiente de plataforma: Al menos el 90 % del código del sistema (lógica de negocio e interfaz) deberá ser agnóstico del sistema operativo anfitrión, permitiendo su ejecución tanto en entornos basados en Linux (como Ubuntu Server o Red Hat Enterprise Linux) como en entornos Windows Server.

Dependencia de la base de datos: El acceso a la capa de persistencia deberá utilizar controladores o capas de abstracción estándar (como PDO u ORM/Query Builders estándar), de modo que los esquemas de bases de datos relacionales puedan migrarse entre motores compatibles (como MySQL o MariaDB) sin reescribir la lógica de la aplicación.

Plataforma y lenguaje de desarrollo: El desarrollo deberá apoyarse en un entorno multiplataforma ampliamente soportado y mantenido (como PHP/Node.js/Python bajo arquitecturas MVC estándar), asegurando que las dependencias externas se gestionen mediante administradores de paquetes estándar de la industria.

Facilidad de despliegue y traslado de entornos.

La configuración del entorno (credenciales de base de datos, rutas de archivos institucionales, llaves de cifrado) deberá manejarse a través de variables de entorno desacopladas del código base, facilitando el cambio entre entornos de desarrollo, pruebas y producción.

El sistema deberá estar preparado para su contenedorización (por ejemplo, mediante Docker) o empaquetamiento estándar, lo que permitirá transferir la solución completa entre servidores locales de la Fiscalía o hacia esquemas de nube privada gubernamental con un esfuerzo de reconfiguración mínimo.
