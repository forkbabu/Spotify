package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.transition.FindSearchFieldViewOldImpl;
import com.spotify.music.libs.search.transition.f;
import com.spotify.music.libs.search.transition.j;
import com.spotify.music.libs.search.transition.k;
import defpackage.s51;

/* renamed from: h64  reason: default package */
public class h64 implements s51<View> {
    private f a;
    private final boolean b;
    private final zab c;
    private final vb4 f;
    private final boolean n;
    private final boolean o;

    public h64(boolean z, zab zab, vb4 vb4, boolean z2, boolean z3) {
        this.b = z;
        this.c = zab;
        this.f = vb4;
        this.n = z2;
        this.o = z3;
    }

    public /* synthetic */ void a(w51 w51, s81 s81, View view) {
        w51.b().a(n61.c("click", s81, ImmutableMap.of("buttonData", e74.a(k.b(view), this.a.getText(), this.a.getAccessibilityText()))));
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        this.a.setText(s81.text().title());
        this.a.setAccessibilityText(s81.text().description());
        this.a.getView().setOnClickListener(new g64(this, w51, s81));
        if (this.b) {
            i91.b(w51.b()).e("voiceMicrophoneClick").d(s81).c(view.findViewById(C0707R.id.search_voice_button)).a();
            this.f.a();
        }
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        ViewGroup viewGroup2;
        Context context = viewGroup.getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.content_area_horizontal_margin);
        if (this.n) {
            j jVar = new j(context);
            this.a = jVar;
            viewGroup2 = (ViewGroup) jVar.getView();
            if (this.o) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.findViewById(C0707R.id.background).getLayoutParams();
                int max = Math.max(dimensionPixelOffset, marginLayoutParams.leftMargin);
                marginLayoutParams.leftMargin = max;
                marginLayoutParams.rightMargin = max;
            }
        } else {
            this.a = new FindSearchFieldViewOldImpl(context, null);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int g = nud.g(12.0f, viewGroup.getResources());
            if (this.o) {
                g = Math.max(dimensionPixelOffset, g);
            }
            int g2 = nud.g(4.0f, viewGroup.getResources());
            linearLayout.setPadding(g, g2, g, g2);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(a.b(context, R.color.gray_7));
            linearLayout.addView(this.a.getView());
            viewGroup2 = linearLayout;
        }
        this.a.setText(context.getString(C0707R.string.find_search_field_hint));
        this.a.setAccessibilityText(context.getString(C0707R.string.find_search_field_hint_voice));
        if (this.b) {
            if (this.n) {
                this.a.setSecondaryButton(this.c.c(context));
            } else {
                viewGroup2.addView(this.c.c(context));
            }
        }
        return viewGroup2;
    }
}
