package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: iz4  reason: default package */
public abstract class iz4 {

    /* renamed from: iz4$a */
    public static final class a extends iz4 {
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
            StringBuilder V0 = je.V0("AddEpisodeRequested(podcastEpisode=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: iz4$b */
    public static final class b extends iz4 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: iz4$c */
    public static final class c extends iz4 {
        private final gz4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(gz4 gz4) {
            super(null);
            h.e(gz4, "podcastEpisodesState");
            this.a = gz4;
        }

        public final gz4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            gz4 gz4 = this.a;
            if (gz4 != null) {
                return gz4.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PodcastEpisodesStateChanged(podcastEpisodesState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private iz4() {
    }

    public iz4(f fVar) {
    }
}
