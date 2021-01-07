package kotlin.collections;

public final class h<T> {
    private final int a;
    private final T b;

    public h(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && kotlin.jvm.internal.h.a(this.b, hVar.b);
    }

    public int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("IndexedValue(index=");
        V0.append(this.a);
        V0.append(", value=");
        return je.G0(V0, this.b, ")");
    }
}
