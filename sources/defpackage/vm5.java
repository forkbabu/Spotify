package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment;
import defpackage.di9;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: vm5  reason: default package */
public final class vm5 {
    public static final a a = new a(null);

    /* renamed from: vm5$a */
    public static final class a {

        /* renamed from: vm5$a$a  reason: collision with other inner class name */
        public static final class C0691a implements FilterAndSortBottomSheetFragment.a {
            final /* synthetic */ FilterAndSortBottomSheetFragment.a a;

            C0691a(FilterAndSortBottomSheetFragment.a aVar) {
                this.a = aVar;
            }

            @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
            public void J(ane ane, int i) {
                h.e(ane, "item");
            }

            @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
            public void X0(di9.b bVar, int i) {
                h.e(bVar, "item");
                this.a.X0(bVar, i);
            }

            @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
            public void c0() {
            }
        }

        public a(f fVar) {
        }

        public static di9.b a(a aVar, String str, String str2, boolean z, SpotifyIconV2 spotifyIconV2, int i) {
            SpotifyIconV2 spotifyIconV22 = (i & 8) != 0 ? SpotifyIconV2.CHECK : null;
            h.e(str, "id");
            h.e(str2, "text");
            h.e(spotifyIconV22, "icon");
            di9.b.a c = di9.b.c();
            c.d(str);
            c.b(str2);
            c.f(str2);
            c.a(spotifyIconV22);
            c.e(spotifyIconV22);
            c.g(z);
            di9.b c2 = c.c();
            h.d(c2, "FilterAndSortConfigurati…\n                .build()");
            return c2;
        }

        public final void b(di9 di9, o oVar, FilterAndSortBottomSheetFragment.a aVar, String str) {
            h.e(di9, "filterAndSortConfiguration");
            h.e(oVar, "fragmentManager");
            h.e(aVar, "listener");
            h.e(str, "filterTitle");
            FilterAndSortBottomSheetFragment filterAndSortBottomSheetFragment = new FilterAndSortBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("BottomSheetDialogFragment.filterAndSortConfiguration", di9);
            bundle.putParcelable("BottomSheetDialogFragment.activeSortOrder", null);
            bundle.putString("BottomSheetDialogFragment.filterTitle", str);
            filterAndSortBottomSheetFragment.r4(bundle);
            h.d(filterAndSortBottomSheetFragment, "FilterAndSortBottomSheet…e, null\n                )");
            filterAndSortBottomSheetFragment.d5(new C0691a(aVar));
            filterAndSortBottomSheetFragment.Y4(oVar, filterAndSortBottomSheetFragment.X2());
        }
    }
}
