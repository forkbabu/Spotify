package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.e;

/* renamed from: cd3  reason: default package */
public final class cd3 implements fjf<ObjectMapper> {
    private final wlf<e> a;

    public cd3(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ObjectMapper build = this.a.get().build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
