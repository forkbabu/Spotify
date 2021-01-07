package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import java.util.List;

final class AutoValue_PrefsModel extends PrefsModel {
    private final List<PagePrefs> pagePrefs;

    /* access modifiers changed from: package-private */
    public static final class b extends PrefsModel.a {
        private List<PagePrefs> a;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.a
        public PrefsModel a() {
            String str = this.a == null ? " pagePrefs" : "";
            if (str.isEmpty()) {
                return new AutoValue_PrefsModel(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.a
        public PrefsModel.a b(List<PagePrefs> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null pagePrefs");
        }

        b(PrefsModel prefsModel, a aVar) {
            this.a = prefsModel.pagePrefs();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrefsModel) {
            return this.pagePrefs.equals(((PrefsModel) obj).pagePrefs());
        }
        return false;
    }

    public int hashCode() {
        return this.pagePrefs.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel
    @JsonProperty("page_prefs")
    public List<PagePrefs> pagePrefs() {
        return this.pagePrefs;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel
    public PrefsModel.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        return je.L0(je.V0("PrefsModel{pagePrefs="), this.pagePrefs, "}");
    }

    private AutoValue_PrefsModel(List<PagePrefs> list) {
        this.pagePrefs = list;
    }
}
