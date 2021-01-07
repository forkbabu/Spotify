package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: lf1  reason: default package */
public final /* synthetic */ class lf1 implements l {
    public final /* synthetic */ dh1 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ BrowserParams c;

    public /* synthetic */ lf1(dh1 dh1, Map map, BrowserParams browserParams) {
        this.a = dh1;
        this.b = map;
        this.c = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, (Map) obj);
    }
}
