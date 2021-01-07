package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.canvas.model.CanvasContentType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.w7;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.t;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.i;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.l;
import io.reactivex.p;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: hnd  reason: default package */
public class hnd implements qzc {
    private final g<PlayerState> a;
    private final pl2 b;
    private final w7 c;
    private final dod d;
    private final fnd e;
    private final y f;
    private final nl2 g;

    public hnd(g<PlayerState> gVar, pl2 pl2, w7 w7Var, dod dod, fnd fnd, y yVar, nl2 nl2) {
        this.a = gVar;
        this.b = pl2;
        this.c = w7Var;
        this.d = dod;
        this.e = fnd;
        this.f = yVar;
        this.g = nl2;
    }

    private static boolean c(CanvasContentType canvasContentType) {
        return canvasContentType == CanvasContentType.VIDEO || canvasContentType == CanvasContentType.VIDEO_LOOPING || canvasContentType == CanvasContentType.VIDEO_LOOPING_RANDOM;
    }

    private l<ContextTrack> d(r rVar) {
        return z.z(Boolean.valueOf(this.g.b() && this.c.b())).r(vmd.a).g(new ymd(this)).g(new and(this, rVar));
    }

    @Override // defpackage.qzc
    public l<t> a(r rVar, o8e o8e) {
        return z.z(Boolean.valueOf(o8e.b().contains(ShareCapability.VIDEO_STORY) && o8e.b().contains(ShareCapability.IMAGE_STORY))).r(zmd.a).g(new dnd(this, rVar)).g(new end(this, rVar)).s(15, TimeUnit.SECONDS).q(this.f);
    }

    @Override // defpackage.qzc
    public l<szc> b(r rVar) {
        return d(rVar).g(new xmd(this, rVar)).s(15, TimeUnit.SECONDS).q(this.f);
    }

    public p e(r rVar, ContextTrack contextTrack) {
        CanvasContentType b2 = this.b.b(contextTrack);
        String c2 = this.b.c(contextTrack);
        if (c(b2) && c2 != null) {
            return this.d.a(rVar, c2).O().m();
        }
        if (!(b2 == CanvasContentType.IMAGE) || c2 == null) {
            return b.a;
        }
        return this.e.b(rVar, c2).O().m();
    }

    public p f(r rVar, ContextTrack contextTrack) {
        CanvasContentType b2 = this.b.b(contextTrack);
        String c2 = this.b.c(contextTrack);
        if (c(b2) && c2 != null) {
            return this.d.b(rVar, c2).O().o(bnd.a);
        }
        if (!(b2 == CanvasContentType.IMAGE) || c2 == null) {
            return b.a;
        }
        return this.e.c(rVar, c2).O().o(tmd.a);
    }

    public p g(Boolean bool) {
        g<PlayerState> gVar = this.a;
        gVar.getClass();
        return new i(gVar, 0);
    }

    public ContextTrack h(PlayerState playerState, r rVar) {
        Optional<ContextTrack> track = playerState.track();
        if (!(track.isPresent() && rVar.g().equals(track.get().uri())) || !this.b.d(track.get())) {
            return null;
        }
        return track.get();
    }

    public /* synthetic */ p i(r rVar, Boolean bool) {
        return d(rVar);
    }
}
