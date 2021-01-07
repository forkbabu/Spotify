package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.functions.l;

/* renamed from: eg1  reason: default package */
public final /* synthetic */ class eg1 implements l {
    public final /* synthetic */ zh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ eg1(zh1 zh1, BrowserParams browserParams) {
        this.a = zh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (MediaBrowserItem) obj);
    }
}
