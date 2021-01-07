package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.g;
import com.facebook.share.model.o;
import com.facebook.share.model.s;

/* access modifiers changed from: package-private */
public class w extends v {
    w(t tVar) {
        super(null);
    }

    @Override // com.facebook.share.internal.v
    public void c(g gVar) {
        throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
    }

    @Override // com.facebook.share.internal.v
    public void f(o oVar) {
        c.h(oVar, this);
    }

    @Override // com.facebook.share.internal.v
    public void i(s sVar) {
        throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
    }
}
