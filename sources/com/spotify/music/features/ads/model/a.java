package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

abstract class a extends i {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;

    a(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.a;
        if (str != null ? str.equals(iVar.getStream()) : iVar.getStream() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(iVar.getMidrollWatchNow()) : iVar.getMidrollWatchNow() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(iVar.getWatchNow()) : iVar.getWatchNow() == null) {
                    String str4 = this.f;
                    if (str4 != null ? str4.equals(iVar.getPreroll()) : iVar.getPreroll() == null) {
                        String str5 = this.n;
                        if (str5 == null) {
                            if (iVar.getMobileScreensaver() == null) {
                                return true;
                            }
                        } else if (str5.equals(iVar.getMobileScreensaver())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.i
    @JsonProperty("midroll-watchnow")
    public String getMidrollWatchNow() {
        return this.b;
    }

    @Override // com.spotify.music.features.ads.model.i
    @JsonProperty("mobile-screensaver")
    public String getMobileScreensaver() {
        return this.n;
    }

    @Override // com.spotify.music.features.ads.model.i
    @JsonProperty("preroll")
    public String getPreroll() {
        return this.f;
    }

    @Override // com.spotify.music.features.ads.model.i
    @JsonProperty("stream")
    public String getStream() {
        return this.a;
    }

    @Override // com.spotify.music.features.ads.model.i
    @JsonProperty("watchnow")
    public String getWatchNow() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 ^ i;
    }
}
