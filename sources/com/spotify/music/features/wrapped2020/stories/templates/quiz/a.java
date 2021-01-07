package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.graphics.Bitmap;
import kotlin.jvm.internal.h;

public final class a {
    private final Bitmap a;
    private final String b;
    private final boolean c;

    public a(Bitmap bitmap, String str, boolean z) {
        h.e(bitmap, "image");
        h.e(str, "text");
        this.a = bitmap;
        this.b = str;
        this.c = z;
    }

    public final Bitmap a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c;
    }

    public int hashCode() {
        Bitmap bitmap = this.a;
        int i = 0;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Choice(image=");
        V0.append(this.a);
        V0.append(", text=");
        V0.append(this.b);
        V0.append(", isCorrect=");
        return je.P0(V0, this.c, ")");
    }
}
