package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: g95  reason: default package */
public final class g95 implements fjf<String> {
    private final wlf<c> a;

    public g95(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String cVar = this.a.get().toString();
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
