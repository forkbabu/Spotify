package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: if1  reason: default package */
public final /* synthetic */ class if1 implements l {
    public final /* synthetic */ bh1 a;
    public final /* synthetic */ BrowserParams b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ if1(bh1 bh1, BrowserParams browserParams, boolean z) {
        this.a = bh1;
        this.b = browserParams;
        this.c = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, (HubsJsonViewModel) obj);
    }
}
