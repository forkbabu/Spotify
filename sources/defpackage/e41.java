package defpackage;

import com.spotify.mobile.android.audioplayer.domain.d;
import com.spotify.mobile.android.audioplayer.domain.g;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: e41  reason: default package */
public final class e41<T, R> implements l<g, d> {
    final /* synthetic */ cqe a;

    e41(cqe cqe) {
        this.a = cqe;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d apply(g gVar) {
        g gVar2 = gVar;
        h.e(gVar2, "command");
        return new d.c(gVar2, this.a.b());
    }
}
