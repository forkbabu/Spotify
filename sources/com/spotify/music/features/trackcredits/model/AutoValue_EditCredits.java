package com.spotify.music.features.trackcredits.model;

final class AutoValue_EditCredits extends EditCredits {
    private final String label;
    private final String url;

    AutoValue_EditCredits(String str, String str2) {
        if (str != null) {
            this.label = str;
            if (str2 != null) {
                this.url = str2;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null label");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditCredits)) {
            return false;
        }
        EditCredits editCredits = (EditCredits) obj;
        if (!this.label.equals(editCredits.label()) || !this.url.equals(editCredits.url())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.label.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode();
    }

    @Override // com.spotify.music.features.trackcredits.model.EditCredits
    public String label() {
        return this.label;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EditCredits{label=");
        V0.append(this.label);
        V0.append(", url=");
        return je.I0(V0, this.url, "}");
    }

    @Override // com.spotify.music.features.trackcredits.model.EditCredits
    public String url() {
        return this.url;
    }
}
