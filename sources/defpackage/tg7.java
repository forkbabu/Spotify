package defpackage;

/* renamed from: tg7  reason: default package */
public final class tg7 extends gg7 {
    private final boolean a;

    public tg7(boolean z) {
        super(null);
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof tg7) && this.a == ((tg7) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("SystemPermissionStateChanged(systemPermissionEnabled="), this.a, ")");
    }
}
