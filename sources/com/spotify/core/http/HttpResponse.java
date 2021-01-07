package com.spotify.core.http;

public class HttpResponse {
    private final String mHeaders;
    private final int mStatus;
    private final String mUrl;

    public HttpResponse(int i, String str, String str2) {
        this.mStatus = i;
        this.mUrl = str;
        this.mHeaders = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (this.mStatus != httpResponse.mStatus) {
            return false;
        }
        String str = this.mUrl;
        if (str == null ? httpResponse.mUrl != null : !str.equals(httpResponse.mUrl)) {
            return false;
        }
        String str2 = this.mHeaders;
        String str3 = httpResponse.mHeaders;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String getHeaders() {
        return this.mHeaders;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int hashCode() {
        int i = this.mStatus * 31;
        String str = this.mUrl;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mHeaders;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HttpResponse{status=");
        V0.append(this.mStatus);
        V0.append(", url='");
        je.A(V0, this.mUrl, '\'', ", headers='");
        V0.append(this.mHeaders);
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }
}
