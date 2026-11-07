# Priorización de Requisitos - Sistema de Evaluación de Desempeño (FGE)

Propuesta de priorización basada en la metodología MoSCoW para asegurar el desarrollo incremental y estructurado del sistema:

- 🟢 Verde: Requisitos críticos que forman el núcleo operativo y sin los cuales el sistema no puede funcionar.
- 🟡 Amarillo: Requisitos necesarios para completar el flujo operativo normal, pero que dependen del núcleo.
- 🔴 Rojo: Funcionalidades secundarias o de conveniencia que pueden implementarse en fases posteriores si el tiempo lo permite.

---

## Tabla de Requisitos Funcionales (RF)

| Prioridad | Requisito | Descripción / Justificación |
| :---: | :--- | :--- |
| 🟢<br>Must Have | **RF 02:** Autenticación y Control de Acceso | Es la base de todo el sistema. Sin autenticación y control de roles, ningún otro módulo es seguro ni funcional. |
| 🟢<br>Must Have | **RF 01:** Registro y Administración de Usuarios | Se necesitan usuarios registrados y con roles asignados antes de poder aplicar cualquier evaluación. |
| 🟢<br>Must Have | **RF 04:** Aplicación de Evaluación de Desempeño | Es el objetivo central del software (la razón de ser del negocio). |
| 🟢<br>Must Have | **RF 07:** Almacenamiento de Respuestas e Historial | Vital para garantizar que la información no se pierda y mantenga la integridad transaccional. |
| 🟡<br>Should Have | **RF 05:** Aplicación de Autoevaluación | Complementa la evaluación principal, pero depende de que el usuario ya pueda ingresar al sistema. |
| 🟡<br>Should Have | **RF 06:** Control del Periodo de Evaluación | Importante para la operación temporal, aunque el sistema podría operar inicialmente con control manual. |
| 🟡<br>Should Have | **RF 08:** Consulta de Resultados | Fundamental para la toma de decisiones, pero requiere que primero existan evaluaciones concluidas. |
| 🔴<br>Could Have | **RF 09:** Generación, Exportación e Impresión de Reportes | Los datos ya pueden consultarse en pantalla (RF 08). Los reportes PDF/Excel se pueden dejar para una fase posterior. |
| 🔴<br>Could Have | **RF 03:** Recuperación de Credenciales | En una primera versión, el Administrador (RF 01) puede restablecer las contraseñas directamente de forma manual. |

---

## Fases de Implementación recomendadas

1. **Fase 1 (MVP - Producto Mínimo Viable):** RF 01, RF 02, RF 04, RF 07 + RNF de Seguridad y Fiabilidad.
2. **Fase 2 (Operación Completa):** RF 05, RF 06 y RF 08.
3. **Fase 3 (Optimización y Cierre):** RF 03 y RF 09.