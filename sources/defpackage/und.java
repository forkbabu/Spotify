package defpackage;

import android.net.Uri;

/* renamed from: und  reason: default package */
final class und extends ynd {
    private final Uri a;
    private final boolean b;

    und(Uri uri, boolean z) {
        if (uri != null) {
            this.a = uri;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null videoFileUri");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ynd
    public Uri a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ynd
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ynd)) {
            return false;
        }
        ynd ynd = (ynd) obj;
        if (!this.a.equals(ynd.a()) || this.b != ynd.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CanvasVideoFileUriHolder{videoFileUri=");
        V0.append(this.a);
        V0.append(", ctaMarginVideo=");
        return je.P0(V0, this.b, "}");
    }
}
