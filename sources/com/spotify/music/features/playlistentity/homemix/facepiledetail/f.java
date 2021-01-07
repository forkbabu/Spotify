package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.facepile.FaceView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;

public class f extends RecyclerView.b0 {
    private final FaceView C;
    private final TextView D;
    private final TextView E;
    private final Picasso F;
    private final Context G;

    public f(Picasso picasso, ViewGroup viewGroup) {
        super(je.G(viewGroup, C0707R.layout.playlist_entity_home_mix_face_pile_detail_row, viewGroup, false));
        this.F = picasso;
        this.G = viewGroup.getContext();
        View findViewById = this.a.findViewById(C0707R.id.face);
        findViewById.getClass();
        this.C = (FaceView) findViewById;
        View findViewById2 = this.a.findViewById(C0707R.id.name);
        findViewById2.getClass();
        this.D = (TextView) findViewById2;
        View findViewById3 = this.a.findViewById(C0707R.id.affinityType);
        findViewById3.getClass();
        this.E = (TextView) findViewById3;
    }

    public void h0(HomeMixUser homeMixUser, com.spotify.music.features.playlistentity.homemix.models.f fVar) {
        fVar.getClass();
        this.C.a(this.F, homeMixUser.getFace());
        this.D.setText(homeMixUser.getShortName());
        this.E.setText(this.G.getString(C0707R.string.home_mix_affinity_type, fVar.a()));
    }
}
