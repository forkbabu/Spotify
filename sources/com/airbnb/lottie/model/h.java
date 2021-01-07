package com.airbnb.lottie.model;

public class h<T> {
    T a;
    T b;

    public void a(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        F f = u3Var.a;
        T t = this.a;
        if (!(f == t || (f != null && f.equals(t)))) {
            return false;
        }
        S s = u3Var.b;
        T t2 = this.b;
        if (s == t2 || (s != null && s.equals(t2))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Pair{");
        V0.append(String.valueOf(this.a));
        V0.append(" ");
        V0.append(String.valueOf(this.b));
        V0.append("}");
        return V0.toString();
    }
}
