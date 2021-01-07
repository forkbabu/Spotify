package com.spotify.music.features.editplaylist.upload;

import com.spotify.music.features.editplaylist.upload.ImageUploadEndpoint;

final class AutoValue_ImageUploadEndpoint_ImageUploadResponse extends ImageUploadEndpoint.ImageUploadResponse {
    private final String uploadToken;

    AutoValue_ImageUploadEndpoint_ImageUploadResponse(String str) {
        if (str != null) {
            this.uploadToken = str;
            return;
        }
        throw new NullPointerException("Null uploadToken");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageUploadEndpoint.ImageUploadResponse) {
            return this.uploadToken.equals(((ImageUploadEndpoint.ImageUploadResponse) obj).uploadToken());
        }
        return false;
    }

    public int hashCode() {
        return this.uploadToken.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ImageUploadResponse{uploadToken="), this.uploadToken, "}");
    }

    @Override // com.spotify.music.features.editplaylist.upload.ImageUploadEndpoint.ImageUploadResponse
    public String uploadToken() {
        return this.uploadToken;
    }
}
