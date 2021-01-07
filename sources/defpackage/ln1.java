package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.offlinesync.OfflineProgressModel;
import com.spotify.music.features.offlinesync.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ln1  reason: default package */
public final class ln1 implements d {
    private final Context a;
    private final g<PlayerState> b;
    private final y c;
    private final e f;
    private final BroadcastReceiver n;
    private ConnectivityManager o;
    private WifiManager.WifiLock p;
    private boolean q;
    private b r;
    private boolean s;
    private final e.a t = new om1(this);

    /* renamed from: ln1$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ln1.this.e();
        }
    }

    public ln1(Context context, g<PlayerState> gVar, y yVar, e eVar) {
        this.a = context.getApplicationContext();
        this.b = gVar;
        this.c = yVar;
        this.f = eVar;
        this.n = new a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        NetworkInfo activeNetworkInfo = this.o.getActiveNetworkInfo();
        boolean z = false;
        if ((activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) && (this.q || this.s)) {
            z = true;
        }
        if (z) {
            if (!this.p.isHeld()) {
                this.p.acquire();
            }
        } else if (this.p.isHeld()) {
            this.p.release();
        }
    }

    public /* synthetic */ void b(OfflineProgressModel offlineProgressModel) {
        boolean z = this.s;
        boolean isSyncing = offlineProgressModel.isSyncing();
        this.s = isSyncing;
        if (z != isSyncing) {
            e();
        }
    }

    public /* synthetic */ void c(PlayerState playerState) {
        this.q = !playerState.isPaused() && playerState.isPlaying();
        e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.o = (ConnectivityManager) this.a.getSystemService("connectivity");
        this.p = ((WifiManager) this.a.getApplicationContext().getSystemService("wifi")).createWifiLock("Spotify Wifi Lock");
        this.r = this.b.Q(this.c).subscribe(new nm1(this));
        this.f.a(this.t);
        this.a.registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.unregisterReceiver(this.n);
        if (this.p.isHeld()) {
            this.p.release();
        }
        this.r.dispose();
        this.f.f(this.t);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "KeepWifiAwake";
    }
}
