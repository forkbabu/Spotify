package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.f;
import io.reactivex.s;
import io.reactivex.t;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ioc  reason: default package */
public class ioc implements e {
    private final SpeedControlInteractor a;
    private final goc b;
    private final List<f<Integer>> c = new CopyOnWriteArrayList();

    public ioc(SpeedControlInteractor speedControlInteractor, goc goc) {
        this.a = speedControlInteractor;
        this.b = goc;
    }

    private void b(Throwable th) {
        for (f<Integer> fVar : this.c) {
            fVar.onError(th);
        }
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public void a(b bVar) {
        Integer b2 = this.b.b(bVar.c());
        if (b2 != null) {
            this.a.d(b2.intValue()).subscribe(new xnc(this, bVar), new znc(this));
        } else {
            b(new RuntimeException("The selected item is not mapped to a supported speed"));
        }
    }

    public s<Integer> c() {
        s y = s.y(new ync(this));
        goc goc = this.b;
        goc.getClass();
        return y.j0(new foc(goc));
    }

    public /* synthetic */ void d(t tVar) {
        tVar.e(new aoc(this, tVar));
        this.c.add(tVar);
    }

    public /* synthetic */ void e(t tVar) {
        this.c.remove(tVar);
    }

    public void f(b bVar) {
        Integer valueOf = Integer.valueOf(bVar.c());
        for (f<Integer> fVar : this.c) {
            fVar.onNext(valueOf);
        }
    }

    public /* synthetic */ void g(Throwable th) {
        Logger.e(th, "Can not save speed preference", new Object[0]);
        b(th);
    }
}
