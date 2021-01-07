package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: ig1  reason: default package */
public final /* synthetic */ class ig1 implements l {
    public final /* synthetic */ mi1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ ig1(mi1 mi1, BrowserParams browserParams) {
        this.a = mi1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (u3) obj);
    }
}
