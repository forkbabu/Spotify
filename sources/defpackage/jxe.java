package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.voice.m;
import defpackage.uue;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

/* renamed from: jxe  reason: default package */
public final /* synthetic */ class jxe implements l {
    public final /* synthetic */ gze a;

    public /* synthetic */ jxe(gze gze) {
        this.a = gze;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a aVar;
        gze gze = this.a;
        ((uue.b) obj).getClass();
        m mVar = (m) gze;
        mVar.getClass();
        if (MoreObjects.isNullOrEmpty(null)) {
            aVar = b.a;
        } else {
            aVar = a.u(new com.spotify.music.features.voice.a(mVar, null));
        }
        return aVar.N();
    }
}
