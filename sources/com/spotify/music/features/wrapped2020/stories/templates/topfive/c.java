package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.graphics.Bitmap;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final Bitmap b;
    private final String c;
    private final String d;
    private final int e;
    private final int f;
    private final WrappedGradient g;

    public c(String str, Bitmap bitmap, String str2, String str3, int i, int i2, WrappedGradient wrappedGradient) {
        h.e(str, "position");
        h.e(bitmap, "image");
        h.e(str2, "title");
        h.e(str3, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(wrappedGradient, "backgroundGradient");
        this.a = str;
        this.b = bitmap;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = wrappedGradient;
    }

    public final Bitmap a() {
        return this.b;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && h.a(this.g, cVar.g);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31;
        WrappedGradient wrappedGradient = this.g;
        if (wrappedGradient != null) {
            i = wrappedGradient.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TopFive(position=");
        V0.append(this.a);
        V0.append(", image=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", subtitle=");
        V0.append(this.d);
        V0.append(", mainTextColor=");
        V0.append(this.e);
        V0.append(", secondaryTextColor=");
        V0.append(this.f);
        V0.append(", backgroundGradient=");
        V0.append(this.g);
        V0.append(")");
        return V0.toString();
    }
}
