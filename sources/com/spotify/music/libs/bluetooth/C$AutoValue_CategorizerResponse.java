package com.spotify.music.libs.bluetooth;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.libs.bluetooth.$AutoValue_CategorizerResponse  reason: invalid class name */
abstract class C$AutoValue_CategorizerResponse extends CategorizerResponse {
    private final String category;
    private final String company;
    private final boolean isInterapp;
    private final String model;
    private final String version;

    C$AutoValue_CategorizerResponse(String str, String str2, String str3, String str4, boolean z) {
        this.category = str;
        this.company = str2;
        this.model = str3;
        this.version = str4;
        this.isInterapp = z;
    }

    @Override // com.spotify.music.libs.bluetooth.CategorizerResponse
    @JsonProperty("category")
    public String category() {
        return this.category;
    }

    @Override // com.spotify.music.libs.bluetooth.CategorizerResponse
    @JsonProperty("company")
    public String company() {
        return this.company;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategorizerResponse)) {
            return false;
        }
        CategorizerResponse categorizerResponse = (CategorizerResponse) obj;
        String str = this.category;
        if (str != null ? str.equals(categorizerResponse.category()) : categorizerResponse.category() == null) {
            String str2 = this.company;
            if (str2 != null ? str2.equals(categorizerResponse.company()) : categorizerResponse.company() == null) {
                String str3 = this.model;
                if (str3 != null ? str3.equals(categorizerResponse.model()) : categorizerResponse.model() == null) {
                    String str4 = this.version;
                    if (str4 != null ? str4.equals(categorizerResponse.version()) : categorizerResponse.version() == null) {
                        if (this.isInterapp == categorizerResponse.isInterapp()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.category;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.company;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.model;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.version;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ (this.isInterapp ? 1231 : 1237);
    }

    @Override // com.spotify.music.libs.bluetooth.CategorizerResponse
    @JsonProperty("interapp")
    public boolean isInterapp() {
        return this.isInterapp;
    }

    @Override // com.spotify.music.libs.bluetooth.CategorizerResponse
    @JsonProperty("model")
    public String model() {
        return this.model;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CategorizerResponse{category=");
        V0.append(this.category);
        V0.append(", company=");
        V0.append(this.company);
        V0.append(", model=");
        V0.append(this.model);
        V0.append(", version=");
        V0.append(this.version);
        V0.append(", isInterapp=");
        return je.P0(V0, this.isInterapp, "}");
    }

    @Override // com.spotify.music.libs.bluetooth.CategorizerResponse
    @JsonProperty("version")
    public String version() {
        return this.version;
    }
}
