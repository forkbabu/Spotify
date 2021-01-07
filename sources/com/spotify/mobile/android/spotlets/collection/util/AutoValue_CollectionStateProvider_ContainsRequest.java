package com.spotify.mobile.android.spotlets.collection.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_CollectionStateProvider_ContainsRequest extends CollectionStateProvider.ContainsRequest {
    private final String contextUri;
    private final List<String> items;
    private final String source;

    AutoValue_CollectionStateProvider_ContainsRequest(List<String> list, String str, String str2) {
        if (list != null) {
            this.items = list;
            if (str != null) {
                this.source = str;
                if (str2 != null) {
                    this.contextUri = str2;
                    return;
                }
                throw new NullPointerException("Null contextUri");
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null items");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionStateProvider.ContainsRequest)) {
            return false;
        }
        CollectionStateProvider.ContainsRequest containsRequest = (CollectionStateProvider.ContainsRequest) obj;
        if (!this.items.equals(containsRequest.getItems()) || !this.source.equals(containsRequest.getSource()) || !this.contextUri.equals(containsRequest.getContextUri())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.ContainsRequest
    @JsonProperty("contextUri")
    public String getContextUri() {
        return this.contextUri;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.ContainsRequest
    @JsonProperty("items")
    public List<String> getItems() {
        return this.items;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.ContainsRequest
    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        return ((((this.items.hashCode() ^ 1000003) * 1000003) ^ this.source.hashCode()) * 1000003) ^ this.contextUri.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContainsRequest{items=");
        V0.append(this.items);
        V0.append(", source=");
        V0.append(this.source);
        V0.append(", contextUri=");
        return je.I0(V0, this.contextUri, "}");
    }
}
