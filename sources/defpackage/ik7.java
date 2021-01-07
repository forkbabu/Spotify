package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.music.libs.viewuri.c;

/* renamed from: ik7  reason: default package */
public final class ik7 implements fjf<hk7> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<u22> c;
    private final wlf<f> d;
    private final wlf<j42> e;

    public ik7(wlf<Context> wlf, wlf<c> wlf2, wlf<u22> wlf3, wlf<f> wlf4, wlf<j42> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static ik7 a(wlf<Context> wlf, wlf<c> wlf2, wlf<u22> wlf3, wlf<f> wlf4, wlf<j42> wlf5) {
        return new ik7(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hk7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
