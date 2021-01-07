package defpackage;

import android.view.View;

/* renamed from: iib  reason: default package */
final class iib implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ jib b;

    iib(String str, jib jib) {
        this.a = str;
        this.b = jib;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.Q.a(this.a);
        jib.w0(this.b, this.a);
    }
}
