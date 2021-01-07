package com.spotify.music.appprotocol.superbird.queue.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public final class AutoValue_QueueAppProtocol_PlayerQueueItem extends QueueAppProtocol$PlayerQueueItem {
    private final String artistName;
    private final String imageUri;
    private final String name;
    private final String provider;
    private final String uid;
    private final String uri;

    AutoValue_QueueAppProtocol_PlayerQueueItem(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str != null) {
            this.uid = str;
            if (str2 != null) {
                this.uri = str2;
                this.name = str3;
                this.artistName = str4;
                this.imageUri = str5;
                if (str6 != null) {
                    this.provider = str6;
                    return;
                }
                throw new NullPointerException("Null provider");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null uid");
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty("artist_name")
    public String artistName() {
        return this.artistName;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueueAppProtocol$PlayerQueueItem)) {
            return false;
        }
        QueueAppProtocol$PlayerQueueItem queueAppProtocol$PlayerQueueItem = (QueueAppProtocol$PlayerQueueItem) obj;
        if (!this.uid.equals(queueAppProtocol$PlayerQueueItem.uid()) || !this.uri.equals(queueAppProtocol$PlayerQueueItem.uri()) || ((str = this.name) != null ? !str.equals(queueAppProtocol$PlayerQueueItem.name()) : queueAppProtocol$PlayerQueueItem.name() != null) || ((str2 = this.artistName) != null ? !str2.equals(queueAppProtocol$PlayerQueueItem.artistName()) : queueAppProtocol$PlayerQueueItem.artistName() != null) || ((str3 = this.imageUri) != null ? !str3.equals(queueAppProtocol$PlayerQueueItem.imageUri()) : queueAppProtocol$PlayerQueueItem.imageUri() != null) || !this.provider.equals(queueAppProtocol$PlayerQueueItem.provider())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((this.uid.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.artistName;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.imageUri;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.provider.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty("image_uri")
    public String imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty(ContextTrack.Metadata.KEY_PROVIDER)
    public String provider() {
        return this.provider;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerQueueItem{uid=");
        V0.append(this.uid);
        V0.append(", uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", artistName=");
        V0.append(this.artistName);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", provider=");
        return je.I0(V0, this.provider, "}");
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty("uid")
    public String uid() {
        return this.uid;
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueueItem
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
