package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: pod  reason: default package */
public final /* synthetic */ class pod implements Callable {
    public final /* synthetic */ vod a;
    public final /* synthetic */ SpSharedPreferences.b b;
    public final /* synthetic */ String c;

    public /* synthetic */ pod(vod vod, SpSharedPreferences.b bVar, String str) {
        this.a = vod;
        this.b = bVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c);
    }
}
