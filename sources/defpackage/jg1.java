package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.music.libs.collection.model.d;
import io.reactivex.functions.l;

/* renamed from: jg1  reason: default package */
public final /* synthetic */ class jg1 implements l {
    public final /* synthetic */ qi1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BrowserParams c;

    public /* synthetic */ jg1(qi1 qi1, boolean z, BrowserParams browserParams) {
        this.a = qi1;
        this.b = z;
        this.c = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (d) obj);
    }
}
