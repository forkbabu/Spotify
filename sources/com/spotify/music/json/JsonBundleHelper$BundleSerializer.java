package com.spotify.music.json;

import android.os.Bundle;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;
import java.util.HashMap;

class JsonBundleHelper$BundleSerializer extends JsonSerializer<Bundle> {
    JsonBundleHelper$BundleSerializer() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Bundle bundle, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Bundle bundle2 = bundle;
        HashMap hashMap = new HashMap();
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj == null || (obj instanceof Serializable)) {
                hashMap.put(str, new c((Serializable) obj));
            } else {
                Assertion.p("value for key '" + str + "' is not Serializable");
            }
        }
        serializerProvider.defaultSerializeValue(hashMap, jsonGenerator);
    }
}
