package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.podcastinteractivity.qna.datasource.i;
import defpackage.uuc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.HttpException;

/* renamed from: tuc  reason: default package */
final class tuc<T, R> implements l<Throwable, xtc> {
    final /* synthetic */ uuc.a a;

    tuc(uuc.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
        if (!(th2 instanceof HttpException) || ((HttpException) th2).a() != 403) {
            this.a.a.b.c(i.d.a);
        } else {
            this.a.a.b.c(i.e.a);
        }
        return new xtc.d(null, 1);
    }
}
