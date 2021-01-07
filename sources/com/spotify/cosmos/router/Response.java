package com.spotify.cosmos.router;

import com.adjust.sdk.Constants;
import com.spotify.core.jni.NativeHelpers;
import java.nio.charset.Charset;
import java.util.Map;

public class Response {
    private static final Charset DEFAULT_CHARSET = Charset.forName(Constants.ENCODING);
    private final byte[] mBody;
    private final Map<String, String> mHeaders;
    private final int mStatus;
    private final String mUri;

    private Response(int i, String str, byte[] bArr, byte[] bArr2) {
        this.mStatus = i;
        this.mUri = str;
        this.mHeaders = NativeHelpers.byteArrayToMap(bArr);
        this.mBody = bArr2;
    }

    public byte[] getBody() {
        return this.mBody;
    }

    public String getBodyString() {
        return new String(this.mBody, DEFAULT_CHARSET);
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUri() {
        return this.mUri;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Response{mStatus=");
        V0.append(this.mStatus);
        V0.append(", mUri='");
        je.A(V0, this.mUri, '\'', ", mHeaders=");
        V0.append(this.mHeaders);
        V0.append(", mBody='");
        V0.append(new String(this.mBody, DEFAULT_CHARSET));
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }

    public Response(int i, String str, Map<String, String> map, byte[] bArr) {
        this.mStatus = i;
        this.mUri = str;
        this.mHeaders = map;
        this.mBody = bArr;
    }
}
