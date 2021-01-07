package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

final class e extends f {
    private final Map<String, Object> a;

    e(Map<String, Object> map) {
        this.a = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Map<String, Object> map = this.a;
        Map<String, Object> partners = ((f) obj).partners();
        if (map != null) {
            return map.equals(partners);
        }
        if (partners == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Map<String, Object> map = this.a;
        return (map == null ? 0 : map.hashCode()) ^ 1000003;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.partneraccountlinking.clientprovider.samsung.f
    @JsonProperty("partners")
    public Map<String, Object> partners() {
        return this.a;
    }

    public String toString() {
        return je.M0(je.V0("ExternalUserAccountsStatusResponse{partners="), this.a, "}");
    }
}
