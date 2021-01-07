package defpackage;

import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: do1  reason: default package */
final class do1<T, R> implements l<b, d.C0189d> {
    final /* synthetic */ c.b a;

    do1(c.b bVar) {
        this.a = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d.C0189d apply(b bVar) {
        b bVar2 = bVar;
        h.e(bVar2, "state");
        return new d.C0189d(bVar2, this.a.a());
    }
}
