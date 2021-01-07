package defpackage;

import android.view.View;

/* renamed from: g64  reason: default package */
public final /* synthetic */ class g64 implements View.OnClickListener {
    public final /* synthetic */ h64 a;
    public final /* synthetic */ w51 b;
    public final /* synthetic */ s81 c;

    public /* synthetic */ g64(h64 h64, w51 w51, s81 s81) {
        this.a = h64;
        this.b = w51;
        this.c = s81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b, this.c, view);
    }
}
