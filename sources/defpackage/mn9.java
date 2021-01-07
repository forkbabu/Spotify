package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.w1;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.l;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: mn9  reason: default package */
public class mn9 {
    private final w1 a;
    private final g<PlayerState> b;
    private final lm9 c;
    private final y d;

    /* renamed from: mn9$b */
    public static class b {
        private final lm9 a;
        private final y b;
        private final g<PlayerState> c;

        public b(lm9 lm9, y yVar, g<PlayerState> gVar) {
            this.a = lm9;
            this.b = yVar;
            this.c = gVar;
        }

        public mn9 a(w1 w1Var) {
            return new mn9(w1Var, this.c, this.a, this.b, null);
        }
    }

    mn9(w1 w1Var, g gVar, lm9 lm9, y yVar, a aVar) {
        this.a = w1Var;
        this.b = gVar;
        this.c = lm9;
        this.d = yVar;
    }

    public l<mm9> a() {
        BrowserParams.a b2 = BrowserParams.b("genie:space", true);
        b2.b("headphones");
        return this.a.a(b2.build(), null, 0, 20).E(hn9.a).r(in9.a).g(new jn9(this)).b(this.c);
    }

    public p b(List list) {
        return this.b.k0(5, TimeUnit.SECONDS, this.d).E().A(ln9.a).A(gn9.a).F((R) Optional.absent()).u(new kn9(this, list));
    }
}
