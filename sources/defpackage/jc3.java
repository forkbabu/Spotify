package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

/* renamed from: jc3  reason: default package */
public final class jc3 implements fjf<ObjectMapper> {
    private final wlf<g> a;

    public jc3(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e b = this.a.get().b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b.d(JsonInclude.Include.NON_NULL);
        ObjectMapper build = b.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
