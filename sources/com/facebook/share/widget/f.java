package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.a;
import com.facebook.internal.h;
import com.facebook.share.internal.c;
import com.facebook.share.model.d;
import com.facebook.share.widget.ShareDialog;

class f implements h.a {
    final /* synthetic */ a a;
    final /* synthetic */ d b;
    final /* synthetic */ boolean c;

    f(ShareDialog.d dVar, a aVar, d dVar2, boolean z) {
        this.a = aVar;
        this.b = dVar2;
        this.c = z;
    }

    @Override // com.facebook.internal.h.a
    public Bundle a() {
        return c.l(this.a.b(), this.b, this.c);
    }

    @Override // com.facebook.internal.h.a
    public Bundle getParameters() {
        return c.m(this.a.b(), this.b, this.c);
    }
}