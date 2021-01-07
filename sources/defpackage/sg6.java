package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sg6  reason: default package */
public final /* synthetic */ class sg6 implements g {
    public static final /* synthetic */ sg6 a = new sg6();

    private /* synthetic */ sg6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "ItemListInteractor failed to play.", new Object[0]);
    }
}
