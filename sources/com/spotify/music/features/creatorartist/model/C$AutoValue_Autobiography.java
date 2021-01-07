package com.spotify.music.features.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.creatorartist.model.$AutoValue_Autobiography  reason: invalid class name */
abstract class C$AutoValue_Autobiography extends Autobiography {
    private final String body;
    private final LinksModel links;
    private final List<String> urls;

    C$AutoValue_Autobiography(String str, List<String> list, LinksModel linksModel) {
        this.body = str;
        if (list != null) {
            this.urls = list;
            this.links = linksModel;
            return;
        }
        throw new NullPointerException("Null urls");
    }

    @Override // com.spotify.music.features.creatorartist.model.Autobiography
    @JsonProperty("body")
    public String body() {
        return this.body;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Autobiography)) {
            return false;
        }
        Autobiography autobiography = (Autobiography) obj;
        String str = this.body;
        if (str != null ? str.equals(autobiography.body()) : autobiography.body() == null) {
            if (this.urls.equals(autobiography.urls())) {
                LinksModel linksModel = this.links;
                if (linksModel == null) {
                    if (autobiography.links() == null) {
                        return true;
                    }
                } else if (linksModel.equals(autobiography.links())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.body;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.urls.hashCode()) * 1000003;
        LinksModel linksModel = this.links;
        if (linksModel != null) {
            i = linksModel.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.features.creatorartist.model.Autobiography
    @JsonProperty("links")
    public LinksModel links() {
        return this.links;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Autobiography{body=");
        V0.append(this.body);
        V0.append(", urls=");
        V0.append(this.urls);
        V0.append(", links=");
        V0.append(this.links);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.features.creatorartist.model.Autobiography
    @JsonProperty("urls")
    public List<String> urls() {
        return this.urls;
    }
}
