package org.slf4j.event;

import java.util.Queue;
import org.slf4j.helpers.b;

public class a implements xpf {
    String a;
    b b;
    Queue<c> c;

    public a(b bVar, Queue<c> queue) {
        this.b = bVar;
        this.a = bVar.getName();
        this.c = queue;
    }

    private void x(Level level, String str, Object[] objArr, Throwable th) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = this.b;
        cVar.b = objArr;
        Thread.currentThread().getName();
        this.c.add(cVar);
    }

    @Override // defpackage.xpf
    public boolean a() {
        return true;
    }

    @Override // defpackage.xpf
    public void b(String str, Object obj, Object obj2) {
        x(Level.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // defpackage.xpf
    public boolean c() {
        return true;
    }

    @Override // defpackage.xpf
    public void d(String str) {
        x(Level.ERROR, str, null, null);
    }

    @Override // defpackage.xpf
    public void debug(String str, Object... objArr) {
        x(Level.DEBUG, str, objArr, null);
    }

    @Override // defpackage.xpf
    public void e(String str, Object obj, Object obj2) {
        x(Level.TRACE, str, new Object[]{obj, obj2}, null);
    }

    @Override // defpackage.xpf
    public void error(String str, Object... objArr) {
        x(Level.ERROR, str, objArr, null);
    }

    @Override // defpackage.xpf
    public boolean f() {
        return true;
    }

    @Override // defpackage.xpf
    public void g(String str, Object obj, Object obj2) {
        x(Level.WARN, str, new Object[]{obj, obj2}, null);
    }

    @Override // defpackage.xpf
    public String getName() {
        return this.a;
    }

    @Override // defpackage.xpf
    public boolean h() {
        return true;
    }

    @Override // defpackage.xpf
    public void i(String str, Throwable th) {
        x(Level.INFO, str, null, th);
    }

    @Override // defpackage.xpf
    public void j(String str, Throwable th) {
        x(Level.WARN, str, null, th);
    }

    @Override // defpackage.xpf
    public void k(String str, Throwable th) {
        x(Level.TRACE, str, null, th);
    }

    @Override // defpackage.xpf
    public void l(String str, Object obj) {
        x(Level.WARN, str, new Object[]{obj}, null);
    }

    @Override // defpackage.xpf
    public void m(String str, Object obj) {
        x(Level.TRACE, str, new Object[]{obj}, null);
    }

    @Override // defpackage.xpf
    public void n(String str, Throwable th) {
        x(Level.ERROR, str, null, th);
    }

    @Override // defpackage.xpf
    public boolean o() {
        return true;
    }

    @Override // defpackage.xpf
    public void p(String str) {
        x(Level.TRACE, str, null, null);
    }

    @Override // defpackage.xpf
    public void q(String str, Object obj, Object obj2) {
        x(Level.ERROR, str, new Object[]{obj, obj2}, null);
    }

    @Override // defpackage.xpf
    public void r(String str, Object obj) {
        x(Level.DEBUG, str, new Object[]{obj}, null);
    }

    @Override // defpackage.xpf
    public void s(String str, Object obj) {
        x(Level.ERROR, str, new Object[]{obj}, null);
    }

    @Override // defpackage.xpf
    public void t(String str, Throwable th) {
        x(Level.DEBUG, str, null, th);
    }

    @Override // defpackage.xpf
    public void u(String str) {
        x(Level.INFO, str, null, null);
    }

    @Override // defpackage.xpf
    public void v(String str) {
        x(Level.WARN, str, null, null);
    }

    @Override // defpackage.xpf
    public void w(String str) {
        x(Level.TRACE, str, null, null);
    }

    @Override // defpackage.xpf
    public void warn(String str, Object... objArr) {
        x(Level.WARN, str, objArr, null);
    }
}
