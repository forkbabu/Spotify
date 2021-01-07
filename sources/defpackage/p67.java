package defpackage;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: p67  reason: default package */
public final class p67 extends r67 {
    private final String a;
    private final String b;
    private final Uri c;

    p67(String str, String str2, Uri uri) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (uri != null) {
                    this.c = uri;
                    return;
                }
                throw new NullPointerException("Null imageUri");
            }
            throw new NullPointerException("Null publisher");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.r67
    public Uri b() {
        return this.c;
    }

    @Override // defpackage.r67
    public String c() {
        return this.b;
    }

    @Override // defpackage.r67
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r67)) {
            return false;
        }
        r67 r67 = (r67) obj;
        if (!this.a.equals(r67.d()) || !this.b.equals(r67.c()) || !this.c.equals(r67.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastShowHeaderViewModel{title=");
        V0.append(this.a);
        V0.append(", publisher=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
