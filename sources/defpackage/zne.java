package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.superbird.ota.api.b;
import com.spotify.superbird.ota.logger.pitstopevents.OtaEvent;
import com.spotify.superbird.ota.model.VersionedPackage;
import io.reactivex.z;
import java.util.List;

/* renamed from: zne  reason: default package */
public class zne implements g<poe, ooe> {
    private final b a;
    private final xne b;
    private final vne c;
    private final yoe f;
    private final ape n;
    private final io.reactivex.g<ooe> o;
    private final io.reactivex.disposables.a p = new io.reactivex.disposables.a();
    private MobiusLoop.g<poe, ooe> q;

    /* renamed from: zne$a */
    class a implements h<poe> {
        a(zne zne) {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            poe poe = (poe) obj;
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public zne(b bVar, xne xne, vne vne, yoe yoe, ape ape, io.reactivex.g<ooe> gVar) {
        this.a = bVar;
        this.b = xne;
        this.c = vne;
        this.f = yoe;
        this.n = ape;
        this.o = gVar;
    }

    public z<List<com.spotify.superbird.ota.model.g>> a(String str, List<VersionedPackage> list) {
        return this.a.b(str, list).o(new pne(this, str, list)).m(new qne(this, str, list));
    }

    public void b(String str, List<com.spotify.superbird.ota.model.g> list) {
        this.f.a(ooe.e(str, list));
    }

    public /* synthetic */ void c(String str, List list, io.reactivex.disposables.b bVar) {
        this.n.e(str, list, OtaEvent.Trigger.CAR_THING);
    }

    public /* synthetic */ void d(String str, List list, Throwable th) {
        this.n.c(str, list, (String) MoreObjects.firstNonNull(th.getMessage(), "Failed to check for updates."));
    }

    public void e() {
        f();
        io.reactivex.disposables.a aVar = this.p;
        io.reactivex.g<ooe> gVar = this.o;
        yoe yoe = this.f;
        yoe.getClass();
        aVar.b(gVar.subscribe(new rne(yoe)));
        MobiusLoop.g<poe, ooe> a2 = this.b.a(poe.a(qoe.a()), this.c, this.f);
        this.q = a2;
        a2.c(this);
        this.q.start();
    }

    public void f() {
        MobiusLoop.g<poe, ooe> gVar = this.q;
        if (gVar != null && gVar.isRunning()) {
            this.q.stop();
            this.q.d();
        }
        this.p.f();
    }

    @Override // com.spotify.mobius.g
    public h<poe> t(da2<ooe> da2) {
        return new a(this);
    }
}
