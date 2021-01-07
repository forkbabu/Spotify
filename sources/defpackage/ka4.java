package defpackage;

import android.app.Activity;
import com.spotify.music.features.browse.component.findcard.a;
import com.spotify.music.features.browse.component.findcard.b;

/* renamed from: ka4  reason: default package */
public final class ka4 implements fjf<a> {
    private final wlf<Activity> a;
    private final wlf<b> b;

    public ka4(wlf<Activity> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().b(nud.m(this.a.get()));
    }
}
