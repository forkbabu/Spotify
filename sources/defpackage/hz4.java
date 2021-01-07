package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: hz4  reason: default package */
public abstract class hz4 {

    /* renamed from: hz4$a */
    public static final class a extends hz4 {
        private final sy4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sy4 sy4) {
            super(null);
            h.e(sy4, "podcastEpisode");
            this.a = sy4;
        }

        public final sy4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            sy4 sy4 = this.a;
            if (sy4 != null) {
                return sy4.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddEpisodeToSelectedList(podcastEpisode=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: hz4$b */
    public static final class b extends hz4 {
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
            return je.L0(je.V0("FetchRecentlyPlayed(playlistItems="), this.a, ")");
        }
    }

    public hz4(f fVar) {
    }
}
