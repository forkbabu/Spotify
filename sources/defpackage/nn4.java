package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.connect.dialogs.g;
import com.spotify.paste.widgets.layouts.AspectRatioView;

/* renamed from: nn4  reason: default package */
public class nn4 extends xba {
    private final ao4 a;
    private final e b;
    private a c;

    /* renamed from: nn4$a */
    public interface a {
    }

    /* renamed from: nn4$b */
    public static class b extends RecyclerView.b0 {
        final m90 C;

        public b(m90 m90) {
            super(m90.getView());
            this.C = m90;
        }
    }

    public nn4(ao4 ao4, e eVar) {
        this.a = ao4;
        this.b = eVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        m90 a2 = e90.b().a(viewGroup.getContext(), viewGroup);
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(C0707R.dimen.connect_education_card_padding);
        int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(C0707R.dimen.connect_education_card_text_view_horizontal_padding);
        a2.getView().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        a2.getTitleView().setPadding(dimensionPixelSize2, a2.getTitleView().getPaddingTop(), dimensionPixelSize2, a2.getTitleView().getPaddingBottom());
        if (a2.getView() instanceof AspectRatioView) {
            ((AspectRatioView) a2.getView()).setAspectRatio(1.0f);
        }
        nud.p(a2.getView().getContext(), a2.getTitleView(), C0707R.attr.pasteTextAppearanceBodyMedium);
        return new b(a2);
    }

    @Override // defpackage.qu0
    public int c() {
        return this.a.b().size();
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{51};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
        if (b0Var instanceof b) {
            zn4 zn4 = this.a.b().get(i);
            b bVar = (b) b0Var;
            bVar.C.setTitle(zn4.h());
            bVar.C.m2(zn4.f());
            ((vt0) this.b.b()).f(((PageIdentifiers) g.a(zn4)).path());
            ViewGroup viewGroup = (ViewGroup) bVar.a;
            viewGroup.setClickable(true);
            viewGroup.setFocusable(true);
            viewGroup.setOnClickListener(new jn4(this, zn4, i));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", b.class.getSimpleName(), b0Var.getClass().getSimpleName()));
    }

    @Override // defpackage.xba
    public int g(int i) {
        return 1;
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return (long) this.a.b().get(i).hashCode();
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return 51;
    }

    public void h(zn4 zn4, int i, View view) {
        a aVar = this.c;
        if (aVar != null) {
            ((cp4) aVar).a.u1(zn4, i);
        }
    }

    public void i(a aVar) {
        this.c = aVar;
    }
}
