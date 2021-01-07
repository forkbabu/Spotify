package com.spotify.music.features.album.offline.model;

import com.spotify.playlist.models.offline.a;

final class AutoValue_Album extends Album {
    private final String collectionUri;
    private final boolean completeInCollection;
    private final a inferredOfflineState;
    private final int numTracksInCollection;
    private final a offlineState;

    AutoValue_Album(String str, a aVar, a aVar2, boolean z, int i) {
        if (str != null) {
            this.collectionUri = str;
            if (aVar != null) {
                this.offlineState = aVar;
                if (aVar2 != null) {
                    this.inferredOfflineState = aVar2;
                    this.completeInCollection = z;
                    this.numTracksInCollection = i;
                    return;
                }
                throw new NullPointerException("Null inferredOfflineState");
            }
            throw new NullPointerException("Null offlineState");
        }
        throw new NullPointerException("Null collectionUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Album)) {
            return false;
        }
        Album album = (Album) obj;
        if (!this.collectionUri.equals(album.getCollectionUri()) || !this.offlineState.equals(album.getOfflineState()) || !this.inferredOfflineState.equals(album.getInferredOfflineState()) || this.completeInCollection != album.isCompleteInCollection() || this.numTracksInCollection != album.getNumTracksInCollection()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.album.offline.model.Album
    public String getCollectionUri() {
        return this.collectionUri;
    }

    @Override // com.spotify.music.features.album.offline.model.Album
    public a getInferredOfflineState() {
        return this.inferredOfflineState;
    }

    @Override // com.spotify.music.features.album.offline.model.Album
    public int getNumTracksInCollection() {
        return this.numTracksInCollection;
    }

    @Override // com.spotify.music.features.album.offline.model.Album
    public a getOfflineState() {
        return this.offlineState;
    }

    public int hashCode() {
        return ((((((((this.collectionUri.hashCode() ^ 1000003) * 1000003) ^ this.offlineState.hashCode()) * 1000003) ^ this.inferredOfflineState.hashCode()) * 1000003) ^ (this.completeInCollection ? 1231 : 1237)) * 1000003) ^ this.numTracksInCollection;
    }

    @Override // com.spotify.music.features.album.offline.model.Album
    public boolean isCompleteInCollection() {
        return this.completeInCollection;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Album{collectionUri=");
        V0.append(this.collectionUri);
        V0.append(", offlineState=");
        V0.append(this.offlineState);
        V0.append(", inferredOfflineState=");
        V0.append(this.inferredOfflineState);
        V0.append(", completeInCollection=");
        V0.append(this.completeInCollection);
        V0.append(", numTracksInCollection=");
        return je.B0(V0, this.numTracksInCollection, "}");
    }
}
