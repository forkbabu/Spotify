package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.playlist.models.j;

/* renamed from: vv6  reason: default package */
public final /* synthetic */ class vv6 implements Runnable {
    public final /* synthetic */ dx6 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a0 f;

    public /* synthetic */ vv6(dx6 dx6, j jVar, boolean z, a0 a0Var) {
        this.a = dx6;
        this.b = jVar;
        this.c = z;
        this.f = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c, this.f);
    }
}
