package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.email.f;
import kotlin.jvm.internal.h;

/* renamed from: yu8  reason: default package */
public final class yu8 {
    private final String a;
    private final String b;
    private final Optional<gv8> c;
    private final Optional<fv8> d;
    private final Optional<hv8> e;
    private final Optional<f> f;

    public yu8(String str, String str2, Optional<gv8> optional, Optional<fv8> optional2, Optional<hv8> optional3, Optional<f> optional4) {
        h.e(str, "newEmail");
        h.e(optional, "inputType");
        h.e(optional2, "fetchState");
        h.e(optional3, "saveState");
        h.e(optional4, "validationState");
        this.a = str;
        this.b = str2;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
    }

    public static yu8 a(yu8 yu8, String str, String str2, Optional optional, Optional optional2, Optional optional3, Optional optional4, int i) {
        if ((i & 1) != 0) {
            str = yu8.a;
        }
        String str3 = (i & 2) != 0 ? yu8.b : null;
        if ((i & 4) != 0) {
            optional = yu8.c;
        }
        if ((i & 8) != 0) {
            optional2 = yu8.d;
        }
        if ((i & 16) != 0) {
            optional3 = yu8.e;
        }
        if ((i & 32) != 0) {
            optional4 = yu8.f;
        }
        h.e(str, "newEmail");
        h.e(optional, "inputType");
        h.e(optional2, "fetchState");
        h.e(optional3, "saveState");
        h.e(optional4, "validationState");
        return new yu8(str, str3, optional, optional2, optional3, optional4);
    }

    public final Optional<fv8> b() {
        return this.d;
    }

    public final Optional<gv8> c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu8)) {
            return false;
        }
        yu8 yu8 = (yu8) obj;
        return h.a(this.a, yu8.a) && h.a(this.b, yu8.b) && h.a(this.c, yu8.c) && h.a(this.d, yu8.d) && h.a(this.e, yu8.e) && h.a(this.f, yu8.f);
    }

    public final Optional<hv8> f() {
        return this.e;
    }

    public final Optional<f> g() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Optional<gv8> optional = this.c;
        int hashCode3 = (hashCode2 + (optional != null ? optional.hashCode() : 0)) * 31;
        Optional<fv8> optional2 = this.d;
        int hashCode4 = (hashCode3 + (optional2 != null ? optional2.hashCode() : 0)) * 31;
        Optional<hv8> optional3 = this.e;
        int hashCode5 = (hashCode4 + (optional3 != null ? optional3.hashCode() : 0)) * 31;
        Optional<f> optional4 = this.f;
        if (optional4 != null) {
            i = optional4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdateEmailDataModel(newEmail=");
        V0.append(this.a);
        V0.append(", previousEmail=");
        V0.append(this.b);
        V0.append(", inputType=");
        V0.append(this.c);
        V0.append(", fetchState=");
        V0.append(this.d);
        V0.append(", saveState=");
        V0.append(this.e);
        V0.append(", validationState=");
        return je.F0(V0, this.f, ")");
    }
}
