package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: fg1  reason: default package */
public final /* synthetic */ class fg1 implements l {
    public final /* synthetic */ bi1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ fg1(bi1 bi1, BrowserParams browserParams) {
        this.a = bi1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (u3) obj);
    }
}
