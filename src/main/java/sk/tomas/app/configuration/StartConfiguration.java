package sk.tomas.app.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Tomas Pachnik on 12-Jan-17.
 */

@Component
class StartConfiguration {

    static Logger loger = LoggerFactory.getLogger(StartConfiguration.class);

    @PostConstruct
    private void defaultIntialization() {
        loger.info("app start config");
    }

}
