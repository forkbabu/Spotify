package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.facepile.FaceView;
import com.spotify.libs.facepile.c;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;

public class h extends RecyclerView.b0 {
    private final CardView C;
    private final TextView D;
    private final LinearLayout E;
    private final Picasso F;
    private final Context G;

    public h(Picasso picasso, ViewGroup viewGroup) {
        super(je.G(viewGroup, C0707R.layout.playlist_entity_home_mix_affinity_card_view, viewGroup, false));
        this.G = viewGroup.getContext();
        this.F = picasso;
        View findViewById = this.a.findViewById(C0707R.id.card);
        findViewById.getClass();
        this.C = (CardView) findViewById;
        View findViewById2 = this.a.findViewById(C0707R.id.title);
        findViewById2.getClass();
        this.D = (TextView) findViewById2;
        View findViewById3 = this.a.findViewById(C0707R.id.content_container);
        findViewById3.getClass();
        this.E = (LinearLayout) findViewById3;
    }

    public void h0(int i, com.spotify.music.features.playlistentity.homemix.models.h hVar, List<c> list) {
        this.C.setCardBackgroundColor(i);
        this.D.setText(hVar.name());
        this.E.removeAllViews();
        for (c cVar : list) {
            LinearLayout linearLayout = this.E;
            FaceView faceView = new FaceView(this.G, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(8);
            }
            faceView.setLayoutParams(layoutParams);
            faceView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            faceView.setAdjustViewBounds(true);
            Picasso picasso = this.F;
            cVar.getClass();
            faceView.a(picasso, cVar);
            linearLayout.addView(faceView);
        }
    }
}
