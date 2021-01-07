package defpackage;

import com.spotify.music.preview.z;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: f05  reason: default package */
public final class f05 {
    private final g05 a;
    private final z b;
    private final List<String> c;
    private final String d;
    private final List<ty4> e;

    public f05() {
        this(null, null, null, null, null, 31);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends ty4> */
    /* JADX WARN: Multi-variable type inference failed */
    public f05(g05 g05, z zVar, List<String> list, String str, List<? extends ty4> list2) {
        h.e(g05, "tracksState");
        h.e(list, "playlistItems");
        h.e(list2, "userSelectionList");
        this.a = g05;
        this.b = zVar;
        this.c = list;
        this.d = str;
        this.e = list2;
    }

    public static f05 a(f05 f05, g05 g05, z zVar, List list, String str, List list2, int i) {
        if ((i & 1) != 0) {
            g05 = f05.a;
        }
        if ((i & 2) != 0) {
            zVar = f05.b;
        }
        List<String> list3 = (i & 4) != 0 ? f05.c : null;
        String str2 = (i & 8) != 0 ? f05.d : null;
        List<ty4> list4 = (i & 16) != 0 ? f05.e : null;
        h.e(g05, "tracksState");
        h.e(list3, "playlistItems");
        h.e(list4, "userSelectionList");
        return new f05(g05, zVar, list3, str2, list4);
    }

    public final String b() {
        return this.d;
    }

    public final List<String> c() {
        return this.c;
    }

    public final g05 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f05)) {
            return false;
        }
        f05 f05 = (f05) obj;
        return h.a(this.a, f05.a) && h.a(this.b, f05.b) && h.a(this.c, f05.c) && h.a(this.d, f05.d) && h.a(this.e, f05.e);
    }

    public int hashCode() {
        g05 g05 = this.a;
        int i = 0;
        int hashCode = (g05 != null ? g05.hashCode() : 0) * 31;
        z zVar = this.b;
        int hashCode2 = (hashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
        List<String> list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        List<ty4> list2 = this.e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TracksModel(tracksState=");
        V0.append(this.a);
        V0.append(", previewPlayerState=");
        V0.append(this.b);
        V0.append(", playlistItems=");
        V0.append(this.c);
        V0.append(", listName=");
        V0.append(this.d);
        V0.append(", userSelectionList=");
        return je.L0(V0, this.e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f05(defpackage.g05 r7, com.spotify.music.preview.z r8, java.util.List r9, java.lang.String r10, java.util.List r11, int r12) {
        /*
            r6 = this;
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.a
            r8 = r12 & 1
            r11 = 0
            if (r8 == 0) goto L_0x000b
            g05$d r8 = defpackage.g05.d.a
            r1 = r8
            goto L_0x000c
        L_0x000b:
            r1 = r11
        L_0x000c:
            r8 = r12 & 2
            r2 = 0
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0015
            r3 = r7
            goto L_0x0016
        L_0x0015:
            r3 = r9
        L_0x0016:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x001c
            r4 = r11
            goto L_0x001d
        L_0x001c:
            r4 = r10
        L_0x001d:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0023
            r5 = r7
            goto L_0x0024
        L_0x0023:
            r5 = r11
        L_0x0024:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f05.<init>(g05, com.spotify.music.preview.z, java.util.List, java.lang.String, java.util.List, int):void");
    }
}
