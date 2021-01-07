package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXFilterRowView;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXHeaderView;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;

/* renamed from: vg9  reason: default package */
public final class vg9 {
    private final LinearLayout a;
    public final ConstraintLayout b;
    public final AppBarLayout c;
    public final YourLibraryXFilterRowView d;
    public final YourLibraryXHeaderView e;
    public final QuickScrollView f;
    public final RecyclerView g;

    private vg9(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppBarLayout appBarLayout, YourLibraryXFilterRowView yourLibraryXFilterRowView, View view, YourLibraryXHeaderView yourLibraryXHeaderView, QuickScrollView quickScrollView, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = constraintLayout;
        this.c = appBarLayout;
        this.d = yourLibraryXFilterRowView;
        this.e = yourLibraryXHeaderView;
        this.f = quickScrollView;
        this.g = recyclerView;
    }

    public static vg9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.empty_view;
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C0707R.id.empty_view);
        if (constraintLayout != null) {
            i = C0707R.id.empty_view_subtitle;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.empty_view_subtitle);
            if (textView != null) {
                i = C0707R.id.empty_view_title;
                TextView textView2 = (TextView) inflate.findViewById(C0707R.id.empty_view_title);
                if (textView2 != null) {
                    i = C0707R.id.filter_row_container;
                    AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(C0707R.id.filter_row_container);
                    if (appBarLayout != null) {
                        i = C0707R.id.filter_row_view;
                        YourLibraryXFilterRowView yourLibraryXFilterRowView = (YourLibraryXFilterRowView) inflate.findViewById(C0707R.id.filter_row_view);
                        if (yourLibraryXFilterRowView != null) {
                            i = C0707R.id.filter_shadow;
                            View findViewById = inflate.findViewById(C0707R.id.filter_shadow);
                            if (findViewById != null) {
                                i = C0707R.id.header_view;
                                YourLibraryXHeaderView yourLibraryXHeaderView = (YourLibraryXHeaderView) inflate.findViewById(C0707R.id.header_view);
                                if (yourLibraryXHeaderView != null) {
                                    i = C0707R.id.quickscroll_view;
                                    QuickScrollView quickScrollView = (QuickScrollView) inflate.findViewById(C0707R.id.quickscroll_view);
                                    if (quickScrollView != null) {
                                        i = C0707R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
                                        if (recyclerView != null) {
                                            LinearLayout linearLayout = (LinearLayout) inflate;
                                            return new vg9(linearLayout, constraintLayout, textView, textView2, appBarLayout, yourLibraryXFilterRowView, findViewById, yourLibraryXHeaderView, quickScrollView, recyclerView, linearLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public LinearLayout a() {
        return this.a;
    }
}
