package defpackage;

import com.spotify.share.sharedata.r;
import io.reactivex.functions.l;

/* renamed from: dnd  reason: default package */
public final /* synthetic */ class dnd implements l {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ r b;

    public /* synthetic */ dnd(hnd hnd, r rVar) {
        this.a = hnd;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i(this.b, (Boolean) obj);
    }
}
