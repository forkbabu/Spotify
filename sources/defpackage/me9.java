package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.m;
import defpackage.fe9;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: me9  reason: default package */
public final /* synthetic */ class me9 implements l {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ye9 c;

    public /* synthetic */ me9(m mVar, String str, ye9 ye9) {
        this.a = mVar;
        this.b = str;
        this.c = ye9;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        m mVar = this.a;
        String str = this.b;
        fe9.a aVar = (fe9.a) obj;
        return s.b1(s.b1(s.i0(aVar.b()).j0(new qe9(mVar, aVar.a()))).q(new ue9(this.c, str, aVar.a())).j0(ve9.a)).j0(xe9.a);
    }
}
