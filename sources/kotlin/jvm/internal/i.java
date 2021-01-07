package kotlin.jvm.internal;

public final class i implements c {
    private final Class<?> a;

    public i(Class<?> cls, String str) {
        h.e(cls, "jClass");
        h.e(str, "moduleName");
        this.a = cls;
    }

    @Override // kotlin.jvm.internal.c
    public Class<?> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && h.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
