package defpackage;

import com.spotify.mobile.android.observablestates.docking.DockingStatus;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: ax1  reason: default package */
public class ax1 implements d {
    private final zw1 a;
    private final s<DockingStatus> b;
    private final y c;
    private final q f = new q();

    public ax1(zw1 zw1, y yVar, s<DockingStatus> sVar) {
        this.a = zw1;
        this.b = sVar;
        this.c = yVar;
        zw1.s();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        q qVar = this.f;
        s<R> j0 = this.b.o0(this.c).j0(vw1.a);
        zw1 zw1 = this.a;
        zw1.getClass();
        qVar.b(j0.subscribe(new yw1(zw1)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "DockingWakeLockPlugin";
    }
}
