package defpackage;

import com.spotify.music.lyrics.core.experience.contract.a;

/* renamed from: gnb  reason: default package */
public final class gnb implements fjf<bnb> {
    private final wlf<enb> a;
    private final wlf<a> b;

    public gnb(wlf<enb> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bnb(this.a.get(), this.b.get());
    }
}
