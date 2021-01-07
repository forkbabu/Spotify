package com.spotify.mobile.android.share.menu.preview.api;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.h;

public final class b {
    private final Drawable a;
    private final String b;

    public b(Drawable drawable, String str) {
        h.e(drawable, "icon");
        h.e(str, "label");
        this.a = drawable;
        this.b = str;
    }

    public final Drawable a() {
        return this.a;
    }

    public final String b() {
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
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
    }

    public int hashCode() {
        Drawable drawable = this.a;
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareDestinationViewData(icon=");
        V0.append(this.a);
        V0.append(", label=");
        return je.I0(V0, this.b, ")");
    }
}
