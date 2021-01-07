package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.viewpager.widget.ViewPager;
import com.google.common.base.MoreObjects;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.mobile.android.ui.view.x;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.ViewPagerIndicator;

/* access modifiers changed from: package-private */
public final class n0 extends nc0 {
    private final ImageView c;
    private final TextView f;
    private final TextView n;
    private final x o;
    private final ToggleButton p;
    private final FacePileView q;

    class a extends androidx.viewpager.widget.a {
        final /* synthetic */ View c;
        final /* synthetic */ View d;

        a(n0 n0Var, View view, View view2) {
            this.c = view;
            this.d = view2;
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            if (i == 0) {
                viewGroup.removeView(this.d);
            } else {
                viewGroup.removeView(this.c);
            }
        }

        @Override // androidx.viewpager.widget.a
        public int d() {
            return this.c != null ? 2 : 1;
        }

        @Override // androidx.viewpager.widget.a
        public Object h(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0 || (view = this.c) == null) {
                if (this.d.getParent() != viewGroup) {
                    viewGroup.addView(this.d);
                }
                return this.d;
            }
            if (view.getParent() != viewGroup) {
                viewGroup.addView(this.c);
            }
            return this.c;
        }

        @Override // androidx.viewpager.widget.a
        public boolean i(View view, Object obj) {
            return view == obj;
        }
    }

    n0(Context context, ViewGroup viewGroup, boolean z) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.vanilla_playlist_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.view_pager);
        findViewById.getClass();
        ViewPager viewPager = (ViewPager) findViewById;
        viewPager.setPageMargin(context.getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin));
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.vanilla_playlist_header_content_view_first_page, (ViewGroup) viewPager, false);
        View findViewById2 = inflate.findViewById(C0707R.id.cover_art_image);
        findViewById2.getClass();
        ImageView imageView = (ImageView) findViewById2;
        this.c = imageView;
        View findViewById3 = inflate.findViewById(16908308);
        findViewById3.getClass();
        this.f = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(16908309);
        findViewById4.getClass();
        this.n = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.follow_button);
        findViewById5.getClass();
        this.p = (ToggleButton) findViewById5;
        View findViewById6 = getView().findViewById(C0707R.id.page_indicator);
        findViewById6.getClass();
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) findViewById6;
        if (z) {
            x xVar = new x(context);
            this.o = xVar;
            xVar.setByText(context.getString(C0707R.string.header_playlist_description_playlist_by));
            xVar.a(true);
            viewPagerIndicator.setVisibility(0);
            viewPagerIndicator.setupWithViewPager(viewPager);
            this.q = xVar.getInfoPageIconFacePileView();
        } else {
            this.o = null;
            View findViewById7 = inflate.findViewById(C0707R.id.first_page_facepile);
            findViewById7.getClass();
            this.q = (FacePileView) findViewById7;
        }
        viewPager.setAdapter(new a(this, this.o, inflate));
        bvd b = dvd.b(imageView);
        b.f(imageView);
        b.a();
    }

    public FacePileView E2() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public ToggleButton F2() {
        return this.p;
    }

    public x G2() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public ImageView getImageView() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public TextView getSubtitleView() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void setSubtitle(String str) {
        this.n.setText(str);
        this.n.setVisibility(MoreObjects.isNullOrEmpty(str) ? 8 : 0);
    }

    /* access modifiers changed from: package-private */
    public void setTitle(String str) {
        this.f.setText(str);
        ImageView imageView = this.c;
        imageView.setContentDescription(imageView.getContext().getString(C0707R.string.playlist_header_cover_art_enlarge, str));
    }
}
