package defpackage;

import android.content.DialogInterface;
import defpackage.xg3;

/* renamed from: ng3  reason: default package */
public final /* synthetic */ class ng3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ sg3 a;
    public final /* synthetic */ xg3.a b;

    public /* synthetic */ ng3(sg3 sg3, xg3.a aVar) {
        this.a = sg3;
        this.b = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        sg3 sg3 = this.a;
        xg3.a aVar = this.b;
        sg3.a();
        vg3.c(vg3.this);
    }
}
