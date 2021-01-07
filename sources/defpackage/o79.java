package defpackage;

import android.content.DialogInterface;

/* renamed from: o79  reason: default package */
public final /* synthetic */ class o79 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ q79 a;

    public /* synthetic */ o79(q79 q79) {
        this.a = q79;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.b(dialogInterface);
    }
}
