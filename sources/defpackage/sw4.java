package defpackage;

import android.content.DialogInterface;

/* renamed from: sw4  reason: default package */
public final /* synthetic */ class sw4 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ mx4 a;

    public /* synthetic */ sw4(mx4 mx4) {
        this.a = mx4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.e(dialogInterface);
    }
}
