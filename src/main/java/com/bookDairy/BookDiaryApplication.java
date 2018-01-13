package com.bookDairy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Maryna Kontar.
 */

@SpringBootApplication
public class BookDiaryApplication
    //		extends SpringBootServletInitializer //need if we want to create a deployable war file
{
        public static void main(String[] args) {
            SpringApplication.run(BookDiaryApplication.class, args);
        }

        //need if we want to create a deployable war file
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(BookstoreApplication.class);
//	}
}
