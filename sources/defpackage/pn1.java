package defpackage;

import com.spotify.mobile.android.observablestates.docking.DockingStatus;
import com.spotify.mobile.android.service.SpotifyServiceCommandHandlingStatus;
import com.spotify.mobile.android.service.k;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.connect.discovery.DiscoveredDeviceConnectionStatus;
import com.spotify.music.features.offlinesync.OfflineProgressModel;
import com.spotify.music.features.offlinesync.e;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: pn1  reason: default package */
public class pn1 implements b, d {
    private boolean A;
    private boolean B;
    private boolean C;
    private final e.a D = new wm1(this);
    private io.reactivex.disposables.b E;
    private io.reactivex.disposables.b F;
    private io.reactivex.disposables.b G;
    private io.reactivex.disposables.b H;
    private io.reactivex.disposables.b I;
    private io.reactivex.disposables.b J;
    private io.reactivex.disposables.b K;
    private final e a;
    private final y b;
    private final s<Boolean> c;
    private final s<DiscoveredDeviceConnectionStatus> f;
    private final s<SpotifyServiceCommandHandlingStatus> n;
    private final j4a o;
    private final er0 p;
    private final k q;
    private final s<DockingStatus> r;
    private final s<LocalPlaybackStatus> s;
    private final s<RemotePlaybackStatus> t;
    private final zw9 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    pn1(e eVar, y yVar, s<Boolean> sVar, s<DiscoveredDeviceConnectionStatus> sVar2, s<SpotifyServiceCommandHandlingStatus> sVar3, j4a j4a, s<DockingStatus> sVar4, s<LocalPlaybackStatus> sVar5, s<RemotePlaybackStatus> sVar6, er0 er0, k kVar, zw9 zw9) {
        this.a = eVar;
        this.b = yVar;
        this.c = sVar;
        this.f = sVar2;
        this.n = sVar3;
        this.o = j4a;
        this.r = sVar4;
        this.s = sVar5;
        this.t = sVar6;
        this.p = er0;
        this.q = kVar;
        this.u = zw9;
    }

    public static void b(pn1 pn1, LocalPlaybackStatus localPlaybackStatus) {
        boolean z2 = localPlaybackStatus == LocalPlaybackStatus.PLAYING;
        pn1.B = z2;
        pn1.u.s(z2);
        pn1.m();
    }

    public static void e(pn1 pn1, Boolean bool) {
        pn1.getClass();
        pn1.w = bool.booleanValue();
        pn1.u.r(bool.booleanValue());
        pn1.m();
    }

    public static void f(pn1 pn1, RemotePlaybackStatus remotePlaybackStatus) {
        boolean z2 = false;
        boolean z3 = remotePlaybackStatus == RemotePlaybackStatus.PLAYING;
        if (z3 && pn1.p.b()) {
            z2 = true;
        }
        pn1.A = z2;
        pn1.u.t(z3);
        pn1.m();
    }

    public static void h(pn1 pn1, DockingStatus dockingStatus) {
        pn1.z = dockingStatus == DockingStatus.DOCKED;
        pn1.m();
    }

    public static void i(pn1 pn1, boolean z2) {
        pn1.y = z2;
        pn1.u.o(z2);
        pn1.m();
    }

    public static void j(pn1 pn1, SpotifyServiceCommandHandlingStatus spotifyServiceCommandHandlingStatus) {
        pn1.C = spotifyServiceCommandHandlingStatus == SpotifyServiceCommandHandlingStatus.HANDLING;
        pn1.m();
    }

    public static void l(pn1 pn1, DiscoveredDeviceConnectionStatus discoveredDeviceConnectionStatus) {
        pn1.x = discoveredDeviceConnectionStatus == DiscoveredDeviceConnectionStatus.CONNECTED;
        pn1.m();
    }

    private void m() {
        if (!this.v && !this.w && !this.x && !this.z && !this.B && !this.A && !this.C && !this.y) {
            this.q.d();
        } else {
            this.q.a();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.H = this.r.o0(this.b).subscribe(new vm1(this));
        this.G = this.o.b().o0(this.b).subscribe(new xm1(this));
        this.I = this.n.o0(this.b).E().subscribe(new ym1(this));
        this.E = this.c.o0(this.b).subscribe(new tm1(this));
        m();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.E.dispose();
        this.G.dispose();
        this.H.dispose();
        this.I.dispose();
        this.q.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.F = this.f.o0(this.b).subscribe(new zm1(this));
        this.a.a(this.D);
        this.J = this.s.o0(this.b).subscribe(new sm1(this));
        this.K = this.t.o0(this.b).subscribe(new um1(this));
        m();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.F.dispose();
        this.a.f(this.D);
        this.J.dispose();
        this.K.dispose();
    }

    public /* synthetic */ void k(OfflineProgressModel offlineProgressModel) {
        boolean z2 = this.v;
        boolean isSyncing = offlineProgressModel.isSyncing();
        this.v = isSyncing;
        if (z2 != isSyncing) {
            m();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "ShutdownSpotifyService";
    }
}
