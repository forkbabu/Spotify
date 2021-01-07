package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wf6  reason: default package */
public final /* synthetic */ class wf6 implements g {
    public static final /* synthetic */ wf6 a = new wf6();

    private /* synthetic */ wf6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "InlinePlayButtonPresenter: Failed to play.", new Object[0]);
    }
}
