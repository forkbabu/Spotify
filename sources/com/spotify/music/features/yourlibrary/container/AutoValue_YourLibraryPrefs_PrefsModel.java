package com.spotify.music.features.yourlibrary.container;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

final class AutoValue_YourLibraryPrefs_PrefsModel extends YourLibraryPrefs.PrefsModel {
    private final Optional<YourLibraryPageId> focusedPageId;
    private final long timestamp;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YourLibraryPrefs.PrefsModel)) {
            return false;
        }
        YourLibraryPrefs.PrefsModel prefsModel = (YourLibraryPrefs.PrefsModel) obj;
        if (this.timestamp != prefsModel.timestamp() || !this.focusedPageId.equals(prefsModel.focusedPageId())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel
    @JsonProperty("focused_page_id")
    @JsonSerialize(using = YourLibraryPrefs.PageIdSerializer.class)
    public Optional<YourLibraryPageId> focusedPageId() {
        return this.focusedPageId;
    }

    public int hashCode() {
        long j = this.timestamp;
        return this.focusedPageId.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel
    @JsonProperty("timestamp")
    public long timestamp() {
        return this.timestamp;
    }

    @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel
    public YourLibraryPrefs.PrefsModel.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PrefsModel{timestamp=");
        V0.append(this.timestamp);
        V0.append(", focusedPageId=");
        return je.F0(V0, this.focusedPageId, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends YourLibraryPrefs.PrefsModel.a {
        private Long a;
        private Optional<YourLibraryPageId> b = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a
        public YourLibraryPrefs.PrefsModel a() {
            String str = this.a == null ? " timestamp" : "";
            if (str.isEmpty()) {
                return new AutoValue_YourLibraryPrefs_PrefsModel(this.a.longValue(), this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a
        public YourLibraryPrefs.PrefsModel.a b(Optional<YourLibraryPageId> optional) {
            this.b = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a
        public YourLibraryPrefs.PrefsModel.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        b(YourLibraryPrefs.PrefsModel prefsModel, a aVar) {
            this.a = Long.valueOf(prefsModel.timestamp());
            this.b = prefsModel.focusedPageId();
        }
    }

    private AutoValue_YourLibraryPrefs_PrefsModel(long j, Optional<YourLibraryPageId> optional) {
        this.timestamp = j;
        this.focusedPageId = optional;
    }
}
