package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

/* renamed from: hj8  reason: default package */
public class hj8 {
    private final View a;

    public hj8(LayoutInflater layoutInflater, ViewGroup viewGroup, ej8 ej8) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_saved_ads, viewGroup, false);
        this.a = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.saved_ads);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        recyclerView.setAdapter(ej8);
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) inflate.findViewById(C0707R.id.fastscroll_savedads);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.setRecyclerView(recyclerView);
        recyclerViewFastScroller.setEnabled(true);
        recyclerView.setVerticalScrollBarEnabled(false);
    }

    public View a() {
        return this.a;
    }
}
