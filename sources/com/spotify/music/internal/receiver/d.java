package com.spotify.music.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.KeyEvent;
import com.spotify.mobile.android.service.o;

public class d implements com.spotify.mobile.android.service.plugininterfaces.d {
    private final e6 a;
    private final o b;
    private final BroadcastReceiver c = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (intent != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                Intent c = d.this.b.c(context, "com.spotify.mobile.android.service.action.media_button");
                c.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                try {
                    context.startService(c);
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public d(e6 e6Var, o oVar) {
        this.a = e6Var;
        this.b = oVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.c(this.c, new IntentFilter("PausingMediaEventsLifecycleDecoupler.optionalaction.pause"));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.e(this.c);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PausingMediaEventsLifecycleDecoupler";
    }
}
