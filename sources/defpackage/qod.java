package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qod  reason: default package */
public final /* synthetic */ class qod implements Runnable {
    public final /* synthetic */ vod a;
    public final /* synthetic */ SpSharedPreferences.b b;

    public /* synthetic */ qod(vod vod, SpSharedPreferences.b bVar) {
        this.a = vod;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
