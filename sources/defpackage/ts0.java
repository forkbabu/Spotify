package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import kotlin.jvm.internal.h;

/* renamed from: ts0  reason: default package */
final class ts0 implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity a;

    ts0(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h.e(dialogInterface, "<anonymous parameter 0>");
        this.a.finish();
    }
}
