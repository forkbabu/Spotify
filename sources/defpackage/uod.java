package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: uod  reason: default package */
public class uod<T> {
    private final sod a;
    private final ObjectMapper b;
    private final Class<T> c;

    public uod(Class<T> cls, sod sod, ObjectMapper objectMapper) {
        this.c = cls;
        this.a = sod;
        this.b = objectMapper;
    }

    public Optional<T> a(SpSharedPreferences.b<Object, JSONObject> bVar, String str) {
        Optional<String> a2 = this.a.a(bVar, str);
        if (!a2.isPresent()) {
            return Optional.absent();
        }
        try {
            return Optional.fromNullable(this.b.readValue(a2.get(), this.c));
        } catch (IOException unused) {
            Logger.b("Could not map string to object for key: %s", bVar);
            return Optional.absent();
        }
    }

    public void b(SpSharedPreferences.b<Object, JSONObject> bVar) {
        this.a.b(bVar);
    }

    public void c(SpSharedPreferences.b<Object, JSONObject> bVar, T t, String str, long j) {
        try {
            this.a.c(bVar, this.b.writeValueAsString(t), str, j);
        } catch (JsonProcessingException unused) {
            Logger.b("Could not write object as string for key: %s", bVar);
        }
    }
}
