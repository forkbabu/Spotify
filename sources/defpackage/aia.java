package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.spotify.rxjava2.q;
import defpackage.yda;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: aia  reason: default package */
public class aia implements com.spotify.mobile.android.service.plugininterfaces.b, wha {
    private final s<na1> a;
    private final yha b;
    private final y c;
    private io.reactivex.disposables.b f;
    private b n;
    private final q o = new q();

    /* access modifiers changed from: private */
    /* renamed from: aia$b */
    public static class b {
        final xha a;
        final sa1 b;

        b(xha xha, sa1 sa1, a aVar) {
            this.a = xha;
            this.b = sa1;
        }
    }

    public aia(s<na1> sVar, yha yha, y yVar) {
        this.a = sVar;
        this.b = yha;
        this.c = yVar;
    }

    public static void d(aia aia, na1 na1) {
        aia.getClass();
        if (na1.d()) {
            b bVar = aia.n;
            if (bVar == null || !bVar.b.equals(na1.b())) {
                aia.e(true);
                sa1 b2 = na1.b();
                yda.b bVar2 = new yda.b("bluetooth");
                bVar2.p(b2.b());
                bVar2.q("media_button");
                bVar2.s("bluetooth");
                xha b3 = aia.b.b(bVar2.k());
                b3.b();
                aia.n = new b(b3, b2, null);
                return;
            }
            return;
        }
        aia.e(true);
    }

    private void e(boolean z) {
        b bVar = this.n;
        if (bVar != null) {
            bVar.a.d(z);
            this.n = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.f = this.a.o0(this.c).subscribe(new vha(this));
    }

    @Override // defpackage.wha
    public void b(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        boolean z2 = device != null && "AVRCP".equals(device.getName());
        b bVar = this.n;
        if (bVar != null && bVar.a.c()) {
            z = true;
        }
        if (z2 && z) {
            this.o.a(this.n.a.a(keyEvent).subscribe());
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
            this.f = null;
        }
        this.o.c();
        e(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return aia.class.getSimpleName();
    }
}
