package defpackage;

import android.app.Activity;
import com.spotify.music.libs.voice.b;
import com.spotify.ubi.specification.factories.a1;

/* renamed from: p54  reason: default package */
public final class p54 implements fjf<o54> {
    private final wlf<Activity> a;
    private final wlf<b> b;
    private final wlf<zab> c;
    private final wlf<a1> d;
    private final wlf<ere> e;

    public p54(wlf<Activity> wlf, wlf<b> wlf2, wlf<zab> wlf3, wlf<a1> wlf4, wlf<ere> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o54(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
