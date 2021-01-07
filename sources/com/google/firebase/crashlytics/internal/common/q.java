package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.c;

/* access modifiers changed from: package-private */
public class q implements m.AbstractC0115m {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;

    q(m mVar, String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m.AbstractC0115m
    public void a(CodedOutputStream codedOutputStream) {
        c.k(codedOutputStream, this.a, this.b, this.c);
    }
}
