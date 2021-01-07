package com.spotify.music.features.settings.soundeffects;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.spotify.glue.dialogs.f;
import com.spotify.mobile.android.service.p;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.C0707R;
import com.spotify.music.z0;

public class SoundEffectsWarningActivity extends ss2 {
    public static final SpSharedPreferences.b<Object, Boolean> L = SpSharedPreferences.b.e("sound_effect_dialog_disabled");
    i G;
    z0 H;
    String I;
    String J;
    final f K = new a();

    class a implements f {
        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends ResultReceiver {
        final /* synthetic */ c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Handler handler, c cVar) {
            super(handler);
            this.a = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
            intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
            intent.putExtra("android.media.extra.AUDIO_SESSION", bundle.getInt("audio_session_id"));
            this.a.startActivityForResult(intent, 0);
        }
    }

    public interface c {
        z0 a();

        String b();

        ComponentName c(Intent intent);

        String d();

        Context getContext();

        void startActivityForResult(Intent intent, int i);
    }

    public static void U0(c cVar) {
        b bVar = new b(new Handler(), cVar);
        Intent c2 = new p(cVar.a(), cVar.b(), cVar.d()).c(cVar.getContext(), "com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION");
        c2.putExtra("callback", bVar);
        cVar.c(c2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f fVar = this.K;
        c cVar = new c();
        cVar.g(getString(C0707R.string.dialog_sound_effects_title));
        cVar.e(getString(C0707R.string.dialog_sound_effects_message));
        cVar.f(getString(C0707R.string.dialog_generic_dont_show_again));
        f fVar2 = new f(this, cVar);
        fVar2.f(getString(C0707R.string.two_button_dialog_button_ok), new a(fVar, cVar));
        fVar2.a(true);
        fVar2.h(new b(fVar));
        fVar2.b().a();
    }
}
