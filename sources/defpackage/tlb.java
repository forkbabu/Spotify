package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties;

/* renamed from: tlb  reason: default package */
public final class tlb implements fjf<slb> {
    private final wlf<AndroidMusicLibsNowplayingScrollProperties> a;

    public tlb(wlf<AndroidMusicLibsNowplayingScrollProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new slb(this.a.get());
    }
}
