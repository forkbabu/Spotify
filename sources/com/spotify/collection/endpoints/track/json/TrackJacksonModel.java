package com.spotify.collection.endpoints.track.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.collection.endpoints.album.json.AlbumJacksonModel;
import com.spotify.collection.endpoints.artist.json.ArtistJacksonModel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.b;
import com.spotify.playlist.models.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TrackJacksonModel implements JacksonModel {
    private final int addTime;
    private final AlbumJacksonModel album;
    private final List<ArtistJacksonModel> artists;
    private final boolean canAddToCollection;
    private final boolean canBan;
    private final String header;
    private final boolean inCollection;
    private final boolean is19plus;
    private final boolean isAvailableInMetadataCatalogue;
    private final boolean isBanned;
    private final boolean isCurrentlyPlayable;
    private final boolean isExplicit;
    private final boolean isLocal;
    private final int length;
    private final String name;
    private final String offline;
    private final String previewId;
    private final TrackPlayStateModel trackPlayState;
    private final String uri;

    public TrackJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("header") String str3, @JsonProperty("offline") String str4, @JsonProperty("previewId") String str5, @JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("artists") List<ArtistJacksonModel> list, @JsonProperty("isCurrentlyPlayable") boolean z, @JsonProperty("isAvailableInMetadataCatalogue") boolean z2, @JsonProperty("isExplicit") boolean z3, @JsonProperty("is19PlusOnly") boolean z4, @JsonProperty("trackPlayState") TrackPlayStateModel trackPlayStateModel, @JsonProperty("isLocal") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("canAddToCollection") boolean z7, @JsonProperty("isBanned") boolean z8, @JsonProperty("canBan") boolean z9, @JsonProperty("addTime") int i, @JsonProperty("length") int i2) {
        h.e(list, "artists");
        this.uri = str;
        this.name = str2;
        this.header = str3;
        this.offline = str4;
        this.previewId = str5;
        this.album = albumJacksonModel;
        this.artists = list;
        this.isCurrentlyPlayable = z;
        this.isAvailableInMetadataCatalogue = z2;
        this.isExplicit = z3;
        this.is19plus = z4;
        this.trackPlayState = trackPlayStateModel;
        this.isLocal = z5;
        this.inCollection = z6;
        this.canAddToCollection = z7;
        this.isBanned = z8;
        this.canBan = z9;
        this.addTime = i;
        this.length = i2;
    }

    public static /* synthetic */ TrackJacksonModel copy$default(TrackJacksonModel trackJacksonModel, String str, String str2, String str3, String str4, String str5, AlbumJacksonModel albumJacksonModel, List list, boolean z, boolean z2, boolean z3, boolean z4, TrackPlayStateModel trackPlayStateModel, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, Object obj) {
        return trackJacksonModel.copy((i3 & 1) != 0 ? trackJacksonModel.uri : str, (i3 & 2) != 0 ? trackJacksonModel.name : str2, (i3 & 4) != 0 ? trackJacksonModel.header : str3, (i3 & 8) != 0 ? trackJacksonModel.offline : str4, (i3 & 16) != 0 ? trackJacksonModel.previewId : str5, (i3 & 32) != 0 ? trackJacksonModel.album : albumJacksonModel, (i3 & 64) != 0 ? trackJacksonModel.artists : list, (i3 & 128) != 0 ? trackJacksonModel.isCurrentlyPlayable : z, (i3 & 256) != 0 ? trackJacksonModel.isAvailableInMetadataCatalogue : z2, (i3 & 512) != 0 ? trackJacksonModel.isExplicit : z3, (i3 & 1024) != 0 ? trackJacksonModel.is19plus : z4, (i3 & 2048) != 0 ? trackJacksonModel.trackPlayState : trackPlayStateModel, (i3 & 4096) != 0 ? trackJacksonModel.isLocal : z5, (i3 & 8192) != 0 ? trackJacksonModel.inCollection : z6, (i3 & 16384) != 0 ? trackJacksonModel.canAddToCollection : z7, (i3 & 32768) != 0 ? trackJacksonModel.isBanned : z8, (i3 & 65536) != 0 ? trackJacksonModel.canBan : z9, (i3 & 131072) != 0 ? trackJacksonModel.addTime : i, (i3 & 262144) != 0 ? trackJacksonModel.length : i2);
    }

    public final String component1() {
        return this.uri;
    }

    public final boolean component10() {
        return this.isExplicit;
    }

    public final boolean component11() {
        return this.is19plus;
    }

    public final TrackPlayStateModel component12() {
        return this.trackPlayState;
    }

    public final boolean component13() {
        return this.isLocal;
    }

    public final boolean component14() {
        return this.inCollection;
    }

    public final boolean component15() {
        return this.canAddToCollection;
    }

    public final boolean component16() {
        return this.isBanned;
    }

    public final boolean component17() {
        return this.canBan;
    }

    public final int component18() {
        return this.addTime;
    }

    public final int component19() {
        return this.length;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.header;
    }

    public final String component4() {
        return this.offline;
    }

    public final String component5() {
        return this.previewId;
    }

    public final AlbumJacksonModel component6() {
        return this.album;
    }

    public final List<ArtistJacksonModel> component7() {
        return this.artists;
    }

    public final boolean component8() {
        return this.isCurrentlyPlayable;
    }

    public final boolean component9() {
        return this.isAvailableInMetadataCatalogue;
    }

    public final TrackJacksonModel copy(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("header") String str3, @JsonProperty("offline") String str4, @JsonProperty("previewId") String str5, @JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("artists") List<ArtistJacksonModel> list, @JsonProperty("isCurrentlyPlayable") boolean z, @JsonProperty("isAvailableInMetadataCatalogue") boolean z2, @JsonProperty("isExplicit") boolean z3, @JsonProperty("is19PlusOnly") boolean z4, @JsonProperty("trackPlayState") TrackPlayStateModel trackPlayStateModel, @JsonProperty("isLocal") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("canAddToCollection") boolean z7, @JsonProperty("isBanned") boolean z8, @JsonProperty("canBan") boolean z9, @JsonProperty("addTime") int i, @JsonProperty("length") int i2) {
        h.e(list, "artists");
        return new TrackJacksonModel(str, str2, str3, str4, str5, albumJacksonModel, list, z, z2, z3, z4, trackPlayStateModel, z5, z6, z7, z8, z9, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackJacksonModel)) {
            return false;
        }
        TrackJacksonModel trackJacksonModel = (TrackJacksonModel) obj;
        return h.a(this.uri, trackJacksonModel.uri) && h.a(this.name, trackJacksonModel.name) && h.a(this.header, trackJacksonModel.header) && h.a(this.offline, trackJacksonModel.offline) && h.a(this.previewId, trackJacksonModel.previewId) && h.a(this.album, trackJacksonModel.album) && h.a(this.artists, trackJacksonModel.artists) && this.isCurrentlyPlayable == trackJacksonModel.isCurrentlyPlayable && this.isAvailableInMetadataCatalogue == trackJacksonModel.isAvailableInMetadataCatalogue && this.isExplicit == trackJacksonModel.isExplicit && this.is19plus == trackJacksonModel.is19plus && h.a(this.trackPlayState, trackJacksonModel.trackPlayState) && this.isLocal == trackJacksonModel.isLocal && this.inCollection == trackJacksonModel.inCollection && this.canAddToCollection == trackJacksonModel.canAddToCollection && this.isBanned == trackJacksonModel.isBanned && this.canBan == trackJacksonModel.canBan && this.addTime == trackJacksonModel.addTime && this.length == trackJacksonModel.length;
    }

    public final int getAddTime() {
        return this.addTime;
    }

    public final AlbumJacksonModel getAlbum() {
        return this.album;
    }

    public final List<ArtistJacksonModel> getArtists() {
        return this.artists;
    }

    public final boolean getCanAddToCollection() {
        return this.canAddToCollection;
    }

    public final boolean getCanBan() {
        return this.canBan;
    }

    public final String getHeader() {
        return this.header;
    }

    public final boolean getInCollection() {
        return this.inCollection;
    }

    public final int getLength() {
        return this.length;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOffline() {
        return this.offline;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public final TrackPlayStateModel getTrackPlayState() {
        return this.trackPlayState;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.header;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.offline;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.previewId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        AlbumJacksonModel albumJacksonModel = this.album;
        int hashCode6 = (hashCode5 + (albumJacksonModel != null ? albumJacksonModel.hashCode() : 0)) * 31;
        List<ArtistJacksonModel> list = this.artists;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isCurrentlyPlayable;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        boolean z2 = this.isAvailableInMetadataCatalogue;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isExplicit;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.is19plus;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        TrackPlayStateModel trackPlayStateModel = this.trackPlayState;
        if (trackPlayStateModel != null) {
            i = trackPlayStateModel.hashCode();
        }
        int i19 = (i18 + i) * 31;
        boolean z5 = this.isLocal;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.inCollection;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        boolean z7 = this.canAddToCollection;
        if (z7) {
            z7 = true;
        }
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = z7 ? 1 : 0;
        int i31 = (i27 + i28) * 31;
        boolean z8 = this.isBanned;
        if (z8) {
            z8 = true;
        }
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = z8 ? 1 : 0;
        int i35 = (i31 + i32) * 31;
        boolean z9 = this.canBan;
        if (!z9) {
            i2 = z9 ? 1 : 0;
        }
        return ((((i35 + i2) * 31) + this.addTime) * 31) + this.length;
    }

    public final boolean is19plus() {
        return this.is19plus;
    }

    public final boolean isAvailableInMetadataCatalogue() {
        return this.isAvailableInMetadataCatalogue;
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public final boolean isCurrentlyPlayable() {
        return this.isCurrentlyPlayable;
    }

    public final boolean isExplicit() {
        return this.isExplicit;
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackJacksonModel(uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", header=");
        V0.append(this.header);
        V0.append(", offline=");
        V0.append(this.offline);
        V0.append(", previewId=");
        V0.append(this.previewId);
        V0.append(", album=");
        V0.append(this.album);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", isCurrentlyPlayable=");
        V0.append(this.isCurrentlyPlayable);
        V0.append(", isAvailableInMetadataCatalogue=");
        V0.append(this.isAvailableInMetadataCatalogue);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", is19plus=");
        V0.append(this.is19plus);
        V0.append(", trackPlayState=");
        V0.append(this.trackPlayState);
        V0.append(", isLocal=");
        V0.append(this.isLocal);
        V0.append(", inCollection=");
        V0.append(this.inCollection);
        V0.append(", canAddToCollection=");
        V0.append(this.canAddToCollection);
        V0.append(", isBanned=");
        V0.append(this.isBanned);
        V0.append(", canBan=");
        V0.append(this.canBan);
        V0.append(", addTime=");
        V0.append(this.addTime);
        V0.append(", length=");
        return je.B0(V0, this.length, ")");
    }

    public final o toTrack() {
        a aVar;
        o.a builder = o.builder();
        String str = this.uri;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        builder.f(str);
        String str3 = this.name;
        if (str3 != null) {
            str2 = str3;
        }
        builder.d(str2);
        builder.i(this.header);
        builder.e(b.a(this.offline, 0));
        builder.o(this.previewId);
        AlbumJacksonModel albumJacksonModel = this.album;
        if (albumJacksonModel == null || (aVar = albumJacksonModel.toAlbum()) == null) {
            aVar = com.spotify.collection.endpoints.album.json.a.a();
        }
        builder.g(aVar);
        List<ArtistJacksonModel> list = this.artists;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toArtist());
        }
        builder.v(ImmutableList.copyOf((Collection) arrayList));
        builder.a(this.isExplicit);
        builder.w(this.is19plus);
        builder.q(this.isLocal);
        builder.b(this.isCurrentlyPlayable);
        builder.n(this.inCollection);
        builder.u(this.canAddToCollection);
        builder.h(this.isBanned);
        builder.c(this.canBan);
        builder.k(this.addTime);
        builder.l(this.length);
        builder.m(this.isAvailableInMetadataCatalogue);
        TrackPlayStateModel trackPlayStateModel = this.trackPlayState;
        builder.j(q.l(trackPlayStateModel != null ? trackPlayStateModel.getPlayabilityRestriction() : null));
        o build = builder.build();
        h.d(build, "Track.builder()\n        …iction))\n        .build()");
        return build;
    }
}
