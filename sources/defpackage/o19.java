package defpackage;

import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: o19  reason: default package */
public abstract class o19 {

    /* renamed from: o19$a */
    public static final class a extends o19 {
        private final int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((h19) ti07).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int l() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("MaxTabsOffsetChanged{newMaxTabsOffset="), this.a, '}');
        }
    }

    /* renamed from: o19$b */
    public static final class b extends o19 {
        b() {
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((f19) ti010).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnSettingsClicked{}";
        }
    }

    /* renamed from: o19$c */
    public static final class c extends o19 {
        private final YourLibraryPageId a;
        private final boolean b;

        c(YourLibraryPageId yourLibraryPageId, boolean z) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            this.b = z;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((i19) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a == this.a && cVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public final YourLibraryPageId l() {
            return this.a;
        }

        public final boolean m() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PageFocusRequest{pageId=");
            V0.append(this.a);
            V0.append(", smooth=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: o19$d */
    public static final class d extends o19 {
        private final YourLibraryPageId a;
        private final String b;
        private final String c;

        d(YourLibraryPageId yourLibraryPageId, String str, String str2) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            str.getClass();
            this.b = str;
            str2.getClass();
            this.c = str2;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) p19.c(((e19) ti0).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.a != this.a || !dVar.b.equals(this.b) || !dVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, (this.a.hashCode() + 0) * 31, 31);
        }

        public final YourLibraryPageId l() {
            return this.a;
        }

        public final String m() {
            return this.b;
        }

        public final String n() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PageFocused{pageId=");
            V0.append(this.a);
            V0.append(", pageIdentifier=");
            V0.append(this.b);
            V0.append(", pageUri=");
            return je.H0(V0, this.c, '}');
        }
    }

    /* renamed from: o19$e */
    public static final class e extends o19 {
        private final YourLibraryPageId a;
        private final LoadingState b;

        e(YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            loadingState.getClass();
            this.b = loadingState;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((d19) ti09).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.a == this.a && eVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final LoadingState l() {
            return this.b;
        }

        public final YourLibraryPageId m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PageLoadingStateChanged{requestingPageId=");
            V0.append(this.a);
            V0.append(", loadingState=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: o19$f */
    public static final class f extends o19 {
        f() {
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((g19) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ScrollActivePageToTopRequest{}";
        }
    }

    /* renamed from: o19$g */
    public static final class g extends o19 {
        private final YourLibraryPageId a;
        private final boolean b;

        g(YourLibraryPageId yourLibraryPageId, boolean z) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            this.b = z;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((k19) ti05).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (gVar.a == this.a && gVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public final YourLibraryPageId l() {
            return this.a;
        }

        public final boolean m() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetPageSwipeLockRequest{requestingPageId=");
            V0.append(this.a);
            V0.append(", swipeLocked=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: o19$h */
    public static final class h extends o19 {
        private final YourLibraryPageId a;
        private final boolean b;

        h(YourLibraryPageId yourLibraryPageId, boolean z) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            this.b = z;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((b19) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (hVar.a == this.a && hVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public final boolean l() {
            return this.b;
        }

        public final YourLibraryPageId m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetTabsCollapseLockRequest{requestingPageId=");
            V0.append(this.a);
            V0.append(", collapseLocked=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: o19$i */
    public static final class i extends o19 {
        private final YourLibraryPageId a;
        private final YourLibraryTabsCollapseState b;
        private final boolean c;

        i(YourLibraryPageId yourLibraryPageId, YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            yourLibraryTabsCollapseState.getClass();
            this.b = yourLibraryTabsCollapseState;
            this.c = z;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((j19) ti06).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (iVar.a == this.a && iVar.b == this.b && iVar.c == this.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return je.n(this.c, (hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public final boolean l() {
            return this.c;
        }

        public final YourLibraryPageId m() {
            return this.a;
        }

        public final YourLibraryTabsCollapseState n() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetTabsCollapseStateRequest{requestingPageId=");
            V0.append(this.a);
            V0.append(", tabsCollapseState=");
            V0.append(this.b);
            V0.append(", animate=");
            return je.O0(V0, this.c, '}');
        }
    }

    /* renamed from: o19$j */
    public static final class j extends o19 {
        private final int a;

        j(int i) {
            this.a = i;
        }

        @Override // defpackage.o19
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010) {
            return (R_) ((c19) ti08).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof j) && ((j) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int l() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("TabsOffsetChanged{newTabsOffset="), this.a, '}');
        }
    }

    o19() {
    }

    public static o19 b(int i2) {
        return new a(i2);
    }

    public static o19 c() {
        return new b();
    }

    public static o19 d(YourLibraryPageId yourLibraryPageId, boolean z) {
        return new c(yourLibraryPageId, z);
    }

    public static o19 e(YourLibraryPageId yourLibraryPageId, String str, String str2) {
        return new d(yourLibraryPageId, str, str2);
    }

    public static o19 f(YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
        return new e(yourLibraryPageId, loadingState);
    }

    public static o19 g() {
        return new f();
    }

    public static o19 h(YourLibraryPageId yourLibraryPageId, boolean z) {
        return new g(yourLibraryPageId, z);
    }

    public static o19 i(YourLibraryPageId yourLibraryPageId, boolean z) {
        return new h(yourLibraryPageId, z);
    }

    public static o19 j(YourLibraryPageId yourLibraryPageId, YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        return new i(yourLibraryPageId, yourLibraryTabsCollapseState, z);
    }

    public static o19 k(int i2) {
        return new j(i2);
    }

    public abstract <R_> R_ a(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<g, R_> ti05, ti0<i, R_> ti06, ti0<a, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<b, R_> ti010);
}
