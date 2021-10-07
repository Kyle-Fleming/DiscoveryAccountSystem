package za.ac.nwu.ac.translator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.repo.config.RepositoryConfig;

@Import({RepositoryConfig.class})
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.translator"
})
@Configuration
public class TranslatorConfig {
}
