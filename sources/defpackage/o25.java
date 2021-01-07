package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: o25  reason: default package */
public abstract class o25 {

    /* renamed from: o25$a */
    public static final class a extends o25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            kotlin.jvm.internal.h.e(str2, "artistUri");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && kotlin.jvm.internal.h.a(this.b, aVar.b) && kotlin.jvm.internal.h.a(this.c, aVar.c);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ArtistAvatarClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$b */
    public static final class b extends o25 {
        private final int a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && kotlin.jvm.internal.h.a(this.c, bVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ArtistClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", artistItemPosition=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$c */
    public static final class c extends o25 {
        private final String a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "feedItemId");
            kotlin.jvm.internal.h.e(str2, "entityUri");
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.h.a(this.a, cVar.a) && this.b == cVar.b && kotlin.jvm.internal.h.a(this.c, cVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AutomatedMessagingEntityClicked(feedItemId=");
            V0.append(this.a);
            V0.append(", feedItemPosition=");
            V0.append(this.b);
            V0.append(", entityUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$d */
    public static final class d extends o25 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ConnectivityChanged(online=false)";
        }
    }

    /* renamed from: o25$e */
    public static final class e extends o25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
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
            return je.I0(je.V0("DismissArtistClicked(artistUri="), this.a, ")");
        }
    }

    /* renamed from: o25$f */
    public static final class f extends o25 {
        private final String a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, int i, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "feedItemId");
            kotlin.jvm.internal.h.e(str2, "entityUri");
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.h.a(this.a, fVar.a) && this.b == fVar.b && kotlin.jvm.internal.h.a(this.c, fVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EntityClicked(feedItemId=");
            V0.append(this.a);
            V0.append(", feedItemPosition=");
            V0.append(this.b);
            V0.append(", entityUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$g */
    public static final class g extends o25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            kotlin.jvm.internal.h.e(str2, "entityName");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && kotlin.jvm.internal.h.a(this.b, gVar.b) && kotlin.jvm.internal.h.a(this.c, gVar.c);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EntityContextMenuClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", entityName=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$h */
    public static final class h extends o25 {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "feedItemId");
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.h.a(this.a, hVar.a) && this.b == hVar.b;
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
            StringBuilder V0 = je.V0("EntityItemExpanded(feedItemId=");
            V0.append(this.a);
            V0.append(", expanded=");
            return je.P0(V0, this.b, ")");
        }
    }

    /* renamed from: o25$i */
    public static final class i extends o25 {
        private final boolean a;

        public i(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && this.a == ((i) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("ExplicitContentSettingChanged(explicitContentDisabled="), this.a, ")");
        }
    }

    /* renamed from: o25$j */
    public static final class j extends o25 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            ((j) obj).getClass();
            return kotlin.jvm.internal.h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FeedRefreshSucceeded(items=null)";
        }
    }

    /* renamed from: o25$k */
    public static final class k extends o25 {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    /* renamed from: o25$l */
    public static final class l extends o25 {
        private final List<p25> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends p25> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(List<? extends p25> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "items");
            this.a = list;
        }

