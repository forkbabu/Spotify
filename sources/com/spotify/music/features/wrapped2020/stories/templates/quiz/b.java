package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final Uri b;
    private final String c;
    private final String d;
    private final String e;
    private final List<a> f;
    private final g g;
    private final int h;
    private final int i;
    private final int j;
    private final WrappedGradient k;
    private final Uri l;
    private final h m;

    public b(String str, Uri uri, String str2, String str3, String str4, List<a> list, g gVar, int i2, int i3, int i4, WrappedGradient wrappedGradient, Uri uri2, h hVar) {
        h.e(str, "storyLogId");
        h.e(uri, "previewUri");
        h.e(str2, "introTitle");
        h.e(str3, "introSubtitle");
        h.e(str4, "prompt");
        h.e(list, "choices");
        h.e(gVar, "result");
        h.e(wrappedGradient, "backgroundGradient");
        h.e(uri2, "secondPreviewUri");
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = gVar;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = wrappedGradient;
        this.l = uri2;
        this.m = hVar;
    }

    public final int a() {
        return this.j;
    }

    public final List<a> b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final Uri e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && h.a(this.d, bVar.d) && h.a(this.e, bVar.e) && h.a(this.f, bVar.f) && h.a(this.g, bVar.g) && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && h.a(this.k, bVar.k) && h.a(this.l, bVar.l) && h.a(this.m, bVar.m);
    }

    public final int f() {
        return this.h;
    }

    public final String g() {
        return this.e;
    }

    public final g h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<a> list = this.f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        g gVar = this.g;
        int hashCode7 = (((((((hashCode6 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        WrappedGradient wrappedGradient = this.k;
        int hashCode8 = (hashCode7 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        Uri uri2 = this.l;
        int hashCode9 = (hashCode8 + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        h hVar = this.m;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode9 + i2;
    }

    public final h i() {
        return this.m;
    }

    public final Uri j() {
        return this.l;
    }

    public final int k() {
        return this.i;
    }

    public final String l() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("QuizStoryData(storyLogId=");
        V0.append(this.a);
        V0.append(", previewUri=");
        V0.append(this.b);
        V0.append(", introTitle=");
        V0.append(this.c);
        V0.append(", introSubtitle=");
        V0.append(this.d);
        V0.append(", prompt=");
        V0.append(this.e);
        V0.append(", choices=");
        V0.append(this.f);
        V0.append(", result=");
        V0.append(this.g);
        V0.append(", primaryColor=");
        V0.append(this.h);
        V0.append(", secondaryColor=");
        V0.append(this.i);
        V0.append(", backgroundColor=");
        V0.append(this.j);
        V0.append(", backgroundGradient=");
        V0.append(this.k);
        V0.append(", secondPreviewUri=");
        V0.append(this.l);
        V0.append(", sayThanks=");
        V0.append(this.m);
        V0.append(")");
        return V0.toString();
    }
}
