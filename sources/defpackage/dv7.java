package defpackage;

/* renamed from: dv7  reason: default package */
abstract class dv7 extends qv7 {
    private final int a;
    private final String b;
    private final String c;
    private final String f;

    dv7(int i, String str, String str2, String str3) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.f = str3;
                    return;
                }
                throw new NullPointerException("Null entityUri");
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.qv7
    public String a() {
        return this.c;
    }

    @Override // defpackage.qv7
    public String b() {
        return this.f;
    }

    @Override // defpackage.qv7
    public String c() {
        return this.b;
    }

    @Override // defpackage.qv7
    public int e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qv7)) {
            return false;
        }
        qv7 qv7 = (qv7) obj;
        if (this.a != qv7.e() || !this.b.equals(qv7.c()) || !this.c.equals(qv7.a()) || !this.f.equals(qv7.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SaveEntityAction{notificationId=");
        V0.append(this.a);
        V0.append(", messageId=");
        V0.append(this.b);
        V0.append(", campaignId=");
        V0.append(this.c);
        V0.append(", entityUri=");
        return je.I0(V0, this.f, "}");
    }
}
