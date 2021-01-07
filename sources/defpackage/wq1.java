package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.g;

/* renamed from: wq1  reason: default package */
public final /* synthetic */ class wq1 implements g {
    public final /* synthetic */ as1 a;

    public /* synthetic */ wq1(as1 as1) {
        this.a = as1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        as1.k(this.a, (AppProtocol.Context) obj);
    }
}
