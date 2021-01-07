package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties;
import kotlin.jvm.internal.h;

/* renamed from: ylb  reason: default package */
public final class ylb implements fjf<wlb> {
    private final wlf<AndroidMusicLibsNowplayingScrollProperties> a;
    private final wlf<ulb> b;
    private final wlf<slb> c;

    public ylb(wlf<AndroidMusicLibsNowplayingScrollProperties> wlf, wlf<ulb> wlf2, wlf<slb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidMusicLibsNowplayingScrollProperties androidMusicLibsNowplayingScrollProperties = this.a.get();
        ulb ulb = this.b.get();
        slb slb = this.c.get();
        h.e(androidMusicLibsNowplayingScrollProperties, "properties");
        h.e(ulb, "remoteDataSource");
        h.e(slb, "debugDataSource");
        return androidMusicLibsNowplayingScrollProperties.a() == AndroidMusicLibsNowplayingScrollProperties.DebugDataSource.CONTROL ? ulb : slb;
    }
}
