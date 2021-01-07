package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: nm7  reason: default package */
public final /* synthetic */ class nm7 implements g {
    public final /* synthetic */ EditProfilePermissionsManager a;

    public /* synthetic */ nm7(EditProfilePermissionsManager editProfilePermissionsManager) {
        this.a = editProfilePermissionsManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        km7.h hVar = (km7.h) obj;
        this.a.e();
    }
}
