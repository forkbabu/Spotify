package com.spotify.collection.endpoints.artist.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.collection.endpoints.track.json.TrackJacksonModel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ArtistEntityJacksonModel implements JacksonModel {
    private final ArtistJacksonModel header;
    private final boolean isLoading;
    private final List<TrackJacksonModel> items;
    private final int unfilteredLength;
    private final int unrangedLength;

    public ArtistEntityJacksonModel(@JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("items") List<TrackJacksonModel> list, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        h.e(list, "items");
        this.header = artistJacksonModel;
        this.items = list;
        this.isLoading = z;
        this.unfilteredLength = i;
        this.unrangedLength = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.collection.endpoints.artist.json.ArtistEntityJacksonModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArtistEntityJacksonModel copy$default(ArtistEntityJacksonModel artistEntityJacksonModel, ArtistJacksonModel artistJacksonModel, List list, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            artistJacksonModel = artistEntityJacksonModel.header;
        }
        if ((i3 & 2) != 0) {
            list = artistEntityJacksonModel.items;
        }
        if ((i3 & 4) != 0) {
            z = artistEntityJacksonModel.isLoading;
        }
        if ((i3 & 8) != 0) {
            i = artistEntityJacksonModel.unfilteredLength;
        }
        if ((i3 & 16) != 0) {
            i2 = artistEntityJacksonModel.unrangedLength;
        }
        return artistEntityJacksonModel.copy(artistJacksonModel, list, z, i, i2);
    }

    public final ArtistJacksonModel component1() {
        return this.header;
    }

    public final List<TrackJacksonModel> component2() {
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

    public final ArtistEntityJacksonModel copy(@JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("items") List<TrackJacksonModel> list, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        h.e(list, "items");
        return new ArtistEntityJacksonModel(artistJacksonModel, list, z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistEntityJacksonModel)) {
            return false;
        }
        ArtistEntityJacksonModel artistEntityJacksonModel = (ArtistEntityJacksonModel) obj;
        return h.a(this.header, artistEntityJacksonModel.header) && h.a(this.items, artistEntityJacksonModel.items) && this.isLoading == artistEntityJacksonModel.isLoading && this.unfilteredLength == artistEntityJacksonModel.unfilteredLength && this.unrangedLength == artistEntityJacksonModel.unrangedLength;
    }

    public final ArtistJacksonModel getHeader() {
        return this.header;
    }

    public final List<TrackJacksonModel> getItems() {
        return this.items;
    }

    public final int getUnfilteredLength() {
        return this.unfilteredLength;
    }

    public final int getUnrangedLength() {
        return this.unrangedLength;
    }

    public int hashCode() {
        ArtistJacksonModel artistJacksonModel = this.header;
        int i = 0;
        int hashCode = (artistJacksonModel != null ? artistJacksonModel.hashCode() : 0) * 31;
        List<TrackJacksonModel> list = this.items;
        if (list != null) {
            i = list.hashCode();
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

    public final li0 toArtistEntity() {
        b bVar;
        boolean z = this.isLoading;
        ArtistJacksonModel artistJacksonModel = this.header;
        if (artistJacksonModel == null || (bVar = artistJacksonModel.toArtist()) == null) {
            bVar = a.a();
        }
        int i = this.unrangedLength;
        int i2 = this.unfilteredLength;
        List<TrackJacksonModel> list = this.items;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toTrack());
        }
        return new li0(z, bVar, i, i2, arrayList);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ArtistEntityJacksonModel(header=");
        V0.append(this.header);
        V0.append(", items=");
        V0.append(this.items);
        V0.append(", isLoading=");
        V0.append(this.isLoading);
        V0.append(", unfilteredLength=");
        V0.append(this.unfilteredLength);
        V0.append(", unrangedLength=");
        return je.B0(V0, this.unrangedLength, ")");
    }
}
