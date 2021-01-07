package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import java.util.Map;

/* renamed from: g79  reason: default package */
public final class g79 implements fjf<zc9> {
    private final wlf<Map<MusicPageId, zc9>> a;
    private final wlf<p69> b;

    public g79(wlf<Map<MusicPageId, zc9>> wlf, wlf<p69> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        zc9 zc9 = this.a.get().get(this.b.get().J1());
        yif.g(zc9, "Cannot return null from a non-@Nullable @Provides method");
        return zc9;
    }
}
