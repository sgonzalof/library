--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table book;
drop table borrow;
drop table members;



CREATE TABLE IF NOT EXISTS "book" (
	"isbn"	INTEGER NOT NULL,
	"title"	TEXT NOT NULL,
	"writer"	TEXT NOT NULL,
	"year"	INTEGER NOT NULL,
	"category"	INTEGER NOT NULL,
	"borrowed"	INTEGER NOT NULL,
	PRIMARY KEY("isbn")
);

CREATE TABLE IF NOT EXISTS "borrow" (
	"title"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"idMember"	TEXT NOT NULL,
	"isbn"	INTEGER NOT NULL,
	"borrowDate"	TEXT NOT NULL,
	"returnDate"	TEXT NOT NULL,
	PRIMARY KEY("idMember","isbn"),
	FOREIGN KEY("idMember") REFERENCES "members"("idMember"),
	FOREIGN KEY("isbn") REFERENCES "book"("isbn")
);

CREATE TABLE IF NOT EXISTS "members" (
	"idMember"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"staff"	INTEGER NOT NULL,
	"birthDate"	TEXT NOT NULL,
	"category"	INTEGER NOT NULL,
	"tlf"	INTEGER NOT NULL,
	"hasABook"	INTEGER,
	PRIMARY KEY("idMember")
);
