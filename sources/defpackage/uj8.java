package defpackage;

import android.content.DialogInterface;

/* renamed from: uj8  reason: default package */
public final /* synthetic */ class uj8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ yj8 a;

    public /* synthetic */ uj8(yj8 yj8) {
        this.a = yj8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
