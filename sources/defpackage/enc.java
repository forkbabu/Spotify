package defpackage;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: enc  reason: default package */
public abstract class enc {

    /* renamed from: enc$a */
    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            h.e(str, "uri");
            h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
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
            StringBuilder V0 = je.V0("ContextTrackData(uri=");
            V0.append(this.a);
            V0.append(", subtitle=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: enc$b */
    public static final class b extends enc {
        private final String a;
        private final String b;
        private final List<a> c;
        private final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, List<a> list, String str3) {
            super(null);
            h.e(str, "contextUri");
            h.e(str2, "episodeUriToPlay");
            h.e(list, "tracks");
            h.e(str3, "interactionId");
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = str3;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final List<a> d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && h.a(this.d, bVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<a> list = this.c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PodcastUriListPlayRequest(contextUri=");
            V0.append(this.a);
            V0.append(", episodeUriToPlay=");
            V0.append(this.b);
            V0.append(", tracks=");
            V0.append(this.c);
            V0.append(", interactionId=");
            return je.I0(V0, this.d, ")");
        }
    }

    public enc(f fVar) {
    }
}
