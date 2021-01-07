package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: d92  reason: default package */
public class d92 extends BroadcastReceiver {
    private final j92 a;

    public d92(j92 j92) {
        this.a = j92;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.hashCode();
        char c = 65535;
        switch (action.hashCode()) {
            case -2062487035:
                if (action.equals("com.spotify.music.internal.waze.LAUNCH")) {
                    c = 0;
                    break;
                }
                break;
            case -1540992924:
                if (action.equals("com.spotify.music.internal.waze.WAKE_BY_INTERAPP")) {
                    c = 1;
                    break;
                }
                break;
            case -629196449:
                if (action.equals("com.spotify.music.internal.waze.WAKE_BY_MBS")) {
                    c = 2;
                    break;
                }
                break;
            case -377338156:
                if (action.equals("com.spotify.music.internal.waze.STOP")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.a.k();
                return;
            case 1:
                this.a.h();
                return;
            case 2:
                this.a.g();
                return;
            case 3:
                this.a.e();
                return;
            default:
                return;
        }
    }
}
