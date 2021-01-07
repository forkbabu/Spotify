package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class AutoValue_RecsRequest extends RecsRequest {
    private final boolean condensed;
    private final int numResults;
    private final Set<String> skipIds;
    private final String title;
    private final Set<String> trackIds;
    private final String uri;

    AutoValue_RecsRequest(String str, int i, Set<String> set, Set<String> set2, String str2, boolean z) {
        this.uri = str;
        this.numResults = i;
        this.skipIds = set;
        this.trackIds = set2;
        this.title = str2;
        this.condensed = z;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("condensed")
    public boolean condensed() {
        return this.condensed;
    }

    public boolean equals(Object obj) {
        Set<String> set;
        Set<String> set2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecsRequest)) {
            return false;
        }
        RecsRequest recsRequest = (RecsRequest) obj;
        String str2 = this.uri;
        if (str2 != null ? str2.equals(recsRequest.uri()) : recsRequest.uri() == null) {
            if (this.numResults == recsRequest.numResults() && ((set = this.skipIds) != null ? set.equals(recsRequest.skipIds()) : recsRequest.skipIds() == null) && ((set2 = this.trackIds) != null ? set2.equals(recsRequest.trackIds()) : recsRequest.trackIds() == null) && ((str = this.title) != null ? str.equals(recsRequest.title()) : recsRequest.title() == null) && this.condensed == recsRequest.condensed()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.numResults) * 1000003;
        Set<String> set = this.skipIds;
        int hashCode2 = (hashCode ^ (set == null ? 0 : set.hashCode())) * 1000003;
        Set<String> set2 = this.trackIds;
        int hashCode3 = (hashCode2 ^ (set2 == null ? 0 : set2.hashCode())) * 1000003;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ (this.condensed ? 1231 : 1237);
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("numResults")
    public int numResults() {
        return this.numResults;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("trackSkipIDs")
    public Set<String> skipIds() {
        return this.skipIds;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecsRequest{uri=");
        V0.append(this.uri);
        V0.append(", numResults=");
        V0.append(this.numResults);
        V0.append(", skipIds=");
        V0.append(this.skipIds);
        V0.append(", trackIds=");
        V0.append(this.trackIds);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", condensed=");
        return je.P0(V0, this.condensed, "}");
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("trackIDs")
    public Set<String> trackIds() {
        return this.trackIds;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsRequest
    @JsonProperty("playlistURI")
    public String uri() {
        return this.uri;
    }
}
