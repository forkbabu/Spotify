package com.spotify.music.features.trackcredits;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter;
import com.spotify.music.features.trackcredits.g;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import java.util.List;

public class h implements g {
    private final View a;
    private final c b;
    private final RecyclerView c;
    private final TrackCreditsAdapter d;
    private final LoadingView e;
    private final View f;

    public h(LayoutInflater layoutInflater, g.a aVar) {
        View inflate = layoutInflater.inflate(C0707R.layout.activity_track_credits, (ViewGroup) null);
        this.a = inflate;
        Context context = inflate.getContext();
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0707R.id.toolbar_container);
        c c2 = l70.c(context, frameLayout);
        this.b = c2;
        e eVar = (e) c2;
        eVar.setBackgroundColor(a.b(context, R.color.gray_15));
        com.spotify.android.goldenpath.a.b(context);
        d.d(eVar.getView(), context);
        frameLayout.addView(eVar.getView());
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(context, R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(context.getString(C0707R.string.generic_content_description_close));
        stateListAnimatorImageButton.setOnClickListener(new c(aVar));
        eVar.H1(ToolbarSide.START, stateListAnimatorImageButton, C0707R.id.toolbar_up_button);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.track_credits_recycler_view);
        this.c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        TrackCreditsAdapter trackCreditsAdapter = new TrackCreditsAdapter();
        this.d = trackCreditsAdapter;
        recyclerView.setAdapter(trackCreditsAdapter);
        this.e = (LoadingView) inflate.findViewById(C0707R.id.track_credits_loading_view);
        ViewGroup viewGroup = (ViewGroup) inflate;
        lb0 a2 = pb0.a(context, viewGroup);
        a2.setTitle(C0707R.string.error_general_title);
        a2.A2(C0707R.string.error_general_body);
        a2.w(C0707R.string.track_credits_error_try_again_button);
        a2.i().setOnClickListener(new d(aVar));
        View view = a2.getView();
        this.f = view;
        view.setVisibility(8);
        viewGroup.addView(view);
    }

    public void a() {
        Context context = this.a.getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public View b() {
        return this.a;
    }

    public void c() {
        this.f.setVisibility(8);
    }

    public void d() {
        this.e.setVisibility(8);
        this.e.n();
    }

    public void e() {
        this.f.setVisibility(0);
    }

    public void f() {
        this.e.setVisibility(0);
        this.e.q();
        this.e.r();
    }

    public void g(List<com.spotify.music.features.trackcredits.adapter.d> list) {
        this.c.setVisibility(0);
        this.d.X(list);
    }

    public void h(String str) {
        this.b.setTitle(str);
    }
}
