package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: le9  reason: default package */
public final /* synthetic */ class le9 implements w {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ye9 c;

    public /* synthetic */ le9(m mVar, String str, ye9 ye9) {
        this.a = mVar;
        this.b = str;
        this.c = ye9;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new me9(this.a, this.b, this.c));
    }
}
