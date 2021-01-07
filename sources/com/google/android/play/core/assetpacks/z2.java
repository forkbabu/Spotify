package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.m;

public final class z2 implements a0<Object> {
    private final a0<s2> a;
    private final a0<Context> b;

    public z2(a0<s2> a0Var, a0<Context> a0Var2) {
        this.a = a0Var;
        this.b = a0Var2;
    }

    @Override // com.google.android.play.core.internal.a0
    public final Object e() {
        s2 e = this.a.e();
        Context a2 = ((b3) this.b).e();
        s2 s2Var = e;
        m.a(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        int i = PlayCoreDialogWrapperActivity.b;
        m.a(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        m.e(s2Var);
        return s2Var;
    }
}
