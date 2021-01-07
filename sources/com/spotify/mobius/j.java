package com.spotify.mobius;

abstract class j<M, E> {
    private static final xpf a = ypf.d(j.class);

    j() {
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public boolean b() {
        return false;
    }

    public void c(g<M, E> gVar) {
        throw new IllegalStateException(String.format("cannot call connect when in the %s state", a()));
    }

    public void d() {
        throw new IllegalStateException(String.format("cannot call disconnect when in the %s state", a()));
    }

    public void e(E e) {
        a.b("Dropping event that was dispatched when the program was in the {} state: {}", a(), e);
    }

    public abstract M f();

    public void g(M m) {
        throw new IllegalStateException(String.format("cannot call replaceModel when in the %s state", a()));
    }

    public void h() {
        throw new IllegalStateException(String.format("cannot call start when in the %s state", a()));
    }

    public void i() {
        throw new IllegalStateException(String.format("cannot call stop when in the %s state", a()));
    }

    public void j(M m) {
        a.b("Dropping model that was dispatched when the program was in the {} state: {}", a(), m);
    }
}
