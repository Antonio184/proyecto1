create database bd_estudiante;

create table tb_estudiante(
	id_estudiante int(11) not null auto_increment,
	nom_estudiante varchar(45) default null,
	ape_estudiante varchar(45) default null,
	carnet_estudiante varchar(25) default null,
	edad_estudiante int(3) default null,
	primary key(id_estudiante))
	engine=innodb auto_increment=1