package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.j;
import com.spotify.podcastinteractivity.qna.model.proto.ResponseRequest;
import defpackage.wtc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: uuc  reason: default package */
final class uuc<Upstream, Downstream> implements w<wtc.h, xtc> {
    final /* synthetic */ jvc a;
    final /* synthetic */ j b;

    /* renamed from: uuc$a */
    static final class a<T, R> implements l<wtc.h, v<? extends xtc>> {
        final /* synthetic */ uuc a;

        a(uuc uuc) {
            this.a = uuc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends xtc> apply(wtc.h hVar) {
            wtc.h hVar2 = hVar;
            h.e(hVar2, "it");
            ResponseRequest.b i = ResponseRequest.i();
            i.m(hVar2.b());
            ResponseRequest responseRequest = (ResponseRequest) i.build();
            jvc jvc = this.a.a;
            String a2 = hVar2.a();
            h.d(responseRequest, "responseRequest");
            return jvc.a(a2, responseRequest).o(new quc(this)).k(new ruc(this)).A(new suc(this)).E(new tuc(this)).P();
        }
    }

    uuc(jvc jvc, j jVar) {
        this.a = jvc;
        this.b = jVar;
    }

    @Override // io.reactivex.w
    public final v<xtc> apply(s<wtc.h> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
