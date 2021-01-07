package com.spotify.music.features.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.spotify.music.features.ads.v1;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;

public class c2 {
    private final mv3 a;
    private final v1 b;
    private final y c;
    private final s<Boolean> d;
    private final p e = new p();
    private final g<Boolean> f;
    private final Context g;
    private BroadcastReceiver h;
    private final v1.b i = new a();

    class a implements v1.b {
        a() {
        }

        @Override // com.spotify.music.features.ads.v1.b
        public void a() {
            c2.this.a.a("moving", Boolean.toString(true));
        }

        @Override // com.spotify.music.features.ads.v1.b
        public void b() {
            c2.this.a.a("moving", Boolean.toString(false));
        }
    }

    public c2(Context context, mv3 mv3, v1 v1Var, y yVar, s<Boolean> sVar) {
        this.g = context;
        this.a = mv3;
        this.b = v1Var;
        this.c = yVar;
        this.d = sVar;
        this.f = new e0(this);
    }

    public /* synthetic */ void b(Boolean bool) {
        this.a.a("focus", Boolean.toString(bool.booleanValue()));
    }

    public void c() {
        this.e.b(this.d.o0(this.c).subscribe(this.f));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        b2 b2Var = new b2(this, (KeyguardManager) this.g.getSystemService("keyguard"));
        this.h = b2Var;
        this.g.registerReceiver(b2Var, intentFilter);
        if (this.b.d()) {
            this.b.e();
            this.b.c(this.i);
        } else {
            this.a.a("moving", "Not Supported");
        }
        this.a.a("active_connected_device", "[]");
    }

    public void d() {
        this.a.b();
        this.b.f();
        this.e.a();
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            this.g.unregisterReceiver(broadcastReceiver);
            this.h = null;
        }
    }
}
