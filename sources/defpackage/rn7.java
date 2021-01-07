package defpackage;

import android.content.DialogInterface;

/* renamed from: rn7  reason: default package */
public final /* synthetic */ class rn7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ po7 a;

    public /* synthetic */ rn7(po7 po7) {
        this.a = po7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
