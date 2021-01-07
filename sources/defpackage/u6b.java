package defpackage;

import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
/* renamed from: u6b  reason: default package */
public final class u6b extends y6b {
    private final int a;
    private final Optional<Integer> b;

    u6b(int i, Optional<Integer> optional) {
        this.a = i;
        this.b = optional;
    }

    @Override // defpackage.y6b
    public Optional<Integer> c() {
        return this.b;
    }

    @Override // defpackage.y6b
    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y6b)) {
            return false;
        }
        y6b y6b = (y6b) obj;
        if (this.a != y6b.d() || !this.b.equals(y6b.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PaginationData{limit=");
        V0.append(this.a);
        V0.append(", lastOffset=");
        return je.F0(V0, this.b, "}");
    }
}
