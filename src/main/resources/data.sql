--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from book;
delete from members;
delete from borrow;

INSERT INTO book (isbn, title, writer, year, category, borrowed) VALUES
(1234567890, 'Don Quijote de la Mancha', 'Miguel de Cervantes', 1605, 1, 0),
(2345678901, 'Cien años de soledad', 'Gabriel García Márquez', 1967, 1, 0),
(3456789012, 'El principito', 'Antoine de Saint-Exupéry', 1943, 0, 1),
(4567890123, '1984', 'George Orwell', 1949, 1, 0),
(5678901234, 'Moby Dick', 'Herman Melville', 1851, 1, 0),
(6789012345, 'Orgullo y prejuicio', 'Jane Austen', 1813, 1, 0),
(7890123456, 'Harry Potter y la piedra filosofal', 'J.K. Rowling', 1997, 0, 1),
(8901234567, 'El Hobbit', 'J.R.R. Tolkien', 1937, 0, 0),
(9012345678, 'Los juegos del hambre', 'Suzanne Collins', 2008, 0, 1),
(1122334455, 'Crónica de una muerte anunciada', 'Gabriel García Márquez', 1981, 1, 0),
(1223344556, 'Fahrenheit 451', 'Ray Bradbury', 1953, 1, 0),
(1324354657, 'Alicia en el país de las maravillas', 'Lewis Carroll', 1865, 0, 1),
(1425364758, 'Las aventuras de Sherlock Holmes', 'Arthur Conan Doyle', 1892, 1, 0),
(1526374859, 'La sombra del viento', 'Carlos Ruiz Zafón', 2001, 1, 0),
(1627384950, 'It', 'Stephen King', 1986, 1, 1),
(1728394051, 'Drácula', 'Bram Stoker', 1897, 1, 0),
(1829405162, 'Frankenstein', 'Mary Shelley', 1818, 1, 0),
(1928415263, 'El código Da Vinci', 'Dan Brown', 2003, 1, 1),
(2031526374, 'La Odisea', 'Homero', -800, 1, 0),
(2142637485, 'El señor de los anillos', 'J.R.R. Tolkien', 1954, 1, 1),
(2253748596, 'Los miserables', 'Victor Hugo', 1862, 1, 0),
(2364859607, 'Peter Pan', 'J.M. Barrie', 1911, 0, 1),
(2475960718, 'Corazón', 'Edmundo de Amicis', 1886, 0, 0),
(2586071829, 'El extraño caso del Dr. Jekyll y Mr. Hyde', 'Robert Louis Stevenson', 1886, 1, 0),
(2697182930, 'El retrato de Dorian Gray', 'Oscar Wilde', 1890, 1, 1),
(2708193041, 'Viaje al centro de la Tierra', 'Julio Verne', 1864, 1, 0),
(2819204152, '20.000 leguas de viaje submarino', 'Julio Verne', 1870, 1, 0),
(2920315263, 'Los tres mosqueteros', 'Alexandre Dumas', 1844, 1, 1),
(3031426374, 'Anna Karenina', 'León Tolstói', 1877, 1, 0),
(3142537485, 'El conde de Montecristo', 'Alexandre Dumas', 1844, 1, 0),
(3253648596, 'La isla del tesoro', 'Robert Louis Stevenson', 1883, 0, 1),
(3364759607, 'Matilda', 'Roald Dahl', 1988, 0, 0),
(3475860718, 'Charlie y la fábrica de chocolate', 'Roald Dahl', 1964, 0, 1),
(3586971829, 'Las crónicas de Narnia', 'C.S. Lewis', 1950, 0, 0),
(3697082930, 'Caperucita Roja', 'Hermanos Grimm', 1812, 0, 1),
(3708193041, 'Blancanieves', 'Hermanos Grimm', 1812, 0, 0),
(3819204152, 'Rapunzel', 'Hermanos Grimm', 1812, 0, 1),
(3920315263, 'Hansel y Gretel', 'Hermanos Grimm', 1812, 0, 0),
(4031426374, 'Pinocho', 'Carlo Collodi', 1883, 0, 1),
(4142537485, 'Mujercitas', 'Louisa May Alcott', 1868, 1, 0),
(4253648596, 'El mago de Oz', 'L. Frank Baum', 1900, 0, 1),
(4364759607, 'Donde viven los monstruos', 'Maurice Sendak', 1963, 0, 0),
(4475860718, 'El libro de la selva', 'Rudyard Kipling', 1894, 0, 1),
(4586971829, 'Percy Jackson y el ladrón del rayo', 'Rick Riordan', 2005, 0, 1),
(4697082930, 'Eragon', 'Christopher Paolini', 2002, 0, 0),
(4708193041, 'El diario de Ana Frank', 'Ana Frank', 1947, 1, 1),
(4819204152, 'La ladrona de libros', 'Markus Zusak', 2005, 1, 0),
(4920315263, 'Bajo la misma estrella', 'John Green', 2012, 1, 1);

