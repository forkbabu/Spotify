package com.spotify.music.builtinauth.authenticator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import io.reactivex.b;

/* access modifiers changed from: package-private */
public class k0 extends BroadcastReceiver {
    final /* synthetic */ b a;
    final /* synthetic */ l0 b;

    k0(l0 l0Var, b bVar) {
        this.b = l0Var;
        this.a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AccountsActivity.e(this.b.a, this);
        e0 e0Var = (e0) intent.getParcelableExtra("result");
        if (e0Var.a) {
            this.a.onComplete();
            return;
        }
        String str = e0Var.b;
        if (str == null) {
            str = "";
        }
        this.a.onError(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_USER_NEEDS_AUTHORIZATION, str));
    }
}
