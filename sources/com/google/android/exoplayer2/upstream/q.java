package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.k;

public final class q implements k.a {
    private final Context a;
    private final k.a b;

    public q(Context context, String str) {
        s sVar = new s(str, null);
        this.a = context.getApplicationContext();
        this.b = sVar;
    }

    @Override // com.google.android.exoplayer2.upstream.k.a
    public k a() {
        return new p(this.a, this.b.a());
    }

    public q(Context context, k.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }
}
