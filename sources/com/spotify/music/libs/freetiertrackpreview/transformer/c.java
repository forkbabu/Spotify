package com.spotify.music.libs.freetiertrackpreview.transformer;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class c implements w<b91, b91> {

    static final class a<T, R> implements l<b91, b91> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "hubsViewModel");
            this.a.getClass();
            List<? extends s81> body = b912.body();
            ArrayList arrayList = new ArrayList(d.e(body, 10));
            for (T t : body) {
                if (je.C(t, "entity:trackPreviewRow")) {
                    t = t.toBuilder().o("consumerMobile:trackPreviewRowAlbum", t.componentId().category()).l();
                }
                arrayList.add(t);
            }
            return je.L(b912, arrayList);
        }
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s<R> j0 = sVar.j0(new a(this));
        h.d(j0, "upstream\n            .ma…viewRows(hubsViewModel) }");
        return j0;
    }
}
