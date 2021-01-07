package com.google.firebase.crashlytics.internal.common;

import android.os.Build;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.c;

/* access modifiers changed from: package-private */
public class t implements m.AbstractC0115m {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;

    t(m mVar, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m.AbstractC0115m
    public void a(CodedOutputStream codedOutputStream) {
        c.o(codedOutputStream, this.a, Build.MODEL, this.b, this.c, this.d, this.e, this.f, Build.MANUFACTURER, Build.PRODUCT);
    }
}
