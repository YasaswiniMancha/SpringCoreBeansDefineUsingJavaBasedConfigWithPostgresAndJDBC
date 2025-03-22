package com.example.movieTicketBooking;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/yash");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public Movie movie(JdbcTemplate jdbcTemplate) {
        String name = jdbcTemplate.queryForObject("SELECT name FROM movies WHERE id = 1", String.class);
        String showTime = jdbcTemplate.queryForObject("SELECT show_time FROM movies WHERE id = 1", String.class);
        return new Movie(name, showTime);
    }

    @Bean
    public Ticket ticket(Movie movie) {
        return new Ticket(movie, "A12");
    }

    @Bean
    public BookingService bookingService(Ticket ticket) {
        BookingService service = new BookingService();
        service.setTicket(ticket);
        return service;
    }
}