package defpackage;

import android.view.View;

/* renamed from: mmc  reason: default package */
public final /* synthetic */ class mmc implements View.OnClickListener {
    public final /* synthetic */ w51 a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ mmc(w51 w51, s81 s81) {
        this.a = w51;
        this.b = s81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b().a(n61.b("click", this.b));
    }
}
