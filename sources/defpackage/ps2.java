package defpackage;

import com.spotify.music.concat.d;
import com.spotify.music.concat.proto.ConcatCosmos$ConcatRequest;
import defpackage.js2;
import io.reactivex.functions.l;

/* renamed from: ps2  reason: default package */
public final /* synthetic */ class ps2 implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ ps2(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        js2.b bVar = (js2.b) obj;
        ConcatCosmos$ConcatRequest.a l = ConcatCosmos$ConcatRequest.l();
        l.m(bVar.a());
        l.n(bVar.b());
        return dVar.a((ConcatCosmos$ConcatRequest) l.build()).A(rs2.a);
    }
}
