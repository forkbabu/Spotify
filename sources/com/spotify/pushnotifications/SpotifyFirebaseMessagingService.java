package com.spotify.pushnotifications;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.p;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.pushnotifications.x0;
import dagger.android.a;
import java.util.Map;

public class SpotifyFirebaseMessagingService extends FirebaseMessagingService {
    k p;
    n q;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void f(p pVar) {
        if (!pVar.I1().isEmpty()) {
            Logger.b("Message data payload: %s", pVar.I1());
            Map<String, String> I1 = pVar.I1();
            if ("notification".equals(I1.get("type"))) {
                ((x0) this.p).h(I1);
                return;
            }
            return;
        }
        Logger.d("Received push notification with empty data", new Object[0]);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void h(String str) {
        Logger.b("Refreshed token from firebase: %s", str);
        this.q.b(str);
    }

    @Override // android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.g, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        n nVar = this.q;
        if (nVar != null) {
            nVar.c();
        }
    }
}
