package defpackage;

import android.app.Activity;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import kotlin.jvm.internal.h;

/* renamed from: yq2  reason: default package */
public final class yq2 implements fjf<m71> {
    private final xq2 a;
    private final wlf<Activity> b;

    public yq2(xq2 xq2, wlf<Activity> wlf) {
        this.a = xq2;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        xq2 xq2 = this.a;
        Activity activity = this.b.get();
        xq2.getClass();
        h.e(activity, "activity");
        return new m71(activity, SpotifyIconV2.TRACK);
    }
}
