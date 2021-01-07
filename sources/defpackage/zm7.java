package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import defpackage.km7;
import defpackage.lm7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: zm7  reason: default package */
public final /* synthetic */ class zm7 implements l {
    public final /* synthetic */ EditProfilePermissionsManager a;

    public /* synthetic */ zm7(EditProfilePermissionsManager editProfilePermissionsManager) {
        this.a = editProfilePermissionsManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        km7.c cVar = (km7.c) obj;
        EditProfilePermissionsManager.PermissionStatus c = this.a.c();
        h.e(c, "permissionStatus");
        return new lm7.q(c);
    }
}
