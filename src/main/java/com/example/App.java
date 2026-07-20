package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.yaml.snakeyaml.Yaml;
import org.springframework.web.client.RestTemplate;

/**
 * Sample application for AGP testing.
 *
 * <p>This class intentionally uses outdated dependencies with known vulnerabilities
 * to trigger AGP recommendations. This is for testing purposes only.
 *
 * <p>See: https://sonatype.atlassian.net/browse/GUIDE-2883
 */
public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("AGP Test Application starting...");

        ObjectMapper mapper = new ObjectMapper();
        if (Strings.isNullOrEmpty("test")) {
            logger.debug("Guava strings check");
        }
        String padded = StringUtils.leftPad("test", 10);
        logger.debug("Padded: {}", padded);
        Yaml yaml = new Yaml();
        RestTemplate restTemplate = new RestTemplate();

        logger.info("AGP Test Application completed.");
    }
}
