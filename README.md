#Flow with JDBC
Main: Container start → AppConfig load.
AppConfig:
dataSource DB connect chesthundi.
jdbcTemplate DB queries run chesthundi.
movie bean DB nunchi data teeskuntadi → ticket → bookingService.
BookingService: DB data tho ticket confirm chesthundi.
Movie, Ticket, BookingService classes — just data source DB ayindi.
Movie → Ticket → BookingService flow ayi, output same vasthundi: "Booking confirmed: Ticket for Pushpa 2 at 7:00 PM, Seat: A12".              

 pgadmin ddl
----------------

CREATE TABLE movies (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    show_time VARCHAR(20)
);
INSERT INTO movies (name, show_time) VALUES ('Pushpa 2', '7:00 PM');
