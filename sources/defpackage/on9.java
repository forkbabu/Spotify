package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: on9  reason: default package */
public final /* synthetic */ class on9 implements l {
    public final /* synthetic */ rn9 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ on9(rn9 rn9, BrowserParams browserParams) {
        this.a = rn9;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (List) obj);
    }
}
