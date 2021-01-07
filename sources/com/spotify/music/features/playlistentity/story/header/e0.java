package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.app.c;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public final class e0 extends nc0 {
    private final int c;
    private final TextView f;
    private final TextView n;
    private final TextView o;
    private final ToggleButton p;
    private final ImageView q = ((ImageView) getView().findViewById(C0707R.id.header_profile_picture));
    private final VideoSurfaceView r = ((VideoSurfaceView) getView().findViewById(C0707R.id.story_thumbnail_video_view));
    private final PlaylistStoryHeaderAnimatedTooltip s = ((PlaylistStoryHeaderAnimatedTooltip) getView().findViewById(C0707R.id.header_tooltip));

    public e0(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.story_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(16908308);
        findViewById.getClass();
        this.o = (TextView) findViewById;
        View findViewById2 = getView().findViewById(C0707R.id.header_description);
        findViewById2.getClass();
        TextView textView = (TextView) findViewById2;
        this.n = textView;
        View findViewById3 = getView().findViewById(C0707R.id.metadata_container);
        findViewById3.getClass();
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f = (TextView) linearLayout.findViewById(C0707R.id.metadata_text);
        ToggleButton e = c.e(context);
        this.p = e;
        e.setTextOn(context.getString(C0707R.string.header_playlist_following));
        e.setTextOff(context.getString(C0707R.string.header_playlist_follow));
        e.setEllipsize(TextUtils.TruncateAt.END);
        e.setVisibility(8);
        linearLayout.addView(e, 0, new LinearLayout.LayoutParams(-2, -2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.c = nud.g(12.0f, context.getResources());
        ImageView imageView = (ImageView) getView().findViewById(C0707R.id.cover_art_image);
    }

    public void B0(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    public ToggleButton E2() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public ImageView F2() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public PlaylistStoryHeaderAnimatedTooltip G2() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public VideoSurfaceView H2() {
        return this.r;
    }

    public void I2(String str, boolean z) {
        this.f.setVisibility(0);
        this.f.setText(str);
        if (z) {
            this.f.setCompoundDrawablesWithIntrinsicBounds(l70.f(this.f.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f.setCompoundDrawablePadding(this.c);
            return;
        }
        this.f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setTitle(String str) {
        this.o.setText(str);
    }
}
