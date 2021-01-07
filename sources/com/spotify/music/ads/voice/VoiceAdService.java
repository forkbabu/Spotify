package com.spotify.music.ads.voice;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.k;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.container.app.foregroundstate.h;
import com.spotify.music.features.ads.model.Ad;
import dagger.android.g;
import java.util.Iterator;
import java.util.Set;

public class VoiceAdService extends g {
    f a;
    cqe b;
    kv3 c;
    gl0<u> f;
    h n;
    private final a o = new a();
    private Ad p;

    public class a extends Binder {
        public a() {
        }

        public VoiceAdService a() {
            return VoiceAdService.this;
        }
    }

    private void f(String str, Ad ad) {
        yda yda;
        Set<yda> c2 = this.c.c();
        Iterator<yda> it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                yda = null;
                break;
            }
            yda = it.next();
            if ("bluetooth".equalsIgnoreCase(yda.i())) {
                break;
            }
        }
        if (yda == null && !c2.isEmpty()) {
            yda = c2.iterator().next();
        }
        VoiceAdLog.c q = VoiceAdLog.q();
        q.p(str);
        q.r(this.b.d());
        q.o("");
        if (ad != null) {
            q.m("ad_id", ad.id());
            q.m("lineitem_id", ad.lineItemId());
            q.m("creative_id", ad.creativeId());
            q.m(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, ad.adPlaybackId());
        }
        if (yda != null) {
            q.n("device_name", yda.f());
            q.n("device_model", yda.e());
            q.n("accessory_type", yda.a());
            q.n("transport_type", yda.i());
            q.n("company", yda.c());
        }
        this.f.c(q.build());
    }

    public static void g(Context context) {
        context.stopService(new Intent(context, VoiceAdService.class));
    }

    public f e() {
        return this.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.o;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        NotificationManager notificationManager;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService("notification")) != null) {
            if (notificationManager.getNotificationChannel("voice_ad") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("voice_ad", "Voice Ad", 3));
            }
            startForeground(1, new k(this, "voice_ad").a());
            this.n.b();
        }
        f("voice_ad_service_created", this.p);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.b("[VoiceAd] Destroyed VoiceAdService", new Object[0]);
        this.a.a();
        f("voice_ad_service_destroyed", this.p);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Logger.b("[VoiceAd] Started VoiceAdService", new Object[0]);
        Ad ad = (Ad) intent.getParcelableExtra("voice_ad");
        this.p = ad;
        this.a.f(ad);
        f("voice_ad_service_started", this.p);
        return 2;
    }
}
