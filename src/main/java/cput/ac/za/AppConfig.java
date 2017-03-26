package cput.ac.za;

import cput.ac.za.QUESTION3.WithSpringFramework.AccountInterface;
import cput.ac.za.QUESTION3.WithSpringFramework.AccountInterfaceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mandisi on 3/26/2017.
 */
@Configuration
public class AppConfig {
    @Bean(name="calc")
    public AccountInterface balance(){
        return new AccountInterfaceImp();
    }
}
