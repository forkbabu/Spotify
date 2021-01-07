package defpackage;

import com.spotify.music.features.premiumdestination.domain.ErrorReason;
import com.spotify.music.features.premiumdestination.domain.k;
import io.reactivex.functions.l;

/* renamed from: xh7  reason: default package */
public final /* synthetic */ class xh7 implements l {
    public static final /* synthetic */ xh7 a = new xh7();

    private /* synthetic */ xh7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return k.a(ErrorReason.SERVER_FAILURE);
    }
}
