package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.browse.b;

/* renamed from: qa4  reason: default package */
public final class qa4 implements fjf<String> {
    private final wlf<b> a;

    public qa4(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String path = ((PageIdentifiers) cg4.d(this.a.get().b())).path();
        yif.g(path, "Cannot return null from a non-@Nullable @Provides method");
        return path;
    }
}
