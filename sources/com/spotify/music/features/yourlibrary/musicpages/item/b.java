package com.spotify.music.features.yourlibrary.musicpages.item;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class b extends MusicItem.e {
    private final List<va9> a;

    /* access modifiers changed from: package-private */
    public static class a extends MusicItem.e.a {
        private List<va9> a;

        a() {
        }

        public MusicItem.e.a a(List<va9> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null activeFilters");
        }

        public MusicItem.e b() {
            String str = this.a == null ? " activeFilters" : "";
            if (str.isEmpty()) {
                return new j(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    b(List<va9> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null activeFilters");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e
    public List<va9> a() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MusicItem.e) {
            return this.a.equals(((MusicItem.e) obj).a());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("FilterIndicatorExtras{activeFilters="), this.a, "}");
    }
}
