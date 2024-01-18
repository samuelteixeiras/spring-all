package com.sam.springwebflux.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log")
public class LoggingController {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";


    public static final String ANSI_RED = "\u001B[31m";
    // Declaring the color
    public static final String ANSI_YELLOW = "\u001B[33m";

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public String logLevelMessages() {
        // log level debug and trace will not be displayed , the current log level is warn
        logger.trace(ANSI_YELLOW
                + "A TRACE Message"
                + ANSI_RESET);
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn(ANSI_YELLOW + "A WARN message" + ANSI_RESET);
        logger.error(ANSI_RED + "An ERROR Message" + ANSI_RESET);

        return "Check out the Logs to see the output...";
    }
}
