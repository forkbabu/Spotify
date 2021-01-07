package io.netty.util.internal.logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

class Log4JLogger extends AbstractInternalLogger {
    static final String b = Log4JLogger.class.getName();
    private static final long serialVersionUID = 2851357342488183058L;
    final transient Logger a;
    final boolean traceCapable = z();

    Log4JLogger(Logger logger) {
        super(logger.getName());
        this.a = logger;
    }

    private boolean z() {
        try {
            this.a.isTraceEnabled();
            return true;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean a() {
        return this.a.isEnabledFor(Level.WARN);
    }

    @Override // io.netty.util.internal.logging.b
    public void b(String str, Object obj, Object obj2) {
        if (this.a.isDebugEnabled()) {
            a d = f.d(str, obj, obj2);
            this.a.log(b, Level.DEBUG, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean c() {
        return this.a.isDebugEnabled();
    }

    @Override // io.netty.util.internal.logging.b
    public void d(String str) {
        this.a.log(b, Level.ERROR, str, (Throwable) null);
    }

    @Override // io.netty.util.internal.logging.b
    public void debug(String str, Object... objArr) {
        if (this.a.isDebugEnabled()) {
            a a2 = f.a(str, objArr);
            this.a.log(b, Level.DEBUG, a2.a(), a2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void e(String str, Object obj, Object obj2) {
        if (h()) {
            a d = f.d(str, obj, obj2);
            this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void error(String str, Object... objArr) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            a a2 = f.a(str, objArr);
            this.a.log(b, Level.ERROR, a2.a(), a2.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean f() {
        return this.a.isInfoEnabled();
    }

    @Override // io.netty.util.internal.logging.b
    public void g(String str, Object obj, Object obj2) {
        if (this.a.isEnabledFor(Level.WARN)) {
            a d = f.d(str, obj, obj2);
            this.a.log(b, Level.WARN, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public boolean h() {
        if (this.traceCapable) {
            return this.a.isTraceEnabled();
        }
        return this.a.isDebugEnabled();
    }

    @Override // io.netty.util.internal.logging.b
    public void i(String str, Throwable th) {
        this.a.log(b, Level.INFO, str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void j(String str, Throwable th) {
        this.a.log(b, Level.WARN, str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void k(String str, Throwable th) {
        this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void l(String str, Object obj) {
        if (this.a.isEnabledFor(Level.WARN)) {
            a c = f.c(str, obj);
            this.a.log(b, Level.WARN, c.a(), c.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void m(String str, Object obj) {
        if (h()) {
            a c = f.c(str, obj);
            this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, c.a(), c.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void n(String str, Throwable th) {
        this.a.log(b, Level.ERROR, str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean o() {
        return this.a.isEnabledFor(Level.ERROR);
    }

    @Override // io.netty.util.internal.logging.b
    public void p(String str) {
        this.a.log(b, Level.DEBUG, str, (Throwable) null);
    }

    @Override // io.netty.util.internal.logging.b
    public void q(String str, Object obj, Object obj2) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            a d = f.d(str, obj, obj2);
            this.a.log(b, Level.ERROR, d.a(), d.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void r(String str, Object obj) {
        if (this.a.isDebugEnabled()) {
            a c = f.c(str, obj);
            this.a.log(b, Level.DEBUG, c.a(), c.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void s(String str, Object obj) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            a c = f.c(str, obj);
            this.a.log(b, Level.ERROR, c.a(), c.b());
        }
    }

    @Override // io.netty.util.internal.logging.b
    public void t(String str, Throwable th) {
        this.a.log(b, Level.DEBUG, str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void u(String str) {
        this.a.log(b, Level.INFO, str, (Throwable) null);
    }

    @Override // io.netty.util.internal.logging.b
    public void v(String str) {
        this.a.log(b, Level.WARN, str, (Throwable) null);
    }

    @Override // io.netty.util.internal.logging.b
    public void w(String str) {
        this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, str, (Throwable) null);
    }

    @Override // io.netty.util.internal.logging.b
    public void warn(String str, Object... objArr) {
        if (this.a.isEnabledFor(Level.WARN)) {
            a a2 = f.a(str, objArr);
            this.a.log(b, Level.WARN, a2.a(), a2.b());
        }
    }
}
