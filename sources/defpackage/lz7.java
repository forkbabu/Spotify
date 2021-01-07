package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.display.e;
import io.reactivex.functions.n;

/* renamed from: lz7  reason: default package */
public final /* synthetic */ class lz7 implements n {
    public static final /* synthetic */ lz7 a = new lz7();

    private /* synthetic */ lz7() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return FormatType.BANNERS == ((e) obj).getFormat();
    }
}
