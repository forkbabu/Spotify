package defpackage;

import java.util.List;

/* renamed from: n25  reason: default package */
public abstract class n25 {

    /* renamed from: n25$a */
    public static final class a extends n25 {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.h.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddArtistFollowListener(artistUri=");
            V0.append(this.a);
            V0.append(", following=");
            return je.P0(V0, this.b, ")");
        }
    }

    /* renamed from: n25$b */
    public static final class b extends n25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("DismissArtist(artistUri="), this.a, ")");
        }
    }

    /* renamed from: n25$c */
    public static final class c extends n25 {
        private final String a;

        public c(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("FetchData(afterItemId="), this.a, ")");
        }
    }

    /* renamed from: n25$d */
    public static final class d extends n25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("FollowArtist(artistUri="), this.a, ")");
        }
    }

    /* renamed from: n25$e */
    public static final class e extends n25 {
        private final t25 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(t25 t25) {
            super(null);
            kotlin.jvm.internal.h.e(t25, "logEvent");
            this.a = t25;
        }

        public final t25 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            t25 t25 = this.a;
            if (t25 != null) {
                return t25.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogImpressionEvent(logEvent=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: n25$f */
    public static final class f extends n25 {
        private final u25 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(u25 u25) {
            super(null);
            kotlin.jvm.internal.h.e(u25, "logEvent");
            this.a = u25;
        }

        public final u25 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            u25 u25 = this.a;
            if (u25 != null) {
                return u25.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogInteractionEvent(logEvent=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: n25$g */
    public static final class g extends n25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Navigate(uri="), this.a, ")");
        }
    }

    /* renamed from: n25$h */
    public static final class h extends n25 {
        private final x25 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(x25 x25) {
            super(null);
            kotlin.jvm.internal.h.e(x25, "command");
            this.a = x25;
        }

        public final x25 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            x25 x25 = this.a;
            if (x25 != null) {
                return x25.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PerformPlayerCommand(command=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: n25$i */
    public static final class i extends n25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "itemId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("RegisterNewestItemViewed(itemId="), this.a, ")");
        }
    }

    /* renamed from: n25$j */
    public static final class j extends n25 {
        private final List<j25> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(List<j25> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "artists");
            this.a = list;
        }

        public final List<j25> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<j25> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("ShowArtistContextMenu(artists="), this.a, ")");
        }
    }

    /* renamed from: n25$k */
    public static final class k extends n25 {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            kotlin.jvm.internal.h.e(str2, "entityName");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.h.a(this.a, kVar.a) && kotlin.jvm.internal.h.a(this.b, kVar.b) && this.c == kVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
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
            StringBuilder V0 = je.V0("ShowEntityContextMenu(entityUri=");
            V0.append(this.a);
            V0.append(", entityName=");
            V0.append(this.b);
            V0.append(", canPlayOnDemand=");
            return je.P0(V0, this.c, ")");
        }
    }

    /* renamed from: n25$l */
    public static final class l extends n25 {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "trackUri");
            kotlin.jvm.internal.h.e(str2, "trackName");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.h.a(this.a, lVar.a) && kotlin.jvm.internal.h.a(this.b, lVar.b) && this.c == lVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
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
            StringBuilder V0 = je.V0("ShowTrackContextMenu(trackUri=");
            V0.append(this.a);
            V0.append(", trackName=");
            V0.append(this.b);
            V0.append(", canPlayOnDemand=");
            return je.P0(V0, this.c, ")");
        }
    }

    public n25(kotlin.jvm.internal.f fVar) {
    }
}
