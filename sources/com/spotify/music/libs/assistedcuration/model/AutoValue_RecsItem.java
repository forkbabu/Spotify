package com.spotify.music.libs.assistedcuration.model;

final class AutoValue_RecsItem extends RecsItem {
    private final String id;
    private final String imageUrl;
    private final String largeImageUrl;
    private final String name;

    AutoValue_RecsItem(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.name = str2;
                this.imageUrl = str3;
                this.largeImageUrl = str4;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecsItem)) {
            return false;
        }
        RecsItem recsItem = (RecsItem) obj;
        if (this.id.equals(recsItem.id()) && this.name.equals(recsItem.name()) && ((str = this.imageUrl) != null ? str.equals(recsItem.imageUrl()) : recsItem.imageUrl() == null)) {
            String str2 = this.largeImageUrl;
            if (str2 == null) {
                if (recsItem.largeImageUrl() == null) {
                    return true;
                }
            } else if (str2.equals(recsItem.largeImageUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.imageUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.largeImageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsItem
    public String id() {
        return this.id;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsItem
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsItem
    public String largeImageUrl() {
        return this.largeImageUrl;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsItem
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecsItem{id=");
        V0.append(this.id);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", largeImageUrl=");
        return je.I0(V0, this.largeImageUrl, "}");
    }
}
