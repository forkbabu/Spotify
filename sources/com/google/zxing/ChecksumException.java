package com.google.zxing;

public final class ChecksumException extends ReaderException {
    static {
        new ChecksumException().setStackTrace(ReaderException.b);
    }

    private ChecksumException() {
    }
}
