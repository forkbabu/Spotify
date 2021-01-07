package defpackage;

/* renamed from: u25  reason: default package */
public abstract class u25 {

    /* renamed from: u25$a */
    public static final class a extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            this.a = i;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
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
            return this.a == aVar.a && kotlin.jvm.internal.h.a(this.b, aVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AutomatedMessagingEntityHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$b */
    public static final class b extends u25 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: u25$c */
    public static final class c extends u25 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: u25$d */
    public static final class d extends u25 {
        private final int a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, String str) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && kotlin.jvm.internal.h.a(this.c, dVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowRecsArtistAvatarHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", artistPosition=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$e */
    public static final class e extends u25 {
        private final int a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i, int i2, String str) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && kotlin.jvm.internal.h.a(this.c, eVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowRecsArtistDismissHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", artistPosition=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$f */
    public static final class f extends u25 {
        private final int a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(int i, int i2, String str) {
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && kotlin.jvm.internal.h.a(this.c, fVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowRecsArtistFollowHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", artistPosition=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$g */
    public static final class g extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && kotlin.jvm.internal.h.a(this.b, gVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseAdditionalArtistsHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$h */
    public static final class h extends u25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "artistUri");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && kotlin.jvm.internal.h.a(this.b, hVar.b) && kotlin.jvm.internal.h.a(this.c, hVar.c);
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
            StringBuilder V0 = je.V0("MusicReleaseArtistAvatarHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$i */
    public static final class i extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && kotlin.jvm.internal.h.a(this.b, iVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseEntityCollapse(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$j */
    public static final class j extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && kotlin.jvm.internal.h.a(this.b, jVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseEntityContextMenuHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$k */
    public static final class k extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && kotlin.jvm.internal.h.a(this.b, kVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseEntityExpand(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$l */
    public static final class l extends u25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(int i, String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && kotlin.jvm.internal.h.a(this.b, lVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseEntityHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: u25$m */
    public static final class m extends u25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a == mVar.a && kotlin.jvm.internal.h.a(this.b, mVar.b) && kotlin.jvm.internal.h.a(this.c, mVar.c);
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
            StringBuilder V0 = je.V0("MusicReleaseEntityPlayButtonPauseHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$n */
    public static final class n extends u25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a == nVar.a && kotlin.jvm.internal.h.a(this.b, nVar.b) && kotlin.jvm.internal.h.a(this.c, nVar.c);
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
            StringBuilder V0 = je.V0("MusicReleaseEntityPlayButtonPlayHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$o */
    public static final class o extends u25 {
        private final int a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(int i, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.a == oVar.a && kotlin.jvm.internal.h.a(this.b, oVar.b) && kotlin.jvm.internal.h.a(this.c, oVar.c);
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
            StringBuilder V0 = je.V0("MusicReleaseEntityPlayButtonResumeHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: u25$p */
    public static final class p extends u25 {
        private final int a;
        private final String b;
        private final int c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(int i, String str, int i2, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a == pVar.a && kotlin.jvm.internal.h.a(this.b, pVar.b) && this.c == pVar.c && kotlin.jvm.internal.h.a(this.d, pVar.d);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseTrackRowContextMenuHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackPosition=");
            V0.append(this.c);
            V0.append(", trackUri=");
            return je.I0(V0, this.d, ")");
        }
    }

    /* renamed from: u25$q */
    public static final class q extends u25 {
        private final int a;
        private final String b;
        private final int c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(int i, String str, int i2, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a == qVar.a && kotlin.jvm.internal.h.a(this.b, qVar.b) && this.c == qVar.c && kotlin.jvm.internal.h.a(this.d, qVar.d);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseTrackRowHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackPosition=");
            V0.append(this.c);
            V0.append(", trackUri=");
            return je.I0(V0, this.d, ")");
        }
    }

    /* renamed from: u25$r */
    public static final class r extends u25 {
        private final int a;
        private final String b;
        private final int c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(int i, String str, int i2, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "releaseUri");
            kotlin.jvm.internal.h.e(str2, "trackUri");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
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
            return this.a == rVar.a && kotlin.jvm.internal.h.a(this.b, rVar.b) && this.c == rVar.c && kotlin.jvm.internal.h.a(this.d, rVar.d);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseTrackRowLongHit(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            V0.append(this.b);
            V0.append(", trackPosition=");
            V0.append(this.c);
            V0.append(", trackUri=");
            return je.I0(V0, this.d, ")");
        }
    }

    public u25(kotlin.jvm.internal.f fVar) {
    }
}
