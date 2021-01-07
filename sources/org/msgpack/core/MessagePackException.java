package org.msgpack.core;

public class MessagePackException extends RuntimeException {
    static {
        new IllegalStateException("Cannot reach here");
    }

    public MessagePackException() {
    }

    public MessagePackException(String str) {
        super(str);
    }

    public MessagePackException(Throwable th) {
        super(th);
    }
}
