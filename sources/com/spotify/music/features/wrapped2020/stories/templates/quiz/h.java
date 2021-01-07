package com.spotify.music.features.wrapped2020.stories.templates.quiz;

public final class h {
    private final a09 a;
    private final String b;
    private final String c;

    public h(a09 a09, String str, String str2) {
        kotlin.jvm.internal.h.e(a09, "sayThanksStatistic");
        kotlin.jvm.internal.h.e(str, "twitterShareUrl");
        kotlin.jvm.internal.h.e(str2, "sayThanksButton");
        this.a = a09;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final a09 b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b) && kotlin.jvm.internal.h.a(this.c, hVar.c);
    }

    public int hashCode() {
        a09 a09 = this.a;
        int i = 0;
        int hashCode = (a09 != null ? a09.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SayThanks(sayThanksStatistic=");
        V0.append(this.a);
        V0.append(", twitterShareUrl=");
        V0.append(this.b);
        V0.append(", sayThanksButton=");
        return je.I0(V0, this.c, ")");
    }
}
