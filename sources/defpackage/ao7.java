package defpackage;

import android.view.View;

/* renamed from: ao7  reason: default package */
public final /* synthetic */ class ao7 implements View.OnClickListener {
    public final /* synthetic */ so7 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ ao7(so7 so7, da2 da2) {
        this.a = so7;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.l(this.b, view);
    }
}
