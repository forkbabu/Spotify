package defpackage;

/* renamed from: av7  reason: default package */
abstract class av7 extends mv7 {
    private final int a;
    private final String b;
    private final String c;

    av7(int i, String str, String str2) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.mv7
    public String a() {
        return this.c;
    }

    @Override // defpackage.mv7
    public String c() {
        return this.b;
    }

    @Override // defpackage.mv7
    public int e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mv7)) {
            return false;
        }
        mv7 mv7 = (mv7) obj;
        if (this.a != mv7.e() || !this.b.equals(mv7.c()) || !this.c.equals(mv7.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OpenPushSettingsAction{notificationId=");
        V0.append(this.a);
        V0.append(", messageId=");
        V0.append(this.b);
        V0.append(", campaignId=");
        return je.I0(V0, this.c, "}");
    }
}
