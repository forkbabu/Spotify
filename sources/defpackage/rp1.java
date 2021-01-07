package defpackage;

import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: rp1  reason: default package */
public final class rp1 implements qp1 {
    private final po1 a;

    /* renamed from: rp1$a */
    static final class a<T, R> implements l<RemainingSkips, Integer> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Integer apply(RemainingSkips remainingSkips) {
            RemainingSkips remainingSkips2 = remainingSkips;
            h.e(remainingSkips2, "it");
            return Integer.valueOf(remainingSkips2.getRemainingSkips());
        }
    }

    public rp1(po1 po1) {
        h.e(po1, "remainingSkipsEndpoint");
        this.a = po1;
    }

    @Override // defpackage.qp1
    public z<Integer> a() {
        z<R> A = this.a.a().A(a.a);
        h.d(A, "remainingSkipsEndpoint.r…  it.remainingSkips\n    }");
        return A;
    }
}
