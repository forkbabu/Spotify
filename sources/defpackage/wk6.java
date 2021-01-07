package defpackage;

import com.spotify.music.offlinetrials.limited.logging.c;

/* renamed from: wk6  reason: default package */
public final class wk6 implements fjf<vk6> {
    private final wlf<wec> a;
    private final wlf<String> b;
    private final wlf<c> c;

    public wk6(wlf<wec> wlf, wlf<String> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vk6(this.a.get(), this.b.get(), this.c.get());
    }
}
