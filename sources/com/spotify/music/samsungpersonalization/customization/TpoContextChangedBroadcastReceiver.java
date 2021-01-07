package com.spotify.music.samsungpersonalization.customization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.android.a;
import kotlin.jvm.internal.h;

public final class TpoContextChangedBroadcastReceiver extends BroadcastReceiver {
    public c a;
    public h2e b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a.c(this, context);
        c cVar = this.a;
        if (cVar == null) {
            h.k("samsungCustomizationClient");
            throw null;
        } else if (cVar.e()) {
            h2e h2e = this.b;
            if (h2e != null) {
                h2e.b(context, new Intent(context, TpoContextChangedService.class), "TpoContextChangedBroadcastReceiver", new Object[0]);
            } else {
                h.k("serviceStarter");
                throw null;
            }
        }
    }
}
