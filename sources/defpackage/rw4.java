package defpackage;

import android.content.DialogInterface;

/* renamed from: rw4  reason: default package */
public final /* synthetic */ class rw4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ mx4 a;

    public /* synthetic */ rw4(mx4 mx4) {
        this.a = mx4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d(dialogInterface, i);
    }
}
