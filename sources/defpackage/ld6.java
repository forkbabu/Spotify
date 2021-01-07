package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ld6  reason: default package */
public final /* synthetic */ class ld6 implements View.OnClickListener {
    public final /* synthetic */ yd6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Context f;

    public /* synthetic */ ld6(yd6 yd6, String str, int i, Context context) {
        this.a = yd6;
        this.b = str;
        this.c = i;
        this.f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(this.b, this.c, this.f, view);
    }
}
