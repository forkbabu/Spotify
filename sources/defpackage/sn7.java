package defpackage;

import android.content.DialogInterface;

/* renamed from: sn7  reason: default package */
public final /* synthetic */ class sn7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ po7 a;

    public /* synthetic */ sn7(po7 po7) {
        this.a = po7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.f(dialogInterface, i);
    }
}
