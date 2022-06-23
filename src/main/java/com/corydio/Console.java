package com.corydio;

import java.util.logging.Logger;

public class Console {
    // THE object
    private static Console console;

    // internal factory
    private Logger logger;

    Console(Logger _logger) {
        this.logger = _logger;
    }

    private void _log(String msg) {
        this.logger.info(msg);
    }

    // public-facing static methods
    public static void initLogger(Logger logger) {
        console = new Console(logger);
    }

    public static void log(String msg) {
        if (console != null) {
            console._log(msg);
        }
    }
}
