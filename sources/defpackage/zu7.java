package defpackage;

/* renamed from: zu7  reason: default package */
abstract class zu7 extends lv7 {
    private final int a;
    private final String b;
    private final String c;

    zu7(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.lv7
    public String a() {
        return this.c;
    }

    @Override // defpackage.lv7
    public String b() {
        return this.b;
    }

    @Override // defpackage.lv7
    public int c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lv7)) {
            return false;
        }
        lv7 lv7 = (lv7) obj;
        if (this.a == lv7.c() && ((str = this.b) != null ? str.equals(lv7.b()) : lv7.b() == null)) {
            String str2 = this.c;
            if (str2 == null) {
                if (lv7.a() == null) {
                    return true;
                }
            } else if (str2.equals(lv7.a())) {
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
        StringBuilder V0 = je.V0("DismissAction{notificationId=");
        V0.append(this.a);
        V0.append(", messageId=");
        V0.append(this.b);
        V0.append(", campaignId=");
        return je.I0(V0, this.c, "}");
    }
}
