package defpackage;

import android.content.DialogInterface;

/* renamed from: p70  reason: default package */
public final /* synthetic */ class p70 implements DialogInterface.OnClickListener {
    public final /* synthetic */ t70 a;

    public /* synthetic */ p70(t70 t70) {
        this.a = t70;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
