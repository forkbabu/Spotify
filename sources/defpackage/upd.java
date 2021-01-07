package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties;

/* renamed from: upd  reason: default package */
public final class upd implements fjf<tpd> {
    private final wlf<AndroidLibsYourLibraryMusicPagesFlagsProperties> a;
    private final wlf<lbb> b;

    public upd(wlf<AndroidLibsYourLibraryMusicPagesFlagsProperties> wlf, wlf<lbb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tpd(this.a.get(), this.b.get());
    }
}
