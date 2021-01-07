package com.spotify.music.features.profile.saveprofile.effecthandlers;

final class AutoValue_SaveProfileEffectHandlers_ImageUploadResponse extends SaveProfileEffectHandlers$ImageUploadResponse {
    private final String uploadToken;

    AutoValue_SaveProfileEffectHandlers_ImageUploadResponse(String str) {
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
        if (obj instanceof SaveProfileEffectHandlers$ImageUploadResponse) {
            return this.uploadToken.equals(((SaveProfileEffectHandlers$ImageUploadResponse) obj).uploadToken());
        }
        return false;
    }

    public int hashCode() {
        return this.uploadToken.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ImageUploadResponse{uploadToken="), this.uploadToken, "}");
    }

    @Override // com.spotify.music.features.profile.saveprofile.effecthandlers.SaveProfileEffectHandlers$ImageUploadResponse
    public String uploadToken() {
        return this.uploadToken;
    }
}
