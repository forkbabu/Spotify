package io.netty.util.internal.logging;

import org.apache.log4j.Logger;

public class e extends c {
    public static final c c = new e();

    @Override // io.netty.util.internal.logging.c
    public b c(String str) {
        return new Log4JLogger(Logger.getLogger(str));
    }
}
