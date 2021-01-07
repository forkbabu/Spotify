package defpackage;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: sx8  reason: default package */
public final class sx8 extends vx8 {
    private final Uri a;
    private final String b;
    private final String c;

    sx8(Uri uri, String str, String str2) {
        if (uri != null) {
            this.a = uri;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null queryLanguage");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // defpackage.vx8
    public String b() {
        return this.b;
    }

    @Override // defpackage.vx8
    public String c() {
        return this.c;
    }

    @Override // defpackage.vx8
    public Uri d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8 = (vx8) obj;
        if (!this.a.equals(vx8.d()) || !this.b.equals(vx8.b()) || !this.c.equals(vx8.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayIntent{uri=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", queryLanguage=");
        return je.I0(V0, this.c, "}");
    }
}
