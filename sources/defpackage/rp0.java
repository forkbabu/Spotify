package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import com.spotify.inappmessaging.display.e;
import com.spotify.inappmessaging.k;
import com.spotify.inappmessaging.preview.views.i;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.s;

/* renamed from: rp0  reason: default package */
public class rp0 {
    private final MobiusLoop.g<hq0, gq0> a;
    private final k b;

    public rp0(MobiusLoop.g<hq0, gq0> gVar, k kVar) {
        this.a = gVar;
        this.b = kVar;
    }

    public s<e> a() {
        return this.b.b();
    }

    public void b(ViewGroup viewGroup, boolean z) {
        i iVar = new i(viewGroup.getContext());
        new Handler(viewGroup.getContext().getMainLooper()).post(new pp0(viewGroup, iVar));
        this.a.c(iVar);
        MobiusLoop.g<hq0, gq0> gVar = this.a;
        gVar.a(gVar.b().f(z));
        this.a.start();
    }

    public void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            new Handler(viewGroup.getContext().getMainLooper()).post(new qp0(viewGroup));
            if (this.a.isRunning()) {
                this.a.stop();
                this.a.d();
            }
        }
    }
}
