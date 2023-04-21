CREATE DATABASE `alumnos`;
CREATE TABLE `datosalumnos` (
	`idAlumno` INT(11) NOT NULL AUTO_INCREMENT,
	`CarreraAlumno` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`nombreAlumno` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`ApellidoAlumno` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`nota1` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`nota2` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`nota3` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	PRIMARY KEY (`idAlumno`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
ROW_FORMAT=DYNAMIC
AUTO_INCREMENT=4
;
