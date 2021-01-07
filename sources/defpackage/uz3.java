package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: uz3  reason: default package */
public final /* synthetic */ class uz3 implements g {
    public final /* synthetic */ g04 a;

    public /* synthetic */ uz3(g04 g04) {
        this.a = g04;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((d04) this.a).d();
        Logger.e((Throwable) obj, "Failed to load album page", new Object[0]);
    }
}
