package defpackage;

import android.view.View;
import com.spotify.music.features.profile.model.ProfileListItem;
import defpackage.ek7;

/* renamed from: ak7  reason: default package */
public final /* synthetic */ class ak7 implements View.OnClickListener {
    public final /* synthetic */ ek7.b a;
    public final /* synthetic */ ProfileListItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ ak7(ek7.b bVar, ProfileListItem profileListItem, int i) {
        this.a = bVar;
        this.b = profileListItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ek7.b bVar = this.a;
        ek7.this.t.a(this.b, this.c);
    }
}
