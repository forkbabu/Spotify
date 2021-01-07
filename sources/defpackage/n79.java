package defpackage;

import android.content.DialogInterface;
import defpackage.q79;

/* renamed from: n79  reason: default package */
public final /* synthetic */ class n79 implements DialogInterface.OnClickListener {
    public final /* synthetic */ q79 a;
    public final /* synthetic */ q79.a b;

    public /* synthetic */ n79(q79 q79, q79.a aVar) {
        this.a = q79;
        this.b = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, dialogInterface, i);
    }
}
