package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;
import com.google.android.gms.internal.recaptcha.p;
import com.google.android.gms.internal.recaptcha.q;

public abstract class q<MessageType extends p<MessageType, BuilderType>, BuilderType extends q<MessageType, BuilderType>> implements e1 {
    public final /* synthetic */ e1 b(f1 f1Var) {
        g0.b bVar = (g0.b) this;
        if (bVar.m().getClass().isInstance(f1Var)) {
            bVar.c((g0) ((p) f1Var));
            return bVar;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
