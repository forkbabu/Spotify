package defpackage;

import android.util.DisplayMetrics;
import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: uqa  reason: default package */
public final class uqa implements fjf<tqa> {
    private final wlf<DisplayMetrics> a;
    private final wlf<b> b;

    public uqa(wlf<DisplayMetrics> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tqa(this.a.get(), this.b.get());
    }
}
