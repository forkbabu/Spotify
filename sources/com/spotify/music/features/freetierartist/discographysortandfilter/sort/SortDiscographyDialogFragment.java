package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.t;
import dagger.android.support.DaggerAppCompatDialogFragment;
import kotlin.jvm.internal.h;

public final class SortDiscographyDialogFragment extends DaggerAppCompatDialogFragment {
    public g v0;
    private b w0;
    private final ContextMenuViewModel x0 = new ContextMenuViewModel();

    static final class a implements e {
        final /* synthetic */ String a;
        final /* synthetic */ SortDiscographyDialogFragment b;
        final /* synthetic */ Context c;

        a(String str, SortDiscographyDialogFragment sortDiscographyDialogFragment, Context context) {
            this.a = str;
            this.b = sortDiscographyDialogFragment;
            this.c = context;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.e
        public final void a(b bVar) {
            String str = this.a;
            SortCriteria sortCriteria = SortCriteria.ALPHABETICAL;
            if (h.a(str, t.a(sortCriteria, this.c))) {
                SortDiscographyDialogFragment.a5(this.b).a(sortCriteria);
            } else {
                SortCriteria sortCriteria2 = SortCriteria.POPULARITY;
                if (h.a(str, t.a(sortCriteria2, this.c))) {
                    SortDiscographyDialogFragment.a5(this.b).a(sortCriteria2);
                } else {
                    SortCriteria sortCriteria3 = SortCriteria.RELEASE_DATE;
                    if (h.a(str, t.a(sortCriteria3, this.c))) {
                        SortDiscographyDialogFragment.a5(this.b).a(sortCriteria3);
                    }
                }
            }
            this.b.M4();
        }
    }

    public static final /* synthetic */ b a5(SortDiscographyDialogFragment sortDiscographyDialogFragment) {
        b bVar = sortDiscographyDialogFragment.w0;
        if (bVar != null) {
            return bVar;
        }
        h.k("sortCriteriaRepository");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        M4();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Context l4 = l4();
        h.d(l4, "requireContext()");
        String[] strArr = {l4.getString(C0707R.string.discography_sort_criteria_release_date), l4.getString(C0707R.string.discography_sort_criteria_popularity), l4.getString(C0707R.string.discography_sort_criteria_alphabetical)};
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            String str = strArr[i];
            int i3 = i2 + 1;
            b bVar = this.w0;
            if (bVar != null) {
                SortCriteria b = bVar.b();
                b a2 = this.x0.a(i2, str);
                a2.k(h.a(t.a(b, l4), str) || (b == SortCriteria.DEFAULT && h.a(str, t.a(SortCriteria.RELEASE_DATE, l4))));
                a2.o(new a(str, this, l4));
                i++;
                i2 = i3;
            } else {
                h.k("sortCriteriaRepository");
                throw null;
            }
        }
        this.x0.d();
        this.x0.G(l4().getString(C0707R.string.discography_sort_dialog_fragment_title));
        g gVar = this.v0;
        if (gVar != null) {
            gVar.a(this.x0);
            g gVar2 = this.v0;
            if (gVar2 != null) {
                Dialog d = gVar2.d();
                h.d(d, "sortDiscographyCriteriaViewCompat.createDialog()");
                return d;
            }
            h.k("sortDiscographyCriteriaViewCompat");
            throw null;
        }
        h.k("sortDiscographyCriteriaViewCompat");
        throw null;
    }

    public final void b5(b bVar) {
        h.e(bVar, "sortCriteriaRepository");
        this.w0 = bVar;
    }
}
