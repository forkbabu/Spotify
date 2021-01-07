package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.q0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.web.RxWebToken;

/* access modifiers changed from: package-private */
public class f0 implements q0.a, Handler.Callback {
    private final Handler a;
    private final Context b;
    private final Uri c;
    private final o0 f;
    private q0 n;

    f0(Context context, RxWebToken rxWebToken, Uri uri, o0 o0Var) {
        Handler handler = new Handler(this);
        this.a = handler;
        this.b = context;
        this.c = uri;
        this.f = o0Var;
        q0 q0Var = new q0(rxWebToken);
        this.n = q0Var;
        q0Var.b(uri.toString(), this);
        handler.sendEmptyMessageDelayed(1, 500);
        handler.sendEmptyMessageDelayed(2, 5000);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f.c(C0707R.string.toast_push_notification_slow_open, new Object[0]);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            n1(this.c);
            return true;
        }
    }

    @Override // com.spotify.mobile.android.util.q0.a
    public void n1(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
        q0 q0Var = this.n;
        if (q0Var != null) {
            q0Var.c();
            this.n = null;
        }
        this.a.removeMessages(1);
        this.a.removeMessages(2);
    }
}
