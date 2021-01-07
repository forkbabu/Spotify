package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: zka  reason: default package */
public final class zka extends bla {
    private final boolean a;
    private final boolean b;

    zka(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.bla
    public boolean b() {
        return this.a;
    }

    @Override // defpackage.bla
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bla)) {
            return false;
        }
        bla bla = (bla) obj;
        if (this.a == bla.b() && this.b == bla.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("IntegrationState{connected=");
        V0.append(this.a);
        V0.append(", installed=");
        return je.P0(V0, this.b, "}");
    }
}
