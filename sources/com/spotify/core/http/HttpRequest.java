package com.spotify.core.http;

import java.util.Arrays;

public class HttpRequest {
    private final byte[] mBody;
    private final byte[] mHeaders;
    private final String mMethod;
    private final String mUrl;

    public HttpRequest(String str, String str2, byte[] bArr, byte[] bArr2) {
        this.mUrl = str;
        this.mMethod = str2;
        this.mHeaders = bArr;
        this.mBody = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        String str = this.mUrl;
        if (str == null ? httpRequest.mUrl != null : !str.equals(httpRequest.mUrl)) {
            return false;
        }
        String str2 = this.mMethod;
        if (str2 == null ? httpRequest.mMethod == null : str2.equals(httpRequest.mMethod)) {
            return Arrays.equals(this.mHeaders, httpRequest.mHeaders) && Arrays.equals(this.mBody, httpRequest.mBody);
        }
        return false;
    }

    public byte[] getBody() {
        return this.mBody;
    }

    public byte[] getHeaders() {
        return this.mHeaders;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int hashCode() {
        String str = this.mUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mMethod;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Arrays.hashCode(this.mBody) + ((Arrays.hashCode(this.mHeaders) + ((hashCode + i) * 31)) * 31);
    }

    public String toString() {
        StringBuilder V0 = je.V0("HttpRequest{mUrl='");
        je.A(V0, this.mUrl, '\'', ", mMethod='");
        je.A(V0, this.mMethod, '\'', ", mHeaders=");
        V0.append(Arrays.toString(this.mHeaders));
        V0.append(", mBody=");
        V0.append(Arrays.toString(this.mBody));
        V0.append('}');
        return V0.toString();
    }
}
