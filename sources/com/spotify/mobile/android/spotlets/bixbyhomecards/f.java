package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;

public final class f {
    private final Context a;
    private final h2e b;
    private final h c;

    public f(Context context, h2e h2e, h hVar) {
        this.a = context;
        this.b = h2e;
        this.c = hVar;
    }

    public void a(BixbyHomeCardService.Request request, int i, String str) {
        if (!this.c.b()) {
            Logger.d("Trying to start BixbyHomeCardService on an unsupported device", new Object[0]);
            return;
        }
        Intent intent = new Intent(this.a, BixbyHomeCardService.class);
        intent.putExtra("request", request.ordinal());
        intent.putExtra("card_id", i);
        intent.putExtra("event", str);
        this.b.b(this.a, intent, "BixbyHomeCardServiceStarter", new Object[0]);
    }

    public void b(BixbyHomeCardService.Request request, int[] iArr) {
        if (!this.c.b()) {
            Logger.d("Trying to start BixbyHomeCardService on an unsupported device", new Object[0]);
            return;
        }
        Intent intent = new Intent(this.a, BixbyHomeCardService.class);
        intent.putExtra("request", request.ordinal());
        intent.putExtra("card_ids", iArr);
        this.b.b(this.a, intent, "BixbyHomeCardServiceStarter", new Object[0]);
    }
}
