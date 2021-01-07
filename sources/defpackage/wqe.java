package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.util.Assertion;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: wqe  reason: default package */
public final class wqe implements ere {
    private final gl0<u> a;
    private final bre b;
    private final Set<xqe> c;
    private final yqe d;

    wqe(gl0<u> gl0, Set<xqe> set, bre bre, yqe yqe) {
        this.a = gl0;
        this.c = set;
        this.b = bre;
        this.d = yqe;
    }

    @Override // defpackage.ere
    public void a(lqe<?, ?> lqe) {
        String str = this.b.get();
        if (lqe instanceof nqe) {
            nqe nqe = (nqe) lqe;
            for (xqe xqe : this.c) {
                xqe.a(nqe);
            }
            this.a.c(cre.h(nqe, str, this.d.get(), null));
        } else if (lqe instanceof mqe) {
            this.a.c(cre.e((mqe) lqe, str, this.d.get(), null));
        } else {
            Assertion.g(String.format("Unrecognized event type %s", lqe.getClass()));
        }
    }

    @Override // defpackage.ere
    public void b(lqe<?, ?> lqe) {
        String str = this.b.get();
        if (lqe instanceof nqe) {
            this.a.d(cre.g((nqe) lqe, str, this.d.get(), null));
        } else if (lqe instanceof mqe) {
            this.a.d(cre.d((mqe) lqe, str, this.d.get(), null));
        } else {
            Assertion.g(String.format("Unrecognized event type %s", lqe.getClass()));
        }
    }
}
