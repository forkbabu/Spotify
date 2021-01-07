package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayTrackQueueUtils;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.spotlets.common.recyclerview.f;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.queue.view.b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nw7  reason: default package */
public class nw7 extends f<sx7> {
    private final lx7 a;
    private final ox7 b;
    private final nx7 c;
    private final Map<String, Boolean> d = new HashMap();
    private boolean e;
    private boolean f;

    public nw7(lx7 lx7, ox7 ox7, nx7 nx7) {
        this.a = lx7;
        ox7.getClass();
        this.b = ox7;
        this.c = nx7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, java.lang.Object, int] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public void b(RecyclerView.b0 b0Var, sx7 sx7, int i) {
        sx7 sx72 = sx7;
        PlayerTrack f2 = sx72.f();
        if (PlayerQueueUtil.isDelimiter(f2)) {
            b0Var.a.setVisibility(8);
            b0Var.a.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            return;
        }
        b0Var.a.setVisibility(0);
        b0Var.a.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        b bVar = (b) b0Var;
        bVar.setTitle(z42.s(f2, "title"));
        bVar.setSubtitle(PlayerTrackUtil.getArtists(f2));
        bVar.setAppearsDisabled((this.f && PlayerTrackUtil.is19Plus(f2)) || (this.e && PlayerTrackUtil.isExplicit(f2) && !PlayerTrackUtil.is19Plus(f2)));
        if (PlayerTrackUtil.is19Plus(f2)) {
            TextLabelUtil.a(bVar.getSubtitleView().getContext(), bVar.getSubtitleView(), true);
        } else {
            TextLabelUtil.b(bVar.getSubtitleView().getContext(), bVar.getSubtitleView(), PlayerTrackUtil.isExplicit(f2));
        }
        if (sx72.c() || !z42.s(f2, "availability_restrictions").isEmpty()) {
            bVar.j0();
            bVar.a.setEnabled(false);
            bVar.a.setClickable(false);
            bVar.m0(false);
        } else {
            bVar.a.setOnClickListener(new iw7(this, f2));
            bVar.u0(new jw7(this, f2, sx72));
            bVar.a.setEnabled(true);
            bVar.a.setClickable(true);
            bVar.m0(true);
            bVar.v0();
        }
        bVar.l0(((Boolean) x.n(this.d.get(PlayTrackQueueUtils.getGloballyUniqueUid(f2)), Boolean.FALSE)).booleanValue());
        if (sx72.b()) {
            bVar.h0().setOnTouchListener(new mw7(this, bVar));
            bVar.s0(true);
            return;
        }
        bVar.s0(false);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public RecyclerView.b0 c(ViewGroup viewGroup) {
        return new b(viewGroup.getContext(), viewGroup);
    }

    public void e() {
        this.d.clear();
    }

    public /* synthetic */ void f(PlayerTrack playerTrack, View view) {
        this.c.a(playerTrack);
    }

    public void g(PlayerTrack playerTrack, sx7 sx7, CompoundButton compoundButton, boolean z) {
        boolean z2;
        String globallyUniqueUid = PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack);
        if (!this.d.containsKey(globallyUniqueUid)) {
            z2 = false;
        } else {
            z2 = this.d.get(globallyUniqueUid).booleanValue();
        }
        if (z != z2) {
            this.d.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack), Boolean.valueOf(z));
            this.a.b(sx7, z);
        }
    }

    public void h(boolean z) {
        this.f = z;
    }

    public void i(boolean z) {
        this.e = z;
    }
}
