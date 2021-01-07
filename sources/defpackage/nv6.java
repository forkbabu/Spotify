package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;

/* renamed from: nv6  reason: default package */
public final /* synthetic */ class nv6 implements Runnable {
    public final /* synthetic */ tw6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a0 c;
    public final /* synthetic */ String f;

    public /* synthetic */ nv6(tw6 tw6, String str, a0 a0Var, String str2) {
        this.a = tw6;
        this.b = str;
        this.c = a0Var;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c, this.f);
    }
}
