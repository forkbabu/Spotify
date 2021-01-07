package defpackage;

import com.spotify.music.marketingformats.constants.MarketingFormatsComponentId;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: whb  reason: default package */
public final class whb implements thb {
    private final g<PlayerState> a;
    private final d b;
    private final f c;
    private final nsb d;
    private final q e;

    /* renamed from: whb$a */
    static final class a implements e {
        final /* synthetic */ whb a;
        final /* synthetic */ boolean b;

        a(whb whb, boolean z) {
            this.a = whb;
            this.b = z;
        }

        @Override // io.reactivex.e
        public final void subscribe(c cVar) {
            h.e(cVar, "it");
            if (this.b) {
                this.a.d.b(new com.spotify.instrumentation.navigation.logger.c(MarketingFormatsComponentId.b.d()));
            }
        }
    }

    public whb(g<PlayerState> gVar, d dVar, f fVar, nsb nsb, q qVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(dVar, "playerControls");
        h.e(fVar, "player");
        h.e(nsb, "nowPlayingViewNavigator");
        h.e(qVar, "disposable");
        this.a = gVar;
        this.b = dVar;
        this.c = fVar;
        this.d = nsb;
        this.e = qVar;
    }

    public static final io.reactivex.a c(whb whb, String str) {
        io.reactivex.a t = whb.c.a(PlayCommand.create(Context.fromUri(str), PlayOrigin.create(kfd.F0.toString()))).t(vhb.a);
        h.d(t, "player.play(\n           … Completable.complete() }");
        return t;
    }

    public static final io.reactivex.a d(whb whb, boolean z) {
        if (z) {
            z<zwd> a2 = whb.b.a(com.spotify.player.controls.c.c());
            qhb qhb = qhb.b;
            a2.getClass();
            SingleFlatMapCompletable singleFlatMapCompletable = new SingleFlatMapCompletable(a2, qhb);
            h.d(singleFlatMapCompletable, "playerControls\n         … Completable.complete() }");
            return singleFlatMapCompletable;
        }
        z<zwd> a3 = whb.b.a(com.spotify.player.controls.c.e());
        qhb qhb2 = qhb.c;
        a3.getClass();
        SingleFlatMapCompletable singleFlatMapCompletable2 = new SingleFlatMapCompletable(a3, qhb2);
        h.d(singleFlatMapCompletable2, "playerControls\n         … Completable.complete() }");
        return singleFlatMapCompletable2;
    }

    @Override // defpackage.thb
    public void a(String str, boolean z) {
        h.e(str, "uri");
        q qVar = this.e;
        h.e(str, "uri");
        io.reactivex.a B = this.a.E().t(new uhb(this, str)).B();
        h.d(B, "playerStateFlowable\n    …       .onErrorComplete()");
        qVar.a(B.d(new a(this, z)).subscribe());
    }
}
