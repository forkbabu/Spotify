package com.spotify.mobile.android.share.menu.preview.api;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final Bitmap b;
    private final String c;
    private final Map<String, String> d;
    private final String e;

    public c(String str, Bitmap bitmap, String str2, Map<String, String> map, String str3) {
        h.e(str, "entityUri");
        h.e(bitmap, "image");
        h.e(map, "queryParameters");
        this.a = str;
        this.b = bitmap;
        this.c = str2;
        this.d = map;
        this.e = str3;
    }

    public final String a() {
        return this.a;
    }

    public final Bitmap b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final Map<String, String> e() {
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
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d) && h.a(this.e, cVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.d;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SharePayload(entityUri=");
        V0.append(this.a);
        V0.append(", image=");
        V0.append(this.b);
        V0.append(", message=");
        V0.append(this.c);
        V0.append(", queryParameters=");
        V0.append(this.d);
        V0.append(", messageEntityUri=");
        return je.I0(V0, this.e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(java.lang.String r7, android.graphics.Bitmap r8, java.lang.String r9, java.util.Map r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r11 = r12 & 4
            if (r11 == 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L_0x000e
            java.util.Map r10 = kotlin.collections.d.g()
        L_0x000e:
            r4 = r10
            r9 = r12 & 16
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.share.menu.preview.api.c.<init>(java.lang.String, android.graphics.Bitmap, java.lang.String, java.util.Map, java.lang.String, int):void");
    }
}
