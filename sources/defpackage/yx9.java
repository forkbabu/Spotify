package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.e;

/* renamed from: yx9  reason: default package */
public final class yx9 implements fjf<ObjectMapper> {
    private final wlf<e> a;

    public yx9(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ObjectMapper build = this.a.get().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
