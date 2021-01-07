package com.spotify.music.libs.collection.json;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumJacksonModel implements JacksonModel {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("artist")
    private final ArtistJacksonModel mArtist;
    @JsonProperty("collectionLink")
    private final String mCollectionUri;
    @JsonProperty("copyrights")
    private final String[] mCopyrights;
    @JsonProperty("covers")
    private final CoversJacksonModel mCovers;
    @JsonProperty("groupLabel")
    private final String mGroupLabel;
    @JsonProperty("inferredOffline")
    private final String mInferredOffline;
    @JsonProperty("playability")
    private final boolean mIsAnyTrackPlayable;
    @JsonProperty("complete")
    private final boolean mIsSavedToCollection;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("numDiscs")
    private final int mNumDiscs;
    @JsonProperty("numTracks")
    private final int mNumTracks;
    @JsonProperty("numTracksInCollection")
    private final int mNumTracksInCollection;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonProperty("syncProgress")
    private final int mSyncProgress;
    @JsonProperty("link")
    private final String mUri;
    @JsonProperty("year")
    private final int mYear;

    public AlbumJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("copyrights") String[] strArr, @JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("year") int i2, @JsonProperty("numDiscs") int i3, @JsonProperty("numTracks") int i4, @JsonProperty("numTracksInCollection") int i5, @JsonProperty("playability") boolean z, @JsonProperty("complete") boolean z2, @JsonProperty("addTime") int i6, @JsonProperty("groupLabel") String str6) {
        this.mUri = str;
        this.mCollectionUri = str2;
        this.mName = str3;
        this.mCopyrights = strArr;
        this.mArtist = artistJacksonModel;
        this.mCovers = coversJacksonModel;
        this.mOffline = str4;
        this.mInferredOffline = str5;
        this.mSyncProgress = i;
        this.mYear = i2;
        this.mNumDiscs = i3;
        this.mNumTracks = i4;
        this.mNumTracksInCollection = i5;
        this.mIsAnyTrackPlayable = z;
        this.mIsSavedToCollection = z2;
        this.mAddTime = i6;
        this.mGroupLabel = str6;
    }

    private static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }

    @JsonIgnore
    public a getAlbum() {
        a.C0376a a = a.a();
        a.r(getUri());
        a.s(getYear());
        a.l(getName());
        a.a(getAddTime());
        a.m(getNumDiscs());
        a.n(getNumTracks());
        a.j(getHeader());
        a.g(getCopyright());
        a.i(getGroupLabel());
        a.f(getCollectionUri());
        a.b(isAnyTrackPlayable());
        a.q(isSavedToCollection());
        a.o(getNumTracksInCollection());
        a.d(getArtists());
        a.h(getCovers());
        a.c(getArtist());
        a.p(getOfflineState());
        a.k(getInferredOfflineState());
        return a.e();
    }

    @JsonIgnore
    public b getArtist() {
        ArtistJacksonModel artistJacksonModel = this.mArtist;
        return artistJacksonModel != null ? artistJacksonModel.getArtist() : b.a().b();
    }

    @JsonIgnore
    public ImmutableList<b> getArtists() {
        b artist = this.mArtist.getArtist();
        return artist == null ? ImmutableList.of() : ImmutableList.of(artist);
    }

    @JsonIgnore
    public String getCollectionUri() {
        return this.mCollectionUri;
    }

    @JsonIgnore
    public String getCopyright() {
        String[] strArr = this.mCopyrights;
        if (strArr == null) {
            return null;
        }
        return TextUtils.join("\n", strArr);
    }

    @JsonIgnore
    public Covers getCovers() {
        return this.mCovers.getCovers();
    }

    public String getGroupLabel() {
        return this.mGroupLabel;
    }

    @JsonIgnore
    public String getHeader() {
        return null;
    }

    public com.spotify.playlist.models.offline.a getInferredOfflineState() {
        return com.spotify.playlist.models.offline.b.a(this.mInferredOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public String getName() {
        return emptyIfNull(this.mName);
    }

    @JsonIgnore
    public int getNumDiscs() {
        return this.mNumDiscs;
    }

    @JsonIgnore
    public int getNumTracks() {
        return this.mNumTracks;
    }

    @JsonIgnore
    public int getNumTracksInCollection() {
        return this.mNumTracksInCollection;
    }

    public com.spotify.playlist.models.offline.a getOfflineState() {
        return com.spotify.playlist.models.offline.b.a(this.mOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public String getUri() {
        return emptyIfNull(this.mUri);
    }

    @JsonIgnore
    public int getYear() {
        return this.mYear;
    }

    @JsonIgnore
    public boolean isAnyTrackPlayable() {
        return this.mIsAnyTrackPlayable;
    }

    @JsonIgnore
    public boolean isSavedToCollection() {
        return this.mIsSavedToCollection;
    }
}
