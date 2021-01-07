package com.spotify.music.libs.fullscreen.story.domain;

import java.util.List;
import java.util.Set;

public abstract class g {

    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends g {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends g {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "artistUri");
            kotlin.jvm.internal.h.e(str2, "artistName");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.h.a(this.a, cVar.a) && kotlin.jvm.internal.h.a(this.b, cVar.b) && this.c == cVar.c;
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
            StringBuilder V0 = je.V0("FollowArtist(artistUri=");
            V0.append(this.a);
            V0.append(", artistName=");
            V0.append(this.b);
            V0.append(", followed=");
            return je.P0(V0, this.c, ")");
        }
    }

    public static final class d extends g {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.h.a(this.a, dVar.a) && this.b == dVar.b;
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
            StringBuilder V0 = je.V0("HeartOverlayEntity(entityUri=");
            V0.append(this.a);
            V0.append(", hearted=");
            return je.P0(V0, this.b, ")");
        }
    }

    public static final class e extends g {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends g {
        private final k a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(null);
            kotlin.jvm.internal.h.e(kVar, "log");
            this.a = kVar;
        }

        public final k a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            k kVar = this.a;
            if (kVar != null) {
                return kVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Log(log=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.music.libs.fullscreen.story.domain.g$g  reason: collision with other inner class name */
    public static final class C0290g extends g {
        public static final C0290g a = new C0290g();

        private C0290g() {
            super(null);
        }
    }

    public static final class h extends g {
        private final Set<String> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Set<String> set) {
            super(null);
            kotlin.jvm.internal.h.e(set, "entityUris");
            this.a = set;
        }

        public final Set<String> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Set<String> set = this.a;
            if (set != null) {
                return set.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ObserveCollectionState(entityUris=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class i extends g {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
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
            return je.I0(je.V0("OpenUri(uri="), this.a, ")");
        }
    }

    public static final class j extends g {
        private final int a;
        private final long b;
        private final c c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(int i, long j, c cVar) {
            super(null);
            kotlin.jvm.internal.h.e(cVar, "chapter");
            this.a = i;
            this.b = j;
            this.c = cVar;
        }

        public final c a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final long c() {
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
            return this.a == jVar.a && this.b == jVar.b && kotlin.jvm.internal.h.a(this.c, jVar.c);
        }

        public int hashCode() {
            int a2 = ((this.a * 31) + defpackage.e.a(this.b)) * 31;
            c cVar = this.c;
            return a2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayChapter(index=");
            V0.append(this.a);
            V0.append(", positionMs=");
            V0.append(this.b);
            V0.append(", chapter=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class k extends g {
        private final List<c> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(List<c> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "chapters");
            this.a = list;
        }

        public final List<c> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && kotlin.jvm.internal.h.a(this.a, ((k) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<c> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("PreFetchTrackCoverImages(chapters="), this.a, ")");
        }
    }

    public static final class l extends g {
        private final j a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(j jVar) {
            super(null);
            kotlin.jvm.internal.h.e(jVar, "feedback");
            this.a = jVar;
        }

        public final j a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof l) && kotlin.jvm.internal.h.a(this.a, ((l) obj).a);
            }
            return true;
        }

        public int hashCode() {
            j jVar = this.a;
            if (jVar != null) {
                return jVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowFeedback(feedback=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class m extends g {
        private final e a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(e eVar) {
            super(null);
            kotlin.jvm.internal.h.e(eVar, "contextMenu");
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof m) && kotlin.jvm.internal.h.a(this.a, ((m) obj).a);
            }
            return true;
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar != null) {
                return eVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowFooterContextMenu(contextMenu=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class n extends g {
        private final OverlayContextMenu a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(OverlayContextMenu overlayContextMenu) {
            super(null);
            kotlin.jvm.internal.h.e(overlayContextMenu, "contextMenu");
            this.a = overlayContextMenu;
        }

        public final OverlayContextMenu a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
            }
            return true;
        }

        public int hashCode() {
            OverlayContextMenu overlayContextMenu = this.a;
            if (overlayContextMenu != null) {
                return overlayContextMenu.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowOverlayContextMenu(contextMenu=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class o extends g {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "newAudioFocusState");
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof o) && kotlin.jvm.internal.h.a(this.a, ((o) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateAudioFocus(newAudioFocusState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class p extends g {
        private final boolean a;

        public p(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof p) && this.a == ((p) obj).a;
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
            return je.P0(je.V0("UpdateContextPlayerState(playing="), this.a, ")");
        }
    }

    public static final class q extends g {
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
            return je.P0(je.V0("UpdateStoryPlayerState(playing="), this.a, ")");
        }
    }

    public g(kotlin.jvm.internal.f fVar) {
    }
}
