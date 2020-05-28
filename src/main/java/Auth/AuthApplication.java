package Auth;

import Auth.config.HibernateUtil;
import Auth.config.MigrationHelper;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
		Session session = HibernateUtil.getSessionFactory().openSession();
		MigrationHelper.addData(session);
	}

}
