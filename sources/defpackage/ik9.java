package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.n;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: ik9  reason: default package */
public class ik9 implements Object<View>, pk9 {
    private final c.a a;
    private final zec b;

    /* renamed from: ik9$a */
    class a extends BroadcastReceiver {
        final /* synthetic */ View a;

        a(ik9 ik9, View view) {
            this.a = view;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ShufflePlayHeaderView.a(new n(), this.a);
        }
    }

    /* renamed from: ik9$b */
    class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ Context a;
        final /* synthetic */ BroadcastReceiver b;

        b(ik9 ik9, Context context, BroadcastReceiver broadcastReceiver) {
            this.a = context;
            this.b = broadcastReceiver;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e6.b(this.a).c(this.b, new IntentFilter("on-demand-restricted"));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e6.b(this.a).e(this.b);
        }
    }

    public ik9(c.a aVar, zec zec) {
        this.a = aVar;
        this.b = zec;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        t51.a(w51, view, s81);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.round_shuffle_play_button;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        c a2 = this.a.a(context);
        a2.b(!this.b.c());
        View view = a2.getView();
        view.addOnAttachStateChangeListener(new b(this, context, new a(this, view)));
        return view;
    }
}
