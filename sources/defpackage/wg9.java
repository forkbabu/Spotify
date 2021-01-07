package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: wg9  reason: default package */
public final class wg9 {
    private final ConstraintLayout a;
    public final Group b;
    public final Group c;
    public final FrameLayout d;
    public final TextView e;
    public final RecyclerView f;

    private wg9(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Group group, Group group2, FrameLayout frameLayout, View view, TextView textView3, TextView textView4, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = group;
        this.c = group2;
        this.d = frameLayout;
        this.e = textView4;
        this.f = recyclerView;
    }

    public static wg9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_your_library_x_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.empty_view_subtitle;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.empty_view_subtitle);
        if (textView != null) {
            i = C0707R.id.empty_view_title;
            TextView textView2 = (TextView) inflate.findViewById(C0707R.id.empty_view_title);
            if (textView2 != null) {
                i = C0707R.id.group_empty;
                Group group = (Group) inflate.findViewById(C0707R.id.group_empty);
                if (group != null) {
                    i = C0707R.id.group_no_results;
                    Group group2 = (Group) inflate.findViewById(C0707R.id.group_no_results);
                    if (group2 != null) {
                        i = C0707R.id.header_search_container;
                        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0707R.id.header_search_container);
                        if (frameLayout != null) {
                            i = C0707R.id.header_shadow;
                            View findViewById = inflate.findViewById(C0707R.id.header_shadow);
                            if (findViewById != null) {
                                i = C0707R.id.no_results_view_subtitle;
                                TextView textView3 = (TextView) inflate.findViewById(C0707R.id.no_results_view_subtitle);
                                if (textView3 != null) {
                                    i = C0707R.id.no_results_view_title;
                                    TextView textView4 = (TextView) inflate.findViewById(C0707R.id.no_results_view_title);
                                    if (textView4 != null) {
                                        i = C0707R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
                                        if (recyclerView != null) {
                                            return new wg9((ConstraintLayout) inflate, textView, textView2, group, group2, frameLayout, findViewById, textView3, textView4, recyclerView);
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

    public ConstraintLayout a() {
        return this.a;
    }
}
