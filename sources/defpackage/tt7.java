package defpackage;

import com.spotify.music.features.profile.model.ProfileListItem;
import defpackage.gk7;
import defpackage.lt7;
import kotlin.jvm.internal.h;

/* renamed from: tt7  reason: default package */
public final /* synthetic */ class tt7 implements gk7.a {
    public final /* synthetic */ da2 a;

    public /* synthetic */ tt7(da2 da2) {
        this.a = da2;
    }

    @Override // defpackage.gk7.a
    public final void a(ProfileListItem profileListItem) {
        da2 da2 = this.a;
        h.e(profileListItem, "profileListItem");
        da2.accept(new lt7.d(profileListItem));
    }
}
