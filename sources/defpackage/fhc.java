package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

/* renamed from: fhc  reason: default package */
public final class fhc implements fjf<ehc> {
    private final wlf<c> a;
    private final wlf<Activity> b;
    private final wlf<b4<msc>> c;

    public fhc(wlf<c> wlf, wlf<Activity> wlf2, wlf<b4<msc>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ehc(this.a.get(), this.b.get(), this.c.get());
    }
}
