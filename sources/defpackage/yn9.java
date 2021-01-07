package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: yn9  reason: default package */
public final /* synthetic */ class yn9 implements l {
    public final /* synthetic */ co9 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ yn9(co9 co9, BrowserParams browserParams) {
        this.a = co9;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (List) obj);
    }
}
