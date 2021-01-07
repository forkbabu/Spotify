package com.spotify.music.features.login.startview.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.effortlesslogin.EffortlessLoginBottomSheetDialog;
import com.spotify.effortlesslogin.prerequisites.f;
import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.c;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.fo5;
import defpackage.ge0;
import defpackage.je0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class StartPresenter implements fo5.a, EffortlessLoginBottomSheetDialog.a {
    private long a;
    private final String b;
    private final fo5 c;
    private final ae0 f;
    private final cqe n;
    private final com.spotify.libs.pse.model.a o;
    private final f p;
    private final d q;
    private final zy0 r;

    static final class a<T> implements qg0<String> {
        final /* synthetic */ StartPresenter a;

        a(StartPresenter startPresenter) {
            this.a = startPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.qg0
        public void accept(String str) {
            String str2 = str;
            h.e(str2, "fullName");
            this.a.c.R1(str2);
        }
    }

    public StartPresenter(fo5 fo5, ae0 ae0, cqe cqe, com.spotify.libs.pse.model.a aVar, f fVar, n nVar, d dVar, zy0 zy0) {
        String str;
        h.e(fo5, "startFragmentViewBinder");
        h.e(ae0, "authTracker");
        h.e(cqe, "clock");
        h.e(aVar, "blueprint");
        h.e(fVar, "effortlessLoginTrigger");
        h.e(nVar, "lifecycleOwner");
        h.e(dVar, "navigator");
        h.e(zy0, "componentExposer");
        this.c = fo5;
        this.f = ae0;
        this.n = cqe;
        this.o = aVar;
        this.p = fVar;
        this.q = dVar;
        this.r = zy0;
        nVar.A().a(this);
        fVar.a(new a(this));
        zy0.a(aVar);
        if ((aVar instanceof c) && !(aVar instanceof a.C0166a)) {
            zy0.a(((c) aVar).a());
        }
        if (aVar instanceof a.c) {
            str = "mix";
        } else if (aVar instanceof a.C0166a) {
            str = "intent_led";
        } else if (aVar instanceof a.b) {
            str = "method_led";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = str;
    }

    @Override // com.spotify.effortlesslogin.EffortlessLoginBottomSheetDialog.a
    public void a() {
        this.q.b(Destination.d.a);
    }

    @Override // defpackage.fo5.a
    public void e0() {
        this.f.a(new ce0.c(je0.o.b, fe0.o.b, ge0.k.b));
    }

    @w(Lifecycle.Event.ON_START)
    public final void onStart() {
        ae0 ae0 = this.f;
        je0.o oVar = je0.o.b;
        ae0.a(new ce0.k(oVar));
        this.a = this.n.d();
        this.f.a(new ce0.g(oVar, "layout", this.b));
        this.f.a(new ce0.g(oVar, "ScreenOrientation", String.valueOf(this.c.l())));
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.p.cancel();
        this.f.a(new ce0.g(je0.o.b, "StartFragmentStartToStop", String.valueOf(this.n.d() - this.a)));
    }
}
