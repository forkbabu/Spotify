package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: zt3  reason: default package */
public final /* synthetic */ class zt3 implements View.OnClickListener {
    public final /* synthetic */ du3 a;
    public final /* synthetic */ Context b;

    public /* synthetic */ zt3(du3 du3, Context context) {
        this.a = du3;
        this.b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b, view);
    }
}
