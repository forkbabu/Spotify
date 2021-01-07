package defpackage;

import com.spotify.music.features.listeninghistory.presenter.a;

/* renamed from: cn5  reason: default package */
public final class cn5 implements fjf<bn5> {
    private final wlf<a> a;

    public cn5(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bn5(this.a.get());
    }
}
