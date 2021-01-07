package defpackage;

import android.net.Uri;

/* renamed from: g8e  reason: default package */
abstract class g8e extends n8e {
    private final Uri a;

    g8e(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null videoUri");
    }

    @Override // defpackage.n8e
    public Uri b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n8e) {
            return this.a.equals(((n8e) obj).b());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VideoShareMedia{videoUri=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
