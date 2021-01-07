package defpackage;

import com.spotify.playlist.models.l;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: g76  reason: default package */
public final class g76 {
    private final int a;
    private final List<l> b;
    private final List<l> c;
    private final z66 d;

    /* renamed from: g76$a */
    public static final class a {
        private int a;
        private List<l> b;
        private List<l> c;
        private z66 d;

        public a() {
            this(0, null, null, null, 15);
        }

        public a(int i, List list, List list2, z66 z66, int i2) {
            EmptyList emptyList = EmptyList.a;
            i = (i2 & 1) != 0 ? 0 : i;
            z66 z662 = null;
            EmptyList emptyList2 = (i2 & 2) != 0 ? emptyList : null;
            emptyList = (i2 & 4) == 0 ? null : emptyList;
            z662 = (i2 & 8) != 0 ? new z66(null, null, 3) : z662;
            h.e(emptyList2, "recs");
            h.e(emptyList, "items");
            h.e(z662, "filterAndSort");
            this.a = i;
            this.b = emptyList2;
            this.c = emptyList;
            this.d = z662;
        }

        public final g76 a() {
            List<l> list = this.b;
            return new g76(this.a, this.c, list, this.d);
        }

        public final a b(z66 z66) {
            h.e(z66, "filterAndSort");
            this.d = z66;
            return this;
        }

        public final a c(List<l> list) {
            h.e(list, "items");
            this.c = list;
            return this;
        }

        public final a d(int i) {
            this.a = i;
            return this;
        }

        public final a e(List<l> list) {
            h.e(list, "recs");
            this.b = list;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
        }

        public int hashCode() {
            int i = this.a * 31;
            List<l> list = this.b;
            int i2 = 0;
            int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
            List<l> list2 = this.c;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            z66 z66 = this.d;
            if (z66 != null) {
                i2 = z66.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(numberOfItems=");
            V0.append(this.a);
            V0.append(", recs=");
            V0.append(this.b);
            V0.append(", items=");
            V0.append(this.c);
            V0.append(", filterAndSort=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g76() {
        /*
            r5 = this;
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.a
            r1 = 0
            z66 r2 = new z66
            r3 = 3
            r4 = 0
            r2.<init>(r4, r4, r3)
            r5.<init>(r1, r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g76.<init>():void");
    }

    public final List<l> a() {
        return this.b;
    }

    public final List<l> b() {
        return this.c;
    }

    public final boolean c() {
        return this.a == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g76)) {
            return false;
        }
        g76 g76 = (g76) obj;
        return this.a == g76.a && h.a(this.b, g76.b) && h.a(this.c, g76.c) && h.a(this.d, g76.d);
    }

    public int hashCode() {
        int i = this.a * 31;
        List<l> list = this.b;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<l> list2 = this.c;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        z66 z66 = this.d;
        if (z66 != null) {
            i2 = z66.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistItems(numberOfItems=");
        V0.append(this.a);
        V0.append(", items=");
        V0.append(this.b);
        V0.append(", recs=");
        V0.append(this.c);
        V0.append(", filterAndSort=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }

    public g76(int i, List<l> list, List<l> list2, z66 z66) {
        h.e(list, "items");
        h.e(list2, "recs");
        h.e(z66, "filterAndSort");
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = z66;
    }
}
