package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import com.spotify.music.playlist.permissions.proto.Permission;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class j {

    public static final class a extends j {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends j {
        private final String a;
        private final PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType b;
        private final Permission c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType permissionType, Permission permission) {
            super(null);
            h.e(str, "playlistUri");
            h.e(permissionType, "type");
            h.e(permission, "permission");
            this.a = str;
            this.b = permissionType;
            this.c = permission;
        }

        public final Permission a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType permissionType = this.b;
            int hashCode2 = (hashCode + (permissionType != null ? permissionType.hashCode() : 0)) * 31;
            Permission permission = this.c;
            if (permission != null) {
                i = permission.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded(playlistUri=");
            V0.append(this.a);
            V0.append(", type=");
            V0.append(this.b);
            V0.append(", permission=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    private j() {
    }

    public j(f fVar) {
    }
}
