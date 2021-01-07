package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.ads.api.SlotApi;

/* renamed from: cv3  reason: default package */
public final class cv3 implements fjf<bv3> {
    private final wlf<SlotApi> a;
    private final wlf<w52> b;
    private final wlf<SnackbarManager> c;

    public cv3(wlf<SlotApi> wlf, wlf<w52> wlf2, wlf<SnackbarManager> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bv3(this.a.get(), this.b.get(), this.c.get());
    }
}
