package com.spotify.saveaccountinfo;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.d;
import androidx.work.impl.l;
import androidx.work.k;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.o0;

public class e implements o0 {
    private final Context a;

    public e(Context context) {
        this.a = context;
    }

    @Override // com.spotify.login.o0
    public void a(AuthenticationMetadata authenticationMetadata) {
        l k = l.k(this.a);
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        k.a aVar = new k.a(SaveAccountInfoWorker.class);
        d.a aVar2 = new d.a();
        aVar2.g("username", authenticationMetadata.c());
        aVar2.g("auth_method", authenticationMetadata.b());
        k.e("SaveAccountInfo", existingWorkPolicy, (k) ((k.a) aVar.h(aVar2.a())).b());
    }
}
