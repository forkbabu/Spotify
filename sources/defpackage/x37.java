package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.playlist.models.Episode;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: x37  reason: default package */
public abstract class x37 {

    /* renamed from: x37$a */
    public static final class a extends x37 {
        private final Throwable a = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(null);
            h.e(null, AppProtocol.LogMessage.SEVERITY_ERROR);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
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

    /* renamed from: x37$b */
    public static final class b extends x37 {
        private final List<Episode> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.playlist.models.Episode> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<? extends Episode> list) {
            super(null);
            h.e(list, "results");
            this.a = list;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<Episode> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Loaded(results="), this.a, ")");
        }
    }

    public x37(f fVar) {
    }
}
