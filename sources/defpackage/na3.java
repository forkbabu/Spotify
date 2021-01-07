package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.rxjava2.n;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: na3  reason: default package */
public final class na3 implements fjf<s<ConnectManager>> {
    private final wlf<Activity> a;
    private final wlf<n> b;
    private final wlf<y> c;

    public na3(wlf<Activity> wlf, wlf<n> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        return this.b.get().a(new Intent(activity, SpotifyService.class), activity.getLocalClassName()).I0(this.c.get()).q(new com.spotify.mobile.android.service.y(ma3.a));
    }
}
