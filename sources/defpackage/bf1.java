package defpackage;

import com.spotify.libs.album.AlbumRelease;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

/* renamed from: bf1  reason: default package */
public final /* synthetic */ class bf1 implements l {
    public final /* synthetic */ tg1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BrowserParams c;

    public /* synthetic */ bf1(tg1 tg1, String str, BrowserParams browserParams) {
        this.a = tg1;
        this.b = str;
        this.c = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (AlbumRelease) obj);
    }
}
