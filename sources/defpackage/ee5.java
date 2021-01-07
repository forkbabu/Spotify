package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.spoton.exceptions.SpotOnPlaybackException;
import com.spotify.music.genie.GenieException;
import io.reactivex.functions.n;

/* renamed from: ee5  reason: default package */
public final /* synthetic */ class ee5 implements n {
    public static final /* synthetic */ ee5 a = new ee5();

    private /* synthetic */ ee5() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof GenieException) {
            Logger.e(th, "Go: Genie failed to grant wish", new Object[0]);
            return true;
        } else if (th instanceof SpotOnPlaybackException) {
            Logger.e(th, "Go: SpotOn playback failed", new Object[0]);
            return true;
        } else {
            Logger.e(th, "Go: Error occurred while trying to play music", new Object[0]);
            return true;
        }
    }
}
