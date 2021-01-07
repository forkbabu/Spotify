package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;
import kotlin.jvm.internal.h;

/* renamed from: jxd  reason: default package */
public final class jxd implements fjf<PlayOrigin> {
    private final wlf<ifd> a;
    private final wlf<String> b;
    private final wlf<c> c;
    private final wlf<yn0> d;

    public jxd(wlf<ifd> wlf, wlf<String> wlf2, wlf<c> wlf3, wlf<yn0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static PlayOrigin a(ifd ifd, String str, c cVar, yn0 yn0) {
        h.e(ifd, "featureIdentifier");
        h.e(str, "versionName");
        h.e(cVar, "viewUri");
        h.e(yn0, "internalReferrer");
        PlayOrigin build = PlayOrigin.builder(ifd.getName()).featureVersion(str).viewUri(cVar.toString()).referrerIdentifier(yn0.getName()).build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
