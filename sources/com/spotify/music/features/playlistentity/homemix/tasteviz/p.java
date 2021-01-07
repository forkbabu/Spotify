package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.h;
import java.util.List;
import java.util.Map;

public class p {
    private final ViewGroup a;
    private final TextView b;
    private final k c;
    private final TextView d;
    private final n e;
    private final View f;

    public p(k kVar, n nVar, LayoutInflater layoutInflater) {
        this.c = kVar;
        this.e = nVar;
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C0707R.layout.playlist_entity_home_mix_taste_viz_view, (ViewGroup) null);
        this.a = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
        recyclerView.setAdapter(kVar);
        recyclerView.setItemAnimator(null);
        View findViewById = viewGroup.findViewById(C0707R.id.action_button);
        this.d = (TextView) viewGroup.findViewById(C0707R.id.home_mix_taste_viz_learn_more);
        this.f = viewGroup.findViewById(C0707R.id.home_mix_taste_viz_cta);
        findViewById.setOnClickListener(new e(this));
        this.b = (TextView) viewGroup.findViewById(C0707R.id.home_mix_taste_viz_welcome);
    }

    public ViewGroup a() {
        return this.a;
    }

    public /* synthetic */ void b(View view) {
        this.e.i();
    }

    public /* synthetic */ void c(View view) {
        n nVar = this.e;
        nVar.h(nVar.f());
    }

    public /* synthetic */ void d(View view) {
        this.e.g();
    }

    public void e(HomeMixPlanType homeMixPlanType, String str, List<h> list, Map<String, HomeMixUser> map, int i) {
        Context context = this.a.getContext();
        String h = homeMixPlanType.h(context);
        String k = homeMixPlanType.k(context);
        if (this.e.f()) {
            this.f.setVisibility(0);
            this.b.setText(context.getString(C0707R.string.home_mix_view_taste_viz_welcome, h));
            this.d.setText(context.getString(C0707R.string.home_mix_view_taste_viz_learn_more, h));
            this.d.setOnClickListener(new f(this));
        } else {
            this.f.setVisibility(8);
            this.b.setText(context.getString(C0707R.string.home_mix_view_taste_viz_top_genres, k, str));
            this.d.setText(context.getString(C0707R.string.home_mix_view_taste_viz_close));
            this.d.setOnClickListener(new g(this));
        }
        this.b.setTextColor(i);
        this.c.X(list, map);
    }
}
