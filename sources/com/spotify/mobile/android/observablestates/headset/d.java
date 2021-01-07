package com.spotify.mobile.android.observablestates.headset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import io.reactivex.f;

final class d extends BroadcastReceiver {
    final /* synthetic */ f a;

    d(f fVar) {
        this.a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra == 0) {
            this.a.onNext(HeadsetPluggedStatus.UNPLUGGED);
        } else if (intExtra != 1) {
            Logger.b("Unknown or no state received in %s", "android.intent.action.HEADSET_PLUG");
        } else {
            this.a.onNext(HeadsetPluggedStatus.PLUGGED);
        }
    }
}
