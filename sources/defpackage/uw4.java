package defpackage;

import android.content.DialogInterface;

/* renamed from: uw4  reason: default package */
public final /* synthetic */ class uw4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ mx4 a;

    public /* synthetic */ uw4(mx4 mx4) {
        this.a = mx4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(dialogInterface, i);
    }
}
