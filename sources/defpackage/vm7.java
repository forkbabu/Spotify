package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: vm7  reason: default package */
public final /* synthetic */ class vm7 implements g {
    public final /* synthetic */ EditProfileActivity a;

    public /* synthetic */ vm7(EditProfileActivity editProfileActivity) {
        this.a = editProfileActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        EditProfileActivity editProfileActivity = this.a;
        km7.e eVar = (km7.e) obj;
        editProfileActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", editProfileActivity.getPackageName(), null)));
    }
}
