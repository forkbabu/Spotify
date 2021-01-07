package org.slf4j.helpers;

public class NOPLogger extends MarkerIgnoringBase {
    public static final NOPLogger a = new NOPLogger();
    private static final long serialVersionUID = -517220405410904473L;

    protected NOPLogger() {
    }

    @Override // defpackage.xpf
    public final boolean a() {
        return false;
    }

    @Override // defpackage.xpf
    public final void b(String str, Object obj, Object obj2) {
    }

    @Override // defpackage.xpf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.xpf
    public final void d(String str) {
    }

    @Override // defpackage.xpf
    public final void debug(String str, Object... objArr) {
    }

    @Override // defpackage.xpf
    public final void e(String str, Object obj, Object obj2) {
    }

    @Override // defpackage.xpf
    public final void error(String str, Object... objArr) {
    }

    @Override // defpackage.xpf
    public final boolean f() {
        return false;
    }

    @Override // defpackage.xpf
    public final void g(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, org.slf4j.helpers.NamedLoggerBase, defpackage.xpf
    public String getName() {
        return "NOP";
    }

    @Override // defpackage.xpf
    public final boolean h() {
        return false;
    }

    @Override // defpackage.xpf
    public final void i(String str, Throwable th) {
    }

    @Override // defpackage.xpf
    public final void j(String str, Throwable th) {
    }

    @Override // defpackage.xpf
    public final void k(String str, Throwable th) {
    }

    @Override // defpackage.xpf
    public final void l(String str, Object obj) {
    }

    @Override // defpackage.xpf
    public final void m(String str, Object obj) {
    }

    @Override // defpackage.xpf
    public final void n(String str, Throwable th) {
    }

    @Override // defpackage.xpf
    public final boolean o() {
        return false;
    }

    @Override // defpackage.xpf
    public final void p(String str) {
    }

    @Override // defpackage.xpf
    public final void q(String str, Object obj, Object obj2) {
    }

    @Override // defpackage.xpf
    public final void r(String str, Object obj) {
    }

    @Override // defpackage.xpf
    public final void s(String str, Object obj) {
    }

    @Override // defpackage.xpf
    public final void t(String str, Throwable th) {
    }

    @Override // defpackage.xpf
    public final void u(String str) {
    }

    @Override // defpackage.xpf
    public final void v(String str) {
    }

    @Override // defpackage.xpf
    public final void w(String str) {
    }

    @Override // defpackage.xpf
    public final void warn(String str, Object... objArr) {
    }
}
