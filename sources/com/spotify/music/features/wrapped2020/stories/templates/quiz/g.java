package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import kotlin.jvm.internal.h;

public final class g {
    private final String a;
    private final String b;
    private final String c;
    private final a09 d;

    public g(String str, String str2, String str3, a09 a09) {
        h.e(str, "correctText");
        h.e(str2, "incorrectText");
        h.e(str3, "title");
        h.e(a09, "statistic");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a09;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final a09 c() {
        return this.d;
    }

    public final String d() {
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
        return h.a(this.a, gVar.a) && h.a(this.b, gVar.b) && h.a(this.c, gVar.c) && h.a(this.d, gVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        a09 a09 = this.d;
        if (a09 != null) {
            i = a09.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Result(correctText=");
        V0.append(this.a);
        V0.append(", incorrectText=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", statistic=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
