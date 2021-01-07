package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: vi9  reason: default package */
public final /* synthetic */ class vi9 implements g {
    public static final /* synthetic */ vi9 a = new vi9();

    private /* synthetic */ vi9() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.d("Error subscribing to page identifier.", new Object[0]);
    }
}
