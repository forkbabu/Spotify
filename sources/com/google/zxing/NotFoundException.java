package com.google.zxing;

public final class NotFoundException extends ReaderException {
    static {
        new NotFoundException().setStackTrace(ReaderException.b);
    }

    private NotFoundException() {
    }
}
