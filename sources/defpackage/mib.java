package defpackage;

import android.view.View;

/* renamed from: mib  reason: default package */
final class mib implements View.OnClickListener {
    final /* synthetic */ nib a;
    final /* synthetic */ String b;

    mib(nib nib, String str) {
        this.a = nib;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.O.a(this.b, !this.a.L.g());
        nib.B0(this.a);
    }
}
