package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: uf1  reason: default package */
public final /* synthetic */ class uf1 implements l {
    public final /* synthetic */ th1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ uf1(th1 th1, BrowserParams browserParams) {
        this.a = th1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (qyd) obj);
    }
}
