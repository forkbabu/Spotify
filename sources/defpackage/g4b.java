package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.search.history.h;
import com.spotify.libs.search.history.p;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.g;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: g4b  reason: default package */
public class g4b implements n4b {
    private final p a;
    private final h b;
    private final qqa c;
    private final g<com.spotify.music.connection.g> d;
    private final y e;
    private final w f;

    public g4b(p pVar, h hVar, qqa qqa, y yVar, s<com.spotify.music.connection.g> sVar, w wVar) {
        this.a = pVar;
        this.b = hVar;
        this.c = qqa;
        this.e = yVar;
        this.d = sVar.Y0(BackpressureStrategy.LATEST);
        this.f = wVar;
    }

    public b91 a(List list, com.spotify.music.connection.g gVar, Map map) {
        Optional<b91> a2 = this.b.a(list, uxc.e(map));
        if (a2.isPresent()) {
            Logger.l("Search history is loaded with %d items", Integer.valueOf(list.size()));
            return a2.get();
        }
        Logger.l("Search history is empty", new Object[0]);
        qqa qqa = this.c;
        gVar.getClass();
        return qqa.a(gVar instanceof g.c, uxc.d(map));
    }

    @Override // defpackage.n4b
    public io.reactivex.g<b91> c() {
        return io.reactivex.g.j(this.a.b(), this.d, this.f.b().E().Y0(BackpressureStrategy.LATEST), new i2b(this)).q(100, TimeUnit.MILLISECONDS, this.e);
    }
}
