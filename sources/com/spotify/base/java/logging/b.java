package com.spotify.base.java.logging;

public class b implements e {
    private static final ThreadLocal<Exception> a = new a();

    class a extends ThreadLocal<Exception> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Exception initialValue() {
            return new Exception();
        }
    }

    @Override // com.spotify.base.java.logging.e
    public String v() {
        StackTraceElement stackTraceElement;
        int i;
        StackTraceElement[] stackTrace = a.get().fillInStackTrace().getStackTrace();
        int i2 = 3;
        while (true) {
            if (i2 >= stackTrace.length) {
                stackTraceElement = stackTrace[stackTrace.length - 1];
                break;
            }
            stackTraceElement = stackTrace[i2];
            if (!stackTraceElement.getClassName().contains("LoggerAdapter")) {
                break;
            }
            i2++;
        }
        String className = stackTraceElement.getClassName();
        if (className.startsWith("com.spotify.music.")) {
            i = 18;
        } else if (className.startsWith("com.spotify.mobile.android.")) {
            i = 27;
        } else {
            i = className.lastIndexOf(46) + 1;
        }
        String substring = className.substring(i);
        int lineNumber = stackTraceElement.getLineNumber();
        return Thread.currentThread().getName() + '@' + substring + ':' + lineNumber;
    }
}
