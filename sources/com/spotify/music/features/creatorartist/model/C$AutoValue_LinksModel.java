package com.spotify.music.features.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.creatorartist.model.$AutoValue_LinksModel  reason: invalid class name */
abstract class C$AutoValue_LinksModel extends LinksModel {
    private final String facebookLink;
    private final String instagramLink;
    private final String twitterLink;
    private final String wikipediaLink;

    C$AutoValue_LinksModel(String str, String str2, String str3, String str4) {
        this.twitterLink = str;
        this.instagramLink = str2;
        this.wikipediaLink = str3;
        this.facebookLink = str4;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinksModel)) {
            return false;
        }
        LinksModel linksModel = (LinksModel) obj;
        String str = this.twitterLink;
        if (str != null ? str.equals(linksModel.getTwitterLink()) : linksModel.getTwitterLink() == null) {
            String str2 = this.instagramLink;
            if (str2 != null ? str2.equals(linksModel.getInstagramLink()) : linksModel.getInstagramLink() == null) {
                String str3 = this.wikipediaLink;
                if (str3 != null ? str3.equals(linksModel.getWikipediaLink()) : linksModel.getWikipediaLink() == null) {
                    String str4 = this.facebookLink;
                    if (str4 == null) {
                        if (linksModel.getFacebookLink() == null) {
                            return true;
                        }
                    } else if (str4.equals(linksModel.getFacebookLink())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.creatorartist.model.LinksModel
    @JsonProperty("facebook")
    public String getFacebookLink() {
        return this.facebookLink;
    }

    @Override // com.spotify.music.features.creatorartist.model.LinksModel
    @JsonProperty("instagram")
    public String getInstagramLink() {
        return this.instagramLink;
    }

    @Override // com.spotify.music.features.creatorartist.model.LinksModel
    @JsonProperty("twitter")
    public String getTwitterLink() {
        return this.twitterLink;
    }

    @Override // com.spotify.music.features.creatorartist.model.LinksModel
    @JsonProperty("wikipedia")
    public String getWikipediaLink() {
        return this.wikipediaLink;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.twitterLink;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.instagramLink;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.wikipediaLink;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.facebookLink;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LinksModel{twitterLink=");
        V0.append(this.twitterLink);
        V0.append(", instagramLink=");
        V0.append(this.instagramLink);
        V0.append(", wikipediaLink=");
        V0.append(this.wikipediaLink);
        V0.append(", facebookLink=");
        return je.I0(V0, this.facebookLink, "}");
    }
}
