package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.jvm.internal.h;

/* renamed from: tz4  reason: default package */
public abstract class tz4 {

    /* renamed from: tz4$a */
    public static final class a extends tz4 {
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

    /* renamed from: tz4$b */
    public static final class b extends tz4 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: tz4$c */
    public static final class c extends tz4 {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            h.e(str, "searchQuery");
            h.e(str2, "catalogue");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
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
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FetchSearchQuery(searchQuery=");
            V0.append(this.a);
            V0.append(", catalogue=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: tz4$d */
    public static final class d extends tz4 {
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

    /* renamed from: tz4$e */
    public static final class e extends tz4 {
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

    /* renamed from: tz4$f */
    public static final class f extends tz4 {
        private final String a;

        public f(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
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
            return je.I0(je.V0("ShowTrackExistedSnackbar(listName="), this.a, ")");
        }
    }

    /* renamed from: tz4$g */
    public static final class g extends tz4 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public tz4(kotlin.jvm.internal.f fVar) {
    }
}
