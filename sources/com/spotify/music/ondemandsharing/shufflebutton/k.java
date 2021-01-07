package com.spotify.music.ondemandsharing.shufflebutton;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.n;

class k extends BroadcastReceiver {
    final /* synthetic */ m a;

    k(m mVar) {
        this.a = mVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ShufflePlayHeaderView.a(new n(), this.a.b);
    }
}
