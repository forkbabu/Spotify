package com.spotify.glue.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.C0707R;

public class f {
    CharSequence a;
    CharSequence b;
    DialogInterface.OnClickListener c;
    DialogInterface.OnClickListener d;
    boolean e = true;
    DialogInterface.OnCancelListener f;
    DialogInterface.OnDismissListener g;
    k h;
    private final Context i;
    private final e j;

    public f(Context context, e eVar) {
        this.i = context;
        this.j = eVar;
    }

    public f a(boolean z) {
        this.e = z;
        return this;
    }

    public d b() {
        return new j(this.i, C0707R.style.res_2132083501_theme_glue_dialog_nominsize, this);
    }

    /* access modifiers changed from: package-private */
    public e c() {
        return this.j;
    }

    public f d(k kVar) {
        this.h = kVar;
        return this;
    }

    public f e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.b = charSequence;
        this.d = onClickListener;
        return this;
    }

    public f f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.a = charSequence;
        this.c = onClickListener;
        return this;
    }

    public f g(DialogInterface.OnDismissListener onDismissListener) {
        this.g = onDismissListener;
        return this;
    }

    public f h(DialogInterface.OnCancelListener onCancelListener) {
        this.f = onCancelListener;
        return this;
    }
}
