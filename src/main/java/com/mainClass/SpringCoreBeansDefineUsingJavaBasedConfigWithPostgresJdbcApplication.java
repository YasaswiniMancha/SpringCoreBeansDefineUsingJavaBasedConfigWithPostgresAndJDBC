package com.mainClass;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.movieTicketBooking.AppConfig;
import com.example.movieTicketBooking.BookingService;

@SpringBootApplication
public class SpringCoreBeansDefineUsingJavaBasedConfigWithPostgresJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BookingService service = context.getBean(BookingService.class);
		service.bookTicket();
	}
}
