package defpackage;

import android.content.DialogInterface;

/* renamed from: h0d  reason: default package */
public final /* synthetic */ class h0d implements DialogInterface.OnCancelListener {
    public final /* synthetic */ u0d a;

    public /* synthetic */ h0d(u0d u0d) {
        this.a = u0d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.b(dialogInterface);
    }
}
