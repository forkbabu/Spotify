package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: mf1  reason: default package */
public final /* synthetic */ class mf1 implements l {
    public final /* synthetic */ fh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ mf1(fh1 fh1, BrowserParams browserParams) {
        this.a = fh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (List) obj);
    }
}
