package defpackage;

import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;

/* renamed from: m42  reason: default package */
public final class m42 implements fjf<l42> {
    private final wlf<l22> a;
    private final wlf<f> b;
    private final wlf<h32> c;
    private final wlf<u22> d;
    private final wlf<r32> e;
    private final wlf<b42> f;

    public m42(wlf<l22> wlf, wlf<f> wlf2, wlf<h32> wlf3, wlf<u22> wlf4, wlf<r32> wlf5, wlf<b42> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static m42 a(wlf<l22> wlf, wlf<f> wlf2, wlf<h32> wlf3, wlf<u22> wlf4, wlf<r32> wlf5, wlf<b42> wlf6) {
        return new m42(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l42(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
