package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_TrackCredits extends TrackCredits {
    private final EditCredits editCredits;
    private final String label;
    private final List<RoleCredits> roleCredits;
    private final List<String> sourceNames;
    private final String trackTitle;
    private final String trackUri;

    AutoValue_TrackCredits(String str, String str2, String str3, List<RoleCredits> list, EditCredits editCredits2, List<String> list2) {
        if (str != null) {
            this.label = str;
            if (str2 != null) {
                this.trackUri = str2;
                if (str3 != null) {
                    this.trackTitle = str3;
                    if (list != null) {
                        this.roleCredits = list;
                        if (editCredits2 != null) {
                            this.editCredits = editCredits2;
                            if (list2 != null) {
                                this.sourceNames = list2;
                                return;
                            }
                            throw new NullPointerException("Null sourceNames");
                        }
                        throw new NullPointerException("Null editCredits");
                    }
                    throw new NullPointerException("Null roleCredits");
                }
                throw new NullPointerException("Null trackTitle");
            }
            throw new NullPointerException("Null trackUri");
        }
        throw new NullPointerException("Null label");
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public EditCredits editCredits() {
        return this.editCredits;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackCredits)) {
            return false;
        }
        TrackCredits trackCredits = (TrackCredits) obj;
        if (!this.label.equals(trackCredits.label()) || !this.trackUri.equals(trackCredits.trackUri()) || !this.trackTitle.equals(trackCredits.trackTitle()) || !this.roleCredits.equals(trackCredits.roleCredits()) || !this.editCredits.equals(trackCredits.editCredits()) || !this.sourceNames.equals(trackCredits.sourceNames())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.label.hashCode() ^ 1000003) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.trackTitle.hashCode()) * 1000003) ^ this.roleCredits.hashCode()) * 1000003) ^ this.editCredits.hashCode()) * 1000003) ^ this.sourceNames.hashCode();
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public String label() {
        return this.label;
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public List<RoleCredits> roleCredits() {
        return this.roleCredits;
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public List<String> sourceNames() {
        return this.sourceNames;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackCredits{label=");
        V0.append(this.label);
        V0.append(", trackUri=");
        V0.append(this.trackUri);
        V0.append(", trackTitle=");
        V0.append(this.trackTitle);
        V0.append(", roleCredits=");
        V0.append(this.roleCredits);
        V0.append(", editCredits=");
        V0.append(this.editCredits);
        V0.append(", sourceNames=");
        return je.L0(V0, this.sourceNames, "}");
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public String trackTitle() {
        return this.trackTitle;
    }

    @Override // com.spotify.music.features.trackcredits.model.TrackCredits
    public String trackUri() {
        return this.trackUri;
    }
}
