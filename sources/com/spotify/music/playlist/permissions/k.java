package com.spotify.music.playlist.permissions;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import com.spotify.music.playlist.permissions.j;
import com.spotify.music.playlist.permissions.proto.Permission;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class k {
    private final String a;
    private final a b;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<Permission, j> {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public j apply(Permission permission) {
            Permission permission2 = permission;
            h.e(permission2, "permission");
            return k.a(this.a, permission2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements l<Throwable, d0<? extends j>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends j> apply(Throwable th) {
            h.e(th, "it");
            return z.z(j.a.a);
        }
    }

    public k(String str, a aVar) {
        h.e(str, "playlistUri");
        h.e(aVar, "endpoint");
        this.a = str;
        this.b = aVar;
    }

    public static final j a(k kVar, Permission permission) {
        PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType permissionType;
        String str = kVar.a;
        int ordinal = permission.i().ordinal();
        if (ordinal == 1) {
            permissionType = PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.PRIVATE;
        } else if (ordinal != 2) {
            permissionType = PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.NONE;
        } else {
            permissionType = PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.PUBLIC;
        }
        return new j.b(str, permissionType, permission);
    }

    public z<j> b() {
        a aVar = this.b;
        l0 z = l0.z(this.a);
        h.d(z, "SpotifyLink.of(playlistUri)");
        String i = z.i();
        h.d(i, "SpotifyLink.of(playlistUri).id");
        z<R> D = aVar.a(i).A(new a(this)).D(b.a);
        h.d(D, "endpoint.getBasePermissi…gle.just(Result.Failed) }");
        return D;
    }
}
