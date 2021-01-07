package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.c;

/* renamed from: rf1  reason: default package */
public final /* synthetic */ class rf1 implements c {
    public final /* synthetic */ nh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ rf1(nh1 nh1, BrowserParams browserParams) {
        this.a = nh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.c(this.b, (String) obj, (ni0) obj2);
    }
}
