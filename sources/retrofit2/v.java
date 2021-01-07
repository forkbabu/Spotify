package retrofit2;

import okhttp3.d0;
import okhttp3.e0;
import okhttp3.t;

public final class v<T> {
    private final d0 a;
    private final T b;
    private final e0 c;

    private v(d0 d0Var, T t, e0 e0Var) {
        this.a = d0Var;
        this.b = t;
        this.c = e0Var;
    }

    public static <T> v<T> c(e0 e0Var, d0 d0Var) {
        if (!d0Var.p()) {
            return new v<>(d0Var, null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> v<T> i(T t, d0 d0Var) {
        if (d0Var.p()) {
            return new v<>(d0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.f();
    }

    public e0 d() {
        return this.c;
    }

    public t e() {
        return this.a.l();
    }

    public boolean f() {
        return this.a.p();
    }

    public String g() {
        return this.a.q();
    }

    public d0 h() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}
