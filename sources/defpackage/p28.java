package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;

/* renamed from: p28  reason: default package */
public class p28 extends ArrayAdapter<PlayerTrack> {
    private final c a;
    private final com.spotify.android.flags.c b;
    private final b42 c;
    private String f = "";
    private boolean n;
    private final b4<PlayerTrack> o = new a();

    /* renamed from: p28$a */
    class a implements b4<PlayerTrack> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(PlayerTrack playerTrack) {
            PlayerTrack playerTrack2 = playerTrack;
            return p28.this.c.a(playerTrack2.uri(), playerTrack2.metadata().get("title"), p28.this.a.toString()).a(p28.this.a).t(!MoreObjects.isNullOrEmpty(playerTrack2.metadata().get("album_uri"))).g(!MoreObjects.isNullOrEmpty(playerTrack2.metadata().get("artist_uri"))).r(true).w(false).b();
        }
    }

    public p28(Activity activity, c cVar, com.spotify.android.flags.c cVar2, b42 b42) {
        super(activity, 0);
        this.a = cVar;
        this.b = cVar2;
        this.c = b42;
    }

    public void c(boolean z) {
        this.n = z;
        notifyDataSetChanged();
    }

    public void d(PlayerTrack playerTrack) {
        String str = "";
        if (playerTrack != null) {
            if (!MoreObjects.isNullOrEmpty(playerTrack.uid())) {
                str = playerTrack.uid();
            } else if (!MoreObjects.isNullOrEmpty(playerTrack.uri())) {
                str = playerTrack.uri();
            }
        }
        if (!str.equals(this.f)) {
            this.f = str;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = e90.i;
        x90 x90 = (x90) l70.p(view, x90.class);
        boolean z = true;
        boolean z2 = !z42.C(this.b);
        if (x90 == null) {
            x90 = e90.d().h(getContext(), viewGroup, z2);
        }
        PlayerTrack playerTrack = (PlayerTrack) getItem(i);
        String str = playerTrack.metadata().get("title");
        String str2 = playerTrack.metadata().get("artist_name");
        String str3 = playerTrack.metadata().get("album_title");
        String sb = (nud.m(getContext()) ? je.a1(str3, " • ", str2) : je.a1(str2, " • ", str3)).toString();
        x90.setTitle(str);
        x90.setSubtitle(sb);
        boolean isExplicit = PlayerTrackUtil.isExplicit(playerTrack);
        TextLabelUtil.b(getContext(), x90.getSubtitleView(), isExplicit);
        x90.setAppearsDisabled(this.n && isExplicit);
        x90.z0(p42.c(getContext(), this.o, playerTrack, this.a));
        x90.getView().setTag(C0707R.id.context_menu_tag, new i42(this.o, playerTrack));
        if (this.f.equals("") || (!this.f.equals(playerTrack.uid()) && !this.f.equals(playerTrack.uri()))) {
            z = false;
        }
        x90.setActive(z);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin);
        x90.getView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        return x90.getView();
    }
}
