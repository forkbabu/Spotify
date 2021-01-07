package com.spotify.music.features.assistedcuration.search.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.disposables.b;
import io.reactivex.y;

public class RestrictedPlaybackCommandHelper {
    private final AgeRestrictedContentFacade a;
    private final y b;
    private boolean c;
    private b d;

    public RestrictedPlaybackCommandHelper(AgeRestrictedContentFacade ageRestrictedContentFacade, n nVar, y yVar) {
        this.a = ageRestrictedContentFacade;
        this.b = yVar;
        nVar.A().a(new m() {
            /* class com.spotify.music.features.assistedcuration.search.utils.RestrictedPlaybackCommandHelper.AnonymousClass1 */

            @w(Lifecycle.Event.ON_START)
            public void onStart() {
                RestrictedPlaybackCommandHelper restrictedPlaybackCommandHelper = RestrictedPlaybackCommandHelper.this;
                restrictedPlaybackCommandHelper.d = RestrictedPlaybackCommandHelper.c(restrictedPlaybackCommandHelper);
            }

            @w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                RestrictedPlaybackCommandHelper.this.d.dispose();
            }
        });
    }

    static b c(RestrictedPlaybackCommandHelper restrictedPlaybackCommandHelper) {
        return restrictedPlaybackCommandHelper.a.c().I0(restrictedPlaybackCommandHelper.b).subscribe(new a(restrictedPlaybackCommandHelper), b.a);
    }

    public static void d(RestrictedPlaybackCommandHelper restrictedPlaybackCommandHelper, boolean z) {
        restrictedPlaybackCommandHelper.c = z;
    }

    public boolean e(boolean z) {
        return this.c && z;
    }

    public void f(String str) {
        this.a.d(str, null);
    }
}
