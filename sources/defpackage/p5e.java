package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.t;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: p5e  reason: default package */
final class p5e<T, R> implements l<Boolean, e> {
    final /* synthetic */ r5e a;
    final /* synthetic */ Activity b;
    final /* synthetic */ t c;

    p5e(r5e r5e, Activity activity, t tVar) {
        this.a = r5e;
        this.b = activity;
        this.c = tVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(Boolean bool) {
        h.e(bool, "it");
        r5e r5e = this.a;
        Activity activity = this.b;
        t tVar = this.c;
        if (tVar != null) {
            r5e.getClass();
            a m = a.m(new m5e(r5e, activity, (p) tVar));
            h.d(m, "Completable.create { emi…)\n            }\n        }");
            return m.p(new o5e(this));
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.share.sharedata.ImageShareData");
    }
}
