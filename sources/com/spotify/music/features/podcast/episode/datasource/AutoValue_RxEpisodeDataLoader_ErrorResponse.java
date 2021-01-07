package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

final class AutoValue_RxEpisodeDataLoader_ErrorResponse extends RxEpisodeDataLoader.ErrorResponse {
    private final String error;

    AutoValue_RxEpisodeDataLoader_ErrorResponse(String str) {
        this.error = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RxEpisodeDataLoader.ErrorResponse)) {
            return false;
        }
        String str = this.error;
        String error2 = ((RxEpisodeDataLoader.ErrorResponse) obj).getError();
        if (str != null) {
            return str.equals(error2);
        }
        if (error2 == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ErrorResponse
    public String getError() {
        return this.error;
    }

    public int hashCode() {
        String str = this.error;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ErrorResponse{error="), this.error, "}");
    }
}
