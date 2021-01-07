package defpackage;

import android.view.View;

/* renamed from: t97  reason: default package */
public final /* synthetic */ class t97 implements View.OnClickListener {
    public final /* synthetic */ aa7 a;
    public final /* synthetic */ k87 b;

    public /* synthetic */ t97(aa7 aa7, k87 k87) {
        this.a = aa7;
        this.b = k87;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
