package io.netty.handler.timeout;

public final class WriteTimeoutException extends TimeoutException {
    private static final long serialVersionUID = -144786655770296065L;

    static {
        new WriteTimeoutException();
    }

    private WriteTimeoutException() {
    }
}
