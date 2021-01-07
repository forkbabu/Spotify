package defpackage;

import android.content.res.Resources;

/* access modifiers changed from: package-private */
/* renamed from: gu5  reason: default package */
public final class gu5 extends ou5 {
    private final String a;
    private final ea2<Resources, String> b;
    private final ea2<Resources, String> c;

    gu5(String str, ea2<Resources, String> ea2, ea2<Resources, String> ea22) {
        if (str != null) {
            this.a = str;
            this.b = ea2;
            this.c = ea22;
            return;
        }
        throw new NullPointerException("Null uid");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ou5
    public ea2<Resources, String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ou5)) {
            return false;
        }
        ou5 ou5 = (ou5) obj;
        if (!this.a.equals(ou5.i()) || !this.b.equals(ou5.g()) || !this.c.equals(ou5.e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ou5
    public ea2<Resources, String> g() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // defpackage.ou5
    public String i() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackViewData{uid=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
