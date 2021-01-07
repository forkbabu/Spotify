package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.g;
import java.util.List;

/* renamed from: ef1  reason: default package */
public final /* synthetic */ class ef1 implements g {
    public final /* synthetic */ vg1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ ef1(vg1 vg1, BrowserParams browserParams) {
        this.a = vg1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (List) obj);
    }
}
