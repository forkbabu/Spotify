package com.spotify.collection.endpoints.artist.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.collection.endpoints.album.json.CoversJacksonModel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ArtistJacksonModel implements JacksonModel {
    private final int addTime;
    private final String collectionUri;
    private final CoversJacksonModel covers;
    private final String groupLabel;
    private final String inferredOffline;
    private final boolean isBanned;
    private final boolean isFollowed;
    private final boolean isVariousArtist;
    private final String name;
    private final int numAlbumsInCollection;
    private final int numTracksInCollection;
    private final String offline;
    private final int syncProgress;
    private final String uri;

    public ArtistJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("portraits") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("numTracksInCollection") int i2, @JsonProperty("numAlbumsInCollection") int i3, @JsonProperty("isFollowed") boolean z, @JsonProperty("isBanned") boolean z2, @JsonProperty("isVariousArtists") boolean z3, @JsonProperty("addTime") int i4, @JsonProperty("groupLabel") String str6) {
        h.e(str3, "name");
        this.uri = str;
        this.collectionUri = str2;
        this.name = str3;
        this.covers = coversJacksonModel;
        this.offline = str4;
        this.inferredOffline = str5;
        this.syncProgress = i;
        this.numTracksInCollection = i2;
        this.numAlbumsInCollection = i3;
        this.isFollowed = z;
        this.isBanned = z2;
        this.isVariousArtist = z3;
        this.addTime = i4;
        this.groupLabel = str6;
    }

    public static /* synthetic */ ArtistJacksonModel copy$default(ArtistJacksonModel artistJacksonModel, String str, String str2, String str3, CoversJacksonModel coversJacksonModel, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, String str6, int i5, Object obj) {
        return artistJacksonModel.copy((i5 & 1) != 0 ? artistJacksonModel.uri : str, (i5 & 2) != 0 ? artistJacksonModel.collectionUri : str2, (i5 & 4) != 0 ? artistJacksonModel.name : str3, (i5 & 8) != 0 ? artistJacksonModel.covers : coversJacksonModel, (i5 & 16) != 0 ? artistJacksonModel.offline : str4, (i5 & 32) != 0 ? artistJacksonModel.inferredOffline : str5, (i5 & 64) != 0 ? artistJacksonModel.syncProgress : i, (i5 & 128) != 0 ? artistJacksonModel.numTracksInCollection : i2, (i5 & 256) != 0 ? artistJacksonModel.numAlbumsInCollection : i3, (i5 & 512) != 0 ? artistJacksonModel.isFollowed : z, (i5 & 1024) != 0 ? artistJacksonModel.isBanned : z2, (i5 & 2048) != 0 ? artistJacksonModel.isVariousArtist : z3, (i5 & 4096) != 0 ? artistJacksonModel.addTime : i4, (i5 & 8192) != 0 ? artistJacksonModel.groupLabel : str6);
    }

    public final String component1() {
        return this.uri;
    }

    public final boolean component10() {
        return this.isFollowed;
    }

    public final boolean component11() {
        return this.isBanned;
    }

    public final boolean component12() {
        return this.isVariousArtist;
    }

    public final int component13() {
        return this.addTime;
    }

    public final String component14() {
        return this.groupLabel;
    }

    public final String component2() {
        return this.collectionUri;
    }

    public final String component3() {
        return this.name;
    }

    public final CoversJacksonModel component4() {
        return this.covers;
    }

    public final String component5() {
        return this.offline;
    }

    public final String component6() {
        return this.inferredOffline;
    }

    public final int component7() {
        return this.syncProgress;
    }

    public final int component8() {
        return this.numTracksInCollection;
    }

    public final int component9() {
        return this.numAlbumsInCollection;
    }

    public final ArtistJacksonModel copy(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("portraits") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("numTracksInCollection") int i2, @JsonProperty("numAlbumsInCollection") int i3, @JsonProperty("isFollowed") boolean z, @JsonProperty("isBanned") boolean z2, @JsonProperty("isVariousArtists") boolean z3, @JsonProperty("addTime") int i4, @JsonProperty("groupLabel") String str6) {
        h.e(str3, "name");
        return new ArtistJacksonModel(str, str2, str3, coversJacksonModel, str4, str5, i, i2, i3, z, z2, z3, i4, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistJacksonModel)) {
            return false;
        }
        ArtistJacksonModel artistJacksonModel = (ArtistJacksonModel) obj;
        return h.a(this.uri, artistJacksonModel.uri) && h.a(this.collectionUri, artistJacksonModel.collectionUri) && h.a(this.name, artistJacksonModel.name) && h.a(this.covers, artistJacksonModel.covers) && h.a(this.offline, artistJacksonModel.offline) && h.a(this.inferredOffline, artistJacksonModel.inferredOffline) && this.syncProgress == artistJacksonModel.syncProgress && this.numTracksInCollection == artistJacksonModel.numTracksInCollection && this.numAlbumsInCollection == artistJacksonModel.numAlbumsInCollection && this.isFollowed == artistJacksonModel.isFollowed && this.isBanned == artistJacksonModel.isBanned && this.isVariousArtist == artistJacksonModel.isVariousArtist && this.addTime == artistJacksonModel.addTime && h.a(this.groupLabel, artistJacksonModel.groupLabel);
    }

    public final int getAddTime() {
        return this.addTime;
    }

    public final String getCollectionUri() {
        return this.collectionUri;
    }

    public final CoversJacksonModel getCovers() {
        return this.covers;
    }

    public final String getGroupLabel() {
        return this.groupLabel;
    }

    public final String getInferredOffline() {
        return this.inferredOffline;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumAlbumsInCollection() {
        return this.numAlbumsInCollection;
    }

    public final int getNumTracksInCollection() {
        return this.numTracksInCollection;
    }

    public final String getOffline() {
        return this.offline;
    }

    public final int getSyncProgress() {
        return this.syncProgress;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.collectionUri;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CoversJacksonModel coversJacksonModel = this.covers;
        int hashCode4 = (hashCode3 + (coversJacksonModel != null ? coversJacksonModel.hashCode() : 0)) * 31;
        String str4 = this.offline;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.inferredOffline;
        int hashCode6 = (((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.syncProgress) * 31) + this.numTracksInCollection) * 31) + this.numAlbumsInCollection) * 31;
        boolean z = this.isFollowed;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        boolean z2 = this.isBanned;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isVariousArtist;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (((i10 + i2) * 31) + this.addTime) * 31;
        String str6 = this.groupLabel;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i11 + i;
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public final boolean isVariousArtist() {
        return this.isVariousArtist;
    }

    public final b toArtist() {
        Covers covers2;
        Covers Q = je.Q(null, null, null, null, 15);
        a.f fVar = a.f.a;
        b.a aVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, Q, fVar, fVar);
        String str = this.uri;
        if (str == null) {
            str = "";
        }
        aVar.n(str);
        aVar.c(this.collectionUri);
        aVar.j(this.name);
        CoversJacksonModel coversJacksonModel = this.covers;
        if (coversJacksonModel == null || (covers2 = coversJacksonModel.toCovers()) == null) {
            covers2 = com.spotify.collection.endpoints.album.json.b.a();
        }
        aVar.d(covers2);
        aVar.m(com.spotify.playlist.models.offline.b.a(this.offline, this.syncProgress));
        aVar.i(com.spotify.playlist.models.offline.b.a(this.inferredOffline, this.syncProgress));
        aVar.l(this.numTracksInCollection);
        aVar.k(this.numAlbumsInCollection);
        aVar.f(this.isFollowed);
        return aVar.b();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ArtistJacksonModel(uri=");
        V0.append(this.uri);
        V0.append(", collectionUri=");
        V0.append(this.collectionUri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", covers=");
        V0.append(this.covers);
        V0.append(", offline=");
        V0.append(this.offline);
        V0.append(", inferredOffline=");
        V0.append(this.inferredOffline);
        V0.append(", syncProgress=");
        V0.append(this.syncProgress);
        V0.append(", numTracksInCollection=");
        V0.append(this.numTracksInCollection);
        V0.append(", numAlbumsInCollection=");
        V0.append(this.numAlbumsInCollection);
        V0.append(", isFollowed=");
        V0.append(this.isFollowed);
        V0.append(", isBanned=");
        V0.append(this.isBanned);
        V0.append(", isVariousArtist=");
        V0.append(this.isVariousArtist);
        V0.append(", addTime=");
        V0.append(this.addTime);
        V0.append(", groupLabel=");
        return je.I0(V0, this.groupLabel, ")");
    }
}
