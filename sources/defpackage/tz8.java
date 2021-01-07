package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import kotlin.jvm.internal.h;

/* renamed from: tz8  reason: default package */
public final class tz8 {
    private final Uri a;
    private final int b;
    private final Bitmap c;
    private final Bitmap d;
    private final Bitmap e;
    private final Bitmap f;
    private final WrappedGradient g;
    private final String h;
    private final int i;
    private final String j;
    private final int k;
    private final int l;
    private final String m;
    private final int n;
    private final int o;
    private final String p;

    public tz8(Uri uri, int i2, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, WrappedGradient wrappedGradient, String str, int i3, String str2, int i4, int i5, String str3, int i6, int i7, String str4) {
        h.e(uri, "previewUri");
        h.e(bitmap, "artistImage1");
        h.e(bitmap2, "artistImage2");
        h.e(bitmap3, "artistImage3");
        h.e(bitmap4, "artistImage4");
        h.e(wrappedGradient, "gradient");
        h.e(str, "title");
        h.e(str2, "tagline");
        h.e(str3, "prompt");
        h.e(str4, "storyId");
        this.a = uri;
        this.b = i2;
        this.c = bitmap;
        this.d = bitmap2;
        this.e = bitmap3;
        this.f = bitmap4;
        this.g = wrappedGradient;
        this.h = str;
        this.i = i3;
        this.j = str2;
        this.k = i4;
        this.l = i5;
        this.m = str3;
        this.n = i6;
        this.o = i7;
        this.p = str4;
    }

    public final Bitmap a() {
        return this.c;
    }

    public final Bitmap b() {
        return this.d;
    }

    public final Bitmap c() {
        return this.e;
    }

    public final Bitmap d() {
        return this.f;
    }

    public final int e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz8)) {
            return false;
        }
        tz8 tz8 = (tz8) obj;
        return h.a(this.a, tz8.a) && this.b == tz8.b && h.a(this.c, tz8.c) && h.a(this.d, tz8.d) && h.a(this.e, tz8.e) && h.a(this.f, tz8.f) && h.a(this.g, tz8.g) && h.a(this.h, tz8.h) && this.i == tz8.i && h.a(this.j, tz8.j) && this.k == tz8.k && this.l == tz8.l && h.a(this.m, tz8.m) && this.n == tz8.n && this.o == tz8.o && h.a(this.p, tz8.p);
    }

    public final int f() {
        return this.o;
    }

    public final int g() {
        return this.b;
    }

    public final Uri h() {
        return this.a;
    }

    public int hashCode() {
        Uri uri = this.a;
        int i2 = 0;
        int hashCode = (((uri != null ? uri.hashCode() : 0) * 31) + this.b) * 31;
        Bitmap bitmap = this.c;
        int hashCode2 = (hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        Bitmap bitmap2 = this.d;
        int hashCode3 = (hashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31;
        Bitmap bitmap3 = this.e;
        int hashCode4 = (hashCode3 + (bitmap3 != null ? bitmap3.hashCode() : 0)) * 31;
        Bitmap bitmap4 = this.f;
        int hashCode5 = (hashCode4 + (bitmap4 != null ? bitmap4.hashCode() : 0)) * 31;
        WrappedGradient wrappedGradient = this.g;
        int hashCode6 = (hashCode5 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        String str = this.h;
        int hashCode7 = (((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.i) * 31;
        String str2 = this.j;
        int hashCode8 = (((((hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.k) * 31) + this.l) * 31;
        String str3 = this.m;
        int hashCode9 = (((((hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.n) * 31) + this.o) * 31;
        String str4 = this.p;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String i() {
        return this.m;
    }

    public final int j() {
        return this.n;
    }

    public final String k() {
        return this.p;
    }

    public final String l() {
        return this.j;
    }

    public final int m() {
        return this.k;
    }

    public final String n() {
        return this.h;
    }

    public final int o() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SummaryIntroStoryData(previewUri=");
        V0.append(this.a);
        V0.append(", backgroundInitial=");
        V0.append(this.b);
        V0.append(", artistImage1=");
        V0.append(this.c);
        V0.append(", artistImage2=");
        V0.append(this.d);
        V0.append(", artistImage3=");
        V0.append(this.e);
        V0.append(", artistImage4=");
        V0.append(this.f);
        V0.append(", gradient=");
        V0.append(this.g);
        V0.append(", title=");
        V0.append(this.h);
        V0.append(", titleColor=");
        V0.append(this.i);
        V0.append(", tagline=");
        V0.append(this.j);
        V0.append(", taglineColor=");
        V0.append(this.k);
        V0.append(", background1=");
        V0.append(this.l);
        V0.append(", prompt=");
        V0.append(this.m);
        V0.append(", promptColor=");
        V0.append(this.n);
        V0.append(", background2=");
        V0.append(this.o);
        V0.append(", storyId=");
        return je.I0(V0, this.p, ")");
    }
}
