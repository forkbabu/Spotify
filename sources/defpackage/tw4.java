package defpackage;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: tw4  reason: default package */
public final /* synthetic */ class tw4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ List a;

    public /* synthetic */ tw4(List list) {
        this.a = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        List list = this.a;
        if (dialogInterface != null) {
            dialogInterface.cancel();
        }
        ((Runnable) list.get(i)).run();
    }
}
