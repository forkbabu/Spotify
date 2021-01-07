package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dqc  reason: default package */
public final class dqc extends jqc {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final gqc e;
    private final int f;
    private final int g;
    private final gqc h;
    private final int i;

    dqc(String str, String str2, String str3, boolean z, gqc gqc, int i2, int i3, gqc gqc2, int i4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    if (gqc != null) {
                        this.e = gqc;
                        this.f = i2;
                        this.g = i3;
                        if (gqc2 != null) {
                            this.h = gqc2;
                            this.i = i4;
                            return;
                        }
                        throw new NullPointerException("Null episodeImageState");
                    }
                    throw new NullPointerException("Null podcastImageState");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.jqc
    public String b() {
        return this.b;
    }

    @Override // defpackage.jqc
    public boolean c() {
        return this.d;
    }

    @Override // defpackage.jqc
    public gqc d() {
        return this.h;
    }

    @Override // defpackage.jqc
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jqc)) {
            return false;
        }
        jqc jqc = (jqc) obj;
        if (!this.a.equals(jqc.j()) || !this.b.equals(jqc.b()) || !this.c.equals(jqc.e()) || this.d != jqc.c() || !this.e.equals(jqc.g()) || this.f != jqc.f() || this.g != jqc.h() || !this.h.equals(jqc.d()) || this.i != jqc.i()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jqc
    public int f() {
        return this.f;
    }

    @Override // defpackage.jqc
    public gqc g() {
        return this.e;
    }

    @Override // defpackage.jqc
    public int h() {
        return this.g;
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }

    @Override // defpackage.jqc
    public int i() {
        return this.i;
    }

    @Override // defpackage.jqc
    public String j() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ViewModel{title=");
        V0.append(this.a);
        V0.append(", description=");
        V0.append(this.b);
        V0.append(", metadata=");
        V0.append(this.c);
        V0.append(", downloaded=");
        V0.append(this.d);
        V0.append(", podcastImageState=");
        V0.append(this.e);
        V0.append(", podcastBgColor=");
        V0.append(this.f);
        V0.append(", podcastTextColor=");
        V0.append(this.g);
        V0.append(", episodeImageState=");
        V0.append(this.h);
        V0.append(", progress=");
        return je.B0(V0, this.i, "}");
    }
}
