package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: xf9  reason: default package */
public final class xf9<T, U> extends eg9<T, U> {
    private final T a;
    private final U b;

    xf9(T t, U u) {
        if (t != null) {
            this.a = t;
            if (u != null) {
                this.b = u;
                return;
            }
            throw new NullPointerException("Null second");
        }
        throw new NullPointerException("Null first");
    }

    @Override // defpackage.eg9
    public T b() {
        return this.a;
    }

    @Override // defpackage.eg9
    public U c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eg9)) {
            return false;
        }
        eg9 eg9 = (eg9) obj;
        if (!this.a.equals(eg9.b()) || !this.b.equals(eg9.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PairNonNull{first=");
        V0.append((Object) this.a);
        V0.append(", second=");
        return je.G0(V0, this.b, "}");
    }
}
