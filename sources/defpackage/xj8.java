package defpackage;

import android.content.res.Resources;
import com.spotify.android.flags.c;
import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;
import com.spotify.music.libs.carmodeengine.util.y;

/* renamed from: xj8  reason: default package */
public final class xj8 implements fjf<wj8> {
    private final wlf<Resources> a;
    private final wlf<y> b;
    private final wlf<yj8> c;
    private final wlf<c6a> d;
    private final wlf<CarModeUserSettingsLogger> e;
    private final wlf<fm9> f;
    private final wlf<c> g;

    public xj8(wlf<Resources> wlf, wlf<y> wlf2, wlf<yj8> wlf3, wlf<c6a> wlf4, wlf<CarModeUserSettingsLogger> wlf5, wlf<fm9> wlf6, wlf<c> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wj8(this.a.get(), this.b.get(), this.c, this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
