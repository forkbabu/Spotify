package defpackage;

import android.app.NotificationManager;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;
import com.spotify.music.C0707R;
import com.spotify.music.container.app.foregroundstate.h;

/* renamed from: u93  reason: default package */
public final class u93 implements fjf<l2e> {
    private final wlf<BixbyHomeCardService> a;
    private final wlf<NotificationManager> b;
    private final wlf<i2e> c;
    private final wlf<m2e> d;
    private final wlf<h> e;

    public u93(wlf<BixbyHomeCardService> wlf, wlf<NotificationManager> wlf2, wlf<i2e> wlf3, wlf<m2e> wlf4, wlf<h> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l2e(this.a.get(), this.b.get(), this.d.get(), this.c.get(), C0707R.string.spotify_notification_channel_name, C0707R.string.spotify_notification_channel_description, this.e.get());
    }
}
