package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.playlist.models.f;
import io.reactivex.functions.c;

/* renamed from: og1  reason: default package */
public final /* synthetic */ class og1 implements c {
    public final /* synthetic */ yi1 a;
    public final /* synthetic */ BrowserParams b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Optional d;

    public /* synthetic */ og1(yi1 yi1, BrowserParams browserParams, boolean z, Optional optional) {
        this.a = yi1;
        this.b = browserParams;
        this.c = z;
        this.d = optional;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.c(this.b, this.c, this.d, (f) obj, (String) obj2);
    }
}
