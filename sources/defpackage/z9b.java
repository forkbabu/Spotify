package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: z9b  reason: default package */
public final /* synthetic */ class z9b implements Runnable {
    public final /* synthetic */ dab a;
    public final /* synthetic */ PlayerContext b;

    public /* synthetic */ z9b(dab dab, PlayerContext playerContext) {
        this.a = dab;
        this.b = playerContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
