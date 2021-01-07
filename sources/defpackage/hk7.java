package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.follow.i;
import com.spotify.music.libs.viewuri.c;
import defpackage.gk7;
import defpackage.w22;

/* renamed from: hk7  reason: default package */
public class hk7 implements gk7 {
    public static final /* synthetic */ int q = 0;
    private final Context a;
    private final c b;
    private final u22 c;
    private final f f;
    private final j42 n;
    private gk7.a o = dk7.a;
    private boolean p;

    public hk7(Context context, c cVar, u22 u22, f fVar, j42 j42) {
        this.a = context;
        this.b = cVar;
        this.c = u22;
        this.f = fVar;
        this.n = j42;
    }

    @Override // defpackage.gk7
    public void Q(boolean z) {
        this.p = z;
    }

    @Override // defpackage.gk7
    public void Q0(p90 p90, ProfileListItem profileListItem) {
        View view = p90.getView();
        view.setOnLongClickListener(this.n);
        view.setTag(C0707R.id.context_menu_tag, new i42(this, profileListItem));
    }

    @Override // defpackage.gk7
    public void Y0(p90 p90, ProfileListItem profileListItem) {
        View b2 = i.b(this.a);
        ((Checkable) b2).setChecked(profileListItem.b().e());
        b2.setOnClickListener(new ck7(this, profileListItem));
        p90.z0(b2);
    }

    @Override // defpackage.gk7
    public void Z0(p90 p90) {
        View view = p90.getView();
        view.setOnLongClickListener(null);
        view.setTag(C0707R.id.context_menu_tag, null);
    }

    public /* synthetic */ void a(ProfileListItem profileListItem, View view) {
        this.o.a(profileListItem);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(ProfileListItem profileListItem) {
        ProfileListItem profileListItem2 = profileListItem;
        int ordinal = profileListItem2.h().ordinal();
        if (ordinal == 1 || ordinal == 2) {
            w22.d d = this.c.a(profileListItem2.i(), profileListItem2.f()).a(this.b).d(false);
            d.i(true);
            d.c(true);
            d.f(false);
            return d.b();
        } else if (ordinal == 3) {
            return this.f.a(profileListItem2.i(), profileListItem2.f()).a(this.b).d(this.p).c(true).b();
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    @Override // defpackage.gk7
    public void p2(gk7.a aVar) {
        this.o = (gk7.a) MoreObjects.firstNonNull(aVar, dk7.a);
    }
}
