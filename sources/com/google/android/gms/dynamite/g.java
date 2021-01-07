package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class g implements DynamiteModule.a {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.C0101a a(Context context, String str, DynamiteModule.a.b bVar) {
        DynamiteModule.a.C0101a aVar = new DynamiteModule.a.C0101a();
        int b = bVar.b(context, str);
        aVar.a = b;
        if (b != 0) {
            aVar.b = bVar.a(context, str, false);
        } else {
            aVar.b = bVar.a(context, str, true);
        }
        int i = aVar.a;
        if (i == 0 && aVar.b == 0) {
            aVar.c = 0;
        } else if (i >= aVar.b) {
            aVar.c = -1;
        } else {
            aVar.c = 1;
        }
        return aVar;
    }
}
