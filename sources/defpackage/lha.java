package defpackage;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
/* renamed from: lha  reason: default package */
public class lha implements DialogInterface.OnClickListener {
    final /* synthetic */ mha a;

    lha(mha mha) {
        this.a = mha;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a = null;
        dialogInterface.dismiss();
    }
}