        public final List<p25> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof l) && kotlin.jvm.internal.h.a(this.a, ((l) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<p25> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("FetchDataSucceeded(items="), this.a, ")");
        }
    }

    /* renamed from: o25$m */
    public static final class m extends o25 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof m) && kotlin.jvm.internal.h.a(this.a, ((m) obj).a);
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
            return je.I0(je.V0("FollowArtistClicked(artistUri="), this.a, ")");
        }
    }

    /* renamed from: o25$n */
    public static final class n extends o25 {
        private final j25 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(j25 j25) {
            super(null);
            kotlin.jvm.internal.h.e(j25, "artist");
            this.a = j25;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
            }
            return true;
        }

        public int hashCode() {
            j25 j25 = this.a;
            if (j25 != null) {
                return j25.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowArtistFailed(artist=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o25$o */
    public static final class o extends o25 {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    /* renamed from: o25$p */
    public static final class p extends o25 {
        private final Set<Integer> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(Set<Integer> set) {
            super(null);
            kotlin.jvm.internal.h.e(set, "indexes");
            this.a = set;
        }

        public final Set<Integer> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof p) && kotlin.jvm.internal.h.a(this.a, ((p) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Set<Integer> set = this.a;
            if (set != null) {
                return set.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowRecsVisibleItemsChanged(indexes=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o25$q */
    public static final class q extends o25 {
        private final int a;
        private final String b;
        private final List<j25> c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(int i, String str, List<j25> list) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            kotlin.jvm.internal.h.e(list, "artists");
            this.a = i;
            this.b = str;
            this.c = list;
        }

        public final List<j25> a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a == qVar.a && kotlin.jvm.internal.h.a(this.b, qVar.b) && kotlin.jvm.internal.h.a(this.c, qVar.c);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            List<j25> list = this.c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OtherArtistsClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", artists=");
            return je.L0(V0, this.c, ")");
        }
    }

    /* renamed from: o25$r */
    public static final class r extends o25 {
        private final String a;
        private final int b;
        private final String c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(String str, int i, String str2, String str3) {
            super(null);
            je.x(str, "feedItemId", str2, "entityUri", str3, "trackUri");
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return kotlin.jvm.internal.h.a(this.a, rVar.a) && this.b == rVar.b && kotlin.jvm.internal.h.a(this.c, rVar.c) && kotlin.jvm.internal.h.a(this.d, rVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayPauseClicked(feedItemId=");
            V0.append(this.a);
            V0.append(", feedItemPosition=");
            V0.append(this.b);
            V0.append(", entityUri=");
            V0.append(this.c);
            V0.append(", trackUri=");
            return je.I0(V0, this.d, ")");
        }
    }

    /* renamed from: o25$s */
    public static final class s extends o25 {
        private final c35 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(c35 c35) {
            super(null);
            kotlin.jvm.internal.h.e(c35, "state");
            this.a = c35;
        }

        public final c35 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof s) && kotlin.jvm.internal.h.a(this.a, ((s) obj).a);
            }
            return true;
        }

        public int hashCode() {
            c35 c35 = this.a;
            if (c35 != null) {
                return c35.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayerStateChanged(state=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: o25$t */
    public static final class t extends o25 {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    /* renamed from: o25$u */
    public static final class u extends o25 {
        private final String a;
        private final int b;
        private final String c;
        private final String d;
        private final int e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(String str, int i, String str2, String str3, int i2) {
            super(null);
            je.x(str, "feedItemId", str2, "entityUri", str3, "trackUri");
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = i2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return kotlin.jvm.internal.h.a(this.a, uVar.a) && this.b == uVar.b && kotlin.jvm.internal.h.a(this.c, uVar.c) && kotlin.jvm.internal.h.a(this.d, uVar.d) && this.e == uVar.e;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.e;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackClicked(feedItemId=");
            V0.append(this.a);
            V0.append(", feedItemPosition=");
            V0.append(this.b);
            V0.append(", entityUri=");
            V0.append(this.c);
            V0.append(", trackUri=");
            V0.append(this.d);
            V0.append(", trackPosition=");
            return je.B0(V0, this.e, ")");
        }
    }

    /* renamed from: o25$v */
    public static final class v extends o25 {
        private final int a;
        private final String b;
        private final int c;
        private final String d;
        private final String e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(int i, String str, int i2, String str2, String str3) {
            super(null);
            je.x(str, "entityUri", str2, "trackUri", str3, "trackName");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = str3;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a == vVar.a && kotlin.jvm.internal.h.a(this.b, vVar.b) && this.c == vVar.c && kotlin.jvm.internal.h.a(this.d, vVar.d) && kotlin.jvm.internal.h.a(this.e, vVar.e);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackContextMenuClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", trackPosition=");
            V0.append(this.c);
            V0.append(", trackUri=");
            V0.append(this.d);
            V0.append(", trackName=");
            return je.I0(V0, this.e, ")");
        }
    }

    /* renamed from: o25$w */
    public static final class w extends o25 {
        private final int a;
        private final String b;
        private final int c;
        private final String d;
        private final String e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(int i, String str, int i2, String str2, String str3) {
            super(null);
            je.x(str, "entityUri", str2, "trackUri", str3, "trackName");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = str3;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a == wVar.a && kotlin.jvm.internal.h.a(this.b, wVar.b) && this.c == wVar.c && kotlin.jvm.internal.h.a(this.d, wVar.d) && kotlin.jvm.internal.h.a(this.e, wVar.e);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackLongClicked(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", trackPosition=");
            V0.append(this.c);
            V0.append(", trackUri=");
            V0.append(this.d);
            V0.append(", trackName=");
            return je.I0(V0, this.e, ")");
        }
    }

    /* renamed from: o25$x */
    public static final class x extends o25 {
        private final Set<Integer> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(Set<Integer> set) {
            super(null);
            kotlin.jvm.internal.h.e(set, "indexes");
            this.a = set;
        }

        public final Set<Integer> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof x) && kotlin.jvm.internal.h.a(this.a, ((x) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Set<Integer> set = this.a;
            if (set != null) {
                return set.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("VisibleItemsChanged(indexes=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private o25() {
    }

    public o25(kotlin.jvm.internal.f fVar) {
    }
}
