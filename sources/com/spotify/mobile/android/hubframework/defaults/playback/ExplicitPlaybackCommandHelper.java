package com.spotify.mobile.android.hubframework.defaults.playback;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import io.reactivex.disposables.b;

public class ExplicitPlaybackCommandHelper {
    private final ExplicitContentFacade a;
    private boolean b;
    private b c;

    public ExplicitPlaybackCommandHelper(final ExplicitContentFacade explicitContentFacade, n nVar) {
        this.a = explicitContentFacade;
        nVar.A().a(new m() {
            /* class com.spotify.mobile.android.hubframework.defaults.playback.ExplicitPlaybackCommandHelper.AnonymousClass1 */

            @w(Lifecycle.Event.ON_START)
            public void onStart() {
                ExplicitPlaybackCommandHelper.this.c = explicitContentFacade.c().subscribe(new c(ExplicitPlaybackCommandHelper.this));
            }

            @w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                ExplicitPlaybackCommandHelper.this.c.dispose();
            }
        });
    }

    static void c(ExplicitPlaybackCommandHelper explicitPlaybackCommandHelper, boolean z) {
        explicitPlaybackCommandHelper.b = z;
    }

    public boolean d(boolean z) {
        return this.b && z;
    }

    public void e(String str, String str2) {
        this.a.e(str, str2);
    }
}
