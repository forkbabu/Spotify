package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: b17  reason: default package */
public final /* synthetic */ class b17 implements g {
    public static final /* synthetic */ b17 a = new b17();

    private /* synthetic */ b17() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "MoreLikeThisPresenter failed to load playlist data", new Object[0]);
    }
}
