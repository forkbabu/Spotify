package defpackage;

import android.content.res.Resources;
import com.spotify.nowplaying.core.orientation.Orientation;
import kotlin.jvm.internal.h;

/* renamed from: xs5  reason: default package */
public final class xs5 implements fjf<Orientation> {
    private final wlf<Resources> a;

    public xs5(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Resources resources = this.a.get();
        h.e(resources, "resources");
        return resources.getConfiguration().orientation == 1 ? Orientation.PORTRAIT : Orientation.LANDSCAPE;
    }
}
