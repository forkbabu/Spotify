package com.spotify.music.playlist.permissions;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

public abstract class PlaylistPermissionsBottomSheetFragmentAdapter extends RecyclerView.e<RecyclerView.b0> {

    public enum PermissionType {
        NONE,
        PUBLIC,
        PRIVATE,
        UNLISTED
    }

    public static final class a {
        private final PermissionType a;
        private final int b;
        private final int c;

        public a(PermissionType permissionType, int i, int i2) {
            h.e(permissionType, "type");
            this.a = permissionType;
            this.b = i;
            this.c = i2;
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final PermissionType c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            PermissionType permissionType = this.a;
            return ((((permissionType != null ? permissionType.hashCode() : 0) * 31) + this.b) * 31) + this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Data(type=");
            V0.append(this.a);
            V0.append(", title=");
            V0.append(this.b);
            V0.append(", subtitle=");
            return je.B0(V0, this.c, ")");
        }
    }

    public interface b {
        PlaylistPermissionsBottomSheetFragmentAdapter a(c cVar);
    }

    public interface c {
        void a(a aVar, int i);
    }

    public abstract void X(boolean z);

    public abstract void Y(PermissionType permissionType);
}
