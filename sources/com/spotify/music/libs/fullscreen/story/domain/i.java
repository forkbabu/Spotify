package com.spotify.music.libs.fullscreen.story.domain;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Map;

public abstract class i {

    public static final class a extends i {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends i {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends i {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends i {
        private final Map<String, Boolean> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Map<String, Boolean> map) {
            super(null);
            kotlin.jvm.internal.h.e(map, "collectionState");
            this.a = map;
        }

        public final Map<String, Boolean> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Map<String, Boolean> map = this.a;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.M0(je.V0("CollectionStateUpdated(collectionState="), this.a, ")");
        }
    }

    public static final class e extends i {
        private final boolean a;

        public e(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.a == ((e) obj).a;
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
            return je.P0(je.V0("ConnectionStateChanged(online="), this.a, ")");
        }
    }

    public static final class f extends i {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends i {
        private final boolean a;

        public g(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && this.a == ((g) obj).a;
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
            return je.P0(je.V0("ContextPlayerStateChanged(playing="), this.a, ")");
        }
    }

    public static final class h extends i {
        private final h a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(h hVar) {
            super(null);
            kotlin.jvm.internal.h.e(hVar, AppProtocol.LogMessage.SEVERITY_ERROR);
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar != null) {
                return hVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(error=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.music.libs.fullscreen.story.domain.i$i  reason: collision with other inner class name */
    public static final class C0291i extends i {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0291i(String str, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistName");
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
            if (!(obj instanceof C0291i)) {
                return false;
            }
            C0291i iVar = (C0291i) obj;
            return kotlin.jvm.internal.h.a(this.a, iVar.a) && this.b == iVar.b;
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
            StringBuilder V0 = je.V0("FollowArtistUpdated(artistName=");
            V0.append(this.a);
            V0.append(", followed=");
            return je.P0(V0, this.b, ")");
        }
    }

    public static final class j extends i {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    public static final class k extends i {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    public static final class l extends i {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    public static final class m extends i {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    public static final class n extends i {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    public static final class o extends i {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    public static final class p extends i {
        private final int a;

        public p(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof p) && this.a == ((p) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("PlayChapterRequested(index="), this.a, ")");
        }
    }

    public static final class q extends i {
        private final boolean a;

        public q(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof q) && this.a == ((q) obj).a;
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
            return je.P0(je.V0("PlayingStateChanged(playing="), this.a, ")");
        }
    }

    public static final class r extends i {
        public static final r a = new r();

        private r() {
            super(null);
        }
    }

    public static final class s extends i {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    public static final class t extends i {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    public static final class u extends i {
        private final p a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(p pVar) {
            super(null);
            kotlin.jvm.internal.h.e(pVar, "story");
            this.a = pVar;
        }

        public final p a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof u) && kotlin.jvm.internal.h.a(this.a, ((u) obj).a);
            }
            return true;
        }

        public int hashCode() {
            p pVar = this.a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryFetched(story=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class v extends i {
        private final boolean a;

        public v(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof v) && this.a == ((v) obj).a;
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
            return je.P0(je.V0("StoryInfoVisibilityChanged(show="), this.a, ")");
        }
    }

    public static final class w extends i {
        private final o a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(o oVar) {
            super(null);
            kotlin.jvm.internal.h.e(oVar, "event");
            this.a = oVar;
        }

        public final o a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof w) && kotlin.jvm.internal.h.a(this.a, ((w) obj).a);
            }
            return true;
        }

        public int hashCode() {
            o oVar = this.a;
            if (oVar != null) {
                return oVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryPlayerEvent(event=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private i() {
    }

    public i(kotlin.jvm.internal.f fVar) {
    }
}
