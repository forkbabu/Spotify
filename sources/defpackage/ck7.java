package defpackage;

import android.view.View;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: ck7  reason: default package */
public final /* synthetic */ class ck7 implements View.OnClickListener {
    public final /* synthetic */ hk7 a;
    public final /* synthetic */ ProfileListItem b;

    public /* synthetic */ ck7(hk7 hk7, ProfileListItem profileListItem) {
        this.a = hk7;
        this.b = profileListItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
