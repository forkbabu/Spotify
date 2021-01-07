package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.o;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.SortCriteria;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.SortDiscographyDialogFragment;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.b;
import com.spotify.music.features.freetierartist.t;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: g65  reason: default package */
public final class g65 implements Object<View>, pk9 {
    private final o a;
    private final b b;

    /* renamed from: g65$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ g65 a;

        a(g65 g65) {
            this.a = g65;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SortDiscographyDialogFragment sortDiscographyDialogFragment = new SortDiscographyDialogFragment();
            sortDiscographyDialogFragment.b5(this.a.b);
            sortDiscographyDialogFragment.Y4(this.a.a, "discography-sort-criteria");
        }
    }

    public g65(o oVar, b bVar) {
        h.e(oVar, "fragmentManager");
        h.e(bVar, "sortCriteriaRepository");
        this.a = oVar;
        this.b = bVar;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        d55 a2 = d55.a(view);
        h.d(a2, "DiscographySortBarBinding.bind(view)");
        TextView textView = a2.a;
        h.d(textView, "binding.sortCriteria");
        SortCriteria b2 = this.b.b();
        Context context = view.getContext();
        h.d(context, "view.context");
        textView.setText(t.a(b2, context));
        a2.a.setOnClickListener(new a(this));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.discography_sort_bar;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.discography_sort_bar, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…_sort_bar, parent, false)");
        return inflate;
    }
}
