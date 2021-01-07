package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ms6  reason: default package */
public final /* synthetic */ class ms6 implements g {
    public static final /* synthetic */ ms6 a = new ms6();

    private /* synthetic */ ms6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "SponsoredSectionPresenter failed to load playlist data", new Object[0]);
    }
}
