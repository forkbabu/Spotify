package com.spotify.music.features.nowplaying.v2;

import android.app.Activity;
import android.content.Intent;
import com.spotify.instrumentation.navigation.logger.c;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.m;
import kotlin.jvm.internal.h;

public class f implements nsb {
    private final Activity a;
    private final m b;
    private final String c;

    public f(Activity activity, m mVar, String str) {
        activity.getClass();
        this.a = activity;
        this.b = mVar;
        this.c = str;
    }

    @Override // defpackage.nsb
    public void a() {
        Activity activity = this.a;
        int i = NowPlayingActivity.S;
        activity.getClass();
        Intent intent = new Intent(activity, NowPlayingActivity.class);
        intent.setFlags(603979776);
        this.b.c(f.C0160f.a, "NowPlayingViewNavigator.showNowPlayingView");
        this.a.startActivity(intent);
    }

    @Override // defpackage.nsb
    public void b(c cVar) {
        Activity activity = this.a;
        int i = NowPlayingActivity.S;
        activity.getClass();
        Intent intent = new Intent(activity, NowPlayingActivity.class);
        intent.setFlags(603979776);
        m mVar = this.b;
        h.e(cVar, "interactionId");
        mVar.c(new f.g(cVar), "NowPlayingViewNavigator.showNowPlayingView");
        this.a.startActivity(intent);
    }

    @Override // defpackage.nsb
    public void c() {
        Intent intent = new Intent();
        intent.setClassName(this.a, this.c);
        yn0 yn0 = bu9.s;
        yn0.getClass();
        intent.putExtra("FeatureIdentifier.InternalReferrer", yn0);
        this.b.c(f.C0160f.a, "NowPlayingViewNavigator.showQueue");
        this.a.startActivity(intent);
    }
}
