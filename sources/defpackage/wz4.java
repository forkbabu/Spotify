package defpackage;

import com.spotify.music.preview.z;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: wz4  reason: default package */
public final class wz4 {
    private final xz4 a;
    private final z b;
    private final String c;
    private final List<String> d;
    private final String e;
    private final List<ty4> f;

    public wz4() {
        this(null, null, null, null, null, null, 63);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends ty4> */
    /* JADX WARN: Multi-variable type inference failed */
    public wz4(xz4 xz4, z zVar, String str, List<String> list, String str2, List<? extends ty4> list2) {
        h.e(xz4, "searchState");
        h.e(list, "playlistItems");
        h.e(list2, "userSelectionList");
        this.a = xz4;
        this.b = zVar;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = list2;
    }

    public static wz4 a(wz4 wz4, xz4 xz4, z zVar, String str, List list, String str2, List list2, int i) {
        if ((i & 1) != 0) {
            xz4 = wz4.a;
        }
        if ((i & 2) != 0) {
            zVar = wz4.b;
        }
        if ((i & 4) != 0) {
            str = wz4.c;
        }
        List<String> list3 = (i & 8) != 0 ? wz4.d : null;
        String str3 = (i & 16) != 0 ? wz4.e : null;
        if ((i & 32) != 0) {
            list2 = wz4.f;
        }
        wz4.getClass();
        h.e(xz4, "searchState");
        h.e(list3, "playlistItems");
        h.e(list2, "userSelectionList");
        return new wz4(xz4, zVar, str, list3, str3, list2);
    }

    public final String b() {
        return this.e;
    }

    public final List<String> c() {
        return this.d;
    }

    public final xz4 d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz4)) {
            return false;
        }
        wz4 wz4 = (wz4) obj;
        return h.a(this.a, wz4.a) && h.a(this.b, wz4.b) && h.a(this.c, wz4.c) && h.a(this.d, wz4.d) && h.a(this.e, wz4.e) && h.a(this.f, wz4.f);
    }

    public final List<ty4> f() {
        return this.f;
    }

    public int hashCode() {
        xz4 xz4 = this.a;
        int i = 0;
        int hashCode = (xz4 != null ? xz4.hashCode() : 0) * 31;
        z zVar = this.b;
        int hashCode2 = (hashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ty4> list2 = this.f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchModel(searchState=");
        V0.append(this.a);
        V0.append(", previewPlayerState=");
        V0.append(this.b);
        V0.append(", userCatalogue=");
        V0.append(this.c);
        V0.append(", playlistItems=");
        V0.append(this.d);
        V0.append(", listName=");
        V0.append(this.e);
        V0.append(", userSelectionList=");
        return je.L0(V0, this.f, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ wz4(defpackage.xz4 r8, com.spotify.music.preview.z r9, java.lang.String r10, java.util.List r11, java.lang.String r12, java.util.List r13, int r14) {
        /*
            r7 = this;
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.a
            r9 = r14 & 1
            r10 = 0
            if (r9 == 0) goto L_0x000b
            xz4$a r9 = defpackage.xz4.a.a
            r1 = r9
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r9 = r14 & 2
            r2 = 0
            r9 = r14 & 4
            r3 = 0
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0018
            r4 = r8
            goto L_0x0019
        L_0x0018:
            r4 = r11
        L_0x0019:
            r9 = r14 & 16
            if (r9 == 0) goto L_0x001f
            r5 = r10
            goto L_0x0020
        L_0x001f:
            r5 = r12
        L_0x0020:
            r9 = r14 & 32
            if (r9 == 0) goto L_0x0026
            r6 = r8
            goto L_0x0027
        L_0x0026:
            r6 = r10
        L_0x0027:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz4.<init>(xz4, com.spotify.music.preview.z, java.lang.String, java.util.List, java.lang.String, java.util.List, int):void");
    }
}
