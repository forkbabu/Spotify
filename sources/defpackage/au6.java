package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import defpackage.zt6;

/* renamed from: au6  reason: default package */
final class au6 implements zt6.b {
    private final zt6.a a;
    private final ImmutableList<eu6> b;
    private final ImmutableList<gu6> c;

    /* renamed from: au6$a */
    class a implements zt6 {
        final /* synthetic */ zt6 a;
        final /* synthetic */ zt6.c b;

        a(au6 au6, zt6 zt6, zt6.c cVar) {
            this.a = zt6;
            this.b = cVar;
        }

        @Override // com.spotify.android.glue.components.toolbar.d
        public void P() {
            this.a.P();
        }

        @Override // com.spotify.android.glue.components.toolbar.d
        public u R() {
            return this.a.R();
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void c(Bundle bundle) {
            this.a.c(bundle);
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void d(Bundle bundle) {
            this.a.d(bundle);
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void f() {
            this.a.f();
        }

        @Override // com.spotify.music.features.playlistentity.t
        public io.reactivex.a g() {
            return this.a.g();
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void h() {
            this.a.h();
        }

        @Override // defpackage.zt6
        public void j0(ViewGroup viewGroup) {
            this.a.j0(viewGroup);
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void l(t.b bVar) {
            this.a.l(bVar);
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void onStop() {
            this.a.onStop();
        }

        @Override // defpackage.zt6
        public void r(ar6 ar6) {
            this.a.r(ar6);
        }

        @Override // defpackage.zt6
        public void x(a0 a0Var, zt6.c cVar) {
            this.a.x(a0Var, this.b);
        }
    }

    au6(zt6.a aVar, ImmutableList<eu6> immutableList, ImmutableList<gu6> immutableList2) {
        this.a = aVar;
        this.b = immutableList;
        this.c = immutableList2;
    }

    @Override // defpackage.zt6.b
    public zt6 a(ToolbarConfiguration toolbarConfiguration, zt6.c cVar, zt6.d<eu6> dVar, zt6.d<gu6> dVar2) {
        return new a(this, this.a.a(toolbarConfiguration, dVar2.a(this.c), dVar.a(this.b)), cVar);
    }
}
