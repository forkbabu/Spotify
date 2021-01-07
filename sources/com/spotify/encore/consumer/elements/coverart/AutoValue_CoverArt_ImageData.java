package com.spotify.encore.consumer.elements.coverart;

import com.spotify.encore.consumer.elements.coverart.CoverArt;

/* access modifiers changed from: package-private */
public final class AutoValue_CoverArt_ImageData extends CoverArt.ImageData {
    private final int tag;
    private final String uri;

    AutoValue_CoverArt_ImageData(String str, int i) {
        this.uri = str;
        this.tag = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoverArt.ImageData)) {
            return false;
        }
        CoverArt.ImageData imageData = (CoverArt.ImageData) obj;
        String str = this.uri;
        if (str != null ? str.equals(imageData.uri()) : imageData.uri() == null) {
            if (this.tag == imageData.tag()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.uri;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.tag;
    }

    @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.ImageData
    public int tag() {
        return this.tag;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ImageData{uri=");
        V0.append(this.uri);
        V0.append(", tag=");
        return je.B0(V0, this.tag, "}");
    }

    @Override // com.spotify.encore.consumer.elements.coverart.CoverArt.ImageData
    public String uri() {
        return this.uri;
    }
}
