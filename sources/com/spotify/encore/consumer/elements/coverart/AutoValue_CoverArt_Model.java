package com.spotify.encore.consumer.elements.coverart;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.coverart.CoverArt;

final class AutoValue_CoverArt_Model extends CoverArt.Model {
    private final CoverArt.ImageData data;
    private final SpotifyIconV2 placeholder;

    /* access modifiers changed from: package-private */
    public static final class Builder implements CoverArt.Model.Builder {
        private CoverArt.ImageData data;
        private SpotifyIconV2 placeholder;

        Builder() {
        }

        @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.Model.Builder
        public CoverArt.Model build() {
            String str = this.data == null ? " data" : "";
            if (this.placeholder == null) {
                str = je.x0(str, " placeholder");
            }
            if (str.isEmpty()) {
                return new AutoValue_CoverArt_Model(this.data, this.placeholder);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.Model.Builder
        public CoverArt.Model.Builder data(CoverArt.ImageData imageData) {
            if (imageData != null) {
                this.data = imageData;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.Model.Builder
        public CoverArt.Model.Builder placeholder(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.placeholder = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null placeholder");
        }
    }

    @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.Model
    public CoverArt.ImageData data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoverArt.Model)) {
            return false;
        }
        CoverArt.Model model = (CoverArt.Model) obj;
        if (!this.data.equals(model.data()) || !this.placeholder.equals(model.placeholder())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.data.hashCode() ^ 1000003) * 1000003) ^ this.placeholder.hashCode();
    }

    @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.Model
    public SpotifyIconV2 placeholder() {
        return this.placeholder;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Model{data=");
        V0.append(this.data);
        V0.append(", placeholder=");
        V0.append(this.placeholder);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_CoverArt_Model(CoverArt.ImageData imageData, SpotifyIconV2 spotifyIconV2) {
        this.data = imageData;
        this.placeholder = spotifyIconV2;
    }
}
