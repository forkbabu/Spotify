package com.spotify.music.libs.freetiertrackpreview.transformer;

import com.spotify.music.preview.v;
import com.spotify.music.preview.z;
import io.reactivex.functions.c;
import io.reactivex.s;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e implements w<b91, b91> {
    private final v a;

    static final class a<T1, T2, R> implements c<b91, z, b91> {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public b91 a(b91 b91, z zVar) {
            b91 b912 = b91;
            z zVar2 = zVar;
            h.e(b912, "hubsViewModel");
            h.e(zVar2, "playerState");
            this.a.getClass();
            String g = zVar2.g();
            List<? extends s81> body = b912.body();
            ArrayList arrayList = new ArrayList(d.e(body, 10));
            for (T t : body) {
                if ((je.C(t, "consumerMobile:trackPreviewRowArtist") || je.C(t, "consumerMobile:trackPreviewRowAlbum")) && h.a(g, t.metadata().string("preview_id", ""))) {
                    t = t.toBuilder().k("is_currently_playing", Boolean.valueOf(zVar2.e())).l();
                }
                arrayList.add(t);
            }
            return je.L(b912, arrayList);
        }
    }

    public e(v vVar) {
        h.e(vVar, "previewPlayer");
        this.a = vVar;
    }

    @Override // io.reactivex.w
    public io.reactivex.v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s n = s.n(sVar, this.a.g(), new a(this));
        h.d(n, "Observable.combineLatest…)\n            }\n        )");
        return n;
    }
}
