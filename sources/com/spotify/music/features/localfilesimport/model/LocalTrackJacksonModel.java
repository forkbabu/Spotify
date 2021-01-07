package com.spotify.music.features.localfilesimport.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalTrackJacksonModel implements JacksonModel, f {
    @JsonProperty("album")
    private final LocalAlbumJacksonModel mAlbum;
    @JsonProperty("artists")
    private final List<LocalArtistJacksonModel> mArtists;
    @JsonProperty("inCollection")
    private final boolean mInCollection;
    @JsonProperty("isExplicit")
    private final boolean mIsExplicit;
    @JsonProperty("name")
    private final String mName;
    @JsonIgnore
    private final List<String> mTracksIds;
    @JsonProperty("link")
    private final String mUri;

    public LocalTrackJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("album") LocalAlbumJacksonModel localAlbumJacksonModel, @JsonProperty("artists") List<LocalArtistJacksonModel> list, @JsonProperty("inCollection") boolean z, @JsonProperty("isExplicit") boolean z2) {
        this.mUri = str;
        this.mName = str2;
        this.mAlbum = localAlbumJacksonModel;
        this.mArtists = list == null ? new ArrayList<>() : list;
        this.mInCollection = z;
        this.mIsExplicit = z2;
        this.mTracksIds = ImmutableList.of(str);
    }

    public b getAlbum() {
        return this.mAlbum;
    }

    public List<c> getArtists() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mArtists);
        return arrayList;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public Drawable getImagePlaceholder(Context context) {
        return null;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public LocalItem.ImageType getImageType() {
        return LocalItem.ImageType.NONE;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getImageUri() {
        return "";
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getSubtitle(Context context) {
        LocalAlbumJacksonModel localAlbumJacksonModel = this.mAlbum;
        String str = "";
        String title = localAlbumJacksonModel != null ? localAlbumJacksonModel.getTitle() : str;
        List<LocalArtistJacksonModel> list = this.mArtists;
        String title2 = (list == null || list.size() <= 0) ? str : this.mArtists.get(0).getTitle();
        StringBuilder V0 = je.V0(title2);
        if (!MoreObjects.isNullOrEmpty(title2) && !MoreObjects.isNullOrEmpty(title)) {
            str = " • ";
        }
        return je.I0(V0, str, title);
    }

    public String getTargetUri() {
        return getUri();
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getTitle() {
        return this.mName;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public String getUri() {
        return this.mUri;
    }

    public boolean inCollection() {
        return this.mInCollection;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    public boolean isExplicit() {
        return this.mIsExplicit;
    }

    @Override // com.spotify.music.features.localfilesimport.model.LocalItem
    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }
}
