package com.spotify.music.playlist.permissions;

import androidx.lifecycle.m;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import com.spotify.music.playlist.permissions.j;
import com.spotify.music.playlist.permissions.proto.Permission;
import com.spotify.music.playlist.permissions.proto.PermissionLevel;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlaylistPermissionsBottomSheetFragmentPresenterImpl implements l, m {
    private final p a = new p();
    private final s b;
    private final y c;
    private final a f;
    private final SnackbarManager n;
    private final e o;
    private final j.b p;

    private static abstract class a {

        /* renamed from: com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentPresenterImpl$a$a  reason: collision with other inner class name */
        public static final class C0322a extends a {
            public static final C0322a a = new C0322a();

            private C0322a() {
                super(null);
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    static final class b<T, R> implements l<Permission, a> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public a apply(Permission permission) {
            h.e(permission, "it");
            return a.c.a;
        }
    }

    static final class c<T> implements g<a> {
        final /* synthetic */ PlaylistPermissionsBottomSheetFragmentPresenterImpl a;

        c(PlaylistPermissionsBottomSheetFragmentPresenterImpl playlistPermissionsBottomSheetFragmentPresenterImpl) {
            this.a = playlistPermissionsBottomSheetFragmentPresenterImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(a aVar) {
            a aVar2 = aVar;
            if (aVar2 instanceof a.c) {
                this.a.o.dismiss();
            } else if (aVar2 instanceof a.b) {
                this.a.o.a(true);
            } else if (aVar2 instanceof a.C0322a) {
                PlaylistPermissionsBottomSheetFragmentPresenterImpl.c(this.a);
                this.a.o.a(false);
            }
        }
    }

    public PlaylistPermissionsBottomSheetFragmentPresenterImpl(s sVar, y yVar, a aVar, SnackbarManager snackbarManager, e eVar, j.b bVar) {
        h.e(sVar, "logger");
        h.e(yVar, "mainThreadScheduler");
        h.e(aVar, "endpoint");
        h.e(snackbarManager, "snackbarManager");
        h.e(eVar, "events");
        h.e(bVar, "result");
        this.b = sVar;
        this.c = yVar;
        this.f = aVar;
        this.n = snackbarManager;
        this.o = eVar;
        this.p = bVar;
    }

    public static final void c(PlaylistPermissionsBottomSheetFragmentPresenterImpl playlistPermissionsBottomSheetFragmentPresenterImpl) {
        SnackbarManager snackbarManager = playlistPermissionsBottomSheetFragmentPresenterImpl.n;
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.not_translated_playlist_permissions_failed_to_save).build();
        h.d(build, "SnackbarConfiguration\n  …s_failed_to_save).build()");
        snackbarManager.show(build);
    }

    @Override // com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter.c
    public void a(PlaylistPermissionsBottomSheetFragmentAdapter.a aVar, int i) {
        PermissionLevel permissionLevel;
        h.e(aVar, "data");
        int ordinal = aVar.c().ordinal();
        if (ordinal == 1) {
            this.b.b();
        } else if (ordinal == 2) {
            this.b.d();
        } else if (ordinal == 3) {
            this.b.a();
        }
        p pVar = this.a;
        s i0 = s.i0(a.b.a);
        a aVar2 = this.f;
        l0 z = l0.z(this.p.b());
        h.d(z, "SpotifyLink.of(result.playlistUri)");
        String i2 = z.i();
        h.d(i2, "SpotifyLink.of(result.playlistUri).id");
        PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType c2 = aVar.c();
        Permission.b bVar = (Permission.b) this.p.a().toBuilder();
        int ordinal2 = c2.ordinal();
        if (ordinal2 == 1) {
            permissionLevel = PermissionLevel.VIEWER;
        } else if (ordinal2 != 2) {
            permissionLevel = PermissionLevel.UNKNOWN;
        } else {
            permissionLevel = PermissionLevel.BLOCKED;
        }
        bVar.m(permissionLevel);
        GeneratedMessageLite build = bVar.build();
        h.d(build, "result.permission.toBuil…pe))\n            .build()");
        pVar.b(s.s(i0, aVar2.b(i2, (Permission) build).P().j0(b.a).p0(s.i0(a.C0322a.a))).o0(this.c).subscribe(new c(this)));
    }

    @Override // com.spotify.music.playlist.permissions.l
    public void stop() {
        this.a.a();
    }
}
