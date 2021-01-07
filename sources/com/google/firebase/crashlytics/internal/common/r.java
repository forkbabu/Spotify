package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.c;

/* access modifiers changed from: package-private */
public class r implements m.AbstractC0115m {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ m f;

    r(m mVar, String str, String str2, String str3, String str4, int i) {
        this.f = mVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m.AbstractC0115m
    public void a(CodedOutputStream codedOutputStream) {
        c.m(codedOutputStream, this.a, this.b, this.c, this.d, this.e, this.f.r);
    }
}
