package com.spotify.music.libs.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.offline.a;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistJacksonModel implements JacksonModel {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("collectionLink")
    private final String mCollectionUri;
    @JsonProperty("portraits")
    private final CoversJacksonModel mCovers;
    @JsonProperty("groupLabel")
    private final String mGroupLabel;
    @JsonProperty("inferredOffline")
    private final String mInferredOffline;
    @JsonProperty("isBanned")
    private final boolean mIsDismissed;
    @JsonProperty("isFollowed")
    private final boolean mIsFollowed;
    @JsonProperty("isVariousArtists")
    private final boolean mIsVariousArtist;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("numAlbumsInCollection")
    private final int mNumAlbumsInCollection;
    @JsonProperty("numTracksInCollection")
    private final int mNumTracksInCollection;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonProperty("syncProgress")
    private final int mSyncProgress;
    @JsonProperty("link")
    private final String mUri;

    public ArtistJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("portraits") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("numTracksInCollection") int i2, @JsonProperty("numAlbumsInCollection") int i3, @JsonProperty("isFollowed") boolean z, @JsonProperty("isBanned") boolean z2, @JsonProperty("isVariousArtists") boolean z3, @JsonProperty("addTime") int i4, @JsonProperty("groupLabel") String str6) {
        this.mUri = str;
        this.mCollectionUri = str2;
        this.mName = str3;
        this.mCovers = coversJacksonModel;
        this.mOffline = str4;
        this.mInferredOffline = str5;
        this.mSyncProgress = i;
        this.mNumTracksInCollection = i2;
        this.mNumAlbumsInCollection = i3;
        this.mIsFollowed = z;
        this.mIsDismissed = z2;
        this.mIsVariousArtist = z3;
        this.mAddTime = i4;
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
    public b getArtist() {
        b.a a = b.a();
        a.n(getUri());
        a.j(getName());
        a.h(getHeader());
        a.d(getCovers());
        a.a(getAddTime());
        a.f(isFollowed());
        a.e(isDismissed());
        a.g(getGroupLabel());
        a.m(getOfflineState());
        a.c(getCollectionUri());
        a.o(isVariousArtists());
        a.i(getInferredOfflineState());
        a.k(getNumAlbumsInCollection());
        a.l(getNumTracksInCollection());
        return a.b();
    }

    @JsonIgnore
    public String getCollectionUri() {
        return this.mCollectionUri;
    }

    @JsonIgnore
    public Covers getCovers() {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return coversJacksonModel != null ? coversJacksonModel.getCovers() : Covers.a().a();
    }

    public String getGroupLabel() {
        return this.mGroupLabel;
    }

    @JsonIgnore
    public String getHeader() {
        return null;
    }

    public a getInferredOfflineState() {
        return com.spotify.playlist.models.offline.b.a(this.mInferredOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public String getName() {
        return emptyIfNull(this.mName);
    }

    @JsonIgnore
    public int getNumAlbumsInCollection() {
        return this.mNumAlbumsInCollection;
    }

    @JsonIgnore
    public int getNumTracksInCollection() {
        return this.mNumTracksInCollection;
    }

    public a getOfflineState() {
        return com.spotify.playlist.models.offline.b.a(this.mOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public String getUri() {
        return emptyIfNull(this.mUri);
    }

    public boolean isDismissed() {
        return this.mIsDismissed;
    }

    @JsonIgnore
    public boolean isFollowed() {
        return this.mIsFollowed;
    }

    @JsonIgnore
    public boolean isVariousArtists() {
        return this.mIsVariousArtist;
    }
}
