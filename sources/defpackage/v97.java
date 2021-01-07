package defpackage;

import android.view.View;

/* renamed from: v97  reason: default package */
public final /* synthetic */ class v97 implements View.OnClickListener {
    public final /* synthetic */ fa7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j87 c;

    public /* synthetic */ v97(fa7 fa7, int i, j87 j87) {
        this.a = fa7;
        this.b = i;
        this.c = j87;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j0(this.b, this.c, view);
    }
}
