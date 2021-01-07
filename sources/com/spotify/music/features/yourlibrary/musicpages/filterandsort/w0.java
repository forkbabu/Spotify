package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;

/* access modifiers changed from: package-private */
public final class w0 extends MusicPagesFiltering.a {
    private final String c;

    w0(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering.a
    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MusicPagesFiltering.a) {
            return this.c.equals(((MusicPagesFiltering.a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("FilterStateUpdate{uri="), this.c, "}");
    }
}
