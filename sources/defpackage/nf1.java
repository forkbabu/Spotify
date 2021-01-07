package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.music.libs.collection.model.c;
import io.reactivex.functions.l;

/* renamed from: nf1  reason: default package */
public final /* synthetic */ class nf1 implements l {
    public final /* synthetic */ hh1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BrowserParams c;

    public /* synthetic */ nf1(hh1 hh1, String str, BrowserParams browserParams) {
        this.a = hh1;
        this.b = str;
        this.c = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (c) obj);
    }
}
