package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import java.util.Map;

final class AutoValue_PagePrefs extends PagePrefs {
    private final SortOrder activeSortOrder;
    private final Map<String, Boolean> filterStates;
    private final Map<String, String> options;
    private final Long timestamp;
    private final String uri;

    /* access modifiers changed from: package-private */
    public static final class b extends PagePrefs.a {
        private String a;
        private Long b;
        private SortOrder c;
        private Map<String, Boolean> d;
        private Map<String, String> e;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs.a a(SortOrder sortOrder) {
            this.c = sortOrder;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs b() {
            String str = this.a == null ? " uri" : "";
            if (this.d == null) {
                str = je.x0(str, " filterStates");
            }
            if (this.e == null) {
                str = je.x0(str, " options");
            }
            if (str.isEmpty()) {
                return new AutoValue_PagePrefs(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs.a c(Map<String, Boolean> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null filterStates");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs.a d(Map<String, String> map) {
            if (map != null) {
                this.e = map;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs.a e(Long l) {
            this.b = l;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a
        public PagePrefs.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        b(PagePrefs pagePrefs, a aVar) {
            this.a = pagePrefs.uri();
            this.b = pagePrefs.timestamp();
            this.c = pagePrefs.activeSortOrder();
            this.d = pagePrefs.filterStates();
            this.e = pagePrefs.options();
        }
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    @JsonProperty("active_sort_order")
    public SortOrder activeSortOrder() {
        return this.activeSortOrder;
    }

    public boolean equals(Object obj) {
        Long l;
        SortOrder sortOrder;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PagePrefs)) {
            return false;
        }
        PagePrefs pagePrefs = (PagePrefs) obj;
        if (!this.uri.equals(pagePrefs.uri()) || ((l = this.timestamp) != null ? !l.equals(pagePrefs.timestamp()) : pagePrefs.timestamp() != null) || ((sortOrder = this.activeSortOrder) != null ? !sortOrder.equals(pagePrefs.activeSortOrder()) : pagePrefs.activeSortOrder() != null) || !this.filterStates.equals(pagePrefs.filterStates()) || !this.options.equals(pagePrefs.options())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    @JsonProperty("filter_states")
    public Map<String, Boolean> filterStates() {
        return this.filterStates;
    }

    public int hashCode() {
        int hashCode = (this.uri.hashCode() ^ 1000003) * 1000003;
        Long l = this.timestamp;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        SortOrder sortOrder = this.activeSortOrder;
        if (sortOrder != null) {
            i = sortOrder.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.filterStates.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    @JsonProperty("options")
    public Map<String, String> options() {
        return this.options;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    @JsonProperty("timestamp")
    public Long timestamp() {
        return this.timestamp;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    public PagePrefs.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PagePrefs{uri=");
        V0.append(this.uri);
        V0.append(", timestamp=");
        V0.append(this.timestamp);
        V0.append(", activeSortOrder=");
        V0.append(this.activeSortOrder);
        V0.append(", filterStates=");
        V0.append(this.filterStates);
        V0.append(", options=");
        return je.M0(V0, this.options, "}");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    private AutoValue_PagePrefs(String str, Long l, SortOrder sortOrder, Map<String, Boolean> map, Map<String, String> map2) {
        this.uri = str;
        this.timestamp = l;
        this.activeSortOrder = sortOrder;
        this.filterStates = map;
        this.options = map2;
    }
}
