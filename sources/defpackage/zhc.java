package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ToggleButton;
import androidx.core.widget.c;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import defpackage.sna;
import defpackage.yrc;

/* renamed from: zhc  reason: default package */
public class zhc implements yrc {
    private final Context a;
    private final sna b;
    private final xhc c;
    private final oic d;

    /* renamed from: zhc$a */
    public static class a extends csc {
        String b;
        String c;
        boolean d;
        boolean e;

        public a() {
            c(true);
        }

        public String e() {
            return this.c;
        }

        public String f() {
            return this.b;
        }

        public void g(boolean z) {
            this.e = z;
        }

        public void h(boolean z) {
            this.d = z;
        }

        public void i(String str) {
            this.c = str;
        }

        public void j(String str) {
            this.b = str;
        }
    }

    /* renamed from: zhc$b */
    public static class b extends yrc.a {
        private final ToggleButton C;
        private final ImageButton D;

        public b(View view, ImageButton imageButton, oic oic) {
            super(view);
            ToggleButton toggleButton = (ToggleButton) view.findViewById(C0707R.id.follow_button);
            this.C = toggleButton;
            this.D = imageButton;
            new com.spotify.paste.widgets.internal.a((ViewGroup) view.findViewById(C0707R.id.context_menu_holder)).f(imageButton);
            oic.a(toggleButton, C0707R.dimen.podcast_follow_button_offset);
        }

        /* access modifiers changed from: package-private */
        public void j0(View.OnClickListener onClickListener) {
            this.D.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void l0(boolean z) {
            this.C.setChecked(z);
        }

        /* access modifiers changed from: package-private */
        public void m0(Drawable drawable) {
            c.h(this.C, null, null, drawable, null);
            this.C.setCompoundDrawablePadding(drawable != null ? nud.f(8.0f, this.C.getContext().getResources()) : 0);
        }

        /* access modifiers changed from: package-private */
        public void s0(String str) {
            this.C.setText(str);
        }

        /* access modifiers changed from: package-private */
        public void u0(View.OnClickListener onClickListener) {
            this.C.setOnClickListener(onClickListener);
        }
    }

    public zhc(Context context, sna sna, xhc xhc, oic oic) {
        this.a = context;
        this.b = sna;
        this.c = xhc;
        this.d = oic;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    public /* synthetic */ void b(a aVar, View view) {
        this.c.a(aVar);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        b bVar = (b) b0Var;
        a aVar = (a) csc;
        String string = this.a.getResources().getString(aVar.d ? C0707R.string.options_menu_following : C0707R.string.options_menu_follow);
        Drawable d2 = aVar.e ? androidx.core.content.a.d(this.a, C0707R.drawable.dropdown_icon) : null;
        sna.a aVar2 = new sna.a(aVar.b, aVar.c, aVar.d);
        bVar.s0(string);
        bVar.m0(d2);
        bVar.l0(aVar.d);
        bVar.u0(new vhc(this, aVar2, bVar));
        bVar.j0(new whc(this, aVar));
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_adapter_delegate_podcast_info, viewGroup, false);
        Context context = this.a;
        ImageButton h = z42.h(context, z42.e(context, SpotifyIconV2.MORE_ANDROID));
        h.setContentDescription(this.a.getString(C0707R.string.context_menu_content_description));
        q4.G(inflate, C0707R.id.follow_button).setHapticFeedbackEnabled(true);
        return new b(inflate, h, this.d);
    }

    public /* synthetic */ void f(sna.a aVar, b bVar, View view) {
        this.b.a(aVar);
        bVar.C.performHapticFeedback(1);
    }
}
