package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: hba  reason: default package */
public class hba {
    private static final String g = "hba";
    public static final /* synthetic */ int h = 0;
    private final s<Optional<GaiaDevice>> a;
    private final s<gba> b;
    private final s<PlayerState> c;
    private final a<gba> d;
    private final p e = new p();
    private final ConnectManager f;

    public hba(ConnectManager connectManager, y yVar, g<PlayerState> gVar) {
        gVar.getClass();
        v vVar = new v(gVar);
        this.c = vVar;
        this.d = a.h1();
        String str = g;
        this.a = connectManager.m(str).W(bba.a, false, Integer.MAX_VALUE).E();
        connectManager.m(str).W(taa.a, false, Integer.MAX_VALUE).Q(waa.a).F(xaa.a);
        this.b = s.n(connectManager.m(str).W(aba.a, false, Integer.MAX_VALUE), vVar, yaa.a).z(100, TimeUnit.MILLISECONDS, yVar).E().j0(zaa.a);
        this.f = connectManager;
    }

    public s<gba> a() {
        return this.d;
    }

    public s<List<GaiaDevice>> b() {
        return this.f.m(g);
    }

    public s<GaiaDevice> c() {
        return this.a.Q(vaa.a).j0(uaa.a);
    }

    public void d() {
        p pVar = this.e;
        s<gba> sVar = this.b;
        a<gba> aVar = this.d;
        aVar.getClass();
        dba dba = new dba(aVar);
        a<gba> aVar2 = this.d;
        aVar2.getClass();
        pVar.b(sVar.subscribe(dba, new cba(aVar2)));
    }

    public void e() {
        this.d.onNext(gba.d());
        this.e.a();
    }
}
