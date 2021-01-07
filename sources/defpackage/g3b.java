package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.search.offline.model.OfflineResults;
import io.reactivex.functions.c;

/* renamed from: g3b  reason: default package */
class g3b implements c<d7b<b91>, d7b<OfflineResults>, b91> {
    private final qqa a;
    private final sg0<OfflineResults, b91> b;

    g3b(qqa qqa, sg0<OfflineResults, b91> sg0) {
        this.a = qqa;
        this.b = sg0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(d7b<b91> d7b, d7b<OfflineResults> d7b2) {
        d7b<b91> d7b3 = d7b;
        d7b<OfflineResults> d7b4 = d7b2;
        sg0<OfflineResults, b91> sg0 = this.b;
        qqa qqa = this.a;
        boolean z = d7b3.i().isPresent() || d7b3.b().isPresent();
        boolean isPresent = d7b4.i().isPresent();
        if (!z) {
            if (isPresent) {
                return sg0.apply(d7b4.i().get());
            }
            return qqa.d(d7b4.g(), Optional.absent());
        } else if (d7b3.b().isPresent()) {
            return qqa.d(d7b3.g(), Optional.fromNullable(d7b3.h()));
        } else {
            b91 b91 = d7b3.i().get();
            b91.getClass();
            b91 b912 = b91;
            return b912.toBuilder().h(b912.custom().toBuilder().b("isOnlineResults", true).d()).g();
        }
    }
}
