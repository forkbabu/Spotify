package com.spotify.music.libs.assistedcuration.model;

final class AutoValue_ResponseItem extends ResponseItem {
    private final String name;
    private final String uri;

    AutoValue_ResponseItem(String str, String str2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseItem)) {
            return false;
        }
        ResponseItem responseItem = (ResponseItem) obj;
        if (!this.uri.equals(responseItem.getUri()) || !this.name.equals(responseItem.getName())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseItem
    public String getName() {
        return this.name;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseItem
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ResponseItem{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        return je.I0(V0, this.name, "}");
    }
}
