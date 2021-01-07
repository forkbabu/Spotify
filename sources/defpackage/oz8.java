package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import kotlin.jvm.internal.h;

/* renamed from: oz8  reason: default package */
public final class oz8 {
    private final Uri a;
    private final Bitmap b;
    private final Bitmap c;
    private final Bitmap d;
    private final Bitmap e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private final int k;
    private final WrappedGradient l;
    private final String m;

    public oz8(Uri uri, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, String str, String str2, String str3, String str4, int i2, int i3, WrappedGradient wrappedGradient, String str5) {
        h.e(uri, "previewUri");
        h.e(bitmap, "artistImage1");
        h.e(bitmap2, "artistImage2");
        h.e(bitmap3, "artistImage3");
        h.e(bitmap4, "artistImage4");
        h.e(str, "textTitle");
        h.e(str2, "textTagline");
        h.e(str3, "textLine1");
        h.e(str4, "textLine2");
        h.e(wrappedGradient, "textBackgroundGradient");
        h.e(str5, "storyId");
        this.a = uri;
        this.b = bitmap;
        this.c = bitmap2;
        this.d = bitmap3;
        this.e = bitmap4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i2;
        this.k = i3;
        this.l = wrappedGradient;
        this.m = str5;
    }

    public final Bitmap a() {
        return this.b;
    }

    public final Bitmap b() {
        return this.c;
    }

    public final Bitmap c() {
        return this.d;
    }

    public final Bitmap d() {
        return this.e;
    }

    public final Uri e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz8)) {
            return false;
        }
        oz8 oz8 = (oz8) obj;
        return h.a(this.a, oz8.a) && h.a(this.b, oz8.b) && h.a(this.c, oz8.c) && h.a(this.d, oz8.d) && h.a(this.e, oz8.e) && h.a(this.f, oz8.f) && h.a(this.g, oz8.g) && h.a(this.h, oz8.h) && h.a(this.i, oz8.i) && this.j == oz8.j && this.k == oz8.k && h.a(this.l, oz8.l) && h.a(this.m, oz8.m);
    }

    public final String f() {
        return this.m;
    }

    public final int g() {
        return this.k;
    }

    public final WrappedGradient h() {
        return this.l;
    }

    public int hashCode() {
        Uri uri = this.a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        Bitmap bitmap2 = this.c;
        int hashCode3 = (hashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31;
        Bitmap bitmap3 = this.d;
        int hashCode4 = (hashCode3 + (bitmap3 != null ? bitmap3.hashCode() : 0)) * 31;
        Bitmap bitmap4 = this.e;
        int hashCode5 = (hashCode4 + (bitmap4 != null ? bitmap4.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.i;
        int hashCode9 = (((((hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.j) * 31) + this.k) * 31;
        WrappedGradient wrappedGradient = this.l;
        int hashCode10 = (hashCode9 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        String str5 = this.m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode10 + i2;
    }

    public final int i() {
        return this.j;
    }

    public final String j() {
        return this.h;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.g;
    }

    public final String m() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("IntroStoryData(previewUri=");
        V0.append(this.a);
        V0.append(", artistImage1=");
        V0.append(this.b);
        V0.append(", artistImage2=");
        V0.append(this.c);
        V0.append(", artistImage3=");
        V0.append(this.d);
        V0.append(", artistImage4=");
        V0.append(this.e);
        V0.append(", textTitle=");
        V0.append(this.f);
        V0.append(", textTagline=");
        V0.append(this.g);
        V0.append(", textLine1=");
        V0.append(this.h);
        V0.append(", textLine2=");
        V0.append(this.i);
        V0.append(", textColor=");
        V0.append(this.j);
        V0.append(", textBackgroundColor=");
        V0.append(this.k);
        V0.append(", textBackgroundGradient=");
        V0.append(this.l);
        V0.append(", storyId=");
        return je.I0(V0, this.m, ")");
    }
}
