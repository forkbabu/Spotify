package defpackage;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jf3  reason: default package */
public final class jf3 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final List<mab> j;

    private jf3(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6, List<mab> list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = list;
    }

    public static jf3 a(b91 b91, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        p81 bundle;
        String str7;
        b91.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = t71.c;
        if ("hubs/placeholder".equals(b91.id()) || (bundle = b91.custom().bundle("toolbarmenu")) == null) {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        } else {
            String string = bundle.string("title", "");
            String string2 = bundle.string(ContextTrack.Metadata.KEY_SUBTITLE, "");
            String string3 = bundle.string("image_uri", "");
            String string4 = bundle.string("share_uri", "");
            String string5 = bundle.string("subtitle_uri", "");
            String string6 = bundle.string("artistAvatarModerationUri", "");
            p81[] bundleArray = bundle.bundleArray("artists");
            if (bundleArray != null) {
                for (p81 p81 : bundleArray) {
                    String string7 = p81.string("uri", "");
                    String string8 = p81.string("name", "");
                    if (string7.equals(string5)) {
                        str7 = string3;
                    } else {
                        str7 = "";
                    }
                    arrayList.add(new mab(string8, string7, str7));
                }
            }
            str2 = string5;
            str = string6;
            str4 = string3;
            str3 = string4;
            str6 = string;
            str5 = string2;
        }
        return new jf3(z, z2, z3, str6, str5, str4, str3, str2, str, arrayList);
    }

    public List<mab> b() {
        return this.j;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf3)) {
            return false;
        }
        jf3 jf3 = (jf3) obj;
        if (this.a != jf3.a || this.b != jf3.b || this.c != jf3.c) {
            return false;
        }
        String str = this.d;
        if (str == null ? jf3.d != null : !str.equals(jf3.d)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null ? jf3.e != null : !str2.equals(jf3.e)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? jf3.f != null : !str3.equals(jf3.f)) {
            return false;
        }
        String str4 = this.g;
        if (str4 == null ? jf3.g != null : !str4.equals(jf3.g)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? jf3.h != null : !str5.equals(jf3.h)) {
            return false;
        }
        String str6 = this.i;
        if (str6 == null ? jf3.i == null : str6.equals(jf3.i)) {
            return this.j.equals(jf3.j);
        }
        return false;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.d;
    }

    public int hashCode() {
        int i2 = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return this.j.hashCode() + ((hashCode4 + i3) * 31);
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        return this.a;
    }
}
