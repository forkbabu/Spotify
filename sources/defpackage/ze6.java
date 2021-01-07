package defpackage;

import android.view.View;
import defpackage.af6;

/* renamed from: ze6  reason: default package */
public final /* synthetic */ class ze6 implements View.OnClickListener {
    public final /* synthetic */ af6.a a;
    public final /* synthetic */ String b;

    public /* synthetic */ ze6(af6.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        af6.a aVar = this.a;
        ud6 ud6 = (ud6) aVar;
        ud6.a.u(ud6.b, ud6.c, this.b);
    }
}
