package com.spotify.music.features.podcast.episode.datasource;

import com.google.common.base.Optional;
import com.spotify.music.features.podcast.episode.o;
import com.spotify.playlist.models.Episode;

public abstract class z {

    public static final class a extends z {
    }

    public static final class b extends z {
    }

    public static final class c extends z {
        private final Episode a;
        private final Optional<b91> b;
        private final Optional<k87> c;
        private final Optional<b91> d;
        private final Optional<b91> e;

        c(Episode episode, Optional<b91> optional, Optional<k87> optional2, Optional<b91> optional3, Optional<b91> optional4) {
            episode.getClass();
            this.a = episode;
            optional.getClass();
            this.b = optional;
            optional2.getClass();
            this.c = optional2;
            optional3.getClass();
            this.d = optional3;
            optional4.getClass();
            this.e = optional4;
        }

        @Override // com.spotify.music.features.podcast.episode.datasource.z
        public final void a(si0<b> si0, si0<a> si02, si0<c> si03) {
            o oVar = (o) si03;
            oVar.a.a(oVar.b, this);
        }

        public final Optional<b91> b() {
            return this.e;
        }

        public final Episode c() {
            return this.a;
        }

        public final Optional<b91> d() {
            return this.b;
        }

        public final Optional<b91> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c) || !cVar.d.equals(this.d) || !cVar.e.equals(this.e)) {
                return false;
            }
            return true;
        }

        public final Optional<k87> f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.d.hashCode();
            return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success{episode=");
            V0.append(this.a);
            V0.append(", episodeRecommendationsHubsViewModel=");
            V0.append(this.b);
            V0.append(", trackListViewModel=");
            V0.append(this.c);
            V0.append(", featuredContentHubsViewModel=");
            V0.append(this.d);
            V0.append(", audioPlusHubsViewModel=");
            V0.append(this.e);
            V0.append('}');
            return V0.toString();
        }
    }

    z() {
    }

    public abstract void a(si0<b> si0, si0<a> si02, si0<c> si03);
}
