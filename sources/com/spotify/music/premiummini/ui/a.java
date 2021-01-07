package com.spotify.music.premiummini.ui;

import android.content.DialogInterface;

/* compiled from: java-style lambda group */
public final class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            ((cmf) this.b).invoke();
        } else if (i2 == 1) {
            ((cmf) this.b).invoke();
        } else {
            throw null;
        }
    }
}
