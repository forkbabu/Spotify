package com.spotify.music.libs.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackJacksonModel extends o implements JacksonModel {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("album")
    private final AlbumJacksonModel mAlbum;
    @JsonProperty("artists")
    private final List<ArtistJacksonModel> mArtists;
    @JsonProperty("canAddToCollection")
    private final boolean mCanAddToCollection;
    @JsonProperty("canBan")
    private final boolean mCanBan;
    @JsonProperty("header")
    private final String mHeader;
    @JsonProperty("inCollection")
    private final boolean mInCollection;
    @JsonProperty("is19PlusOnly")
    private final boolean mIs19plus;
    @JsonProperty("isAvailableInMetadataCatalogue")
    private final boolean mIsAvailableInMetadataCatalogue;
    @JsonProperty("isBanned")
    private final boolean mIsBanned;
    @JsonProperty("isCurrentlyPlayable")
    private final boolean mIsCurrentlyPlayable;
    @JsonProperty("isExplicit")
    private final boolean mIsExplicit;
    @JsonProperty("isLocal")
    private final boolean mIsLocal;
    @JsonProperty("length")
    private final int mLength;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonIgnore
    private final PlayabilityRestriction mPlayabilityRestriction;
    @JsonProperty("previewId")
    private final String mPreviewId;
    @JsonProperty("trackDescriptors")
    private final List<String> mTrackDescriptors;
    @JsonProperty("link")
    private final String mUri;

    /* access modifiers changed from: private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrackPlayStateModel implements JacksonModel {
        @JsonProperty("playabilityRestriction")
        private final String mPlayabilityRestriction;

        public TrackPlayStateModel(@JsonProperty("playabilityRestriction") String str) {
            this.mPlayabilityRestriction = str;
        }

        public String getPlayabilityRestriction() {
            return this.mPlayabilityRestriction;
        }
    }

    public TrackJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("header") String str3, @JsonProperty("offline") String str4, @JsonProperty("previewId") String str5, @JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("artists") List<ArtistJacksonModel> list, @JsonProperty("isCurrentlyPlayable") boolean z, @JsonProperty("isAvailableInMetadataCatalogue") boolean z2, @JsonProperty("isExplicit") boolean z3, @JsonProperty("is19PlusOnly") boolean z4, @JsonProperty("trackPlayState") TrackPlayStateModel trackPlayStateModel, @JsonProperty("isLocal") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("canAddToCollection") boolean z7, @JsonProperty("isBanned") boolean z8, @JsonProperty("canBan") boolean z9, @JsonProperty("addTime") int i, @JsonProperty("length") int i2, @JsonProperty("trackDescriptors") List<String> list2) {
        this.mUri = str;
        this.mName = str2;
        this.mHeader = str3;
        this.mAlbum = albumJacksonModel;
        this.mArtists = list;
        this.mIsCurrentlyPlayable = z;
        this.mIsAvailableInMetadataCatalogue = z2;
        this.mIsExplicit = z3;
        this.mIs19plus = z4;
        this.mPlayabilityRestriction = getRestrictionFromPlayState(trackPlayStateModel);
        this.mIsLocal = z5;
        this.mInCollection = z6;
        this.mCanAddToCollection = z7;
        this.mIsBanned = z8;
        this.mCanBan = z9;
        this.mOffline = str4;
        this.mPreviewId = str5;
        this.mAddTime = i;
        this.mLength = i2;
        this.mTrackDescriptors = list2;
    }

    private static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    private static PlayabilityRestriction getRestrictionFromPlayState(TrackPlayStateModel trackPlayStateModel) {
        if (trackPlayStateModel != null) {
            return q.l(trackPlayStateModel.getPlayabilityRestriction());
        }
        return PlayabilityRestriction.UNKNOWN;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public a getAlbum() {
        return this.mAlbum.getAlbum();
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public ImmutableList<b> getArtists() {
        return FluentIterable.from(this.mArtists).transform(a.a).toList();
    }

    @Override // com.spotify.playlist.models.o
    public boolean getCanAddToCollection() {
        return this.mCanAddToCollection;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getCanBan() {
        return this.mCanBan;
    }

    @Override // com.spotify.playlist.models.o
    public String getGroupLabel() {
        return null;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getHasLyrics() {
        return false;
    }

    @Override // com.spotify.playlist.models.g
    @JsonIgnore
    public String getHeader() {
        return this.mHeader;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getIs19plus() {
        return this.mIs19plus;
    }

    @Override // com.spotify.playlist.models.o
    public int getLength() {
        return this.mLength;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public String getName() {
        return emptyIfNull(this.mName);
    }

    @Override // com.spotify.playlist.models.o
    public com.spotify.playlist.models.offline.a getOfflineState() {
        return com.spotify.playlist.models.offline.b.a(this.mOffline, 0);
    }

    @Override // com.spotify.playlist.models.o
    public PlayabilityRestriction getPlayabilityRestriction() {
        return this.mPlayabilityRestriction;
    }

    @Override // com.spotify.playlist.models.o
    public String getPlayableTrackUri() {
        return null;
    }

    @Override // com.spotify.playlist.models.o
    public String getPreviewId() {
        return this.mPreviewId;
    }

    @Override // com.spotify.playlist.models.o
    public ImmutableList<String> getTrackDescriptors() {
        List<String> list = this.mTrackDescriptors;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return ImmutableList.of();
    }

    @Override // com.spotify.playlist.models.h
    @JsonIgnore
    public String getUri() {
        return emptyIfNull(this.mUri);
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public boolean isAvailableInMetadataCatalogue() {
        return this.mIsAvailableInMetadataCatalogue;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isBanned() {
        return this.mIsBanned;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public boolean isCurrentlyPlayable() {
        return this.mIsCurrentlyPlayable;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public boolean isExplicit() {
        return this.mIsExplicit;
    }

    @Override // com.spotify.playlist.models.o
    @JsonIgnore
    public boolean isInCollection() {
        return this.mInCollection;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isLocal() {
        return this.mIsLocal;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isPremiumOnly() {
        throw new UnsupportedOperationException("isPremiumOnly() not implemented!!!");
    }

    @Override // com.spotify.playlist.models.o
    public o.a toBuilder() {
        return o.builder();
    }
}
