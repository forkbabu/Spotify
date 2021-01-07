package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ou6  reason: default package */
public final /* synthetic */ class ou6 implements g {
    public static final /* synthetic */ ou6 a = new ou6();

    private /* synthetic */ ou6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "InviteFriendsAction: Failed to set collaborative state.", new Object[0]);
    }
}
