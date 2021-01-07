package com.spotify.music.appprotocol.superbird.queue.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_QueueAppProtocol_PlayerQueue extends QueueAppProtocol$PlayerQueue {
    private final QueueAppProtocol$PlayerQueueItem currentTrack;
    private final List<QueueAppProtocol$PlayerQueueItem> nextTracks;
    private final List<QueueAppProtocol$PlayerQueueItem> previousTracks;

    AutoValue_QueueAppProtocol_PlayerQueue(List<QueueAppProtocol$PlayerQueueItem> list, QueueAppProtocol$PlayerQueueItem queueAppProtocol$PlayerQueueItem, List<QueueAppProtocol$PlayerQueueItem> list2) {
        if (list != null) {
            this.nextTracks = list;
            this.currentTrack = queueAppProtocol$PlayerQueueItem;
            if (list2 != null) {
                this.previousTracks = list2;
                return;
            }
            throw new NullPointerException("Null previousTracks");
        }
        throw new NullPointerException("Null nextTracks");
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue
    @JsonProperty("current")
    public QueueAppProtocol$PlayerQueueItem currentTrack() {
        return this.currentTrack;
    }

    public boolean equals(Object obj) {
        QueueAppProtocol$PlayerQueueItem queueAppProtocol$PlayerQueueItem;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueueAppProtocol$PlayerQueue)) {
            return false;
        }
        QueueAppProtocol$PlayerQueue queueAppProtocol$PlayerQueue = (QueueAppProtocol$PlayerQueue) obj;
        if (!this.nextTracks.equals(queueAppProtocol$PlayerQueue.nextTracks()) || ((queueAppProtocol$PlayerQueueItem = this.currentTrack) != null ? !queueAppProtocol$PlayerQueueItem.equals(queueAppProtocol$PlayerQueue.currentTrack()) : queueAppProtocol$PlayerQueue.currentTrack() != null) || !this.previousTracks.equals(queueAppProtocol$PlayerQueue.previousTracks())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.nextTracks.hashCode() ^ 1000003) * 1000003;
        QueueAppProtocol$PlayerQueueItem queueAppProtocol$PlayerQueueItem = this.currentTrack;
        return ((hashCode ^ (queueAppProtocol$PlayerQueueItem == null ? 0 : queueAppProtocol$PlayerQueueItem.hashCode())) * 1000003) ^ this.previousTracks.hashCode();
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue
    @JsonProperty("next")
    public List<QueueAppProtocol$PlayerQueueItem> nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue
    @JsonProperty("previous")
    public List<QueueAppProtocol$PlayerQueueItem> previousTracks() {
        return this.previousTracks;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerQueue{nextTracks=");
        V0.append(this.nextTracks);
        V0.append(", currentTrack=");
        V0.append(this.currentTrack);
        V0.append(", previousTracks=");
        return je.L0(V0, this.previousTracks, "}");
    }
}
