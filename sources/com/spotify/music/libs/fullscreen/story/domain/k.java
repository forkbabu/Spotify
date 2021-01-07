package com.spotify.music.libs.fullscreen.story.domain;

public abstract class k {

    public static final class a extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
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
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AudioPlaying(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class b extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
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
            return kotlin.jvm.internal.h.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("BackButtonPressed(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class c extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
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
            return kotlin.jvm.internal.h.a(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CloseClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class d extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.h.a(this.a, dVar.a) && this.b == dVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContextPlayerResumed(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class e extends k {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends k {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends k {
        private final long a;

        public g(long j) {
            super(null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && this.a == ((g) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return defpackage.e.a(this.a);
        }

        public String toString() {
            return je.E0(je.V0("EndStory(durationMs="), this.a, ")");
        }
    }

    public static final class h extends k {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    public static final class i extends k {
        private final String a;
        private final int b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, int i, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public final boolean a() {
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
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.h.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowArtistClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            V0.append(this.b);
            V0.append(", followed=");
            return je.P0(V0, this.c, ")");
        }
    }

    public static final class j extends k {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "reason");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
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
            return je.I0(je.V0("FollowArtistUpdateFailed(reason="), this.a, ")");
        }
    }

    /* renamed from: com.spotify.music.libs.fullscreen.story.domain.k$k  reason: collision with other inner class name */
    public static final class C0292k extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0292k(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0292k)) {
                return false;
            }
            C0292k kVar = (C0292k) obj;
            return kotlin.jvm.internal.h.a(this.a, kVar.a) && this.b == kVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FooterContextMenuPressed(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class l extends k {
        private final String a;
        private final int b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, int i, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public final boolean a() {
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
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.h.a(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HeartButtonClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            V0.append(this.b);
            V0.append(", hearted=");
            return je.P0(V0, this.c, ")");
        }
    }

    public static final class m extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.h.a(this.a, mVar.a) && this.b == mVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NextChapterClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class n extends k {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "reason");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
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
            return je.I0(je.V0("ObserveCollectionStateFailed(reason="), this.a, ")");
        }
    }

    public static final class o extends k {
        private final String a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(String str, int i, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            kotlin.jvm.internal.h.e(str2, "destination");
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
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.h.a(this.a, oVar.a) && this.b == oVar.b && kotlin.jvm.internal.h.a(this.c, oVar.c);
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
            StringBuilder V0 = je.V0("OverlayClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            V0.append(this.b);
            V0.append(", destination=");
            return je.I0(V0, this.c, ")");
        }
    }

    public static final class p extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.h.a(this.a, pVar.a) && this.b == pVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OverlayContextMenuPressed(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class q extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return kotlin.jvm.internal.h.a(this.a, qVar.a) && this.b == qVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaybackError(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class r extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return kotlin.jvm.internal.h.a(this.a, rVar.a) && this.b == rVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaylistCoverPressed(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class s extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return kotlin.jvm.internal.h.a(this.a, sVar.a) && this.b == sVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PreviousChapterClicked(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class t extends k {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    public static final class u extends k {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "reason");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof u) && kotlin.jvm.internal.h.a(this.a, ((u) obj).a);
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
            return je.I0(je.V0("StoryFetchingFailed(reason="), this.a, ")");
        }
    }

    public static final class v extends k {
        public static final v a = new v();

        private v() {
            super(null);
        }
    }

    public static final class w extends k {
        private final String a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(String str, int i) {
            super(null);
            kotlin.jvm.internal.h.e(str, "id");
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return kotlin.jvm.internal.h.a(this.a, wVar.a) && this.b == wVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("VideoPlaying(id=");
            V0.append(this.a);
            V0.append(", itemIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public k(kotlin.jvm.internal.f fVar) {
    }
}
