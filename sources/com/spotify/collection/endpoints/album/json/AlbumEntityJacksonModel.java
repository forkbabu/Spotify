package com.spotify.collection.endpoints.album.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.collection.endpoints.track.json.TrackJacksonModel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class AlbumEntityJacksonModel implements JacksonModel {
    private final AlbumJacksonModel header;
    private final boolean isLoading;
    private final TrackJacksonModel[] items;
    private final int unfilteredLength;
    private final int unrangedLength;

    public AlbumEntityJacksonModel(@JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("items") TrackJacksonModel[] trackJacksonModelArr, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        h.e(albumJacksonModel, "header");
        h.e(trackJacksonModelArr, "items");
        this.header = albumJacksonModel;
        this.items = trackJacksonModelArr;
        this.isLoading = z;
        this.unfilteredLength = i;
        this.unrangedLength = i2;
    }

    private final AlbumJacksonModel component1() {
        return this.header;
    }

    public static /* synthetic */ AlbumEntityJacksonModel copy$default(AlbumEntityJacksonModel albumEntityJacksonModel, AlbumJacksonModel albumJacksonModel, TrackJacksonModel[] trackJacksonModelArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            albumJacksonModel = albumEntityJacksonModel.header;
        }
        if ((i3 & 2) != 0) {
            trackJacksonModelArr = albumEntityJacksonModel.items;
        }
        if ((i3 & 4) != 0) {
            z = albumEntityJacksonModel.isLoading;
        }
        if ((i3 & 8) != 0) {
            i = albumEntityJacksonModel.unfilteredLength;
        }
        if ((i3 & 16) != 0) {
            i2 = albumEntityJacksonModel.unrangedLength;
        }
        return albumEntityJacksonModel.copy(albumJacksonModel, trackJacksonModelArr, z, i, i2);
    }

    public final TrackJacksonModel[] component2() {
        return this.items;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final int component4() {
        return this.unfilteredLength;
    }

    public final int component5() {
        return this.unrangedLength;
    }

    public final AlbumEntityJacksonModel copy(@JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("items") TrackJacksonModel[] trackJacksonModelArr, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        h.e(albumJacksonModel, "header");
        h.e(trackJacksonModelArr, "items");
        return new AlbumEntityJacksonModel(albumJacksonModel, trackJacksonModelArr, z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumEntityJacksonModel)) {
            return false;
        }
        AlbumEntityJacksonModel albumEntityJacksonModel = (AlbumEntityJacksonModel) obj;
        return h.a(this.header, albumEntityJacksonModel.header) && h.a(this.items, albumEntityJacksonModel.items) && this.isLoading == albumEntityJacksonModel.isLoading && this.unfilteredLength == albumEntityJacksonModel.unfilteredLength && this.unrangedLength == albumEntityJacksonModel.unrangedLength;
    }

    public final TrackJacksonModel[] getItems() {
        return this.items;
    }

    public final int getUnfilteredLength() {
        return this.unfilteredLength;
    }

    public final int getUnrangedLength() {
        return this.unrangedLength;
    }

    public int hashCode() {
        AlbumJacksonModel albumJacksonModel = this.header;
        int i = 0;
        int hashCode = (albumJacksonModel != null ? albumJacksonModel.hashCode() : 0) * 31;
        TrackJacksonModel[] trackJacksonModelArr = this.items;
        if (trackJacksonModelArr != null) {
            i = Arrays.hashCode(trackJacksonModelArr);
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isLoading;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((((i2 + i3) * 31) + this.unfilteredLength) * 31) + this.unrangedLength;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ki0 toAlbumEntity() {
        TrackJacksonModel[] trackJacksonModelArr = this.items;
        ArrayList arrayList = new ArrayList(trackJacksonModelArr.length);
        for (TrackJacksonModel trackJacksonModel : trackJacksonModelArr) {
            arrayList.add(trackJacksonModel.toTrack());
        }
        return new ki0(arrayList, this.unfilteredLength, this.unrangedLength, this.header.toAlbum(), this.isLoading);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumEntityJacksonModel(header=");
        V0.append(this.header);
        V0.append(", items=");
        V0.append(Arrays.toString(this.items));
        V0.append(", isLoading=");
        V0.append(this.isLoading);
        V0.append(", unfilteredLength=");
        V0.append(this.unfilteredLength);
        V0.append(", unrangedLength=");
        return je.B0(V0, this.unrangedLength, ")");
    }
}
