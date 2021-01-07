package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: hj1  reason: default package */
public final /* synthetic */ class hj1 implements l {
    public final /* synthetic */ tj1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ hj1(tj1 tj1, BrowserParams browserParams) {
        this.a = tj1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (String) obj);
    }
}
