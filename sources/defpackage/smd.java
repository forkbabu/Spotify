package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.c;

/* renamed from: smd  reason: default package */
public final /* synthetic */ class smd implements c {
    public final /* synthetic */ r a;

    public /* synthetic */ smd(r rVar) {
        this.a = rVar;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return q.k(this.a, (Bitmap) obj, Optional.of(((h1d) obj2).b()));
    }
}
