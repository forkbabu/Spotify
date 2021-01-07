package io.netty.util.internal.logging;

/* access modifiers changed from: package-private */
public class Slf4JLogger extends AbstractInternalLogger {
    private static final long serialVersionUID = 108038972685130825L;
    private final transient xpf a;

    Slf4JLogger(xpf xpf) {
        super(xpf.getName());
        this.a = xpf;
    }

    @Override // io.netty.util.internal.logging.b
    public boolean a() {
        return this.a.a();
    }

    @Override // io.netty.util.internal.logging.b
    public void b(String str, Object obj, Object obj2) {
        this.a.b(str, obj, obj2);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean c() {
        return this.a.c();
    }

    @Override // io.netty.util.internal.logging.b
    public void d(String str) {
        this.a.d(str);
    }

    @Override // io.netty.util.internal.logging.b
    public void debug(String str, Object... objArr) {
        this.a.debug(str, objArr);
    }

    @Override // io.netty.util.internal.logging.b
    public void e(String str, Object obj, Object obj2) {
        this.a.e(str, obj, obj2);
    }

    @Override // io.netty.util.internal.logging.b
    public void error(String str, Object... objArr) {
        this.a.error(str, objArr);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean f() {
        return this.a.f();
    }

    @Override // io.netty.util.internal.logging.b
    public void g(String str, Object obj, Object obj2) {
        this.a.g(str, obj, obj2);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean h() {
        return this.a.h();
    }

    @Override // io.netty.util.internal.logging.b
    public void i(String str, Throwable th) {
        this.a.i(str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void j(String str, Throwable th) {
        this.a.j(str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void k(String str, Throwable th) {
        this.a.k(str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void l(String str, Object obj) {
        this.a.l(str, obj);
    }

    @Override // io.netty.util.internal.logging.b
    public void m(String str, Object obj) {
        this.a.m(str, obj);
    }

    @Override // io.netty.util.internal.logging.b
    public void n(String str, Throwable th) {
        this.a.n(str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public boolean o() {
        return this.a.o();
    }

    @Override // io.netty.util.internal.logging.b
    public void p(String str) {
        this.a.p(str);
    }

    @Override // io.netty.util.internal.logging.b
    public void q(String str, Object obj, Object obj2) {
        this.a.q(str, obj, obj2);
    }

    @Override // io.netty.util.internal.logging.b
    public void r(String str, Object obj) {
        this.a.r(str, obj);
    }

    @Override // io.netty.util.internal.logging.b
    public void s(String str, Object obj) {
        this.a.s(str, obj);
    }

    @Override // io.netty.util.internal.logging.b
    public void t(String str, Throwable th) {
        this.a.t(str, th);
    }

    @Override // io.netty.util.internal.logging.b
    public void u(String str) {
        this.a.u(str);
    }

    @Override // io.netty.util.internal.logging.b
    public void v(String str) {
        this.a.v(str);
    }

    @Override // io.netty.util.internal.logging.b
    public void w(String str) {
        this.a.w(str);
    }

    @Override // io.netty.util.internal.logging.b
    public void warn(String str, Object... objArr) {
        this.a.warn(str, objArr);
    }
}
