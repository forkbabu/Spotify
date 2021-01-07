package com.spotify.collection.endpoints.album.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.collection.endpoints.artist.json.ArtistJacksonModel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import kotlin.text.e;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class AlbumJacksonModel implements JacksonModel {
    private final int addTime;
    private final ArtistJacksonModel artist;
    private final String collectionUri;
    private final String[] copyrights;
    private final CoversJacksonModel covers;
    private final String groupLabel;
    private final String inferredOffline;
    private final boolean isAnyTrackPlayable;
    private final boolean isSavedToCollection;
    private final String name;
    private final int numDiscs;
    private final int numTracks;
    private final int numTracksInCollection;
    private final String offline;
    private final int syncProgress;
    private final String uri;
    private final int year;

    public AlbumJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("copyrights") String[] strArr, @JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("year") int i2, @JsonProperty("numDiscs") int i3, @JsonProperty("numTracks") int i4, @JsonProperty("numTracksInCollection") int i5, @JsonProperty("playability") boolean z, @JsonProperty("complete") boolean z2, @JsonProperty("addTime") int i6, @JsonProperty("groupLabel") String str6) {
        h.e(str3, "name");
        this.uri = str;
        this.collectionUri = str2;
        this.name = str3;
        this.copyrights = strArr;
        this.artist = artistJacksonModel;
        this.covers = coversJacksonModel;
        this.offline = str4;
        this.inferredOffline = str5;
        this.syncProgress = i;
        this.year = i2;
        this.numDiscs = i3;
        this.numTracks = i4;
        this.numTracksInCollection = i5;
        this.isAnyTrackPlayable = z;
        this.isSavedToCollection = z2;
        this.addTime = i6;
        this.groupLabel = str6;
    }

    private final String component1() {
        return this.uri;
    }

    private final int component10() {
        return this.year;
    }

    private final int component11() {
        return this.numDiscs;
    }

    private final int component12() {
        return this.numTracks;
    }

    private final int component13() {
        return this.numTracksInCollection;
    }

    private final boolean component14() {
        return this.isAnyTrackPlayable;
    }

    private final boolean component15() {
        return this.isSavedToCollection;
    }

    private final int component16() {
        return this.addTime;
    }

    private final String component17() {
        return this.groupLabel;
    }

    private final String component2() {
        return this.collectionUri;
    }

    private final String component3() {
        return this.name;
    }

    private final String[] component4() {
        return this.copyrights;
    }

    private final ArtistJacksonModel component5() {
        return this.artist;
    }

    private final CoversJacksonModel component6() {
        return this.covers;
    }

    private final String component7() {
        return this.offline;
    }

    private final String component8() {
        return this.inferredOffline;
    }

    private final int component9() {
        return this.syncProgress;
    }

    public static /* synthetic */ AlbumJacksonModel copy$default(AlbumJacksonModel albumJacksonModel, String str, String str2, String str3, String[] strArr, ArtistJacksonModel artistJacksonModel, CoversJacksonModel coversJacksonModel, String str4, String str5, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, String str6, int i7, Object obj) {
        return albumJacksonModel.copy((i7 & 1) != 0 ? albumJacksonModel.uri : str, (i7 & 2) != 0 ? albumJacksonModel.collectionUri : str2, (i7 & 4) != 0 ? albumJacksonModel.name : str3, (i7 & 8) != 0 ? albumJacksonModel.copyrights : strArr, (i7 & 16) != 0 ? albumJacksonModel.artist : artistJacksonModel, (i7 & 32) != 0 ? albumJacksonModel.covers : coversJacksonModel, (i7 & 64) != 0 ? albumJacksonModel.offline : str4, (i7 & 128) != 0 ? albumJacksonModel.inferredOffline : str5, (i7 & 256) != 0 ? albumJacksonModel.syncProgress : i, (i7 & 512) != 0 ? albumJacksonModel.year : i2, (i7 & 1024) != 0 ? albumJacksonModel.numDiscs : i3, (i7 & 2048) != 0 ? albumJacksonModel.numTracks : i4, (i7 & 4096) != 0 ? albumJacksonModel.numTracksInCollection : i5, (i7 & 8192) != 0 ? albumJacksonModel.isAnyTrackPlayable : z, (i7 & 16384) != 0 ? albumJacksonModel.isSavedToCollection : z2, (i7 & 32768) != 0 ? albumJacksonModel.addTime : i6, (i7 & 65536) != 0 ? albumJacksonModel.groupLabel : str6);
    }

    public final AlbumJacksonModel copy(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("copyrights") String[] strArr, @JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("year") int i2, @JsonProperty("numDiscs") int i3, @JsonProperty("numTracks") int i4, @JsonProperty("numTracksInCollection") int i5, @JsonProperty("playability") boolean z, @JsonProperty("complete") boolean z2, @JsonProperty("addTime") int i6, @JsonProperty("groupLabel") String str6) {
        h.e(str3, "name");
        return new AlbumJacksonModel(str, str2, str3, strArr, artistJacksonModel, coversJacksonModel, str4, str5, i, i2, i3, i4, i5, z, z2, i6, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumJacksonModel)) {
            return false;
        }
        AlbumJacksonModel albumJacksonModel = (AlbumJacksonModel) obj;
        return h.a(this.uri, albumJacksonModel.uri) && h.a(this.collectionUri, albumJacksonModel.collectionUri) && h.a(this.name, albumJacksonModel.name) && h.a(this.copyrights, albumJacksonModel.copyrights) && h.a(this.artist, albumJacksonModel.artist) && h.a(this.covers, albumJacksonModel.covers) && h.a(this.offline, albumJacksonModel.offline) && h.a(this.inferredOffline, albumJacksonModel.inferredOffline) && this.syncProgress == albumJacksonModel.syncProgress && this.year == albumJacksonModel.year && this.numDiscs == albumJacksonModel.numDiscs && this.numTracks == albumJacksonModel.numTracks && this.numTracksInCollection == albumJacksonModel.numTracksInCollection && this.isAnyTrackPlayable == albumJacksonModel.isAnyTrackPlayable && this.isSavedToCollection == albumJacksonModel.isSavedToCollection && this.addTime == albumJacksonModel.addTime && h.a(this.groupLabel, albumJacksonModel.groupLabel);
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.collectionUri;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String[] strArr = this.copyrights;
        int hashCode4 = (hashCode3 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        ArtistJacksonModel artistJacksonModel = this.artist;
        int hashCode5 = (hashCode4 + (artistJacksonModel != null ? artistJacksonModel.hashCode() : 0)) * 31;
        CoversJacksonModel coversJacksonModel = this.covers;
        int hashCode6 = (hashCode5 + (coversJacksonModel != null ? coversJacksonModel.hashCode() : 0)) * 31;
        String str4 = this.offline;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.inferredOffline;
        int hashCode8 = (((((((((((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.syncProgress) * 31) + this.year) * 31) + this.numDiscs) * 31) + this.numTracks) * 31) + this.numTracksInCollection) * 31;
        boolean z = this.isAnyTrackPlayable;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        boolean z2 = this.isSavedToCollection;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (((i6 + i2) * 31) + this.addTime) * 31;
        String str6 = this.groupLabel;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i7 + i;
    }

    public final a toAlbum() {
        b bVar;
        Covers covers2;
        a.C0376a aVar = new a.C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143);
        String str = this.uri;
        if (str == null) {
            str = "";
        }
        aVar.r(str);
        aVar.f(this.collectionUri);
        aVar.l(this.name);
        String[] strArr = this.copyrights;
        String str2 = null;
        if (strArr != null) {
            h.e(strArr, "$this$joinToString");
            h.e("\n", "separator");
            h.e("", "prefix");
            h.e("", "postfix");
            h.e("...", "truncated");
            StringBuilder sb = new StringBuilder();
            h.e(strArr, "$this$joinTo");
            h.e(sb, "buffer");
            h.e("\n", "separator");
            h.e("", "prefix");
            h.e("", "postfix");
            h.e("...", "truncated");
            sb.append((CharSequence) "");
            int i = 0;
            for (String str3 : strArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) "\n");
                }
                e.a(sb, str3, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            h.d(str2, "joinTo(StringBuilder(), …ed, transform).toString()");
        }
        aVar.g(str2);
        ArtistJacksonModel artistJacksonModel = this.artist;
        if (artistJacksonModel == null || (bVar = artistJacksonModel.toArtist()) == null) {
            bVar = com.spotify.collection.endpoints.artist.json.a.a();
        }
        aVar.c(bVar);
        CoversJacksonModel coversJacksonModel = this.covers;
        if (coversJacksonModel == null || (covers2 = coversJacksonModel.toCovers()) == null) {
            covers2 = b.a();
        }
        aVar.h(covers2);
        aVar.p(com.spotify.playlist.models.offline.b.a(this.offline, this.syncProgress));
        aVar.k(com.spotify.playlist.models.offline.b.a(this.inferredOffline, this.syncProgress));
        aVar.s(this.year);
        aVar.m(this.numDiscs);
        aVar.n(this.numTracks);
        aVar.o(this.numTracksInCollection);
        aVar.b(this.isAnyTrackPlayable);
        aVar.q(this.isSavedToCollection);
        aVar.a(this.addTime);
        aVar.i(this.groupLabel);
        return aVar.e();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumJacksonModel(uri=");
        V0.append(this.uri);
        V0.append(", collectionUri=");
        V0.append(this.collectionUri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", copyrights=");
        V0.append(Arrays.toString(this.copyrights));
        V0.append(", artist=");
        V0.append(this.artist);
        V0.append(", covers=");
        V0.append(this.covers);
        V0.append(", offline=");
        V0.append(this.offline);
        V0.append(", inferredOffline=");
        V0.append(this.inferredOffline);
        V0.append(", syncProgress=");
        V0.append(this.syncProgress);
        V0.append(", year=");
        V0.append(this.year);
        V0.append(", numDiscs=");
        V0.append(this.numDiscs);
        V0.append(", numTracks=");
        V0.append(this.numTracks);
        V0.append(", numTracksInCollection=");
        V0.append(this.numTracksInCollection);
        V0.append(", isAnyTrackPlayable=");
        V0.append(this.isAnyTrackPlayable);
        V0.append(", isSavedToCollection=");
        V0.append(this.isSavedToCollection);
        V0.append(", addTime=");
        V0.append(this.addTime);
        V0.append(", groupLabel=");
        return je.I0(V0, this.groupLabel, ")");
    }
}