INSERT INTO "book" ("isbn", "title", "writer", "year", "category", "borrowed")
SELECT 9789998887000 + ROW_NUMBER() OVER(), 'Libro ' || ROW_NUMBER() OVER(), 'Autor ' || ROW_NUMBER() OVER(), 1900 + (ROW_NUMBER() OVER() % 124),
       CASE WHEN (ROW_NUMBER() OVER() % 2) = 0 THEN 1 ELSE 0 END, CASE WHEN (ROW_NUMBER() OVER() % 3) = 0 THEN 1 ELSE 0 END
FROM (SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 
      UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9 UNION ALL SELECT 10
      UNION ALL SELECT 11 UNION ALL SELECT 12 UNION ALL SELECT 13 UNION ALL SELECT 14 UNION ALL SELECT 15
      UNION ALL SELECT 16 UNION ALL SELECT 17 UNION ALL SELECT 18 UNION ALL SELECT 19 UNION ALL SELECT 20) AS X
CROSS JOIN (SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 
      UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9 UNION ALL SELECT 10
      UNION ALL SELECT 11 UNION ALL SELECT 12 UNION ALL SELECT 13 UNION ALL SELECT 14 UNION ALL SELECT 15
      UNION ALL SELECT 16 UNION ALL SELECT 17 UNION ALL SELECT 18 UNION ALL SELECT 19 UNION ALL SELECT 20) AS Y
LIMIT 461;





INSERT INTO members (idMember, name, staff, birthDate, category, tlf, hasABook) VALUES
('12345678A', 'Juan Pérez', 1, '1985-06-15', 1, 600123456, 0),
('23456789B', 'María López', 0, '1992-08-21', 1, 611234567, 1),
('34567890C', 'Pedro Gómez', 0, '1980-11-10', 1, 622345678, 0),
('1', 'Ana Torres', 0, '2014-02-25', 0, 633456789, 1),
('2', 'Luis Sánchez', 0, '2016-07-30', 0, 644567890, 0),
('3', 'Sofía Ramírez', 0, '2012-05-19', 0, 655678907, 1),
('45678901D', 'Elena Martín', 1, '1975-09-05', 1, 666789012, 0),
('56789012E', 'Carlos Fernández', 0, '1999-12-13', 1, 677890123, 1),
('4', 'Javier Castro', 0, '2015-04-08', 0, 688901234, 0),
('5', 'Isabel Moreno', 0, '2013-10-22', 0, 699012345, 1);




INSERT INTO borrow (title, name, idMember, isbn, borrowDate, returnDate) VALUES
('El principito', 'Sofía Ramírez', '3', 3456789012, '2025-03-01', '2025-03-16'),
('Harry Potter y la piedra filosofal', 'Ana Torres', '1', 7890123456, '2025-03-05', '2025-03-20'),
('Los juegos del hambre', 'Ana Torres', '1', 9012345678, '2025-03-05', '2025-04-04'),
('It', 'María López', '23456789B', 1627384950, '2025-03-02', '2025-03-17'),
('El código Da Vinci', 'Carlos Fernández', '56789012E', 1928415263, '2025-03-10', '2025-03-25'),
('El señor de los anillos', 'Carlos Fernández', '56789012E', 2142637485, '2025-03-10', '2025-04-09'),
('Los tres mosqueteros', 'María López', '23456789B', 2920315263, '2025-02-25', '2025-03-11'),
('El retrato de Dorian Gray', 'María López', '23456789B', 2697182930, '2025-02-25', '2025-03-11'),
('La isla del tesoro', 'Isabel Moreno', '5', 3253648596, '2025-03-08', '2025-03-23'),
('Charlie y la fábrica de chocolate', 'Isabel Moreno', '5', 3475860718, '2025-03-08', '2025-04-07'),
('Caperucita Roja', 'Sofía Ramírez', '3', 3697082930, '2025-02-28', '2025-03-14'),
('Rapunzel', 'Sofía Ramírez', '3', 3819204152, '2025-02-28', '2025-03-14'),
('Pinocho', 'Javier Castro', '4', 4031426374, '2025-03-09', '2025-03-24'),
('El mago de Oz', 'Javier Castro', '4', 4253648596, '2025-03-09', '2025-04-08'),
('El diario de Ana Frank', 'Carlos Fernández', '56789012E', 4708193041, '2025-02-20', '2025-03-07');

