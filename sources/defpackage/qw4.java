package defpackage;

import android.content.DialogInterface;

/* renamed from: qw4  reason: default package */
public final /* synthetic */ class qw4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ mx4 a;

    public /* synthetic */ qw4(mx4 mx4) {
        this.a = mx4;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.f(dialogInterface);
    }
}
