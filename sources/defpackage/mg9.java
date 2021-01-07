package defpackage;

import defpackage.qg9;

/* access modifiers changed from: package-private */
/* renamed from: mg9  reason: default package */
public final class mg9 extends qg9.b {
    private final int a;
    private final int b;

    mg9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.b
    public int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.b
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qg9.b)) {
            return false;
        }
        qg9.b bVar = (qg9.b) obj;
        if (this.a == bVar.a() && this.b == bVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecyclerViewHeightAndRange{height=");
        V0.append(this.a);
        V0.append(", range=");
        return je.B0(V0, this.b, "}");
    }
}
