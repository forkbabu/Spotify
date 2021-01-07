package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: cn7  reason: default package */
public final /* synthetic */ class cn7 implements w {
    public final /* synthetic */ EditProfilePermissionsManager a;

    public /* synthetic */ cn7(EditProfilePermissionsManager editProfilePermissionsManager) {
        this.a = editProfilePermissionsManager;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.j0(new zm7(this.a));
    }
}
