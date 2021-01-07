package defpackage;

import com.spotify.music.C0707R;
import com.spotify.share.sharedata.t;
import defpackage.h2d;
import defpackage.v2d;
import io.reactivex.d0;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: w2d  reason: default package */
final class w2d<T, R> implements l<t, d0<? extends String>> {
    final /* synthetic */ v2d.b a;
    final /* synthetic */ h2d.d b;

    w2d(v2d.b bVar, h2d.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends String> apply(t tVar) {
        t tVar2 = tVar;
        h.e(tVar2, "shareData");
        return this.a.a.c.a(this.a.a.a, this.b.c(), tVar2, this.b.d().a(), this.b.d().b(), this.a.a.a.getString(C0707R.string.integration_id_context_menu));
    }
}
