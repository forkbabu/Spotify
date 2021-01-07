package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties;

/* renamed from: nbb  reason: default package */
public final class nbb implements fjf<mbb> {
    private final wlf<AndroidLibsYourEpisodesFlagsProperties> a;
    private final wlf<txc> b;

    public nbb(wlf<AndroidLibsYourEpisodesFlagsProperties> wlf, wlf<txc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mbb(this.a.get(), this.b.get());
    }
}
