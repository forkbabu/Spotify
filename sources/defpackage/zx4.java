package defpackage;

import android.view.View;

/* renamed from: zx4  reason: default package */
public final /* synthetic */ class zx4 implements View.OnClickListener {
    public final /* synthetic */ iy4 a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ zx4(iy4 iy4, View.OnClickListener onClickListener) {
        this.a = iy4;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.E(this.b, view);
    }
}
