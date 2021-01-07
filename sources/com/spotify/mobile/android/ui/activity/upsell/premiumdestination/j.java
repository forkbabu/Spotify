package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

final class j extends l {
    private final int a;
    private final int b;
    private final int c;

    j(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.l
    public int a() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.l
    public int b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.l
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.b() && this.b == lVar.c() && this.c == lVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Feature{imageResource=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", description=");
        return je.B0(V0, this.c, "}");
    }
}
