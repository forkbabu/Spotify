package com.spotify.music.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

public final class Platform implements JacksonModel {
    private final String clientId;
    private final String displayName;
    private final String name;

    public Platform(@JsonProperty("client_id") String str, @JsonProperty("name") String str2, @JsonProperty("display_name") String str3) {
        je.x(str, "clientId", str2, "name", str3, "displayName");
        this.clientId = str;
        this.name = str2;
        this.displayName = str3;
    }

    public static /* synthetic */ Platform copy$default(Platform platform, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platform.clientId;
        }
        if ((i & 2) != 0) {
            str2 = platform.name;
        }
        if ((i & 4) != 0) {
            str3 = platform.displayName;
        }
        return platform.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.displayName;
    }

    public final Platform copy(@JsonProperty("client_id") String str, @JsonProperty("name") String str2, @JsonProperty("display_name") String str3) {
        h.e(str, "clientId");
        h.e(str2, "name");
        h.e(str3, "displayName");
        return new Platform(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Platform)) {
            return false;
        }
        Platform platform = (Platform) obj;
        return h.a(this.clientId, platform.clientId) && h.a(this.name, platform.name) && h.a(this.displayName, platform.displayName);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.displayName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Platform(clientId=");
        V0.append(this.clientId);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", displayName=");
        return je.I0(V0, this.displayName, ")");
    }
}
