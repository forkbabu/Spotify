package defpackage;

import android.content.DialogInterface;

/* renamed from: vj8  reason: default package */
public final /* synthetic */ class vj8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ yj8 a;

    public /* synthetic */ vj8(yj8 yj8) {
        this.a = yj8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(dialogInterface, i);
    }
}
