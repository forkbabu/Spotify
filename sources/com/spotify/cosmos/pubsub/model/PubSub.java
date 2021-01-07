package com.spotify.cosmos.pubsub.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class PubSub {
    private final Map<String, String> attributes;
    private final String ident;
    private final List<String> payload;

    public PubSub(String str, List<String> list, Map<String, String> map) {
        h.e(str, "ident");
        h.e(list, "payload");
        h.e(map, "attributes");
        this.ident = str;
        this.payload = list;
        this.attributes = map;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.cosmos.pubsub.model.PubSub */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PubSub copy$default(PubSub pubSub, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pubSub.ident;
        }
        if ((i & 2) != 0) {
            list = pubSub.payload;
        }
        if ((i & 4) != 0) {
            map = pubSub.attributes;
        }
        return pubSub.copy(str, list, map);
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

    public final PubSub copy(String str, List<String> list, Map<String, String> map) {
        h.e(str, "ident");
        h.e(list, "payload");
        h.e(map, "attributes");
        return new PubSub(str, list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PubSub)) {
            return false;
        }
        PubSub pubSub = (PubSub) obj;
        return h.a(this.ident, pubSub.ident) && h.a(this.payload, pubSub.payload) && h.a(this.attributes, pubSub.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
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
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PubSub(ident=");
        V0.append(this.ident);
        V0.append(", payload=");
        V0.append(this.payload);
        V0.append(", attributes=");
        return je.M0(V0, this.attributes, ")");
    }
}
