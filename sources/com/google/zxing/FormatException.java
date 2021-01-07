package com.google.zxing;

public final class FormatException extends ReaderException {
    private static final FormatException c;

    static {
        FormatException formatException = new FormatException();
        c = formatException;
        formatException.setStackTrace(ReaderException.b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.a ? new FormatException() : c;
    }
}
