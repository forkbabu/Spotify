package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.C0707R;
import io.reactivex.s;

/* renamed from: moc  reason: default package */
public class moc implements x3<Integer> {
    private final ImmutableMap<Integer, Integer> b;
    private final Context c;
    private final goc d;
    private final ImmutableList<Integer> e;
    private final ioc f;
    private final koc g;

    public moc(Context context, goc goc, ImmutableList<Integer> immutableList, ioc ioc, koc koc) {
        this.c = context;
        this.d = goc;
        this.e = immutableList;
        this.f = ioc;
        this.g = koc;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(je.a0(C0707R.string.context_menu_speed_control_120, builder, je.a0(C0707R.string.context_menu_speed_control_100, builder, je.a0(C0707R.string.context_menu_speed_control_80, builder, je.a0(C0707R.string.context_menu_speed_control_50, builder, Integer.valueOf((int) C0707R.id.menu_item_speed_control_50), C0707R.id.menu_item_speed_control_80), C0707R.id.menu_item_speed_control_100), C0707R.id.menu_item_speed_control_120), C0707R.id.menu_item_speed_control_150), Integer.valueOf((int) C0707R.string.context_menu_speed_control_150));
        if (immutableList.contains(180)) {
            builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_speed_control_180), Integer.valueOf((int) C0707R.string.context_menu_speed_control_180));
        }
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_speed_control_200), Integer.valueOf((int) C0707R.string.context_menu_speed_control_200));
        if (immutableList.contains(250)) {
            builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_speed_control_250), Integer.valueOf((int) C0707R.string.context_menu_speed_control_250));
        }
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_speed_control_300), Integer.valueOf((int) C0707R.string.context_menu_speed_control_300));
        if (immutableList.contains(350)) {
            builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_speed_control_350), Integer.valueOf((int) C0707R.string.context_menu_speed_control_350));
        }
        this.b = builder.build();
    }

    private void d(ContextMenuViewModel contextMenuViewModel, int i, nqe nqe) {
        b a = contextMenuViewModel.a(i, this.c.getString(this.b.get(Integer.valueOf(i)).intValue()));
        a.l(false);
        a.n(this.f, new doc(nqe));
    }

    private ContextMenuViewModel e(String str) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.G(this.c.getString(C0707R.string.context_menu_speed_control_title));
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_50, this.g.a(50, str));
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_80, this.g.a(80, str));
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_100, this.g.a(100, str));
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_120, this.g.a(120, str));
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_150, this.g.a(Integer.valueOf((int) AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), str));
        if (this.e.contains(180)) {
            d(contextMenuViewModel, C0707R.id.menu_item_speed_control_180, this.g.a(180, str));
        }
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_200, this.g.a(200, str));
        if (this.e.contains(250)) {
            d(contextMenuViewModel, C0707R.id.menu_item_speed_control_250, this.g.a(250, str));
        }
        d(contextMenuViewModel, C0707R.id.menu_item_speed_control_300, this.g.a(300, str));
        if (this.e.contains(350)) {
            d(contextMenuViewModel, C0707R.id.menu_item_speed_control_350, this.g.a(350, str));
        }
        return contextMenuViewModel;
    }

    private void g(ContextMenuViewModel contextMenuViewModel, Integer num, String str) {
        Integer a = this.d.a(num);
        nqe a2 = this.g.a(num, str);
        if (a != null) {
            contextMenuViewModel.l().clear();
            UnmodifiableIterator<Integer> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (a.equals(next)) {
                    int intValue = next.intValue();
                    StringBuilder V0 = je.V0("✓ ");
                    V0.append(this.c.getString(this.b.get(Integer.valueOf(intValue)).intValue()));
                    String sb = V0.toString();
                    if (nud.m(this.c)) {
                        sb = this.c.getString(this.b.get(Integer.valueOf(intValue)).intValue()) + " ✓";
                    }
                    b a3 = contextMenuViewModel.a(intValue, sb);
                    a3.l(false);
                    a3.n(this.f, new coc(a2));
                    a3.j(true);
                    a3.k(true);
                } else {
                    d(contextMenuViewModel, next.intValue(), a2);
                }
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Integer> y3Var) {
        ContextMenuViewModel e2 = e(y3Var.j());
        g(e2, y3Var.f(), y3Var.j());
        return this.f.c().j0(new boc(this, y3Var)).G0(e2);
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Integer> y3Var) {
        return e(y3Var.j());
    }

    public /* synthetic */ ContextMenuViewModel f(y3 y3Var, Integer num) {
        this.g.b(num);
        ContextMenuViewModel e2 = e(y3Var.j());
        g(e2, num, y3Var.j());
        return e2;
    }
}
