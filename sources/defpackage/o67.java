package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: o67  reason: default package */
public final class o67 extends q67 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;

    o67(String str, String str2, String str3, String str4, String str5, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (str5 != null) {
                            this.e = str5;
                            this.f = z;
                            return;
                        }
                        throw new NullPointerException("Null description");
                    }
                    throw new NullPointerException("Null publisher");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null showUri");
        }
        throw new NullPointerException("Null imageUri");
    }

    @Override // defpackage.q67
    public String b() {
        return this.e;
    }

    @Override // defpackage.q67
    public String c() {
        return this.a;
    }

    @Override // defpackage.q67
    public boolean d() {
        return this.f;
    }

    @Override // defpackage.q67
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q67)) {
            return false;
        }
        q67 q67 = (q67) obj;
        if (!this.a.equals(q67.c()) || !this.b.equals(q67.f()) || !this.c.equals(q67.g()) || !this.d.equals(q67.e()) || !this.e.equals(q67.b()) || this.f != q67.d()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.q67
    public String f() {
        return this.b;
    }

    @Override // defpackage.q67
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastEntityToolbarModel{imageUri=");
        V0.append(this.a);
        V0.append(", showUri=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", publisher=");
        V0.append(this.d);
        V0.append(", description=");
        V0.append(this.e);
        V0.append(", isFollowing=");
        return je.P0(V0, this.f, "}");
    }
}
