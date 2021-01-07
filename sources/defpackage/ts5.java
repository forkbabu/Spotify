package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: ts5  reason: default package */
public final class ts5 {
    private final ConstraintLayout a;
    public final RecyclerView b;

    private ts5(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = recyclerView;
    }

    public static ts5 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.channels_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
        if (recyclerView != null) {
            return new ts5((ConstraintLayout) inflate, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0707R.id.recycler_view)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
