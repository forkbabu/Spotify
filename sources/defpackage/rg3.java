package defpackage;

import android.content.DialogInterface;
import defpackage.xg3;

/* renamed from: rg3  reason: default package */
public final /* synthetic */ class rg3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ sg3 a;
    public final /* synthetic */ xg3.a b;

    public /* synthetic */ rg3(sg3 sg3, xg3.a aVar) {
        this.a = sg3;
        this.b = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        sg3 sg3 = this.a;
        xg3.a aVar = this.b;
        sg3.e();
        vg3.d(vg3.this);
    }
}
