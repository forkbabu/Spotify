package com.spotify.glue.dialogs;

import android.content.DialogInterface;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
public class l {
    private final c a;
    private DialogInterface.OnClickListener b;
    private DialogInterface.OnClickListener c;

    public l(c cVar) {
        this.a = cVar;
    }

    public void a(f fVar) {
        this.a.setCancelable(fVar.e);
        this.a.setOnCancelListener(fVar.f);
        this.a.setOnDismissListener(fVar.g);
        if (!TextUtils.isEmpty(fVar.a)) {
            this.b = fVar.c;
            this.a.e(true);
        } else {
            this.a.e(false);
        }
        if (!TextUtils.isEmpty(fVar.b)) {
            this.c = fVar.d;
            this.a.c(true);
        } else {
            this.a.c(false);
        }
        this.a.a(fVar.h);
    }

    public void b() {
        this.a.dismiss();
    }

    public void c() {
        DialogInterface.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(this.a, -2);
        }
        this.a.dismiss();
    }

    public void d() {
        DialogInterface.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(this.a, -1);
        }
        this.a.dismiss();
    }

    public void e() {
        this.a.show();
    }
}
