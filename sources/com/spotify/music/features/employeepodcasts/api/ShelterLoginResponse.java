package com.spotify.music.features.employeepodcasts.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ShelterLoginResponse extends b implements JacksonModel {
    private final String appStartPage;
    private final String cart;
    private final String companyEmail;
    private final long expiresAtMs;
    private final String name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShelterLoginResponse(@JsonProperty("name") String str, @JsonProperty("companyEmail") String str2, @JsonProperty("appStartPage") String str3, @JsonProperty("cart") String str4, @JsonProperty("expiresAtMs") long j) {
        super(null);
        h.e(str, "name");
        h.e(str2, "companyEmail");
        h.e(str3, "appStartPage");
        h.e(str4, "cart");
        this.name = str;
        this.companyEmail = str2;
        this.appStartPage = str3;
        this.cart = str4;
        this.expiresAtMs = j;
    }

    public static /* synthetic */ ShelterLoginResponse copy$default(ShelterLoginResponse shelterLoginResponse, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shelterLoginResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = shelterLoginResponse.companyEmail;
        }
        if ((i & 4) != 0) {
            str3 = shelterLoginResponse.appStartPage;
        }
        if ((i & 8) != 0) {
            str4 = shelterLoginResponse.cart;
        }
        if ((i & 16) != 0) {
            j = shelterLoginResponse.expiresAtMs;
        }
        return shelterLoginResponse.copy(str, str2, str3, str4, j);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.companyEmail;
    }

    public final String component3() {
        return this.appStartPage;
    }

    public final String component4() {
        return this.cart;
    }

    public final long component5() {
        return this.expiresAtMs;
    }

    public final ShelterLoginResponse copy(@JsonProperty("name") String str, @JsonProperty("companyEmail") String str2, @JsonProperty("appStartPage") String str3, @JsonProperty("cart") String str4, @JsonProperty("expiresAtMs") long j) {
        h.e(str, "name");
        h.e(str2, "companyEmail");
        h.e(str3, "appStartPage");
        h.e(str4, "cart");
        return new ShelterLoginResponse(str, str2, str3, str4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShelterLoginResponse)) {
            return false;
        }
        ShelterLoginResponse shelterLoginResponse = (ShelterLoginResponse) obj;
        return h.a(this.name, shelterLoginResponse.name) && h.a(this.companyEmail, shelterLoginResponse.companyEmail) && h.a(this.appStartPage, shelterLoginResponse.appStartPage) && h.a(this.cart, shelterLoginResponse.cart) && this.expiresAtMs == shelterLoginResponse.expiresAtMs;
    }

    public final String getAppStartPage() {
        return this.appStartPage;
    }

    public final String getCart() {
        return this.cart;
    }

    public final String getCompanyEmail() {
        return this.companyEmail;
    }

    public final long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.companyEmail;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appStartPage;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cart;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + e.a(this.expiresAtMs);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShelterLoginResponse(name=");
        V0.append(this.name);
        V0.append(", companyEmail=");
        V0.append(this.companyEmail);
        V0.append(", appStartPage=");
        V0.append(this.appStartPage);
        V0.append(", cart=");
        V0.append(this.cart);
        V0.append(", expiresAtMs=");
        return je.E0(V0, this.expiresAtMs, ")");
    }
}
