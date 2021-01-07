package com.spotify.collection.endpoints.album.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class CoversJacksonModel implements JacksonModel {
    private final String largeUri;
    private final String smallUri;
    private final String uri;
    private final String xLargeUri;

    public CoversJacksonModel(@JsonProperty("default") String str, @JsonProperty("small") String str2, @JsonProperty("large") String str3, @JsonProperty("xlarge") String str4) {
        h.e(str, "uri");
        this.uri = str;
        this.smallUri = str2;
        this.largeUri = str3;
        this.xLargeUri = str4;
    }

    public static /* synthetic */ CoversJacksonModel copy$default(CoversJacksonModel coversJacksonModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coversJacksonModel.uri;
        }
        if ((i & 2) != 0) {
            str2 = coversJacksonModel.smallUri;
        }
        if ((i & 4) != 0) {
            str3 = coversJacksonModel.largeUri;
        }
        if ((i & 8) != 0) {
            str4 = coversJacksonModel.xLargeUri;
        }
        return coversJacksonModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.uri;
    }

    public final String component2() {
        return this.smallUri;
    }

    public final String component3() {
        return this.largeUri;
    }

    public final String component4() {
        return this.xLargeUri;
    }

    public final CoversJacksonModel copy(@JsonProperty("default") String str, @JsonProperty("small") String str2, @JsonProperty("large") String str3, @JsonProperty("xlarge") String str4) {
        h.e(str, "uri");
        return new CoversJacksonModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoversJacksonModel)) {
            return false;
        }
        CoversJacksonModel coversJacksonModel = (CoversJacksonModel) obj;
        return h.a(this.uri, coversJacksonModel.uri) && h.a(this.smallUri, coversJacksonModel.smallUri) && h.a(this.largeUri, coversJacksonModel.largeUri) && h.a(this.xLargeUri, coversJacksonModel.xLargeUri);
    }

    public final String getLargeUri() {
        return this.largeUri;
    }

    public final String getSmallUri() {
        return this.smallUri;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getXLargeUri() {
        return this.xLargeUri;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.smallUri;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.largeUri;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.xLargeUri;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final Covers toCovers() {
        Covers.a aVar = new Covers.a(null, null, null, null, 15);
        aVar.d(this.uri);
        aVar.c(this.smallUri);
        aVar.b(this.largeUri);
        aVar.e(this.xLargeUri);
        return aVar.a();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CoversJacksonModel(uri=");
        V0.append(this.uri);
        V0.append(", smallUri=");
        V0.append(this.smallUri);
        V0.append(", largeUri=");
        V0.append(this.largeUri);
        V0.append(", xLargeUri=");
        return je.I0(V0, this.xLargeUri, ")");
    }
}
