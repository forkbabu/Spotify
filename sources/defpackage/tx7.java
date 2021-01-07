package defpackage;

/* renamed from: tx7  reason: default package */
public class tx7 {
    private final ksb a;
    private final Boolean b;

    public tx7(ksb ksb, boolean z) {
        this.a = ksb;
        this.b = Boolean.valueOf(z);
    }

    public boolean a() {
        return this.b.booleanValue();
    }

    public ksb b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx7)) {
            return false;
        }
        tx7 tx7 = (tx7) obj;
        if (!tx7.b.equals(this.b) || !tx7.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
