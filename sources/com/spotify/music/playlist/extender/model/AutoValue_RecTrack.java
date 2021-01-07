package com.spotify.music.playlist.extender.model;

import com.spotify.music.playlist.extender.model.RecTrack;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RecTrack extends RecTrack {
    private final Item album;
    private final List<Item> artists;
    private final boolean currentlyPlayable;
    private final int duration;
    private final boolean explicit;
    private final String id;
    private final String name;
    private final boolean tagged19plus;

    /* access modifiers changed from: package-private */
    public static final class b implements RecTrack.a {
        private String a;
        private String b;
        private Item c;
        private List<Item> d;
        private Integer e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        b() {
        }

        @Override // com.spotify.music.playlist.extender.model.RecTrack.a
        public RecTrack.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.extender.model.RecTrack.a
        public RecTrack.a b(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.extender.model.RecTrack.a
        public RecTrack build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " name");
            }
            if (this.c == null) {
                str = je.x0(str, " album");
            }
            if (this.d == null) {
                str = je.x0(str, " artists");
            }
            if (this.e == null) {
                str = je.x0(str, " duration");
            }
            if (this.f == null) {
                str = je.x0(str, " explicit");
            }
            if (this.g == null) {
                str = je.x0(str, " tagged19plus");
            }
            if (this.h == null) {
                str = je.x0(str, " currentlyPlayable");
            }
            if (str.isEmpty()) {
                return new AutoValue_RecTrack(this.a, this.b, this.c, this.d, this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.playlist.extender.model.RecTrack.a
        public RecTrack.a c(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public RecTrack.a d(Item item) {
            if (item != null) {
                this.c = item;
                return this;
            }
            throw new NullPointerException("Null album");
        }

        public RecTrack.a e(List<Item> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public RecTrack.a f(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public RecTrack.a g(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public RecTrack.a h(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        b(RecTrack recTrack, a aVar) {
            this.a = recTrack.getId();
            this.b = recTrack.getName();
            this.c = recTrack.getAlbum();
            this.d = recTrack.getArtists();
            this.e = Integer.valueOf(recTrack.getDuration());
            this.f = Boolean.valueOf(recTrack.isExplicit());
            this.g = Boolean.valueOf(recTrack.isTagged19plus());
            this.h = Boolean.valueOf(recTrack.isCurrentlyPlayable());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecTrack)) {
            return false;
        }
        RecTrack recTrack = (RecTrack) obj;
        if (!this.id.equals(recTrack.getId()) || !this.name.equals(recTrack.getName()) || !this.album.equals(recTrack.getAlbum()) || !this.artists.equals(recTrack.getArtists()) || this.duration != recTrack.getDuration() || this.explicit != recTrack.isExplicit() || this.tagged19plus != recTrack.isTagged19plus() || this.currentlyPlayable != recTrack.isCurrentlyPlayable()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public Item getAlbum() {
        return this.album;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public List<Item> getArtists() {
        return this.artists;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public int getDuration() {
        return this.duration;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public String getId() {
        return this.id;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.album.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ this.duration) * 1000003) ^ (this.explicit ? 1231 : 1237)) * 1000003) ^ (this.tagged19plus ? 1231 : 1237)) * 1000003;
        if (!this.currentlyPlayable) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public boolean isCurrentlyPlayable() {
        return this.currentlyPlayable;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public boolean isExplicit() {
        return this.explicit;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public boolean isTagged19plus() {
        return this.tagged19plus;
    }

    @Override // com.spotify.music.playlist.extender.model.RecTrack
    public RecTrack.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecTrack{id=");
        V0.append(this.id);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", album=");
        V0.append(this.album);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", duration=");
        V0.append(this.duration);
        V0.append(", explicit=");
        V0.append(this.explicit);
        V0.append(", tagged19plus=");
        V0.append(this.tagged19plus);
        V0.append(", currentlyPlayable=");
        return je.P0(V0, this.currentlyPlayable, "}");
    }

    private AutoValue_RecTrack(String str, String str2, Item item, List<Item> list, int i, boolean z, boolean z2, boolean z3) {
        this.id = str;
        this.name = str2;
        this.album = item;
        this.artists = list;
        this.duration = i;
        this.explicit = z;
        this.tagged19plus = z2;
        this.currentlyPlayable = z3;
    }
}
