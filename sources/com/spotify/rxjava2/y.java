package com.spotify.rxjava2;

public final class y {
    private final String a;
    private final StackTraceElement[] b;
    private final StackTraceElement[] c;

    private y(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        this.a = str;
        this.b = stackTraceElementArr;
        this.c = stackTraceElementArr2;
    }

    public static y c(String str, StackTraceElement[] stackTraceElementArr) {
        return new y(str, stackTraceElementArr, x.a());
    }

    public Throwable a(String str, String str2) {
        RuntimeException runtimeException = new RuntimeException(str2);
        runtimeException.setStackTrace(this.b);
        RuntimeException runtimeException2 = new RuntimeException(str, runtimeException);
        runtimeException2.setStackTrace(this.c);
        return runtimeException2;
    }

    public String b() {
        return this.a;
    }
}
