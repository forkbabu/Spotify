package defpackage;

import com.spotify.mobile.android.video.v;

/* renamed from: xb1  reason: default package */
public final /* synthetic */ class xb1 implements v.c {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ xb1(Runnable runnable) {
        this.a = runnable;
    }

    @Override // com.spotify.mobile.android.video.v.c
    public final void a() {
        new Thread(this.a).start();
    }
}
