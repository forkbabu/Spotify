package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: c54  reason: default package */
public final class c54 extends v44 {
    private final d54 a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c54(d54 d54, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(null);
        h.e(d54, "state");
        h.e(str, "invitationToken");
        this.a = d54;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public static c54 a(c54 c54, d54 d54, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        d54 d542 = (i & 1) != 0 ? c54.a : d54;
        String str8 = (i & 2) != 0 ? c54.b : null;
        String str9 = (i & 4) != 0 ? c54.c : null;
        String str10 = (i & 8) != 0 ? c54.d : null;
        String str11 = (i & 16) != 0 ? c54.e : null;
        String str12 = (i & 32) != 0 ? c54.f : null;
        String str13 = (i & 64) != 0 ? c54.g : null;
        String str14 = (i & 128) != 0 ? c54.h : null;
        c54.getClass();
        h.e(d542, "state");
        h.e(str8, "invitationToken");
        return new c54(d542, str8, str9, str10, str11, str12, str13, str14);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c54)) {
            return false;
        }
        c54 c54 = (c54) obj;
        return h.a(this.a, c54.a) && h.a(this.b, c54.b) && h.a(this.c, c54.c) && h.a(this.d, c54.d) && h.a(this.e, c54.e) && h.a(this.f, c54.f) && h.a(this.g, c54.g) && h.a(this.h, c54.h);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final d54 h() {
        return this.a;
    }

    public int hashCode() {
        d54 d54 = this.a;
        int i = 0;
        int hashCode = (d54 != null ? d54.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public final String i() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Invitation(state=");
        V0.append(this.a);
        V0.append(", invitationToken=");
        V0.append(this.b);
        V0.append(", sender=");
        V0.append(this.c);
        V0.append(", senderImageUrl=");
        V0.append(this.d);
        V0.append(", recipientImageUrl=");
        V0.append(this.e);
        V0.append(", recipient=");
        V0.append(this.f);
        V0.append(", tasteMatch=");
        V0.append(this.g);
        V0.append(", playlistUri=");
        return je.I0(V0, this.h, ")");
    }
}
