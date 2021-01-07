package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

/* renamed from: rod  reason: default package */
public final /* synthetic */ class rod implements g {
    public final /* synthetic */ vod a;
    public final /* synthetic */ SpSharedPreferences.b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long f;

    public /* synthetic */ rod(vod vod, SpSharedPreferences.b bVar, String str, long j) {
        this.a = vod;
        this.b = bVar;
        this.c = str;
        this.f = j;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, this.c, this.f, obj);
    }
}
