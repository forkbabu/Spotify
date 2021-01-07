package defpackage;

import android.content.Intent;
import com.spotify.music.features.profile.editprofile.ChangeImageActivity;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: um7  reason: default package */
public final /* synthetic */ class um7 implements g {
    public final /* synthetic */ EditProfileActivity a;

    public /* synthetic */ um7(EditProfileActivity editProfileActivity) {
        this.a = editProfileActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        EditProfileActivity editProfileActivity = this.a;
        boolean a2 = ((km7.f) obj).a();
        int i = ChangeImageActivity.X;
        Intent intent = new Intent(editProfileActivity, ChangeImageActivity.class);
        intent.putExtra("using-camera", a2);
        editProfileActivity.startActivityForResult(intent, 1);
    }
}
