package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: ff1  reason: default package */
public final /* synthetic */ class ff1 implements l {
    public final /* synthetic */ xg1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ ff1(xg1 xg1, BrowserParams browserParams) {
        this.a = xg1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Boolean) obj);
    }
}
