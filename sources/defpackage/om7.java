package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: om7  reason: default package */
public final /* synthetic */ class om7 implements g {
    public final /* synthetic */ EditProfilePermissionsManager a;

    public /* synthetic */ om7(EditProfilePermissionsManager editProfilePermissionsManager) {
        this.a = editProfilePermissionsManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        km7.g gVar = (km7.g) obj;
        this.a.d();
    }
}
