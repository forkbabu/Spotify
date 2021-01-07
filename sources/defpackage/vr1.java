package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: vr1  reason: default package */
public final /* synthetic */ class vr1 implements g {
    public static final /* synthetic */ vr1 a = new vr1();

    private /* synthetic */ vr1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ps1.l;
        Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
    }
}
