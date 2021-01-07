package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ot6  reason: default package */
public final /* synthetic */ class ot6 implements g {
    public static final /* synthetic */ ot6 a = new ot6();

    private /* synthetic */ ot6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistToolbarMenuDelegate failed to observe show or hide toolbar.", new Object[0]);
    }
}
