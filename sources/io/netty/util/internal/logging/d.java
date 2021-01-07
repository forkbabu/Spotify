package io.netty.util.internal.logging;

import java.util.logging.Logger;

public class d extends c {
    public static final c c = new d();

    @Override // io.netty.util.internal.logging.c
    public b c(String str) {
        return new JdkLogger(Logger.getLogger(str));
    }
}
