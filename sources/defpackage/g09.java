package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: g09  reason: default package */
public final class g09 implements c09 {
    private final pnc a;
    private final q b;
    private final lbb c;
    private final y d;

    public g09(pnc pnc, q qVar, lbb lbb, y yVar) {
        h.e(pnc, "podcastPlayerStateProvider");
        h.e(qVar, "podcastPlayerStateUtil");
        h.e(lbb, "yourEpisodesFlags");
        h.e(yVar, "computationScheduler");
        this.a = pnc;
        this.b = qVar;
        this.c = lbb;
        this.d = yVar;
    }

    @Override // defpackage.c09
    public com.spotify.mobius.q<j> a(s<c> sVar) {
        h.e(sVar, "subscription");
        s<R> j0 = sVar.j0(e09.a);
        h.d(j0, "subscription.map { episo…on(episodesSub)\n        }");
        g<onc> a2 = this.a.a(this.d);
        s j02 = je.Z(a2, a2).j0(new f09(this));
        h.d(j02, "podcastPlayerStateProvid…          )\n            }");
        s<R> j03 = this.c.b().j0(d09.a);
        h.d(j03, "yourEpisodesFlags.isDown…loadAllEnabled)\n        }");
        com.spotify.mobius.q<j> a3 = i.a(j0, j02, j03);
        h.d(a3, "RxEventSources.fromObser…wnloadEnabled()\n        )");
        return a3;
    }
}
