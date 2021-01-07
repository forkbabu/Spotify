package defpackage;

import android.content.Context;
import com.spotify.localization.SpotifyLocale;

/* renamed from: sb3  reason: default package */
public final class sb3 implements fjf<String> {
    private final wlf<Context> a;

    public sb3(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = SpotifyLocale.a(this.a.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
