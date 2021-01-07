package com.spotify.music.spotlets.radio.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.d0;
import dagger.android.g;

public class RadioActionsService extends g {
    private static final String t = RadioActionsService.class.getSimpleName();
    public static final /* synthetic */ int u = 0;
    private final a a = new a();
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    d0 c;
    yn1 f;
    v n;
    private boolean o;
    private final io.reactivex.functions.g<Throwable> p = w.a;
    private final io.reactivex.functions.g<SessionState> q = new v(this);
    private final io.reactivex.functions.g<Throwable> r = t.a;
    private final io.reactivex.functions.g<c> s = new u(this);

    public class a extends Binder {
        public a() {
        }
    }

    public /* synthetic */ void f(SessionState sessionState) {
        boolean z = sessionState.connected() && !sessionState.loggingOut();
        if (z != this.o) {
            this.o = z;
            if (z) {
                this.c.a();
                return;
            }
            this.c.c();
            stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b.b(this.f.a().subscribe(this.q, this.p));
        this.b.b(this.n.b().subscribe(this.s, this.r));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c.b();
        this.b.f();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ifd ifd = kfd.a1;
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.GET_ALL_STATIONS".equals(action)) {
            this.c.o();
            return 2;
        } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION".equals(action)) {
            String[] stringArrayExtra = intent.getStringArrayExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds");
            com.spotify.music.libs.viewuri.c cVar = (com.spotify.music.libs.viewuri.c) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri");
            if (cVar == null) {
                cVar = ViewUris.c;
            }
            intent.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", false);
            boolean booleanExtra = intent.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.createStation", true);
            int intExtra = intent.getIntExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", -1);
            long longExtra = intent.getLongExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", -1);
            ifd ifd2 = (ifd) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier");
            if (ifd2 != null) {
                ifd = ifd2;
            }
            yn0 yn0 = (yn0) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
            if (yn0 == null) {
                yn0 = bu9.v;
            }
            this.c.n(stringArrayExtra, booleanExtra, intExtra, longExtra, intent.getStringArrayExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.trackUrisToFilter"), new d0.a(cVar, ifd, yn0));
            return 2;
        } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY".equals(action)) {
            RadioStationModel radioStationModel = (RadioStationModel) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station");
            com.spotify.music.libs.viewuri.c cVar2 = (com.spotify.music.libs.viewuri.c) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri");
            if (cVar2 == null) {
                cVar2 = ViewUris.c;
            }
            int intExtra2 = intent.getIntExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", -1);
            long longExtra2 = intent.getLongExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", -1);
            ifd ifd3 = (ifd) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier");
            if (ifd3 != null) {
                ifd = ifd3;
            }
            yn0 yn02 = (yn0) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
            if (yn02 == null) {
                yn02 = bu9.v;
            }
            this.c.m(radioStationModel, intExtra2, longExtra2, intent.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.createStation", true), intent.getStringArrayExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.trackUrisToFilter"), new d0.a(cVar2, ifd, yn02));
            return 2;
        } else if (MoreObjects.isNullOrEmpty(action)) {
            return 2;
        } else {
            throw new IllegalArgumentException(je.x0("RadioActionsService does not know the action ", action));
        }
    }
}
