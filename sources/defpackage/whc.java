package defpackage;

import android.view.View;
import defpackage.zhc;

/* renamed from: whc  reason: default package */
public final /* synthetic */ class whc implements View.OnClickListener {
    public final /* synthetic */ zhc a;
    public final /* synthetic */ zhc.a b;

    public /* synthetic */ whc(zhc zhc, zhc.a aVar) {
        this.a = zhc;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(this.b, view);
    }
}
