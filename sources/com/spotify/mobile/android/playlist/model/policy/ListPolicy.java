package com.spotify.mobile.android.playlist.model.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPolicy implements JacksonModel {
    @JsonProperty("addedBy")
    private Map<String, Boolean> mAddedByAttributes;
    @JsonProperty("album")
    private AlbumAttributes mAlbumAttributes;
    @JsonProperty("artist")
    private Map<String, Boolean> mArtistAttributes;
    @JsonProperty("artists")
    private Map<String, Boolean> mArtistsAttributes;
    @JsonIgnore
    private Map<String, Boolean> mAttributes;
    @JsonProperty("podcastSegments")
    private Map<String, Boolean> mPodcastSegmentsAttributes;
    @JsonProperty("show")
    private Map<String, Boolean> mShowAttributes;

    /* access modifiers changed from: private */
    public static class AlbumAttributes implements JacksonModel {
        @JsonProperty("artist")
        private Map<String, Boolean> mArtistAttributes;
        private Map<String, Boolean> mRootAttributes;

        private AlbumAttributes() {
        }

        @JsonAnyGetter
        public Map<String, Boolean> getAttributes() {
            return this.mRootAttributes;
        }

        public void setArtistAttributes(Map<String, Boolean> map) {
            this.mArtistAttributes = map;
        }

        public void setAttributes(Map<String, Boolean> map) {
            this.mRootAttributes = map;
        }
    }

    @JsonAnyGetter
    public Map<String, Boolean> getMap() {
        return this.mAttributes;
    }

    public void setAddedByAttributes(Map<String, Boolean> map) {
        this.mAddedByAttributes = map;
    }

    public void setAlbumArtistAttributes(Map<String, Boolean> map) {
        AlbumAttributes albumAttributes = this.mAlbumAttributes;
        if (albumAttributes == null) {
            albumAttributes = new AlbumAttributes();
        }
        this.mAlbumAttributes = albumAttributes;
        albumAttributes.setArtistAttributes(map);
    }

    public void setAlbumAttributes(Map<String, Boolean> map) {
        AlbumAttributes albumAttributes = this.mAlbumAttributes;
        if (albumAttributes == null) {
            albumAttributes = new AlbumAttributes();
        }
        this.mAlbumAttributes = albumAttributes;
        albumAttributes.setAttributes(map);
    }

    public void setArtistAttributes(Map<String, Boolean> map) {
        this.mArtistAttributes = map;
    }

    public void setArtistsAttributes(Map<String, Boolean> map) {
        this.mArtistsAttributes = map;
    }

    public void setListAttributes(Map<String, Boolean> map) {
        this.mAttributes = map;
    }

    public void setPodcastSegmentsAttributes(Map<String, Boolean> map) {
        this.mPodcastSegmentsAttributes = map;
    }

    public void setShowAttributes(Map<String, Boolean> map) {
        this.mShowAttributes = map;
    }
}
