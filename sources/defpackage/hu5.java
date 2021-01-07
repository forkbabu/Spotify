package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: hu5  reason: default package */
public final class hu5 extends pu5 {
    private final List<ou5> a;
    private final int b;
    private final boolean c;
    private final boolean d;

    hu5(List<ou5> list, int i, boolean z, boolean z2) {
        if (list != null) {
            this.a = list;
            this.b = i;
            this.c = z;
            this.d = z2;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    @Override // defpackage.pu5
    public int b() {
        return this.b;
    }

    @Override // defpackage.pu5
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.pu5
    public boolean d() {
        return this.d;
    }

    @Override // defpackage.pu5
    public List<ou5> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pu5)) {
            return false;
        }
        pu5 pu5 = (pu5) obj;
        if (this.a.equals(pu5.e()) && this.b == pu5.b() && this.c == pu5.c() && this.d == pu5.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TracksCarouselViewData{tracks=");
        V0.append(this.a);
        V0.append(", currentTrackIndex=");
        V0.append(this.b);
        V0.append(", disallowScrollLeft=");
        V0.append(this.c);
        V0.append(", disallowScrollRight=");
        return je.P0(V0, this.d, "}");
    }
}
