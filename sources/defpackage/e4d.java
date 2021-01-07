package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.sleeptimer.n;
import com.spotify.ubi.specification.factories.u3;
import io.reactivex.s;

/* renamed from: e4d  reason: default package */
public class e4d implements x3<Void> {
    private final ImmutableMap<Integer, String> b;
    private final Context c;
    private final d4d d;
    private final n e;
    private final LinkType f;
    private final u3 g;
    private final ImmutableMap<Integer, nqe> h;

    public e4d(Context context, d4d d4d, n nVar, LinkType linkType, String str) {
        this.c = context;
        this.d = d4d;
        this.e = nVar;
        this.f = linkType;
        Resources resources = context.getResources();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Integer valueOf = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_5_mins);
        builder.mo51put(valueOf, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_mins, 5, 5));
        Integer valueOf2 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_10_mins);
        builder.mo51put(valueOf2, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_mins, 10, 10));
        Integer valueOf3 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_15_mins);
        builder.mo51put(valueOf3, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_mins, 15, 15));
        Integer valueOf4 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_30_mins);
        builder.mo51put(valueOf4, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_mins, 30, 30));
        Integer valueOf5 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_45_mins);
        builder.mo51put(valueOf5, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_mins, 45, 45));
        Integer valueOf6 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_1_hour);
        builder.mo51put(valueOf6, resources.getQuantityString(C0707R.plurals.context_menu_sleep_timer_hours, 1, 1));
        Integer valueOf7 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_end_of_episode);
        builder.mo51put(valueOf7, context.getString(C0707R.string.context_menu_sleep_timer_end_of_episode));
        Integer valueOf8 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_end_of_track);
        builder.mo51put(valueOf8, context.getString(C0707R.string.context_menu_sleep_timer_end_of_track));
        Integer valueOf9 = Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_turn_off);
        builder.mo51put(valueOf9, context.getString(C0707R.string.context_menu_sleep_timer_turn_off));
        this.b = builder.build();
        u3 u3Var = new u3(str);
        this.g = u3Var;
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put(valueOf, u3Var.e().a(5));
        builder2.mo51put(valueOf2, u3Var.e().a(10));
        builder2.mo51put(valueOf3, u3Var.e().a(15));
        builder2.mo51put(valueOf4, u3Var.e().a(30));
        builder2.mo51put(valueOf5, u3Var.e().a(45));
        builder2.mo51put(valueOf6, u3Var.e().a(60));
        builder2.mo51put(valueOf7, u3Var.d().a(str));
        builder2.mo51put(valueOf8, u3Var.d().a(str));
        builder2.mo51put(valueOf9, u3Var.c().a());
        this.h = builder2.build();
    }

    private void d(ContextMenuViewModel contextMenuViewModel, int i) {
        nqe nqe = this.h.get(Integer.valueOf(i));
        if (nqe == null) {
            nqe = this.g.b().a();
        }
        b a = contextMenuViewModel.a(i, this.b.get(Integer.valueOf(i)));
        a.l(true);
        a.n(this.d, new z3d(nqe));
    }

    private ContextMenuViewModel e() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.G(this.c.getString(C0707R.string.context_menu_sleep_timer_title));
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_5_mins);
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_10_mins);
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_15_mins);
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_30_mins);
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_45_mins);
        d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_1_hour);
        if (this.f == LinkType.SHOW_EPISODE) {
            d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_end_of_episode);
        } else {
            d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_end_of_track);
        }
        if (this.e.e()) {
            d(contextMenuViewModel, C0707R.id.menu_item_sleep_timer_turn_off);
        }
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Void> y3Var) {
        return s.i0(e());
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Void> y3Var) {
        return e();
    }
}
