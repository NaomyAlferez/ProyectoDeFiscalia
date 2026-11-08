-- Esquema de base de datos (MySQL)

CREATE DATABASE IF NOT EXISTS sedfgey
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE sedfgey;

-- Permite volver a ejecutar el script desde cero
DROP TABLE IF EXISTS reporte, respuesta, indicador, evaluacion, periodo_evaluacion, usuario;

CREATE TABLE usuario (
    id_usuario        INT AUTO_INCREMENT PRIMARY KEY,
    nombre            VARCHAR(150) NOT NULL,
    codigo_empleado   VARCHAR(20)  NOT NULL UNIQUE,
    rfc               VARCHAR(13)  NOT NULL UNIQUE,
    cargo             VARCHAR(100) NOT NULL,
    puesto            VARCHAR(100) NOT NULL,
    area_adscripcion  VARCHAR(120) NOT NULL,
    fecha_ingreso     DATE         NOT NULL,
    nombre_usuario    VARCHAR(50)  NOT NULL UNIQUE,
    contrasena_hash   VARCHAR(255) NOT NULL,
    tipo_usuario      VARCHAR(30)  NOT NULL,
    CHECK (tipo_usuario IN ('administrador', 'directora_administracion', 'servidor_publico'))
);

CREATE TABLE periodo_evaluacion (
    id_periodo    INT AUTO_INCREMENT PRIMARY KEY,
    fecha_inicio  DATE    NOT NULL,
    fecha_fin     DATE    NOT NULL,
    activo        BOOLEAN NOT NULL DEFAULT FALSE,
    CHECK (fecha_fin >= fecha_inicio)
);

CREATE TABLE evaluacion (
    id_evaluacion        INT AUTO_INCREMENT PRIMARY KEY,
    tipo                 VARCHAR(50) NOT NULL,
    fecha_realizacion    DATE,
    estado               VARCHAR(20) NOT NULL DEFAULT 'borrador',
    periodo_inicio       DATE        NOT NULL,
    periodo_fin          DATE        NOT NULL,
    id_usuario_emisor    INT         NOT NULL,
    id_usuario_receptor  INT         NOT NULL,
    id_periodo           INT         NOT NULL,
    FOREIGN KEY (id_usuario_emisor)   REFERENCES usuario (id_usuario),
    FOREIGN KEY (id_usuario_receptor) REFERENCES usuario (id_usuario),
    FOREIGN KEY (id_periodo)          REFERENCES periodo_evaluacion (id_periodo),
    CHECK (periodo_fin >= periodo_inicio),
    CHECK (estado IN ('borrador', 'enviada'))
);

CREATE TABLE indicador (
    id_indicador   INT AUTO_INCREMENT PRIMARY KEY,
    descripcion    VARCHAR(255) NOT NULL,
    criterio       VARCHAR(255) NOT NULL,
    calificacion   DECIMAL(5,2),
    ponderacion    DECIMAL(5,2) NOT NULL,
    id_evaluacion  INT NOT NULL,
    FOREIGN KEY (id_evaluacion) REFERENCES evaluacion (id_evaluacion)
        ON DELETE CASCADE
);

CREATE TABLE respuesta (
    id_respuesta     INT AUTO_INCREMENT PRIMARY KEY,
    valor_respuesta  VARCHAR(255) NOT NULL,
    observaciones    TEXT,
    id_indicador     INT NOT NULL UNIQUE,
    FOREIGN KEY (id_indicador) REFERENCES indicador (id_indicador)
        ON DELETE CASCADE
);

CREATE TABLE reporte (
    id_reporte        INT AUTO_INCREMENT PRIMARY KEY,
    tipo_reporte      VARCHAR(50) NOT NULL,
    formato           VARCHAR(20) NOT NULL,
    fecha_generacion  DATE        NOT NULL,
    id_directora      INT         NOT NULL,
    FOREIGN KEY (id_directora) REFERENCES usuario (id_usuario)
);