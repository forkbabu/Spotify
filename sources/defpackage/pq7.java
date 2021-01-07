package defpackage;

import android.view.View;

/* renamed from: pq7  reason: default package */
public final /* synthetic */ class pq7 implements View.OnClickListener {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ pq7(pr7 pr7, da2 da2) {
        this.a = pr7;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.p(this.b, view);
    }
}
