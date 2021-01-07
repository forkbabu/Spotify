package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.preview.z;
import java.util.List;

/* renamed from: uz4  reason: default package */
public abstract class uz4 {

    /* renamed from: uz4$a */
    public static final class a extends uz4 {
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

    /* renamed from: uz4$b */
    public static final class b extends uz4 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "previewId");
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
            return je.I0(je.V0("PauseRequested(previewId="), this.a, ")");
        }
    }

    /* renamed from: uz4$c */
    public static final class c extends uz4 {
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
            return je.I0(je.V0("PlayRequested(previewId="), this.a, ")");
        }
    }

    /* renamed from: uz4$d */
    public static final class d extends uz4 {
        private final z a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(z zVar) {
            super(null);
            kotlin.jvm.internal.h.e(zVar, "previewPlayerState");
            this.a = zVar;
        }

        public final z a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
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

    /* renamed from: uz4$e */
    public static final class e extends uz4 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "searchQuery");
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
            return je.I0(je.V0("SearchQueryChanged(searchQuery="), this.a, ")");
        }
    }

    /* renamed from: uz4$f */
    public static final class f extends uz4 {
        private final xz4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(xz4 xz4) {
            super(null);
            kotlin.jvm.internal.h.e(xz4, "searchState");
            this.a = xz4;
        }

        public final xz4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            xz4 xz4 = this.a;
            if (xz4 != null) {
                return xz4.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SearchStateChanged(searchState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: uz4$g */
    public static final class g extends uz4 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "catalogue");
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
            return je.I0(je.V0("UserCatalogueUpdated(catalogue="), this.a, ")");
        }
    }

    /* renamed from: uz4$h */
    public static final class h extends uz4 {
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

    private uz4() {
    }

    public uz4(kotlin.jvm.internal.f fVar) {
    }
}