package io.netty.util.internal.logging;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class JdkLogger extends AbstractInternalLogger {
    static final String b = JdkLogger.class.getName();
    static final String c = AbstractInternalLogger.class.getName();
    private static final long serialVersionUID = -1767272577989225979L;
    final transient Logger a;

    JdkLogger(Logger logger) {
        super(logger.getName());
        this.a = logger;
    }

    private void z(String str, Level level, String str2, Throwable th) {
        LogRecord logRecord = new LogRecord(level, str2);
        logRecord.setLoggerName(name());
        logRecord.setThrown(th);
        String str3 = c;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                i = -1;
                break;
            }
            String className = stackTrace[i].getClassName();
            if (className.equals(str) || className.equals(str3)) {
                break;
            }
            i++;
        }
        while (true) {
            i++;
            if (i >= stackTrace.length) {
                i = -1;
                break;
            }
            String className2 = stackTrace[i].getClassName();
            if (!className2.equals(str) && !className2.equals(str3)) {
                break;
            }
        }
        if (i != -1) {
            StackTraceElement stackTraceElement = stackTrace[i];
            logRecord.setSourceClassName(stackTraceElement.getClassName());
            logRecord.setSourceMethodName(stackTraceElement.getMethodName());
        }
        this.a.log(logRecord);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean a() {
        return this.a.isLoggable(Level.WARNING);
    }

    @Override // io.netty.util.internal.logging.b
    public void b(String str, Object obj, Object obj2) {
        Logger logger = this.a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            a d = f.d(str, obj, obj2);
            z(b, level, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean c() {
        return this.a.isLoggable(Level.FINE);
    }

    @Override // io.netty.util.internal.logging.b
    public void d(String str) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            z(b, level, str, null);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void debug(String str, Object... objArr) {
        Logger logger = this.a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            a a2 = f.a(str, objArr);
            z(b, level, a2.a(), a2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void e(String str, Object obj, Object obj2) {
        Logger logger = this.a;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            a d = f.d(str, obj, obj2);
            z(b, level, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void error(String str, Object... objArr) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            a a2 = f.a(str, objArr);
            z(b, level, a2.a(), a2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean f() {
        return this.a.isLoggable(Level.INFO);
    }

    @Override // io.netty.util.internal.logging.b
    public void g(String str, Object obj, Object obj2) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            a d = f.d(str, obj, obj2);
            z(b, level, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean h() {
        return this.a.isLoggable(Level.FINEST);
    }

    @Override // io.netty.util.internal.logging.b
    public void i(String str, Throwable th) {
        if (this.a.isLoggable(Level.INFO)) {
            z(b, Level.INFO, str, th);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void j(String str, Throwable th) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            z(b, level, str, th);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void k(String str, Throwable th) {
        Logger logger = this.a;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            z(b, level, str, th);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void l(String str, Object obj) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            a c2 = f.c(str, obj);
            z(b, level, c2.a(), c2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void m(String str, Object obj) {
        Logger logger = this.a;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            a c2 = f.c(str, obj);
            z(b, level, c2.a(), c2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void n(String str, Throwable th) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            z(b, level, str, th);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean o() {
        return this.a.isLoggable(Level.SEVERE);
    }

    @Override // io.netty.util.internal.logging.b
    public void p(String str) {
        Logger logger = this.a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            z(b, level, str, null);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void q(String str, Object obj, Object obj2) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            a d = f.d(str, obj, obj2);
            z(b, level, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void r(String str, Object obj) {
        Logger logger = this.a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            a c2 = f.c(str, obj);
            z(b, level, c2.a(), c2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void s(String str, Object obj) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            a c2 = f.c(str, obj);
            z(b, level, c2.a(), c2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void t(String str, Throwable th) {
        Logger logger = this.a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            z(b, level, str, th);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void u(String str) {
        if (this.a.isLoggable(Level.INFO)) {
            z(b, Level.INFO, str, null);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void v(String str) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            z(b, level, str, null);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void w(String str) {
        Logger logger = this.a;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            z(b, level, str, null);
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void warn(String str, Object... objArr) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            a a2 = f.a(str, objArr);
            z(b, level, a2.a(), a2.b());
        }
    }
}
