package com.spotify.music.features.podcast.episode.inspector.tracklist.model;

import com.spotify.music.features.podcast.episode.inspector.tracklist.model.d;
import java.util.List;

final class b extends d {
    private final List<c> a;
    private final String b;
    private final boolean c;
    private final String d;
    private final List<String> e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.podcast.episode.inspector.tracklist.model.b$b  reason: collision with other inner class name */
    public static final class C0247b implements d.a {
        private List<c> a;
        private String b;
        private Boolean c;
        private String d;
        private List<String> e;

        C0247b() {
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d build() {
            String str = this.a == null ? " trackListItems" : "";
            if (this.b == null) {
                str = je.x0(str, " episodeUri");
            }
            if (this.c == null) {
                str = je.x0(str, " canUpsell");
            }
            if (this.e == null) {
                str = je.x0(str, " artists");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.booleanValue(), this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d.a c(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d.a d(List<c> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null trackListItems");
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d.a f(List<String> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d.a
        public d.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null episodeUri");
        }
    }

    b(List list, String str, boolean z, String str2, List list2, a aVar) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = list2;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d
    public List<String> a() {
        return this.e;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d
    public String d() {
        return this.b;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.f()) || !this.b.equals(dVar.d()) || this.c != dVar.c() || ((str = this.d) != null ? !str.equals(dVar.e()) : dVar.e() != null) || !this.e.equals(dVar.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.d
    public List<c> f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        String str = this.d;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListModel{trackListItems=");
        V0.append(this.a);
        V0.append(", episodeUri=");
        V0.append(this.b);
        V0.append(", canUpsell=");
        V0.append(this.c);
        V0.append(", imageUri=");
        V0.append(this.d);
        V0.append(", artists=");
        return je.L0(V0, this.e, "}");
    }
}
