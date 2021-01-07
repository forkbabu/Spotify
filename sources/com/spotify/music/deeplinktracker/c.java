package com.spotify.music.deeplinktracker;

import android.content.Intent;
import com.spotify.mobile.android.util.l0;

public class c implements zgb {
    private final b a;
    private final d b;

    public c(b bVar, d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    @Override // defpackage.zgb
    public void a(Intent intent) {
        l0 l0Var;
        if ("android.intent.action.VIEW".equals(intent.getAction()) || this.b.b(intent)) {
            b bVar = this.a;
            if (this.b.b(intent)) {
                String str = "";
                if (intent.getExtras() != null) {
                    str = intent.getExtras().getString("query", str);
                }
                l0Var = l0.z("spotify://search/" + str);
            } else {
                l0Var = l0.z(intent.getDataString());
            }
            bVar.a(intent, l0Var);
        }
    }
}
