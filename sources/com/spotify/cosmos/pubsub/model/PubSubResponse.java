package com.spotify.cosmos.pubsub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

@JsonDeserialize
public final class PubSubResponse implements JacksonModel {
    private final Map<String, String> attributes;
    private final Integer errorCode;
    private final String errorDescription;
    private final String ident;
    private final List<String> payload;

    public PubSubResponse(@JsonProperty("ident") String str, @JsonProperty("payloads") List<String> list, @JsonProperty("attrs") Map<String, String> map, @JsonProperty("errorCode") Integer num, @JsonProperty("errorDescription") String str2) {
        this.ident = str;
        this.payload = list;
        this.attributes = map;
        this.errorCode = num;
        this.errorDescription = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.cosmos.pubsub.model.PubSubResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PubSubResponse copy$default(PubSubResponse pubSubResponse, String str, List list, Map map, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pubSubResponse.ident;
        }
        if ((i & 2) != 0) {
            list = pubSubResponse.payload;
        }
        if ((i & 4) != 0) {
            map = pubSubResponse.attributes;
        }
        if ((i & 8) != 0) {
            num = pubSubResponse.errorCode;
        }
        if ((i & 16) != 0) {
            str2 = pubSubResponse.errorDescription;
        }
        return pubSubResponse.copy(str, list, map, num, str2);
    }

    public final String component1() {
        return this.ident;
    }

    public final List<String> component2() {
        return this.payload;
    }

    public final Map<String, String> component3() {
        return this.attributes;
    }

    public final Integer component4() {
        return this.errorCode;
    }

    public final String component5() {
        return this.errorDescription;
    }

    public final PubSubResponse copy(@JsonProperty("ident") String str, @JsonProperty("payloads") List<String> list, @JsonProperty("attrs") Map<String, String> map, @JsonProperty("errorCode") Integer num, @JsonProperty("errorDescription") String str2) {
        return new PubSubResponse(str, list, map, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PubSubResponse)) {
            return false;
        }
        PubSubResponse pubSubResponse = (PubSubResponse) obj;
        return h.a(this.ident, pubSubResponse.ident) && h.a(this.payload, pubSubResponse.payload) && h.a(this.attributes, pubSubResponse.attributes) && h.a(this.errorCode, pubSubResponse.errorCode) && h.a(this.errorDescription, pubSubResponse.errorDescription);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getIdent() {
        return this.ident;
    }

    public final List<String> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        String str = this.ident;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.payload;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.attributes;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num = this.errorCode;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.errorDescription;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PubSubResponse(ident=");
        V0.append(this.ident);
        V0.append(", payload=");
        V0.append(this.payload);
        V0.append(", attributes=");
        V0.append(this.attributes);
        V0.append(", errorCode=");
        V0.append(this.errorCode);
        V0.append(", errorDescription=");
        return je.I0(V0, this.errorDescription, ")");
    }
}
