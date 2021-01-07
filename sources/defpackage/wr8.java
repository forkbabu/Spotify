package defpackage;

import android.view.View;

/* renamed from: wr8  reason: default package */
final class wr8 implements View.OnClickListener {
    final /* synthetic */ w51 a;
    final /* synthetic */ s81 b;

    wr8(w51 w51, s81 s81) {
        this.a = w51;
        this.b = s81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b().a(n61.b("click", this.b));
    }
}
