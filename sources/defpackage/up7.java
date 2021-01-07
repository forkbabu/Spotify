package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: up7  reason: default package */
public final /* synthetic */ class up7 implements w {
    public final /* synthetic */ RxWebToken a;
    public final /* synthetic */ y b;

    public /* synthetic */ up7(RxWebToken rxWebToken, y yVar) {
        this.a = rxWebToken;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new tp7(this.a, this.b));
    }
}
