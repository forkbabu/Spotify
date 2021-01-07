package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

/* renamed from: qfc  reason: default package */
public final class qfc implements fjf<pfc> {
    private final wlf<c> a;
    private final wlf<b4<msc>> b;

    public qfc(wlf<c> wlf, wlf<b4<msc>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pfc(this.a.get(), this.b.get());
    }
}
