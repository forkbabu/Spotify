package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ux5  reason: default package */
public final class ux5 extends dy5 {
    private final int a;
    private final int b;

    ux5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dy5
    public int b() {
        return this.a;
    }

    @Override // defpackage.dy5
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy5)) {
            return false;
        }
        dy5 dy5 = (dy5) obj;
        if (this.a == dy5.b() && this.b == dy5.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationButton{icon=");
        V0.append(this.a);
        V0.append(", string=");
        return je.B0(V0, this.b, "}");
    }
}
