package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import defpackage.lp7;
import io.reactivex.functions.l;
import io.reactivex.y;

/* renamed from: tp7  reason: default package */
public final /* synthetic */ class tp7 implements l {
    public final /* synthetic */ RxWebToken a;
    public final /* synthetic */ y b;

    public /* synthetic */ tp7(RxWebToken rxWebToken, y yVar) {
        this.a = rxWebToken;
        this.b = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        RxWebToken rxWebToken = this.a;
        return rxWebToken.a(Uri.parse(((lp7.e) obj).a())).o0(this.b).j0(fq7.a).j0(op7.a);
    }
}
