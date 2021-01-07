package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: og6  reason: default package */
public final /* synthetic */ class og6 implements g {
    public static final /* synthetic */ og6 a = new og6();

    private /* synthetic */ og6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "ItemListInteractor::onItemBanClicked failed to skip playing item.", new Object[0]);
    }
}
