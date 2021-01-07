package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;

/* renamed from: u69  reason: default package */
public final class u69 implements fjf<PlayOrigin> {
    private final wlf<ifd> a;
    private final wlf<String> b;
    private final wlf<c> c;
    private final wlf<yn0> d;

    public u69(wlf<ifd> wlf, wlf<String> wlf2, wlf<c> wlf3, wlf<yn0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn0 yn0 = this.d.get();
        PlayOrigin build = PlayOrigin.builder(this.a.get().getName()).featureVersion(this.b.get()).viewUri(this.c.get().toString()).externalReferrer(yn0.getName()).referrerIdentifier(yn0.getName()).build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
