package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.graphics.Bitmap;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import java.util.List;
import kotlin.jvm.internal.h;

public final class c {
    private final Bitmap a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final List<b> g;
    private final List<b> h;
    private final String i;
    private final String j;
    private final WrappedGradient k;
    private final WrappedGradient l;

    public c(Bitmap bitmap, String str, String str2, String str3, String str4, String str5, List<b> list, List<b> list2, String str6, String str7, WrappedGradient wrappedGradient, WrappedGradient wrappedGradient2) {
        h.e(bitmap, "artistImage");
        h.e(str, "hashTagText");
        h.e(str2, "topLeftTitle");
        h.e(str3, "topRightTitle");
        h.e(str4, "bottomRightTitle");
        h.e(str5, "bottomLeftTitle");
        h.e(list, "topLeftListData");
        h.e(list2, "topRightListData");
        h.e(str6, "bottomRightData");
        h.e(str7, "bottomLeftData");
        h.e(wrappedGradient, "outerGradient");
        h.e(wrappedGradient2, "innerGradient");
        this.a = bitmap;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = list2;
        this.i = str6;
        this.j = str7;
        this.k = wrappedGradient;
        this.l = wrappedGradient2;
    }

    public final Bitmap a() {
        return this.a;
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d) && h.a(this.e, cVar.e) && h.a(this.f, cVar.f) && h.a(this.g, cVar.g) && h.a(this.h, cVar.h) && h.a(this.i, cVar.i) && h.a(this.j, cVar.j) && h.a(this.k, cVar.k) && h.a(this.l, cVar.l);
    }

    public final String f() {
        return this.b;
    }

    public final WrappedGradient g() {
        return this.l;
    }

    public final WrappedGradient h() {
        return this.k;
    }

    public int hashCode() {
        Bitmap bitmap = this.a;
        int i2 = 0;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
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
        List<b> list = this.g;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        List<b> list2 = this.h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.j;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        WrappedGradient wrappedGradient = this.k;
        int hashCode11 = (hashCode10 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        WrappedGradient wrappedGradient2 = this.l;
        if (wrappedGradient2 != null) {
            i2 = wrappedGradient2.hashCode();
        }
        return hashCode11 + i2;
    }

    public final List<b> i() {
        return this.g;
    }

    public final String j() {
        return this.c;
    }

    public final List<b> k() {
        return this.h;
    }

    public final String l() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SummaryShareCard(artistImage=");
        V0.append(this.a);
        V0.append(", hashTagText=");
        V0.append(this.b);
        V0.append(", topLeftTitle=");
        V0.append(this.c);
        V0.append(", topRightTitle=");
        V0.append(this.d);
        V0.append(", bottomRightTitle=");
        V0.append(this.e);
        V0.append(", bottomLeftTitle=");
        V0.append(this.f);
        V0.append(", topLeftListData=");
        V0.append(this.g);
        V0.append(", topRightListData=");
        V0.append(this.h);
        V0.append(", bottomRightData=");
        V0.append(this.i);
        V0.append(", bottomLeftData=");
        V0.append(this.j);
        V0.append(", outerGradient=");
        V0.append(this.k);
        V0.append(", innerGradient=");
        V0.append(this.l);
        V0.append(")");
        return V0.toString();
    }
}
