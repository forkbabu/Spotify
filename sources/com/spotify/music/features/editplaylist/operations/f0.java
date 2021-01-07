package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import com.spotify.music.features.editplaylist.operations.b;
import com.spotify.music.features.editplaylist.operations.c;
import com.spotify.music.features.editplaylist.operations.d;
import com.spotify.music.features.editplaylist.operations.e;
import com.spotify.music.features.editplaylist.operations.f;

public class f0 {
    private final tx4 a;

    public f0(tx4 tx4) {
        this.a = tx4;
    }

    public v a(String str) {
        b.a aVar = new b.a();
        aVar.b(this.a.a());
        b.a aVar2 = aVar;
        aVar2.c(str);
        return aVar2.a();
    }

    public y b(String str) {
        c.a aVar = new c.a();
        aVar.c(this.a.a());
        c.a aVar2 = aVar;
        aVar2.b(str);
        return aVar2.a();
    }

    public b0 c(String str, String str2) {
        d.a aVar = new d.a();
        aVar.c(this.a.a());
        d.a aVar2 = aVar;
        aVar2.d(str);
        d.a aVar3 = aVar2;
        aVar3.b(str2);
        return aVar3.a();
    }

    public l0 d(String str) {
        e.a aVar = new e.a();
        aVar.c(this.a.a());
        e.a aVar2 = aVar;
        aVar2.b(str);
        return aVar2.a();
    }

    public o0 e(Uri uri) {
        f.a aVar = new f.a();
        aVar.c(this.a.a());
        f.a aVar2 = aVar;
        aVar2.b(uri);
        return aVar2.a();
    }
}
