package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final Uri b;
    private final int c;
    private final yz8 d;
    private final yz8 e;
    private final int f;
    private final a09 g;
    private final int h;
    private final yz8 i;
    private final List<a> j;

    public b(String str, Uri uri, int i2, yz8 yz8, yz8 yz82, int i3, a09 a09, int i4, yz8 yz83, List<a> list) {
        h.e(str, "storyId");
        h.e(uri, "previewUri");
        h.e(yz8, "introTitle");
        h.e(yz82, "introMessage");
        h.e(a09, "introData");
        h.e(yz83, "topFiveTitle");
        h.e(list, "blobData");
        this.a = str;
        this.b = uri;
        this.c = i2;
        this.d = yz8;
        this.e = yz82;
        this.f = i3;
        this.g = a09;
        this.h = i4;
        this.i = yz83;
        this.j = list;
    }

    public final List<a> a() {
        return this.j;
    }

    public final int b() {
        return this.c;
    }

    public final a09 c() {
        return this.g;
    }

    public final int d() {
        return this.f;
    }

    public final yz8 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && this.c == bVar.c && h.a(this.d, bVar.d) && h.a(this.e, bVar.e) && this.f == bVar.f && h.a(this.g, bVar.g) && this.h == bVar.h && h.a(this.i, bVar.i) && h.a(this.j, bVar.j);
    }

    public final yz8 f() {
        return this.d;
    }

    public final Uri g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c) * 31;
        yz8 yz8 = this.d;
        int hashCode3 = (hashCode2 + (yz8 != null ? yz8.hashCode() : 0)) * 31;
        yz8 yz82 = this.e;
        int hashCode4 = (((hashCode3 + (yz82 != null ? yz82.hashCode() : 0)) * 31) + this.f) * 31;
        a09 a09 = this.g;
        int hashCode5 = (((hashCode4 + (a09 != null ? a09.hashCode() : 0)) * 31) + this.h) * 31;
        yz8 yz83 = this.i;
        int hashCode6 = (hashCode5 + (yz83 != null ? yz83.hashCode() : 0)) * 31;
        List<a> list = this.j;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode6 + i2;
    }

    public final yz8 i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("GenrelustData(storyId=");
        V0.append(this.a);
        V0.append(", previewUri=");
        V0.append(this.b);
        V0.append(", introBackgroundColor=");
        V0.append(this.c);
        V0.append(", introTitle=");
        V0.append(this.d);
        V0.append(", introMessage=");
        V0.append(this.e);
        V0.append(", introDataColor=");
        V0.append(this.f);
        V0.append(", introData=");
        V0.append(this.g);
        V0.append(", topFiveBackgroundColor=");
        V0.append(this.h);
        V0.append(", topFiveTitle=");
        V0.append(this.i);
        V0.append(", blobData=");
        return je.L0(V0, this.j, ")");
    }
}
