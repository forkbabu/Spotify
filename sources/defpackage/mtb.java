package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import io.reactivex.v;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mtb  reason: default package */
public class mtb {
    private final ConnectManager a;
    private final List<Long> b;
    private final cqe c;
    private final y d;
    private final p e = new p();
    private final oc1 f;

    public mtb(ConnectManager connectManager, cqe cqe, y yVar, oc1 oc1) {
        this.a = connectManager;
        this.b = new ArrayList(3);
        this.c = cqe;
        this.d = yVar;
        this.f = oc1;
    }

    public static void a(mtb mtb, ConnectManager.ConnectState connectState) {
        int i = 0;
        while (i < mtb.b.size() && mtb.c.d() - mtb.b.get(i).longValue() > 30000) {
            mtb.b.remove(i);
            i++;
        }
        if (mtb.b.size() < 3 && ConnectManager.ConnectState.ACTIVE == connectState) {
            mtb.a.d();
            mtb.b.add(Long.valueOf(mtb.c.d()));
        }
    }

    public boolean b(GaiaDevice gaiaDevice) {
        return !this.f.a(gaiaDevice);
    }

    public /* synthetic */ v c(GaiaDevice gaiaDevice) {
        return this.a.h(mtb.class.getSimpleName());
    }

    public void d() {
        this.e.b(this.a.p(mtb.class.getSimpleName()).Q(new jtb(this)).J0(new ktb(this)).o0(this.d).subscribe(new ltb(this)));
    }

    public void e() {
        this.e.a();
    }
}
