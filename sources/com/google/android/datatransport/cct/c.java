package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.d;
import java.net.URL;

final /* synthetic */ class c implements dh {
    private static final c a = new c();

    private c() {
    }

    public static dh b() {
        return a;
    }

    public Object a(Object obj, Object obj2) {
        d.a aVar = (d.a) obj;
        d.b bVar = (d.b) obj2;
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        bh.a("CctTransportBackend", "Following redirect to: %s", url);
        return new d.a(bVar.b, aVar.b, aVar.c);
    }
}
