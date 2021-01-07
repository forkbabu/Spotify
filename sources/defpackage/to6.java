package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;

/* renamed from: to6  reason: default package */
public final class to6 implements fjf<PlayOrigin> {
    private final wlf<ifd> a;
    private final wlf<String> b;
    private final wlf<c> c;
    private final wlf<yn0> d;

    public to6(wlf<ifd> wlf, wlf<String> wlf2, wlf<c> wlf3, wlf<yn0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        PlayOrigin build = PlayOrigin.builder(this.a.get().getName()).featureVersion(this.b.get()).viewUri(this.c.get().toString()).referrerIdentifier(this.d.get().getName()).build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
