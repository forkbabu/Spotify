package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.n;

/* renamed from: be3  reason: default package */
class be3 extends BroadcastReceiver {
    final /* synthetic */ Button a;

    be3(de3 de3, Button button) {
        this.a = button;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ShufflePlayHeaderView.a(new n(), this.a);
    }
}
