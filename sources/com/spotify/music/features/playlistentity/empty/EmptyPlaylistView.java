package com.spotify.music.features.playlistentity.empty;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

final class EmptyPlaylistView extends RelativeLayout {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView f;
    private Button n;

    public EmptyPlaylistView(Context context) {
        super(context);
        d();
    }

    private void d() {
        RelativeLayout.inflate(getContext(), C0707R.layout.playlist_empty_view, this);
        this.b = (TextView) findViewById(C0707R.id.title);
        this.c = (TextView) findViewById(C0707R.id.subtitle);
        this.n = (Button) findViewById(C0707R.id.button);
        this.f = (TextView) findViewById(C0707R.id.description);
        ImageView imageView = (ImageView) findViewById(C0707R.id.image);
        this.a = imageView;
        imageView.setImageDrawable(yc0.f(getContext()));
        setVisibility(8);
    }

    public Button a() {
        return this.n;
    }

    public TextView b() {
        return this.f;
    }

    public ImageView c() {
        return this.a;
    }

    public void e(String str) {
        this.c.setText(str);
    }

    public void f(String str) {
        this.b.setText(str);
    }

    public EmptyPlaylistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }
}
