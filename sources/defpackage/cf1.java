package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: cf1  reason: default package */
public final /* synthetic */ class cf1 implements l {
    public final /* synthetic */ vg1 a;
    public final /* synthetic */ BrowserParams b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cf1(vg1 vg1, BrowserParams browserParams, boolean z) {
        this.a = vg1;
        this.b = browserParams;
        this.c = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, this.c, (HubsJsonViewModel) obj);
    }
}
