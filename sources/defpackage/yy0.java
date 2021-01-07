package defpackage;

import android.app.Activity;
import com.spotify.localization.SpotifyLocale;

/* renamed from: yy0  reason: default package */
public final class yy0 implements fjf<String> {
    private final wlf<Activity> a;

    public yy0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return SpotifyLocale.f(this.a.get());
    }
}
