package defpackage;

import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import io.reactivex.s;
import io.reactivex.w;

/* renamed from: tbf  reason: default package */
public final /* synthetic */ class tbf implements w {
    public final /* synthetic */ p a;
    public final /* synthetic */ v b;

    public /* synthetic */ tbf(p pVar, v vVar) {
        this.a = pVar;
        this.b = vVar;
    }

    @Override // io.reactivex.w
    public final io.reactivex.v apply(s sVar) {
        return sVar.J0(new icf(this.a, this.b));
    }
}
