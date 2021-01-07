package defpackage;

/* renamed from: ss9  reason: default package */
final class ss9 extends us9 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final vs9 j;
    private final String k;

    ss9(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, vs9 vs9, String str10) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = str6;
                this.g = str7;
                this.h = str8;
                this.i = str9;
                this.j = vs9;
                if (str10 != null) {
                    this.k = str10;
                    return;
                }
                throw new NullPointerException("Null status");
            }
            throw new NullPointerException("Null serial");
        }
        throw new NullPointerException("Null deviceId");
    }

    @Override // defpackage.us9
    public String a() {
        return this.i;
    }

    @Override // defpackage.us9
    public String b() {
        return this.a;
    }

    @Override // defpackage.us9
    public vs9 c() {
        return this.j;
    }

    @Override // defpackage.us9
    public String d() {
        return this.b;
    }

    @Override // defpackage.us9
    public String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        vs9 vs9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof us9)) {
            return false;
        }
        us9 us9 = (us9) obj;
        if (!this.a.equals(us9.b()) || !this.b.equals(us9.d()) || ((str = this.c) != null ? !str.equals(us9.f()) : us9.f() != null) || ((str2 = this.d) != null ? !str2.equals(us9.j()) : us9.j() != null) || ((str3 = this.e) != null ? !str3.equals(us9.i()) : us9.i() != null) || ((str4 = this.f) != null ? !str4.equals(us9.h()) : us9.h() != null) || ((str5 = this.g) != null ? !str5.equals(us9.k()) : us9.k() != null) || ((str6 = this.h) != null ? !str6.equals(us9.g()) : us9.g() != null) || ((str7 = this.i) != null ? !str7.equals(us9.a()) : us9.a() != null) || ((vs9 = this.j) != null ? !vs9.equals(us9.c()) : us9.c() != null) || !this.k.equals(us9.e())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.us9
    public String f() {
        return this.c;
    }

    @Override // defpackage.us9
    public String g() {
        return this.h;
    }

    @Override // defpackage.us9
    public String h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.h;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.i;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        vs9 vs9 = this.j;
        if (vs9 != null) {
            i2 = vs9.hashCode();
        }
        return ((hashCode8 ^ i2) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.us9
    public String i() {
        return this.e;
    }

    @Override // defpackage.us9
    public String j() {
        return this.d;
    }

    @Override // defpackage.us9
    public String k() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomethingDevice{deviceId=");
        V0.append(this.a);
        V0.append(", serial=");
        V0.append(this.b);
        V0.append(", username=");
        V0.append(this.c);
        V0.append(", versionOs=");
        V0.append(this.d);
        V0.append(", versionHardware=");
        V0.append(this.e);
        V0.append(", versionFirmware=");
        V0.append(this.f);
        V0.append(", versionSoftware=");
        V0.append(this.g);
        V0.append(", versionAudioDriver=");
        V0.append(this.h);
        V0.append(", connectDeviceName=");
        V0.append(this.i);
        V0.append(", platform=");
        V0.append(this.j);
        V0.append(", status=");
        return je.I0(V0, this.k, "}");
    }
}
