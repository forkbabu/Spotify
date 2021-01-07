package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: xf1  reason: default package */
public final /* synthetic */ class xf1 implements l {
    public final /* synthetic */ xh1 a;
    public final /* synthetic */ BrowserParams b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xf1(xh1 xh1, BrowserParams browserParams, boolean z) {
        this.a = xh1;
        this.b = browserParams;
        this.c = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (RecentlyPlayedItems) obj);
    }
}
