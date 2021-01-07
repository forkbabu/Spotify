package defpackage;

import com.spotify.playlist.models.Episode;
import defpackage.lyd;

/* renamed from: dyd  reason: default package */
final class dyd extends lyd {
    private final Episode a;

    /* access modifiers changed from: package-private */
    /* renamed from: dyd$b */
    public static final class b implements lyd.a {
        private Episode a;

        b() {
        }

        @Override // defpackage.lyd.a
        public lyd.a a(Episode episode) {
            this.a = episode;
            return this;
        }

        @Override // defpackage.lyd.a
        public lyd build() {
            return new dyd(this.a, null);
        }
    }

    dyd(Episode episode, a aVar) {
        this.a = episode;
    }

    @Override // defpackage.lyd
    public Episode b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyd)) {
            return false;
        }
        Episode episode = this.a;
        Episode b2 = ((lyd) obj).b();
        if (episode != null) {
            return episode.equals(b2);
        }
        if (b2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Episode episode = this.a;
        return (episode == null ? 0 : episode.hashCode()) ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContinueListeningSection{episode=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
