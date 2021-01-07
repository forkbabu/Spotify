package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.preview.z;
import java.util.List;

/* renamed from: d05  reason: default package */
public abstract class d05 {

    /* renamed from: d05$a */
    public static final class a extends d05 {
        private final uy4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(uy4 uy4) {
            super(null);
            kotlin.jvm.internal.h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
            this.a = uy4;
        }

        public final uy4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            uy4 uy4 = this.a;
            if (uy4 != null) {
                return uy4.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddTrackRequested(track=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: d05$b */
    public static final class b extends d05 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: d05$c */
    public static final class c extends d05 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "previewId");
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
            return je.I0(je.V0("PauseRequested(previewId="), this.a, ")");
        }
    }

    /* renamed from: d05$d */
    public static final class d extends d05 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "previewId");
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
            return je.I0(je.V0("PlayRequested(previewId="), this.a, ")");
        }
    }

    /* renamed from: d05$e */
    public static final class e extends d05 {
        private final z a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(z zVar) {
            super(null);
            kotlin.jvm.internal.h.e(zVar, "previewPlayerState");
            this.a = zVar;
        }

        public final z a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            z zVar = this.a;
            if (zVar != null) {
                return zVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PreviewPlayerStateUpdated(previewPlayerState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: d05$f */
    public static final class f extends d05 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: d05$g */
    public static final class g extends d05 {
        private final g05 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(g05 g05) {
            super(null);
            kotlin.jvm.internal.h.e(g05, "tracksState");
            this.a = g05;
        }

        public final g05 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            g05 g05 = this.a;
            if (g05 != null) {
                return g05.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TracksStateChanged(tracksState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: d05$h */
    public static final class h extends d05 {
        private final List<ty4> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends ty4> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List<? extends ty4> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "userSelectionList");
            this.a = list;
        }

        public final List<ty4> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<ty4> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("UserSelectionListChanged(userSelectionList="), this.a, ")");
        }
    }

    private d05() {
    }

    public d05(kotlin.jvm.internal.f fVar) {
    }
}
