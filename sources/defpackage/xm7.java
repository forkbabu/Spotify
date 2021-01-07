package defpackage;

import android.widget.Toast;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: xm7  reason: default package */
public final /* synthetic */ class xm7 implements g {
    public final /* synthetic */ EditProfileActivity a;

    public /* synthetic */ xm7(EditProfileActivity editProfileActivity) {
        this.a = editProfileActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        km7.m mVar = (km7.m) obj;
        Toast.makeText(this.a, (int) C0707R.string.error_general_title, 1).show();
    }
}
