package com.spotify.music.libs.search.ondemand.editorial;

/* access modifiers changed from: package-private */
public final class AutoValue_EditorialOnDemandInfo extends EditorialOnDemandInfo {
    private static final long serialVersionUID = -6869574732011201431L;
    private final String playlistUri;
    private final String trackUri;

    AutoValue_EditorialOnDemandInfo(String str, String str2) {
        if (str != null) {
            this.trackUri = str;
            if (str2 != null) {
                this.playlistUri = str2;
                return;
            }
            throw new NullPointerException("Null playlistUri");
        }
        throw new NullPointerException("Null trackUri");
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.EditorialOnDemandInfo
    public String b() {
        return this.playlistUri;
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.EditorialOnDemandInfo
    public String c() {
        return this.trackUri;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditorialOnDemandInfo)) {
            return false;
        }
        EditorialOnDemandInfo editorialOnDemandInfo = (EditorialOnDemandInfo) obj;
        if (!this.trackUri.equals(editorialOnDemandInfo.c()) || !this.playlistUri.equals(editorialOnDemandInfo.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.trackUri.hashCode() ^ 1000003) * 1000003) ^ this.playlistUri.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EditorialOnDemandInfo{trackUri=");
        V0.append(this.trackUri);
        V0.append(", playlistUri=");
        return je.I0(V0, this.playlistUri, "}");
    }
}
