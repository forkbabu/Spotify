package com.spotify.music.features.profile.editprofile.permissions;

import androidx.core.content.a;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;

public class EditProfilePermissionsManager {
    private final EditProfileActivity a;

    public enum PermissionStatus {
        ALLOWED,
        DENIED,
        PERMANENTLY_DENIED
    }

    public EditProfilePermissionsManager(EditProfileActivity editProfileActivity) {
        this.a = editProfileActivity;
    }

    private PermissionStatus b(String str) {
        if (a.a(this.a, str) == 0) {
            return PermissionStatus.ALLOWED;
        }
        if (androidx.core.app.a.j(this.a, str)) {
            return PermissionStatus.DENIED;
        }
        return PermissionStatus.PERMANENTLY_DENIED;
    }

    public PermissionStatus a() {
        return b("android.permission.CAMERA");
    }

    public PermissionStatus c() {
        return b("android.permission.READ_EXTERNAL_STORAGE");
    }

    public void d() {
        androidx.core.app.a.i(this.a, new String[]{"android.permission.CAMERA"}, 1);
    }

    public void e() {
        androidx.core.app.a.i(this.a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
    }
}
