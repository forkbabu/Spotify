package com.spotify.music.features.spoton.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.C0707R;
import com.spotify.music.features.spoton.SpotOnAction;
import com.spotify.music.features.spoton.SpotOnPlaybackManager;
import com.spotify.music.features.spoton.o;
import com.spotify.music.features.spoton.q;
import com.spotify.remoteconfig.AndroidFeatureSpotonProperties;
import dagger.android.g;
import defpackage.yda;
import io.reactivex.disposables.a;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.y;

public class SpotOnService extends g {
    private static final String v = SpotOnService.class.getSimpleName();
    public static final /* synthetic */ int w = 0;
    ul1 a;
    q b;
    h2e c;
    y f;
    o n;
    AndroidFeatureSpotonProperties o;
    Context p;
    yk8 q;
    uk8 r;
    cte s;
    private boolean t;
    private final a u = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.u.dispose();
        this.t = false;
        this.a.f(this, v);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        PendingIntent pendingIntent;
        SpotOnPlaybackManager.OnboardingMode onboardingMode;
        SpotOnPlaybackManager.TtsMode ttsMode;
        ul1 ul1 = this.a;
        String str2 = v;
        if (!ul1.c(str2)) {
            this.a.e(this, str2);
        }
        this.c.a(intent);
        if (!this.o.a()) {
            stopSelf();
            return 2;
        }
        if (!this.t) {
            this.a.g(str2, getString(C0707R.string.spot_on_notification_is_connecting));
            this.t = true;
            SpotOnAction spotOnAction = null;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getStringExtra("client-id");
            }
            if (intent == null) {
                pendingIntent = null;
            } else {
                pendingIntent = (PendingIntent) intent.getParcelableExtra("pending-intent");
            }
            if (intent != null) {
                spotOnAction = (SpotOnAction) intent.getSerializableExtra("action");
            }
            if (!this.n.a(pendingIntent) || spotOnAction == null || str == null) {
                stopSelf();
            } else {
                String stringExtra = intent.getStringExtra("brand");
                String stringExtra2 = intent.getStringExtra("model");
                String stringExtra3 = intent.getStringExtra("version");
                String stringExtra4 = intent.getStringExtra("device-name");
                yda.b bVar = new yda.b("SpotOn");
                bVar.s("bluetooth");
                bVar.l("headphones");
                bVar.m(str);
                bVar.n(stringExtra);
                bVar.o(stringExtra2);
                bVar.t(stringExtra3);
                bVar.p(stringExtra4);
                bVar.q("spot_on");
                yda k = bVar.k();
                q qVar = this.b;
                ifd ifd = kfd.o1;
                Context context = this.p;
                uk8 uk8 = this.r;
                cte cte = this.s;
                yk8 yk8 = this.q;
                int ordinal = this.o.b().ordinal();
                if (ordinal == 1) {
                    onboardingMode = SpotOnPlaybackManager.OnboardingMode.ONCE;
                } else if (ordinal != 2) {
                    onboardingMode = SpotOnPlaybackManager.OnboardingMode.NONE;
                } else {
                    onboardingMode = SpotOnPlaybackManager.OnboardingMode.THREE_TIMES;
                }
                int ordinal2 = this.o.c().ordinal();
                if (ordinal2 == 1) {
                    ttsMode = SpotOnPlaybackManager.TtsMode.TTS_PLAY_PLAYLIST;
                } else if (ordinal2 != 2) {
                    ttsMode = SpotOnPlaybackManager.TtsMode.NONE;
                } else {
                    ttsMode = SpotOnPlaybackManager.TtsMode.TTS_PLAYLIST;
                }
                SpotOnPlaybackManager b2 = qVar.b(ifd, context, uk8, cte, yk8, onboardingMode, ttsMode);
                this.u.b(new CompletableDoFinally(b2.m(k).d(io.reactivex.a.n(new c(b2, spotOnAction))).A(this.f), new a(this, b2)).subscribe(b.a));
            }
        }
        return 2;
    }
}
