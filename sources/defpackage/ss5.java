package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: ss5  reason: default package */
public final class ss5 {
    private final ConstraintLayout a;
    public final RecyclerView b;

    private ss5(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = recyclerView;
    }

    public static ss5 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.channel_details_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
        if (recyclerView != null) {
            return new ss5((ConstraintLayout) inflate, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0707R.id.recycler_view)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
