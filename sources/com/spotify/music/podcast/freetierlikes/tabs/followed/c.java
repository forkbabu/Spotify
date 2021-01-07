package com.spotify.music.podcast.freetierlikes.tabs.followed;

final class c extends c0 {
    private final String a;

    c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null contextUri");
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.c0
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return this.a.equals(((c0) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ShowPlayerState{contextUri="), this.a, "}");
    }
}
