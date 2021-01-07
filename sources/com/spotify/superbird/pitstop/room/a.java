package com.spotify.superbird.pitstop.room;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import java.util.Map;
import org.json.JSONException;

public final class a {
    private final ObjectMapper a = new ObjectMapper(null, null, null);

    /* renamed from: com.spotify.superbird.pitstop.room.a$a  reason: collision with other inner class name */
    public static final class C0391a extends TypeReference<Map<Object, ? extends Object>> {
        C0391a() {
        }
    }

    public final String a(Map<Object, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        try {
            return this.a.writeValueAsString(map);
        } catch (JSONException e) {
            Logger.e(e, "Failed to read Map into String", new Object[0]);
            return null;
        }
    }

    public final Map<Object, Object> b(String str) {
        try {
            C0391a aVar = new C0391a();
            if (str != null) {
                return (Map) this.a.readValue(str, aVar);
            }
            return null;
        } catch (JSONException e) {
            Logger.e(e, "Failed to read Map into String", new Object[0]);
            return null;
        }
    }
}
