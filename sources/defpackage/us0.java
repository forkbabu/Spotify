package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import kotlin.jvm.internal.h;

/* renamed from: us0  reason: default package */
final class us0 implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ Intent b;

    us0(Activity activity, Intent intent) {
        this.a = activity;
        this.b = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h.e(dialogInterface, "<anonymous parameter 0>");
        this.a.finish();
        Intent intent = this.b;
        if (intent != null) {
            this.a.startActivityForResult(intent, 100);
        }
    }
}
