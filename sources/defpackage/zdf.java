package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.h;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.x;
import io.reactivex.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zdf  reason: default package */
public class zdf {
    private final Object a = new Object();
    private final wdf b;
    private final g<PlayerState> c;
    private final x<ByteBuffer> d;
    private final wcf e;
    private final sef f;
    private final List<ByteBuffer> g = new ArrayList();
    boolean h;
    private b i = EmptyDisposable.INSTANCE;
    private da2<lef> j;
    private MobiusLoop.g<com.spotify.voice.external.experience.domain.model.b, lef> k;

    public zdf(wdf wdf, g<PlayerState> gVar, x<ByteBuffer> xVar, y yVar, sef sef) {
        this.b = wdf;
        this.c = gVar;
        this.d = xVar;
        this.e = new wcf(this, yVar);
        this.f = sef;
    }

    /* access modifiers changed from: private */
    public void e() {
        synchronized (this.a) {
            this.g.clear();
            this.i.dispose();
            this.j = null;
            MobiusLoop.g<com.spotify.voice.external.experience.domain.model.b, lef> gVar = this.k;
            if (gVar != null) {
                if (gVar.isRunning()) {
                    this.k.stop();
                    this.k.d();
                }
                this.k = null;
            }
            this.f.flush();
            this.h = false;
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        synchronized (this.a) {
            while (!this.g.isEmpty()) {
                ByteBuffer remove = this.g.remove(0);
                this.d.onNext(remove);
                this.f.a(remove);
            }
        }
    }

    public void d() {
        da2<lef> da2 = this.j;
        if (da2 != null) {
            da2.accept(lef.d());
        }
        this.i.dispose();
    }

    public void g(String str, PlayerState playerState) {
        com.spotify.voice.external.experience.domain.model.b b2 = com.spotify.voice.external.experience.domain.model.b.b(playerState.contextUri(), playerState.track().or((Optional<ContextTrack>) ContextTrack.builder("").build()));
        vcf vcf = new vcf(this);
        MobiusLoop.g<com.spotify.voice.external.experience.domain.model.b, lef> a2 = this.b.a(b2, str, this.e, playerState);
        this.k = a2;
        a2.c(vcf);
        this.k.start();
    }

    public /* synthetic */ h h(da2 da2) {
        this.j = da2;
        return new ydf(this);
    }

    public void j(ByteBuffer byteBuffer) {
        synchronized (this.a) {
            if (this.h) {
                i();
                this.d.onNext(byteBuffer);
                this.f.a(byteBuffer);
            } else {
                this.g.add(byteBuffer);
            }
        }
    }

    public void k(String str) {
        e();
        this.i = this.c.E().subscribe(new ucf(this, str));
    }

    public void l() {
        e();
    }
}
