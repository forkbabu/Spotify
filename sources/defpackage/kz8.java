package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: kz8  reason: default package */
public final class kz8 {
    private final Uri a;
    private final int b;
    private final WrappedGradient c;
    private final Bitmap d;
    private final a09 e;
    private final String f;
    private final a09 g;
    private final String h;
    private final Integer i;
    private final String j;
    private final Integer k;

    public kz8(Uri uri, int i2, WrappedGradient wrappedGradient, Bitmap bitmap, a09 a09, String str, a09 a092, String str2, Integer num, String str3, Integer num2) {
        h.e(wrappedGradient, "backgroundGradient");
        h.e(a09, "title");
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(a092, "description");
        h.e(str2, "storyId");
        h.e(str3, "backgroundImgAltText");
        this.a = uri;
        this.b = i2;
        this.c = wrappedGradient;
        this.d = bitmap;
        this.e = a09;
        this.f = str;
        this.g = a092;
        this.h = str2;
        this.i = num;
        this.j = str3;
        this.k = num2;
    }

    public final int a() {
        return this.b;
    }

    public final Bitmap b() {
        return this.d;
    }

    public final String c() {
        return this.j;
    }

    public final Integer d() {
        return this.k;
    }

    public final Integer e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz8)) {
            return false;
        }
        kz8 kz8 = (kz8) obj;
        return h.a(this.a, kz8.a) && this.b == kz8.b && h.a(this.c, kz8.c) && h.a(this.d, kz8.d) && h.a(this.e, kz8.e) && h.a(this.f, kz8.f) && h.a(this.g, kz8.g) && h.a(this.h, kz8.h) && h.a(this.i, kz8.i) && h.a(this.j, kz8.j) && h.a(this.k, kz8.k);
    }

    public final a09 f() {
        return this.g;
    }

    public final Uri g() {
        return this.a;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        Uri uri = this.a;
        int i2 = 0;
        int hashCode = (((uri != null ? uri.hashCode() : 0) * 31) + this.b) * 31;
        WrappedGradient wrappedGradient = this.c;
        int hashCode2 = (hashCode + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        Bitmap bitmap = this.d;
        int hashCode3 = (hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        a09 a09 = this.e;
        int hashCode4 = (hashCode3 + (a09 != null ? a09.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        a09 a092 = this.g;
        int hashCode6 = (hashCode5 + (a092 != null ? a092.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.i;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.j;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.k;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String i() {
        return this.f;
    }

    public final a09 j() {
        return this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BasicStoryData(previewUri=");
        V0.append(this.a);
        V0.append(", backgroundColor=");
        V0.append(this.b);
        V0.append(", backgroundGradient=");
        V0.append(this.c);
        V0.append(", backgroundImage=");
        V0.append(this.d);
        V0.append(", title=");
        V0.append(this.e);
        V0.append(", subtitle=");
        V0.append(this.f);
        V0.append(", description=");
        V0.append(this.g);
        V0.append(", storyId=");
        V0.append(this.h);
        V0.append(", backgroundImgColor=");
        V0.append(this.i);
        V0.append(", backgroundImgAltText=");
        V0.append(this.j);
        V0.append(", backgroundImgAltTextColor=");
        V0.append(this.k);
        V0.append(")");
        return V0.toString();
    }
}
