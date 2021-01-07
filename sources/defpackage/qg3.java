package defpackage;

import android.content.DialogInterface;
import defpackage.xg3;

/* renamed from: qg3  reason: default package */
public final /* synthetic */ class qg3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ sg3 a;
    public final /* synthetic */ xg3.a b;

    public /* synthetic */ qg3(sg3 sg3, xg3.a aVar) {
        this.a = sg3;
        this.b = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        sg3 sg3 = this.a;
        xg3.a aVar = this.b;
        sg3.c();
        vg3.a(vg3.this);
    }
}
