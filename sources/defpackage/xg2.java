package defpackage;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: xg2  reason: default package */
public class xg2 extends ff2 {
    public static final /* synthetic */ int j = 0;
    private final y e;
    private final g<PlayerState> f;
    private final v1 g;
    private b h;
    private QueueAppProtocol$PlayerQueue i;

    /* access modifiers changed from: private */
    /* renamed from: xg2$a */
    public static class a implements Predicate<ContextTrack> {
        private final int a;
        private int b = 0;

        a(int i) {
            this.a = i;
        }

        /* renamed from: a */
        public boolean apply(ContextTrack contextTrack) {
            if (contextTrack == null || kxd.k(contextTrack)) {
                return false;
            }
            if (contextTrack.isDelimiter() || contextTrack.uri().startsWith("spotify:meta:")) {
                this.b++;
                return false;
            } else if (this.b < this.a) {
                return true;
            } else {
                return false;
            }
        }
    }

    public xg2(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar) {
        super(aVar);
        this.g = v1Var;
        this.e = yVar;
        this.f = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.h = this.g.C0().b().o0(this.f, vg2.a).Q(this.e).s().A(new ug2(this)).subscribe(new wg2(this), tg2.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.h;
        if (bVar != null && !bVar.d()) {
            this.h.dispose();
            this.h = null;
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        QueueAppProtocol$PlayerQueue queueAppProtocol$PlayerQueue = this.i;
        if (queueAppProtocol$PlayerQueue != null) {
            c(queueAppProtocol$PlayerQueue);
        }
    }

    public /* synthetic */ void k(QueueAppProtocol$PlayerQueue queueAppProtocol$PlayerQueue) {
        this.i = queueAppProtocol$PlayerQueue;
    }
}
