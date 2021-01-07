package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.n;

class y extends BroadcastReceiver {
    final /* synthetic */ Button a;

    y(a0 a0Var, Button button) {
        this.a = button;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ShufflePlayHeaderView.a(new n(), this.a);
    }
}
