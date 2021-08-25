create table alumno (
    id int not null,
    nombre varchar(100) not null,
    app varchar(100) not null,
    apm varchar(100) not null
);
create table materia (
    id int not null,
    nombre varchar(100) not null
    
);
create table alumno_materia (
    id_Alumno int not null,
    id_Materia int not null,
    calificacion varchar(100) 
    
);