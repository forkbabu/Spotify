package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.t;

/* access modifiers changed from: package-private */
/* renamed from: oa1  reason: default package */
public class oa1 extends BroadcastReceiver {
    final /* synthetic */ t a;
    final /* synthetic */ qa1 b;

    oa1(qa1 qa1, t tVar) {
        this.b = qa1;
        this.a = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            Parcelable parcelable = extras.getParcelable("android.bluetooth.device.extra.DEVICE");
            if (parcelable == null) {
                Logger.d("No device available from connection state intent", new Object[0]);
                return;
            }
            sa1 a2 = sa1.a(parcelable);
            Logger.b("New state: %s, Previous state: %s, Device name: %s", qa1.a(extras.getInt("android.bluetooth.profile.extra.STATE", -1)), qa1.a(extras.getInt("android.bluetooth.profile.extra.PREVIOUS_STATE", -1)), a2.b());
            int i = extras.getInt("android.bluetooth.profile.extra.STATE", -1);
            if (i == 2) {
                if (this.b.b != null && !this.b.b.equals(a2)) {
                    this.a.onNext(na1.g(this.b.b));
                }
                this.b.b = a2;
                this.a.onNext(na1.a(a2));
            } else if (i == 3 || i == 0) {
                this.b.b = null;
                this.a.onNext(na1.f());
            }
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            Logger.b("New state: %s, Previous state: %s, Device name: %s", qa1.d(extras.getInt("android.bluetooth.adapter.extra.STATE", -1)), qa1.d(extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), this.b.b != null ? this.b.b.b() : "");
            int i2 = extras.getInt("android.bluetooth.adapter.extra.STATE", -1);
            if (i2 == 13 || i2 == 10) {
                this.b.b = null;
                this.a.onNext(na1.f());
            }
        } else {
            Assertion.g("Unexpected intent");
        }
        if (!(this.b.d)) {
            this.b.d = true;
        }
    }
}
