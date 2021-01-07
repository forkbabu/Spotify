package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.f;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;

public class k {
    private final Picasso a;
    private final ViewGroup b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final i f;
    private final d g;

    public k(i iVar, Picasso picasso, d dVar, LayoutInflater layoutInflater) {
        this.a = picasso;
        this.f = iVar;
        this.g = dVar;
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C0707R.layout.playlist_entity_home_mix_face_pile_detail_view, (ViewGroup) null);
        this.b = viewGroup;
        this.c = (ImageView) viewGroup.findViewById(C0707R.id.image);
        this.d = (TextView) viewGroup.findViewById(C0707R.id.title);
        this.e = (TextView) viewGroup.findViewById(C0707R.id.subtitle);
        viewGroup.findViewById(C0707R.id.action_button).setOnClickListener(new b(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext());
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(iVar);
        recyclerView.setItemAnimator(null);
    }

    public ViewGroup a() {
        return this.b;
    }

    public void b(View view) {
        this.g.e();
    }

    public void c(l lVar) {
        this.a.m(q.d(lVar, Covers.Size.LARGE)).n(this.c, null);
        this.d.setText(lVar.e());
        o g2 = lVar.g();
        if (g2 != null) {
            TextView textView = this.e;
            ImmutableList<b> artists = g2.getArtists();
            a album = g2.getAlbum();
            String str = "";
            String f2 = (artists == null || artists.isEmpty()) ? str : artists.get(0).f();
            String g3 = album.g();
            StringBuilder V0 = je.V0(f2);
            if (!TextUtils.isEmpty(f2) && !TextUtils.isEmpty(g3)) {
                str = " • ";
            }
            V0.append(str);
            V0.append(g3);
            textView.setText(V0.toString());
        }
    }

    public void d(Map<String, HomeMixUser> map, List<f> list) {
        this.f.X(map, list);
    }
}
