package br.com.kleryton.userapimicrosservicos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalConfig {

//    @Autowired
//    private UserRepositorie userRepositorie;
//
//    @Bean
//    public void startDB() {
//        User user01 = new User(null, "Kleryton", "kleryton.inside@gmail.com", "123");
//        User user02 = new User(null, "Maira", "maira.luana20@gmail.com", "456");
//        userRepositorie.saveAll(List.of(user01, user02));
//    }
}
