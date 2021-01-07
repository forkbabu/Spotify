package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.playlist.formatlisttype.FormatListType;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: zo6  reason: default package */
public interface zo6 extends lp6, pp6, np6, gp6, ip6, ep6 {

    /* renamed from: zo6$a */
    public interface a {
        boolean a(b bVar);

        c b();

        Class<? extends zo6> c();
    }

    /* renamed from: zo6$b */
    public static final class b {
        private final String a;
        private final FormatListType b;
        private final Map<String, String> c;

        public b(String str, FormatListType formatListType, Map<String, String> map) {
            h.e(str, "playlistUri");
            h.e(formatListType, "formatListType");
            h.e(map, "formatListAttributes");
            this.a = str;
            this.b = formatListType;
            this.c = map;
        }

        public final FormatListType a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            FormatListType formatListType = this.b;
            int hashCode2 = (hashCode + (formatListType != null ? formatListType.hashCode() : 0)) * 31;
            Map<String, String> map = this.c;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Conditions(playlistUri=");
            V0.append(this.a);
            V0.append(", formatListType=");
            V0.append(this.b);
            V0.append(", formatListAttributes=");
            return je.M0(V0, this.c, ")");
        }
    }

    /* renamed from: zo6$c */
    public interface c {
        zo6 create();
    }

    Optional<com.spotify.instrumentation.a> g(LicenseLayout licenseLayout);
}
