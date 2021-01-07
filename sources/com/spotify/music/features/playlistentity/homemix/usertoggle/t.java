package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import java.util.List;

public class t {
    private final ViewGroup a;
    private final q b;
    private final k c;

    public t(r rVar, k kVar, LayoutInflater layoutInflater) {
        this.c = kVar;
        q b2 = rVar.b(kVar);
        this.b = b2;
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C0707R.layout.playlist_entity_home_mix_user_toggle_view, (ViewGroup) null);
        this.a = viewGroup;
        viewGroup.findViewById(C0707R.id.action_button).setOnClickListener(new i(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext());
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(b2);
        recyclerView.setItemAnimator(null);
    }

    public ViewGroup a() {
        return this.a;
    }

    public void b(View view) {
        this.c.h();
    }

    public void c(List<HomeMixUser> list) {
        this.b.Z(list);
    }
}
