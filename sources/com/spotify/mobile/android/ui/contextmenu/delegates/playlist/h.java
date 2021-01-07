package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;

public class h {
    private final z3<j> a;
    private final AndroidLibsContextMenuPlaylistProperties b;

    /* access modifiers changed from: package-private */
    public class a implements e, b, c, d {
        private final PlaylistMenuMaker.a a;
        private y3<j> b;
        private com.spotify.music.libs.viewuri.c c;
        private boolean d;
        private boolean e;
        private Optional<s3> f = Optional.absent();
        private Optional<ifd> g = Optional.absent();

        a(PlaylistMenuMaker.a aVar) {
            this.a = aVar;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h.e
        public b a(com.spotify.music.libs.viewuri.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h.d
        public r3 b() {
            PlaylistMenuMaker.EditOption editOption;
            PlaylistMenuMaker.a aVar = this.a;
            ifd or = this.g.or((Optional<ifd>) kfd.w1);
            com.spotify.music.libs.viewuri.c cVar = this.c;
            cVar.getClass();
            boolean z = this.d;
            boolean z2 = this.e;
            int ordinal = h.this.b.a().ordinal();
            if (ordinal == 1) {
                editOption = PlaylistMenuMaker.EditOption.SHOW_WHEN_OWNED_BY_SELF;
            } else if (ordinal != 2) {
                editOption = PlaylistMenuMaker.EditOption.NO_SHOW;
            } else {
                editOption = PlaylistMenuMaker.EditOption.SHOW_WHEN_CAN_MODIFY_CONTENTS;
            }
            return r3.a(this.b, h.this.a, aVar.e(or, cVar, z, z2, editOption, this.f.or((Optional<s3>) s3.a)));
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h.c
        public d c(boolean z) {
            this.e = z;
            return this;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.delegates.playlist.h.b
        public c d(boolean z) {
            this.d = z;
            return this;
        }

        public e e(String str, String str2) {
            this.b = y3.k(PageIdentifiers.CONTEXTMENU_PLAYLIST, str, str2);
            return this;
        }
    }

    public interface b {
        c d(boolean z);
    }

    public interface c {
        d c(boolean z);
    }

    public interface d {
        r3 b();
    }

    public interface e {
        b a(com.spotify.music.libs.viewuri.c cVar);
    }

    public h(z3<j> z3Var, AndroidLibsContextMenuPlaylistProperties androidLibsContextMenuPlaylistProperties) {
        this.a = z3Var;
        this.b = androidLibsContextMenuPlaylistProperties;
    }
}
