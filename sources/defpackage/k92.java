package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: k92  reason: default package */
public class k92 implements d {
    private final j92 a;
    private final kd0 b;
    private final BroadcastReceiver c;

    public k92(j92 j92, kd0 kd0) {
        this.a = j92;
        this.b = kd0;
        this.c = new d92(j92);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.spotify.music.internal.waze.LAUNCH");
        intentFilter.addAction("com.spotify.music.internal.waze.WAKE_BY_INTERAPP");
        intentFilter.addAction("com.spotify.music.internal.waze.WAKE_BY_MBS");
        intentFilter.addAction("com.spotify.music.internal.waze.STOP");
        this.b.a(this.c, intentFilter);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b.d(this.c);
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "WazeSdkManager";
    }
}
