package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.functions.c;

/* renamed from: hf1  reason: default package */
public final /* synthetic */ class hf1 implements c {
    public final /* synthetic */ zg1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ BrowserParams d;

    public /* synthetic */ hf1(zg1 zg1, String str, l0 l0Var, BrowserParams browserParams) {
        this.a = zg1;
        this.b = str;
        this.c = l0Var;
        this.d = browserParams;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.d(this.b, this.c, this.d, (ArtistModel) obj, (Integer) obj2);
    }
}
