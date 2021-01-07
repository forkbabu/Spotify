package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import org.json.JSONObject;

/* renamed from: xid  reason: default package */
public final class xid implements fjf<ObjectMapper> {
    private final wlf<g> a;

    public xid(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        e b = this.a.get().b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b.a(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        b.e(SerializationFeature.WRAP_ROOT_VALUE, true);
        b.d(JsonInclude.Include.NON_NULL);
        ObjectMapper build = b.build();
        build.reader().withRootName("offer");
        return build;
    }
}
