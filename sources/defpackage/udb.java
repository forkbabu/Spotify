package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import com.spotify.music.lyrics.fullscreen.LyricsFullscreenFragment;
import kotlin.jvm.internal.h;

/* renamed from: udb  reason: default package */
public final class udb {
    private final o a;

    public udb(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    public final boolean a() {
        return this.a.U(LyricsFullscreenFragment.class.getSimpleName()) != null;
    }

    public final void b(Bundle bundle) {
        h.e(bundle, "bundle");
        if (!this.a.o0()) {
            LyricsFullscreenFragment lyricsFullscreenFragment = new LyricsFullscreenFragment();
            lyricsFullscreenFragment.r4(bundle);
            lyricsFullscreenFragment.Y4(this.a, LyricsFullscreenFragment.class.getSimpleName());
        }
    }
}
