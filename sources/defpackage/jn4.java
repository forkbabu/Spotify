package defpackage;

import android.view.View;

/* renamed from: jn4  reason: default package */
public final /* synthetic */ class jn4 implements View.OnClickListener {
    public final /* synthetic */ nn4 a;
    public final /* synthetic */ zn4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jn4(nn4 nn4, zn4 zn4, int i) {
        this.a = nn4;
        this.b = zn4;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, this.c, view);
    }
}
