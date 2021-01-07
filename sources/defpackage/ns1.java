package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;
import com.spotify.music.builtinauth.authenticator.e0;

/* access modifiers changed from: package-private */
/* renamed from: ns1  reason: default package */
public class ns1 extends BroadcastReceiver {
    final /* synthetic */ int a;
    final /* synthetic */ os1 b;

    ns1(os1 os1, int i) {
        this.b = os1;
        this.a = i;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AccountsActivity.e(this.b.f, this);
        e0 e0Var = (e0) intent.getParcelableExtra("result");
        if (e0Var.a) {
            boolean unused = this.b.b(this.a, new AppProtocol.TokenResponse(0, null, e0Var.b));
        } else {
            boolean unused2 = this.b.b(this.a, new AppProtocol.TokenResponse(1, e0Var.b, null));
        }
        this.b.j(this.a);
    }
}
