package com.spotify.music.lyrics.fullscreen.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.a;

public class LyricsFullscreenHeaderView extends FrameLayout {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final ImageButton f;
    private final View n;

    public LyricsFullscreenHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(String str, String str2) {
        this.b.setText(str);
        this.c.setText(str2);
    }

    /* access modifiers changed from: package-private */
    public TextView getArtistTextView() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public ImageButton getCloseButton() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public View getContainer() {
        return this.n;
    }

    public ImageView getCoverArtImageView() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public TextView getSongTextView() {
        return this.c;
    }

    public void setCloseClickListener(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
    }

    public LyricsFullscreenHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = LayoutInflater.from(context).inflate(C0707R.layout.lyrics_full_screen_header_view, this);
        this.a = (ImageView) findViewById(C0707R.id.coverArt);
        this.b = (TextView) findViewById(C0707R.id.artistName);
        this.c = (TextView) findViewById(C0707R.id.title);
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.close);
        this.f = imageButton;
        a aVar = new a(getContext(), SpotifyIconV2.X, (float) nud.g(16.0f, getContext().getResources()), (float) nud.g(32.0f, getContext().getResources()), androidx.core.content.a.b(getContext(), R.color.black_40), androidx.core.content.a.b(getContext(), R.color.white));
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        imageButton.setBackground(aVar);
    }
}
