package defpackage;

import android.content.DialogInterface;

/* renamed from: vn7  reason: default package */
public final /* synthetic */ class vn7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ po7 a;

    public /* synthetic */ vn7(po7 po7) {
        this.a = po7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(dialogInterface, i);
    }
}
