package com.spotify.libs.callingcode.json;

/* access modifiers changed from: package-private */
public abstract class a extends CallingCode {
    private final String b;
    private final String c;
    private final String f;

    a(String str, String str2, String str3) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.f = str3;
                    return;
                }
                throw new NullPointerException("Null countryName");
            }
            throw new NullPointerException("Null callingCode");
        }
        throw new NullPointerException("Null countryCode");
    }

    @Override // com.spotify.libs.callingcode.json.CallingCode
    public String a() {
        return this.c;
    }

    @Override // com.spotify.libs.callingcode.json.CallingCode
    public String b() {
        return this.b;
    }

    @Override // com.spotify.libs.callingcode.json.CallingCode
    public String c() {
        return this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CallingCode{countryCode=");
        V0.append(this.b);
        V0.append(", callingCode=");
        V0.append(this.c);
        V0.append(", countryName=");
        return je.I0(V0, this.f, "}");
    }
}
