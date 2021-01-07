package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.rxjava2.p;

/* renamed from: mec  reason: default package */
public class mec implements d {
    private final RxPlayerState a;
    private final p b = new p();

    public mec(RxPlayerState rxPlayerState) {
        this.a = rxPlayerState;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.b.b(this.a.getPlayerState().subscribe());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "LegacyRxPlayerStateObserverPlugin";
    }
}
