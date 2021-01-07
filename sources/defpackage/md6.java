package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: md6  reason: default package */
public final /* synthetic */ class md6 implements g {
    public static final /* synthetic */ md6 a = new md6();

    private /* synthetic */ md6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "HomeMixAdapterItemListPresenter: Failed to auto play.", new Object[0]);
    }
}
