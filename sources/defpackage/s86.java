package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: s86  reason: default package */
public final /* synthetic */ class s86 implements g {
    public static final /* synthetic */ s86 a = new s86();

    private /* synthetic */ s86() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "FilterAndSortPresenter failed to restore filtering and sorting", new Object[0]);
    }
}
