package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.music.libs.viewuri.c;

/* access modifiers changed from: package-private */
public class r0 implements d0 {
    final /* synthetic */ q0 a;

    r0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        if (this.a.G != null) {
            this.a.G.x(a0Var, j.a);
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.a.g.getViewUri();
    }
}
