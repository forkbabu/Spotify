package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: of1  reason: default package */
public final /* synthetic */ class of1 implements l {
    public final /* synthetic */ jh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ of1(jh1 jh1, BrowserParams browserParams) {
        this.a = jh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (List) obj);
    }
}
