package com.google.firebase.crashlytics.internal.common;

import android.os.Build;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.c;

/* access modifiers changed from: package-private */
public class s implements m.AbstractC0115m {
    final /* synthetic */ boolean a;

    s(m mVar, String str, String str2, boolean z) {
        this.a = z;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m.AbstractC0115m
    public void a(CodedOutputStream codedOutputStream) {
        c.r(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, this.a);
    }
}
