package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.a {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.C0101a a(Context context, String str, DynamiteModule.a.b bVar) {
        DynamiteModule.a.C0101a aVar = new DynamiteModule.a.C0101a();
        aVar.a = bVar.b(context, str);
        int a = bVar.a(context, str, true);
        aVar.b = a;
        int i = aVar.a;
        if (i == 0 && a == 0) {
            aVar.c = 0;
        } else if (a >= i) {
            aVar.c = 1;
        } else {
            aVar.c = -1;
        }
        return aVar;
    }
}
