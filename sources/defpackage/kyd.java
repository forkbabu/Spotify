package defpackage;

import com.spotify.playlist.models.Episode;
import defpackage.syd;

/* renamed from: kyd  reason: default package */
final class kyd extends syd {
    private final Episode a;

    /* access modifiers changed from: package-private */
    /* renamed from: kyd$b */
    public static final class b implements syd.a {
        private Episode a;

        b() {
        }

        @Override // defpackage.syd.a
        public syd.a a(Episode episode) {
            this.a = episode;
            return this;
        }

        @Override // defpackage.syd.a
        public syd build() {
            return new kyd(this.a, null);
        }
    }

    kyd(Episode episode, a aVar) {
        this.a = episode;
    }

    @Override // defpackage.syd
    public Episode b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syd)) {
            return false;
        }
        Episode episode = this.a;
        Episode b2 = ((syd) obj).b();
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
        StringBuilder V0 = je.V0("TrailerSection{episode=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
