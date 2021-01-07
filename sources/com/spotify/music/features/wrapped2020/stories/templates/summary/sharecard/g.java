package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.h;

public final class g {
    private final Uri a;
    private final int b;
    private final c c;
    private final List<e> d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public g(Uri uri, int i, c cVar, List<e> list, String str, String str2, String str3, String str4) {
        h.e(cVar, "data");
        h.e(list, "colorSchemes");
        h.e(str, "textShare");
        h.e(str2, "textReplay");
        h.e(str3, "storyId");
        h.e(str4, "shareStoryType");
        this.a = uri;
        this.b = i;
        this.c = cVar;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final int a() {
        return this.b;
    }

    public final List<e> b() {
        return this.d;
    }

    public final c c() {
        return this.c;
    }

    public final Uri d() {
        return this.a;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.a, gVar.a) && this.b == gVar.b && h.a(this.c, gVar.c) && h.a(this.d, gVar.d) && h.a(this.e, gVar.e) && h.a(this.f, gVar.f) && h.a(this.g, gVar.g) && h.a(this.h, gVar.h);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        Uri uri = this.a;
        int i = 0;
        int hashCode = (((uri != null ? uri.hashCode() : 0) * 31) + this.b) * 31;
        c cVar = this.c;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        List<e> list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SummaryShareStoryData(previewUri=");
        V0.append(this.a);
        V0.append(", backgroundColor=");
        V0.append(this.b);
        V0.append(", data=");
        V0.append(this.c);
        V0.append(", colorSchemes=");
        V0.append(this.d);
        V0.append(", textShare=");
        V0.append(this.e);
        V0.append(", textReplay=");
        V0.append(this.f);
        V0.append(", storyId=");
        V0.append(this.g);
        V0.append(", shareStoryType=");
        return je.I0(V0, this.h, ")");
    }
}
