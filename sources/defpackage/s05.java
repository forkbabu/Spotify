package defpackage;

import android.view.View;

/* renamed from: s05  reason: default package */
public final /* synthetic */ class s05 implements View.OnClickListener {
    public final /* synthetic */ u05 a;
    public final /* synthetic */ int b;

    public /* synthetic */ s05(u05 u05, int i) {
        this.a = u05;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.X(this.b, view);
    }
}
