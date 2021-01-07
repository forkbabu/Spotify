package com.spotify.music.sociallistening.facepile;

import kotlin.jvm.internal.h;

public final class g {
    private final String a;
    private final String b;
    private final String c;

    public g(String str, String str2, String str3) {
        h.e(str, "username");
        h.e(str2, "displayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.a, gVar.a) && h.a(this.b, gVar.b) && h.a(this.c, gVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FacePileFace(username=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        return je.I0(V0, this.c, ")");
    }
}
