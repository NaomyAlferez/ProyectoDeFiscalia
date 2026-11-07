### Descripción general

Los **Requisitos No Funcionales (RNF)** definen los atributos de calidad y restricciones técnicas del sistema para el proceso de evaluaciones y autoevaluaciones de la **Fiscalía General del Estado de Yucatán (FGE)**, garantizando una plataforma rápida, segura, disponible y conforme a la normativa institucional.

### Requisitos No Funcionales (RNF)

| Categoría | Criterio / Aspecto | Descripción resumida |
| :--- | :--- | :--- |
| **Rendimiento** | Tiempos de respuesta | $\le$ 3 s para autenticación, navegación y guardado; $\le$ 5 s para consultas; $\le$ 10 s para reportes PDF/Excel. |
| **Rendimiento** | Concurrencia | Soporte de acceso simultáneo para los servidores públicos evaluados. |
| **Seguridad** | Control de acceso | Autenticación con credenciales y roles (Directora: gestión y resultados; Usuarios: solo sus evaluaciones). |
| **Seguridad** | Integridad y Normativa | Validación de datos, bloqueo de cambios tras el envío, respaldos y cumplimiento de avisos de privacidad y reglamentos. |
| **Usabilidad** | Interfaz intuitiva | Diseño de pantallas accesible, claro y alineado a la identidad gráfica institucional para facilitar la navegación del usuario. |
| **Fiabilidad** | Tolerancia a fallos | Conservación de datos y prevención de duplicados o pérdidas ante fallas de red o del sistema. |
| **Fiabilidad** | Historial | Preservación y disponibilidad para consulta del registro histórico de evaluaciones. |
| **Disponibilidad** | Uptime operativo | Disponibilidad mínima del **99%** en periodo de evaluación (mantenimientos programados fuera de horario). |
| **Disponibilidad** | Recuperación | Restablecimiento del servicio en un tiempo máximo de **30 minutos** ante fallos internos. |
| **Mantenibilidad** | Gestión de tareas | Mantenimiento técnico a cargo de desarrollo; tareas operativas y estadísticas periódicas por el administrador. |
| **Portabilidad** | Compatibilidad | Arquitectura web desacoplada, multi-navegador y compatible con la infraestructura de servidores de la Fiscalía. |