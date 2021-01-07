package com.spotify.mobile.android.playlist.model.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Deprecated
public class DecorationPolicy implements JacksonModel {
    @JsonProperty("album")
    private Map<String, Boolean> mAlbumAttributes;
    @JsonProperty("artist")
    private Map<String, Boolean> mArtistAttributes;
    @JsonProperty("artists")
    private Map<String, Boolean> mArtistsAttributes;
    @JsonIgnore
    private Map<String, Boolean> mAttributes;
    @JsonProperty("sections")
    private Map<String, Boolean> mAuxiliarySections;
    @JsonProperty("header")
    private HeaderPolicy mHeaderPolicy;
    @JsonProperty("list")
    private ListPolicy mListPolicy;
    @JsonProperty("radio")
    private RadioPolicy mRadioPolicy;

    public HeaderPolicy getHeaderPolicy() {
        return this.mHeaderPolicy;
    }

    public ListPolicy getListPolicy() {
        return this.mListPolicy;
    }

    @JsonAnyGetter
    public Map<String, Boolean> getMap() {
        return this.mAttributes;
    }

    public void setAlbumAttributes(Map<String, Boolean> map) {
        this.mAlbumAttributes = map;
    }

    public void setArtistAttributes(Map<String, Boolean> map) {
        this.mArtistAttributes = map;
    }

    public void setArtistsAttributes(Map<String, Boolean> map) {
        this.mArtistsAttributes = map;
    }

    public void setAuxiliarySectionsAttributes(Map<String, Boolean> map) {
        this.mAuxiliarySections = map;
    }

    public void setHeaderPolicy(HeaderPolicy headerPolicy) {
        this.mHeaderPolicy = headerPolicy;
    }

    public void setListAttributes(Map<String, Boolean> map) {
        this.mAttributes = map;
    }

    public void setListPolicy(ListPolicy listPolicy) {
        this.mListPolicy = listPolicy;
    }

    public void setRadioPolicy(RadioPolicy radioPolicy) {
        this.mRadioPolicy = radioPolicy;
    }
}
