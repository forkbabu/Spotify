package com.google.android.gms.tasks;

public class h<TResult> {
    private final b0<TResult> a = new b0<>();

    public g<TResult> a() {
        return this.a;
    }

    public void b(Exception exc) {
        this.a.u(exc);
    }

    public void c(TResult tresult) {
        this.a.v(tresult);
    }

    public boolean d(Exception exc) {
        return this.a.x(exc);
    }

    public boolean e(TResult tresult) {
        return this.a.y(tresult);
    }
}
