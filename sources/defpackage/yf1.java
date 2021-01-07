package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;

/* renamed from: yf1  reason: default package */
public final /* synthetic */ class yf1 implements l {
    public final /* synthetic */ zh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ yf1(zh1 zh1, BrowserParams browserParams) {
        this.a = zh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zh1 zh1 = this.a;
        BrowserParams browserParams = this.b;
        zh1.getClass();
        return s.i0((List) obj).Z(ag1.a).W(new eg1(zh1, browserParams), false, Integer.MAX_VALUE).Z0().A(cg1.a);
    }
}
