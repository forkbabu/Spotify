package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ida  reason: default package */
public final /* synthetic */ class ida implements g {
    public static final /* synthetic */ ida a = new ida();

    private /* synthetic */ ida() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("M2M volume updated remotely: %.2f", (Float) obj);
    }
}
