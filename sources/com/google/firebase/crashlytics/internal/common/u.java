package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.c;

/* access modifiers changed from: package-private */
public class u implements m.AbstractC0115m {
    final /* synthetic */ x0 a;

    u(m mVar, x0 x0Var) {
        this.a = x0Var;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m.AbstractC0115m
    public void a(CodedOutputStream codedOutputStream) {
        c.s(codedOutputStream, this.a.b(), null, null);
    }
}
