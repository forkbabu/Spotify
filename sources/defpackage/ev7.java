package defpackage;

/* renamed from: ev7  reason: default package */
abstract class ev7 extends rv7 {
    private final int a;
    private final String b;
    private final String c;

    ev7(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.rv7
    public String a() {
        return this.c;
    }

    @Override // defpackage.rv7
    public String b() {
        return this.b;
    }

    @Override // defpackage.rv7
    public int c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rv7)) {
            return false;
        }
        rv7 rv7 = (rv7) obj;
        if (this.a == rv7.c() && ((str = this.b) != null ? str.equals(rv7.b()) : rv7.b() == null)) {
            String str2 = this.c;
            if (str2 == null) {
                if (rv7.a() == null) {
                    return true;
                }
            } else if (str2.equals(rv7.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SendEmailVerificationAction{notificationId=");
        V0.append(this.a);
        V0.append(", messageId=");
        V0.append(this.b);
        V0.append(", campaignId=");
        return je.I0(V0, this.c, "}");
    }
}
