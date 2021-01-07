package com.spotify.mobile.android.recentlyplayed.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.offline.b;
import java.util.Locale;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPlayedItem implements JacksonModel, Parcelable {
    private static final String COLLECTION_TRACKS_URI = "spotify:internal:collection:tracks";
    private static final String COLLECTION_YOUR_EPISODES_URI = "spotify:collection:your-episodes";
    public static final Parcelable.Creator<RecentlyPlayedItem> CREATOR = new a();
    private static final String MEDIA_TYPE_VIDEO = "video";
    private static final ImmutableMap<String, Type> TYPES;
    public String artistName;
    public boolean available;
    public String collectionLink;
    public Map<String, String> formatListAttributes;
    public String formatListType;
    public String imageUri;
    public boolean inCollection;
    public boolean isCollaborative;
    public boolean isFollowing;
    public boolean isLoading;
    @JsonIgnore
    public Optional<Boolean> isOnDemandInFree;
    public boolean isOwnedBySelf;
    public String link;
    @JsonProperty("isOnDemandInFree")
    public final Boolean mIsOnDemandInFree;
    @JsonIgnore
    public Show.MediaType mMediaTypeEnum;
    public final String mOffline;
    @JsonProperty("type")
    public final String mType;
    public String madeForName;
    public String madeForUsername;
    public String mediaType;
    public String name;
    @JsonIgnore
    public String navigationLink;
    public int numTracks;
    @JsonIgnore
    public com.spotify.playlist.models.offline.a offlineState;
    public String ownerName;
    public String publisher;
    public String subtitle;
    @Deprecated
    public int syncProgress;
    public int tracksInCollectionCount;
    @JsonIgnore
    public Type type;

    public enum Type {
        ALBUM,
        ARTIST,
        PLAYLIST,
        SHOW,
        RADIO,
        DAILYMIX,
        COLLECTION_SONGS,
        TRACK,
        COLLECTION_YOUR_EPISODES,
        UNKNOWN
    }

    static class a implements Parcelable.Creator<RecentlyPlayedItem> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public RecentlyPlayedItem createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItem(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public RecentlyPlayedItem[] newArray(int i) {
            return new RecentlyPlayedItem[i];
        }
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("album", Type.ALBUM);
        builder.mo51put("artist", Type.ARTIST);
        Type type2 = Type.PLAYLIST;
        builder.mo51put("playlist", type2);
        builder.mo51put("toplist", type2);
        builder.mo51put("show", Type.SHOW);
        Type type3 = Type.RADIO;
        builder.mo51put("radio", type3);
        builder.mo51put("station", type3);
        builder.mo51put("dailymix", Type.DAILYMIX);
        Type type4 = Type.COLLECTION_SONGS;
        builder.mo51put("collection", type4);
        builder.mo51put("collectionunion", type4);
        builder.mo51put("collectionyourepisodes", Type.COLLECTION_YOUR_EPISODES);
        builder.mo51put(AppProtocol.TrackData.TYPE_TRACK, Type.TRACK);
        TYPES = builder.build();
    }

    /* synthetic */ RecentlyPlayedItem(Parcel parcel, a aVar) {
        this(parcel);
    }

    private void populateDerived() {
        this.offlineState = b.a(this.mOffline, this.syncProgress);
        ImmutableMap<String, Type> immutableMap = TYPES;
        String str = this.mType;
        if (str != null) {
            str = str.toLowerCase(Locale.getDefault());
        }
        Type type2 = (Type) x.n(immutableMap.get(str), Type.UNKNOWN);
        this.type = type2;
        if (type2 != Type.ALBUM || !this.inCollection) {
            this.navigationLink = this.link;
        } else {
            this.navigationLink = this.collectionLink;
        }
        if (type2 == Type.COLLECTION_SONGS) {
            this.navigationLink = COLLECTION_TRACKS_URI;
        } else if (type2 == Type.COLLECTION_YOUR_EPISODES) {
            this.navigationLink = COLLECTION_YOUR_EPISODES_URI;
        }
        this.mMediaTypeEnum = "video".equals(this.mediaType) ? Show.MediaType.VIDEO : Show.MediaType.AUDIO;
        if (this.type == Type.SHOW) {
            this.isOnDemandInFree = Optional.of(Boolean.TRUE);
        } else {
            this.isOnDemandInFree = Optional.fromNullable(this.mIsOnDemandInFree);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public String getSubtitle(Context context) {
        String string = context.getResources().getString(C0707R.string.placeholders_loading);
        switch (this.type.ordinal()) {
            case 0:
                return isLoading() ? string : context.getResources().getString(C0707R.string.recently_played_album_by, this.artistName);
            case 1:
                return isLoading() ? string : context.getResources().getString(C0707R.string.recently_played_artist);
            case 2:
                if (isLoading()) {
                    return string;
                }
                if (!TextUtils.isEmpty(this.madeForName)) {
                    return context.getResources().getString(C0707R.string.recently_played_made_for, this.madeForName);
                }
                if (this.isOwnedBySelf || TextUtils.isEmpty(this.ownerName)) {
                    return context.getResources().getString(C0707R.string.recently_played_playlist);
                }
                return context.getResources().getString(C0707R.string.recently_played_playlist_by, this.ownerName);
            case 3:
                return isLoading() ? string : context.getResources().getString(this.mMediaTypeEnum == Show.MediaType.VIDEO ? C0707R.string.recently_played_video_show_by : C0707R.string.recently_played_show_by, this.publisher);
            case 4:
                l0 z = l0.z(agd.b(this.link));
                if (TextUtils.isEmpty(this.subtitle) || z.q() != LinkType.STATION_CLUSTER) {
                    return agd.e(context, z);
                }
                return this.subtitle;
            case 5:
                if (!TextUtils.isEmpty(this.subtitle)) {
                    return this.subtitle;
                }
                return null;
            case 6:
            case 7:
            case 8:
                return null;
            default:
                StringBuilder V0 = je.V0("Unknown type with link: ");
                V0.append(this.link);
                Assertion.p(V0.toString());
                return "";
        }
    }

    public String getTargetUri() {
        return this.navigationLink;
    }

    public String getTitle(Context context) {
        switch (this.type.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                return this.name;
            case 6:
                return context.getResources().getString(C0707R.string.recently_played_liked_songs);
            case 8:
                return context.getResources().getString(C0707R.string.recently_played_your_episodes);
            default:
                StringBuilder V0 = je.V0("Unknown type with link: ");
                V0.append(this.link);
                Assertion.p(V0.toString());
                return "";
        }
    }

    public String getUri() {
        return this.link;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean isLoading() {
        switch (this.type.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
                return TextUtils.isEmpty(this.name);
            case 2:
                return TextUtils.isEmpty(this.link);
            case 6:
            case 8:
                break;
            default:
                StringBuilder V0 = je.V0("Unknown type with link: ");
                V0.append(this.link);
                Assertion.p(V0.toString());
                break;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
        parcel.writeString(this.collectionLink);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUri);
        parcel.writeString(this.mType);
        parcel.writeString(this.mOffline);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.publisher);
        parcel.writeString(this.artistName);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.mediaType);
        parcel.writeString(this.formatListType);
        parcel.writeInt(this.available ? 1 : 0);
        parcel.writeInt(this.isCollaborative ? 1 : 0);
        parcel.writeInt(this.isLoading ? 1 : 0);
        parcel.writeInt(this.isOwnedBySelf ? 1 : 0);
        parcel.writeInt(this.isFollowing ? 1 : 0);
        parcel.writeInt(this.inCollection ? 1 : 0);
        Boolean bool = this.mIsOnDemandInFree;
        if (bool != null) {
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.numTracks);
        parcel.writeInt(this.tracksInCollectionCount);
        parcel.writeInt(this.syncProgress);
        gf0.t(parcel, this.formatListAttributes);
        parcel.writeString(this.madeForName);
        parcel.writeString(this.madeForUsername);
    }

    public RecentlyPlayedItem(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("imageUri") String str4, @JsonProperty("type") String str5, @JsonProperty("offline") String str6, @JsonProperty("ownerName") String str7, @JsonProperty("publisher") String str8, @JsonProperty("artistName") String str9, @JsonProperty("subtitle") String str10, @JsonProperty("mediaType") String str11, @JsonProperty("available") boolean z, @JsonProperty("isCollaborative") boolean z2, @JsonProperty("isLoading") boolean z3, @JsonProperty("isOwnedBySelf") boolean z4, @JsonProperty("isFollowing") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("numTracks") int i, @JsonProperty("tracksInCollectionCount") int i2, @JsonProperty("syncProgress") int i3, @JsonProperty("formatListType") String str12, @JsonProperty("formatListAttributes") Map<String, String> map, @JsonProperty("madeForName") String str13, @JsonProperty("madeForUsername") String str14, @JsonProperty("isOnDemandInFree") Boolean bool) {
        ImmutableMap immutableMap;
        this.isOnDemandInFree = Optional.absent();
        this.link = str;
        this.collectionLink = str2;
        this.name = str3;
        this.imageUri = str4;
        this.mType = str5;
        this.mOffline = str6;
        this.mIsOnDemandInFree = bool;
        this.ownerName = str7;
        this.publisher = str8;
        this.artistName = str9;
        this.subtitle = str10;
        this.mediaType = str11;
        this.available = z;
        this.isCollaborative = z2;
        this.isLoading = z3;
        this.isOwnedBySelf = z4;
        this.isFollowing = z5;
        this.inCollection = z6;
        this.numTracks = i;
        this.tracksInCollectionCount = i2;
        this.syncProgress = i3;
        this.formatListType = str12;
        if (map != null) {
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            immutableMap = ImmutableMap.of();
        }
        this.formatListAttributes = immutableMap;
        this.madeForName = str13;
        this.madeForUsername = str14;
        populateDerived();
    }

    private RecentlyPlayedItem(Parcel parcel) {
        this.isOnDemandInFree = Optional.absent();
        this.link = parcel.readString();
        this.collectionLink = parcel.readString();
        this.name = parcel.readString();
        this.imageUri = parcel.readString();
        this.mType = parcel.readString();
        this.mOffline = parcel.readString();
        this.ownerName = parcel.readString();
        this.publisher = parcel.readString();
        this.artistName = parcel.readString();
        this.subtitle = parcel.readString();
        this.mediaType = parcel.readString();
        this.formatListType = parcel.readString();
        boolean z = true;
        this.available = parcel.readInt() != 0;
        this.isCollaborative = parcel.readInt() != 0;
        this.isLoading = parcel.readInt() != 0;
        this.isOwnedBySelf = parcel.readInt() != 0;
        this.isFollowing = parcel.readInt() != 0;
        this.inCollection = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.mIsOnDemandInFree = Boolean.valueOf(readInt == 0 ? false : z);
        } else {
            this.mIsOnDemandInFree = null;
        }
        this.numTracks = parcel.readInt();
        this.tracksInCollectionCount = parcel.readInt();
        this.syncProgress = parcel.readInt();
        this.formatListAttributes = gf0.k(parcel, zf0.b());
        this.madeForName = parcel.readString();
        this.madeForUsername = parcel.readString();
        populateDerived();
    }
}
