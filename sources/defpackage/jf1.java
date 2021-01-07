package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: jf1  reason: default package */
public final /* synthetic */ class jf1 implements l {
    public final /* synthetic */ bh1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ BrowserParams f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ jf1(bh1 bh1, String str, Map map, BrowserParams browserParams, boolean z) {
        this.a = bh1;
        this.b = str;
        this.c = map;
        this.f = browserParams;
        this.n = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, this.f, this.n, (Map) obj);
    }
}
