package io.netty.handler.timeout;

public final class ReadTimeoutException extends TimeoutException {
    private static final long serialVersionUID = 169287984113283421L;

    static {
        new ReadTimeoutException();
    }

    private ReadTimeoutException() {
    }
}
