package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.event.a;
import org.slf4j.event.c;

public class b implements xpf {
    private final String a;
    private volatile xpf b;
    private Boolean c;
    private Method f;
    private a n;
    private Queue<c> o;
    private final boolean p;

    public b(String str, Queue<c> queue, boolean z) {
        this.a = str;
        this.o = queue;
        this.p = z;
    }

    public boolean A() {
        return this.b == null;
    }

    public void B(org.slf4j.event.b bVar) {
        if (y()) {
            try {
                this.f.invoke(this.b, bVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void C(xpf xpf) {
        this.b = xpf;
    }

    @Override // defpackage.xpf
    public boolean a() {
        return x().a();
    }

    @Override // defpackage.xpf
    public void b(String str, Object obj, Object obj2) {
        x().b(str, obj, obj2);
    }

    @Override // defpackage.xpf
    public boolean c() {
        return x().c();
    }

    @Override // defpackage.xpf
    public void d(String str) {
        x().d(str);
    }

    @Override // defpackage.xpf
    public void debug(String str, Object... objArr) {
        x().debug(str, objArr);
    }

    @Override // defpackage.xpf
    public void e(String str, Object obj, Object obj2) {
        x().e(str, obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.a.equals(((b) obj).a);
    }

    @Override // defpackage.xpf
    public void error(String str, Object... objArr) {
        x().error(str, objArr);
    }

    @Override // defpackage.xpf
    public boolean f() {
        return x().f();
    }

    @Override // defpackage.xpf
    public void g(String str, Object obj, Object obj2) {
        x().g(str, obj, obj2);
    }

    @Override // defpackage.xpf
    public String getName() {
        return this.a;
    }

    @Override // defpackage.xpf
    public boolean h() {
        return x().h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xpf
    public void i(String str, Throwable th) {
        x().i(str, th);
    }

    @Override // defpackage.xpf
    public void j(String str, Throwable th) {
        x().j(str, th);
    }

    @Override // defpackage.xpf
    public void k(String str, Throwable th) {
        x().k(str, th);
    }

    @Override // defpackage.xpf
    public void l(String str, Object obj) {
        x().l(str, obj);
    }

    @Override // defpackage.xpf
    public void m(String str, Object obj) {
        x().m(str, obj);
    }

    @Override // defpackage.xpf
    public void n(String str, Throwable th) {
        x().n(str, th);
    }

    @Override // defpackage.xpf
    public boolean o() {
        return x().o();
    }

    @Override // defpackage.xpf
    public void p(String str) {
        x().p(str);
    }

    @Override // defpackage.xpf
    public void q(String str, Object obj, Object obj2) {
        x().q(str, obj, obj2);
    }

    @Override // defpackage.xpf
    public void r(String str, Object obj) {
        x().r(str, obj);
    }

    @Override // defpackage.xpf
    public void s(String str, Object obj) {
        x().s(str, obj);
    }

    @Override // defpackage.xpf
    public void t(String str, Throwable th) {
        x().t(str, th);
    }

    @Override // defpackage.xpf
    public void u(String str) {
        x().u(str);
    }

    @Override // defpackage.xpf
    public void v(String str) {
        x().v(str);
    }

    @Override // defpackage.xpf
    public void w(String str) {
        x().w(str);
    }

    @Override // defpackage.xpf
    public void warn(String str, Object... objArr) {
        x().warn(str, objArr);
    }

    /* access modifiers changed from: package-private */
    public xpf x() {
        if (this.b != null) {
            return this.b;
        }
        if (this.p) {
            return NOPLogger.a;
        }
        if (this.n == null) {
            this.n = new a(this, this.o);
        }
        return this.n;
    }

    public boolean y() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f = this.b.getClass().getMethod("log", org.slf4j.event.b.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public boolean z() {
        return this.b instanceof NOPLogger;
    }
}
