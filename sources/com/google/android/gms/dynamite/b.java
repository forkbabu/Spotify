package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.a.b {
    b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.b
    public final int a(Context context, String str, boolean z) {
        return DynamiteModule.d(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.b
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
