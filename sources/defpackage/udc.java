package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.partnerapps.api.c;

/* renamed from: udc  reason: default package */
public final class udc implements fjf<tdc> {
    private final wlf<c> a;
    private final wlf<mla> b;
    private final wlf<SpSharedPreferences<Object>> c;

    public udc(wlf<c> wlf, wlf<mla> wlf2, wlf<SpSharedPreferences<Object>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tdc(this.a.get(), this.b.get(), this.c.get());
    }
}
