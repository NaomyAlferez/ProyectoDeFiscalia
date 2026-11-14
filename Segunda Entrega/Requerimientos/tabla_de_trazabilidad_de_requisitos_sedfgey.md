# Tabla de Trazabilidad de Requisitos - SEDFGEY

Este documento establece la matriz de trazabilidad que conecta los **Requisitos Funcionales (RF)** y **Requisitos No Funcionales (RNF)** del *Sistema de Evaluación del Desempeño de la Fiscalía General del Estado de Yucatán (SEDFGEY)* con las clases, atributos y métodos implementados en el paquete `modelo` bajo la arquitectura MVC del proyecto.

---

## 1. Matriz de Trazabilidad: Requisitos Funcionales vs. Código

| ID Requisito | Descripción del Requisito | Clases Asociadas (`modelo`) | Atributos y Métodos Involucrados | Estado |
| :--- | :--- | :--- | :--- | :---: |
| **RF-01** | Autenticación y control de acceso al sistema para el personal de la fiscalía. | `Usuario` | `iniciarSesion()`, `cerrarSesion()`, `nombreUsuario`, `contrasena`, `tipoUsuario` | En progreso (Modelo listo) |
| **RF-02** | Gestión de usuarios (alta, modificación y baja de perfiles de empleados y administradores). | `Administrador`, `Usuario` | `registrarUsuario()`, `modificarUsuario()`, `eliminarUsuario()`, `codigoEmpleado`, `rfc`, `cargo`, `puesto`, `areaAdscripcion` | En progreso (Modelo listo) |
| **RF-03** | Configuración y establecimiento de los periodos de evaluación institucionales. | `Administrador`, `PeriodoEvaluacion` | `establecerPeriodoEvaluacion()`, `verificarVigencia()`, `idPeriodo`, `fechaInicio`, `fechaFin`, `activo` | En progreso (Modelo listo) |
| **RF-04** | Registro, guardado de borrador y envío formal de la evaluación de desempeño. | `Evaluacion` | `guardarBorrador()`, `enviarEvaluacion()`, `idEvaluacion`, `tipo`, `estado`, `fechaRealizacion`, `periodoInicio`, `periodoFin` | En progreso (Modelo listo) |
| **RF-05** | Validación de criterios de antigüedad e indicadores normativos para la evaluación. | `Evaluacion`, `Indicador` | `validarAntigüedad()`, `indicadores`, `idIndicador`, `criterio`, `descripcion` | En progreso (Modelo listo) |
| **RF-06** | Captura de respuestas detalladas, calificaciones y observaciones por cada indicador. | `Indicador`, `Respuesta` | `calificacion`, `idIndicador`, `idRespuesta`, `valorRespuesta`, `observaciones` | En progreso (Modelo listo) |
| **RF-07** | Generación, exportación e impresión de reportes de desempeño en formatos institucionales. | `Reporte` | `generarReporte()`, `exportar()`, `imprimir()`, `idReporte`, `tipoReporte`, `formato`, `fechaGeneracion` | En progreso (Modelo listo) |
| **RF-08** | Recuperación segura de credenciales de acceso para usuarios registrados. | `Usuario` | `recuperarContrasena()`, `nombreUsuario`, `rfc`, `codigoEmpleado` | En progreso (Modelo listo) |

---

## 2. Trazabilidad de Requisitos No Funcionales (RNF)

| ID RNF | Atributo de Calidad | Implementación en la Arquitectura y Clases |
| :--- | :--- | :--- |
| **RNF-01** | **Seguridad y Control de Acceso** | Encapsulamiento de atributos sensibles (`protected` / `private`) en `Usuario` y segregación de privilegios administrativos mediante herencia en la subclase `Administrador`. |
| **RNF-02** | **Integridad de Datos** | Tipado estricto en Java (`Date`, `int`, `double`, `boolean`, `List<Indicador>`) asegurando la consistencia entre las clases del modelo y el esquema de la base de datos. |
| **RNF-03** | **Mantenibilidad y Escalabilidad** | Separación de responsabilidades bajo el patrón arquitectónico **MVC** (paquete `modelo` desacoplado de las vistas y controladores). |

---

## 3. Notas de Verificación

* **Estado actual (Sprint 2):** Las entidades base del paquete `modelo` reflejan fielmente los atributos y comportamientos requeridos. Conforme se integren las capas de `Acceso a Datos (DAO)`, `Controladores` y `Vistas`, esta matriz se actualizará con sus respectivas rutas de archivo y métodos de enlace.