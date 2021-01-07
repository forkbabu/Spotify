package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import defpackage.km7;
import defpackage.lm7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: rm7  reason: default package */
public final /* synthetic */ class rm7 implements l {
    public final /* synthetic */ EditProfilePermissionsManager a;

    public /* synthetic */ rm7(EditProfilePermissionsManager editProfilePermissionsManager) {
        this.a = editProfilePermissionsManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        km7.b bVar = (km7.b) obj;
        EditProfilePermissionsManager.PermissionStatus a2 = this.a.a();
        h.e(a2, "permissionStatus");
        return new lm7.c(a2);
    }
}
