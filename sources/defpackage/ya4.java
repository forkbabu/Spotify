package defpackage;

import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: ya4  reason: default package */
public final class ya4 implements fjf<String> {
    private final wlf<String> a;

    public ya4(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String path = ((PageIdentifiers) cg4.d(this.a.get())).path();
        yif.g(path, "Cannot return null from a non-@Nullable @Provides method");
        return path;
    }
}
