package com.spotify.music.features.offlinesync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("progress")
public final class OfflineProgressModel implements JacksonModel {
    private final float mPercentComplete;
    private final int mQueuedTracks;
    private final int mSyncedTracks;
    private final boolean mSyncing;

    public OfflineProgressModel(@JsonProperty("queued_tracks") int i, @JsonProperty("synced_tracks") int i2, @JsonProperty("syncing") boolean z, @JsonProperty("percent_complete") float f) {
        this.mQueuedTracks = i;
        this.mSyncedTracks = i2;
        this.mSyncing = z;
        this.mPercentComplete = f;
    }

    public static OfflineProgressModel create(int i, int i2, boolean z) {
        return new OfflineProgressModel(i, i2, z, ((float) i2) / Math.max((float) (i2 + i), 1.0f));
    }

    public static OfflineProgressRootModel createWrapped(int i, int i2, boolean z) {
        return OfflineProgressRootModel.wrap(create(i, i2, z));
    }

    public boolean equals(Object obj) {
        if (obj == null || !OfflineProgressModel.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        OfflineProgressModel offlineProgressModel = (OfflineProgressModel) obj;
        if (offlineProgressModel.getQueuedTracks() == getQueuedTracks() && offlineProgressModel.isSyncing() == isSyncing() && offlineProgressModel.getSyncedTracks() == getSyncedTracks()) {
            return true;
        }
        return false;
    }

    @JsonProperty("percent_complete")
    public float getPercentComplete() {
        return this.mPercentComplete;
    }

    @JsonProperty("queued_tracks")
    public int getQueuedTracks() {
        return this.mQueuedTracks;
    }

    @JsonProperty("synced_tracks")
    public int getSyncedTracks() {
        return this.mSyncedTracks;
    }

    public int getTotalTracks() {
        return getQueuedTracks() + getSyncedTracks();
    }

    public int hashCode() {
        return (getSyncedTracks() * 10) + (getTotalTracks() * 100) + (isSyncing() ? 1 : 0);
    }

    @JsonProperty("syncing")
    public boolean isSyncing() {
        return this.mSyncing;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineProgressModel{mQueuedTracks=");
        V0.append(this.mQueuedTracks);
        V0.append(", mSyncedTracks=");
        V0.append(this.mSyncedTracks);
        V0.append(", mSyncing=");
        V0.append(this.mSyncing);
        V0.append(", mPercentComplete=");
        V0.append(this.mPercentComplete);
        V0.append('}');
        return V0.toString();
    }
}
