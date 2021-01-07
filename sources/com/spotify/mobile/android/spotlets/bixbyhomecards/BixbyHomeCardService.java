package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import dagger.android.g;

public class BixbyHomeCardService extends g {
    du1 a;
    l2e b;
    h2e c;
    a f;
    private Notification n;

    public enum Request {
        UPDATE,
        ENABLE,
        DISABLE,
        RECEIVE_EVENT;
        
        private static final Request[] n = values();
    }

    private static int[] e(Intent intent) {
        int[] intArrayExtra = intent.getIntArrayExtra("card_ids");
        if (intArrayExtra != null) {
            return intArrayExtra;
        }
        throw new RuntimeException(String.format("Card ids doesn't exist for request: %s", f(intent)));
    }

    private static Request f(Intent intent) {
        int intExtra = intent.getIntExtra("request", -1);
        if (intExtra != -1) {
            return Request.n[intExtra];
        }
        throw new RuntimeException("Request doesn't exist");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a.e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        l2e l2e = this.b;
        if (this.n == null) {
            k kVar = new k(this, "spotify_updates_channel");
            kVar.i(getString(C0707R.string.bixby_notification_is_connected));
            kVar.z(C0707R.drawable.icn_notification);
            this.n = kVar.a();
        }
        l2e.e(C0707R.id.bixby_notification_id, this.n);
        this.c.a(intent);
        int ordinal = f(intent).ordinal();
        int i3 = 0;
        if (ordinal == 0) {
            int[] e = e(intent);
            int length = e.length;
            while (i3 < length) {
                this.a.j(e[i3]);
                i3++;
            }
        } else if (ordinal == 1) {
            int[] e2 = e(intent);
            int length2 = e2.length;
            while (i3 < length2) {
                this.a.h(e2[i3]);
                i3++;
            }
        } else if (ordinal == 2) {
            int[] e3 = e(intent);
            int length3 = e3.length;
            while (i3 < length3) {
                this.a.g(e3[i3]);
                i3++;
            }
        } else if (ordinal == 3) {
            String stringExtra = intent.getStringExtra("event");
            if (stringExtra != null) {
                int intExtra = intent.getIntExtra("card_id", -1);
                if (intExtra != -1) {
                    this.a.i(stringExtra, intExtra);
                } else {
                    throw new RuntimeException(String.format("Card id doesn't exist for request: %s", f(intent)));
                }
            } else {
                throw new RuntimeException(String.format("event doesn't exist for request: %s", f(intent)));
            }
        }
        this.b.b(C0707R.id.bixby_notification_id);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        stopSelf();
        return true;
    }
}
