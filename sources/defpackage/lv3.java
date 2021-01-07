package defpackage;

import com.spotify.music.features.ads.api.e;

/* renamed from: lv3  reason: default package */
public final class lv3 implements fjf<kv3> {
    private final wlf<e> a;
    private final wlf<com.spotify.music.json.e> b;

    public lv3(wlf<e> wlf, wlf<com.spotify.music.json.e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kv3(this.a.get(), this.b.get());
    }
}
