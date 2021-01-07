package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: df1  reason: default package */
public final /* synthetic */ class df1 implements l {
    public final /* synthetic */ vg1 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ BrowserParams c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ df1(vg1 vg1, Map map, BrowserParams browserParams, boolean z) {
        this.a = vg1;
        this.b = map;
        this.c = browserParams;
        this.f = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, this.f, (Map) obj);
    }
}
