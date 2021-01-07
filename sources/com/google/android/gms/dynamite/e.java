package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.a {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.C0101a a(Context context, String str, DynamiteModule.a.b bVar) {
        DynamiteModule.a.C0101a aVar = new DynamiteModule.a.C0101a();
        int a = bVar.a(context, str, true);
        aVar.b = a;
        if (a != 0) {
            aVar.c = 1;
        } else {
            int b = bVar.b(context, str);
            aVar.a = b;
            if (b != 0) {
                aVar.c = -1;
            }
        }
        return aVar;
    }
}
