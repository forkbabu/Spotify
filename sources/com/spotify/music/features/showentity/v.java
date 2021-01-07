package com.spotify.music.features.showentity;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

public class v implements z {
    private final b a;
    private final o b;

    public v(b bVar, o oVar) {
        this.a = bVar;
        this.b = oVar;
    }

    public void a(String str, Optional<Bundle> optional) {
        n.a a2 = n.a(str);
        a2.f(true);
        Intent b2 = this.b.b(a2.a());
        if (optional.isPresent()) {
            b2.putExtras(optional.get());
        }
        this.a.b(b2);
    }
}
