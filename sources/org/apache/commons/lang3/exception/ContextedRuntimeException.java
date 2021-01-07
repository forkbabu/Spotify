package org.apache.commons.lang3.exception;

public class ContextedRuntimeException extends RuntimeException implements a {
    private static final long serialVersionUID = 20110706;
    private final a exceptionContext = new DefaultExceptionContext();

    @Override // org.apache.commons.lang3.exception.a
    public String a(String str) {
        return this.exceptionContext.a(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(super.getMessage());
    }
}
