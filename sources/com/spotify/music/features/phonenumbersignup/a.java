package com.spotify.music.features.phonenumbersignup;

import com.spotify.libs.callingcode.json.CallingCode;

abstract class a extends c {
    private final CallingCode a;
    private final String b;

    a(CallingCode callingCode, String str) {
        if (callingCode != null) {
            this.a = callingCode;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null phoneNumber");
        }
        throw new NullPointerException("Null callingCode");
    }

    @Override // com.spotify.music.features.phonenumbersignup.c
    public CallingCode a() {
        return this.a;
    }

    @Override // com.spotify.music.features.phonenumbersignup.c
    public String c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.a.equals(cVar.a()) || !this.b.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OtpHandle{callingCode=");
        V0.append(this.a);
        V0.append(", phoneNumber=");
        return je.I0(V0, this.b, "}");
    }
}
