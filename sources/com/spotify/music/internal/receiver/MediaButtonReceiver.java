package com.spotify.music.internal.receiver;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import dagger.android.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.y;
import java.util.Iterator;

public class MediaButtonReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int f = 0;
    o a;
    h2e b;
    e6 c;
    e d;
    y e;

    private void a(Context context, KeyEvent keyEvent, int i) {
        if (i == 126 || i == 85 || i == 79) {
            Logger.g("onReceive %d %d", Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getKeyCode()));
            Intent c2 = this.a.c(context, "com.spotify.mobile.android.service.action.media_button");
            c2.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
            try {
                Logger.g("Sending received intent to service", new Object[0]);
                context.startService(c2);
            } catch (IllegalStateException unused) {
                Logger.g("Send failed, using fallback", new Object[0]);
                this.b.b(context, c2, "media-button", "action=", Integer.valueOf(keyEvent.getAction()), "code=", Integer.valueOf(i));
            }
        } else {
            e6 e6Var = this.c;
            Intent intent = new Intent("PausingMediaEventsLifecycleDecoupler.optionalaction.pause");
            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
            e6Var.d(intent);
        }
    }

    public /* synthetic */ e b(Context context, KeyEvent keyEvent, int i, BroadcastReceiver.PendingResult pendingResult) {
        if (!this.d.a()) {
            a(context, keyEvent, i);
        } else {
            Logger.g("Ignoring event because user is logged out.", new Object[0]);
        }
        pendingResult.finish();
        return b.a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        Logger.g("onReceive %s", intent.toUri(0));
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getRepeatCount() <= 0 || keyCode == 85 || keyCode == 79) {
                if (this.a == null || this.b == null || this.c == null) {
                    a.c(this, context);
                }
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("com.spotify.mobile.android.service.SpotifyService".equals(it.next().service.getClassName())) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    io.reactivex.a.n(new a(this, context, keyEvent, keyCode, goAsync())).G(this.e).subscribe(b.a);
                } else {
                    a(context, keyEvent, keyCode);
                }
            }
        }
    }
}
