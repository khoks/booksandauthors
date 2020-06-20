package khoks.com.test.graphqlbackend.booksandauthors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BooksandauthorsApplication {

	//added a sample comment
	public static void main(String[] args) {
		SpringApplication.run(BooksandauthorsApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {	
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/getbooks").allowedOrigins("*");
				registry.addMapping("/getbooks/**").allowedOrigins("*");
			}
	    };
	 }

}
