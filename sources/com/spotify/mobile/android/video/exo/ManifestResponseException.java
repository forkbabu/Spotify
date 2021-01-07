package com.spotify.mobile.android.video.exo;

import android.text.TextUtils;
import com.spotify.mobile.android.video.exception.ErrorType;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ManifestResponseException extends IOException {
    private static final Map<String, ErrorType> b;
    private static final long serialVersionUID = 43;
    private final transient JSONObject a;
    private final int mHttpStatusCode;
    private final String mJsonResponse;

    private static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 2414789161110589469L;
        private final int mHttpStatusCode;
        private final String mJsonResponse;

        public SerializationProxy(ManifestResponseException manifestResponseException) {
            this.mJsonResponse = manifestResponseException.mJsonResponse;
            this.mHttpStatusCode = manifestResponseException.mHttpStatusCode;
        }

        private Object readResolve() {
            return new ManifestResponseException(this.mHttpStatusCode, this.mJsonResponse);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        ErrorType errorType = ErrorType.ERROR_GEORESTRICTED;
        hashMap.put("geoLocation", errorType);
        hashMap.put("GEO_RESTRICTED", errorType);
        hashMap.put("UNSUPPORTED_PLATFORM_VERSION", ErrorType.ERROR_UNSUPPORTED_PLATFORM_VERSION);
        hashMap.put("UNSUPPORTED_CLIENT_VERSION", ErrorType.ERROR_UNSUPPORTED_CLIENT_VERSION);
        hashMap.put("COUNTRY_RESTRICTED", ErrorType.ERROR_COUNTRY_RESTRICTED);
        hashMap.put("UNAVAILABLE", ErrorType.ERROR_UNAVAILABLE);
        hashMap.put("CATALOGUE_RESTRICTED", ErrorType.ERROR_CATALOGUE_RESTRICTED);
        hashMap.put("MANIFEST_DELETED", ErrorType.ERROR_MANIFEST_DELETED);
    }

    public ManifestResponseException(int i, String str) {
        super("http status = " + i + "; jsonResponse" + str);
        JSONObject jSONObject;
        this.mHttpStatusCode = i;
        if (i != 404 || !TextUtils.isEmpty(str)) {
            this.mJsonResponse = str;
        } else {
            this.mJsonResponse = String.format("{reason='%s'}", "MANIFEST_DELETED");
        }
        if (this.mJsonResponse != null) {
            try {
                jSONObject = new JSONObject(this.mJsonResponse);
            } catch (JSONException unused) {
            }
            this.a = jSONObject;
        }
        jSONObject = null;
        this.a = jSONObject;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }

    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    public ErrorType c() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                ErrorType errorType = b.get(jSONObject.getString("reason"));
                if (errorType != null) {
                    return errorType;
                }
            } catch (JSONException unused) {
            }
        }
        return ErrorType.ERROR_UNKNOWN;
    }
}
