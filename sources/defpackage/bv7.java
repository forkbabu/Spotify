package defpackage;

/* renamed from: bv7  reason: default package */
abstract class bv7 extends nv7 {
    private final int a;
    private final String b;
    private final String c;
    private final String f;
    private final boolean n;

    bv7(int i, String str, String str2, String str3, boolean z) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.f = str3;
                    this.n = z;
                    return;
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.nv7
    public String a() {
        return this.c;
    }

    @Override // defpackage.nv7
    public boolean c() {
        return this.n;
    }

    @Override // defpackage.nv7
    public String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv7)) {
            return false;
        }
        nv7 nv7 = (nv7) obj;
        if (this.a != nv7.f() || !this.b.equals(nv7.e()) || !this.c.equals(nv7.a()) || !this.f.equals(nv7.g()) || this.n != nv7.c()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nv7
    public int f() {
        return this.a;
    }

    @Override // defpackage.nv7
    public String g() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OpenUrlAction{notificationId=");
        V0.append(this.a);
        V0.append(", messageId=");
        V0.append(this.b);
        V0.append(", campaignId=");
        V0.append(this.c);
        V0.append(", url=");
        V0.append(this.f);
        V0.append(", isQuickAction=");
        return je.P0(V0, this.n, "}");
    }
}
