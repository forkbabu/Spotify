package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: c05  reason: default package */
public abstract class c05 {

    /* renamed from: c05$a */
    public static final class a extends c05 {
        private final uy4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(uy4 uy4) {
            super(null);
            h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
            this.a = uy4;
        }

        public final uy4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
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
            StringBuilder V0 = je.V0("AddTrackToSelectedList(track=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: c05$b */
    public static final class b extends c05 {
        private final List<String> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<String> list) {
            super(null);
            h.e(list, "playlistItems");
            this.a = list;
        }

        public final List<String> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<String> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("FetchSuggestedTracks(playlistItems="), this.a, ")");
        }
    }

    /* renamed from: c05$c */
    public static final class c extends c05 {
        private final List<String> a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<String> list, String str) {
            super(null);
            h.e(list, "playlistItems");
            this.a = list;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final List<String> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            List<String> list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OpenSearch(playlistItems=");
            V0.append(this.a);
            V0.append(", listName=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: c05$d */
    public static final class d extends c05 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            h.e(str, "previewId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
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
            return je.I0(je.V0("PausePreview(previewId="), this.a, ")");
        }
    }

    /* renamed from: c05$e */
    public static final class e extends c05 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            h.e(str, "previewId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
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
            return je.I0(je.V0("PlayPreview(previewId="), this.a, ")");
        }
    }

    /* renamed from: c05$f */
    public static final class f extends c05 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public c05(kotlin.jvm.internal.f fVar) {
    }
}
