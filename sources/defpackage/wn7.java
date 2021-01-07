package defpackage;

import android.content.DialogInterface;

/* renamed from: wn7  reason: default package */
public final /* synthetic */ class wn7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ po7 a;
    public final /* synthetic */ kl7 b;

    public /* synthetic */ wn7(po7 po7, kl7 kl7) {
        this.a = po7;
        this.b = kl7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(this.b, dialogInterface, i);
    }
}
