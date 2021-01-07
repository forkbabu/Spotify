package defpackage;

import com.spotify.libs.connect.model.LoginIntent;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.d;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;

@Deprecated
/* renamed from: an4  reason: default package */
public class an4 {
    private final cn4 a;
    private final y b;
    private final a c = new a();

    public an4(y yVar, cn4 cn4) {
        this.a = cn4;
        yVar.getClass();
        this.b = yVar;
    }

    public void a(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice.getDeviceId() != null) {
            this.c.b(this.a.d(discoveredDevice.getDeviceId(), discoveredDevice).subscribe(nm4.a, qm4.a));
        }
    }

    public void b(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice.getDeviceId() != null) {
            this.c.b(this.a.a(discoveredDevice.getDeviceId(), discoveredDevice).subscribe(nm4.a, qm4.a));
        }
    }

    public void c(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice.getDeviceId() != null) {
            this.c.b(this.a.c(discoveredDevice.getDeviceId(), discoveredDevice).subscribe(nm4.a, qm4.a));
        }
    }

    public void d() {
        this.c.f();
    }

    public void e(d dVar) {
        a aVar = this.c;
        s<LoginIntent> o0 = this.a.b().o0(this.b);
        pm4 pm4 = new pm4(dVar);
        qm4 qm4 = qm4.a;
        aVar.b(o0.subscribe(pm4, qm4));
        this.c.b(this.a.logout().o0(this.b).subscribe(new om4(dVar), qm4));
    }
}
