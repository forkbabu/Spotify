package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

/* renamed from: a92  reason: default package */
public class a92 {
    private final s<List<b>> a;
    private final e92 b;
    private final r92 c;
    private final y d;
    private final y e;
    private io.reactivex.disposables.b f;

    a92(s<List<b>> sVar, e92 e92, r92 r92, y yVar, y yVar2) {
        this.a = sVar;
        this.b = e92;
        this.c = r92;
        this.d = yVar;
        this.e = yVar2;
    }

    public static void b(a92 a92, Boolean bool) {
        a92.getClass();
        if (bool.booleanValue()) {
            boolean e2 = a92.c.e();
            Logger.b("WazeInterAppConnectedState setEnabled: wazeIsTurnedOn=%s", Boolean.valueOf(e2));
            if (e2) {
                a92.b.a("com.spotify.music.internal.waze.WAKE_BY_INTERAPP");
            }
        }
    }

    public void a() {
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null && !bVar.d()) {
            this.f.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void c() {
        this.f = this.a.j0(y82.a).I0(this.d).o0(this.e).subscribe(new x82(this));
    }
}
