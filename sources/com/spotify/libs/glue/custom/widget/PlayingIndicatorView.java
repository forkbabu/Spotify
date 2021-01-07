package com.spotify.libs.glue.custom.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;

public final class PlayingIndicatorView extends StateListAnimatorImageView {
    private final Animatable a;

    class a extends b8 {
        final /* synthetic */ Handler b;

        a(Handler handler) {
            this.b = handler;
        }

        @Override // defpackage.b8
        public void a(Drawable drawable) {
            Handler handler = this.b;
            Animatable animatable = PlayingIndicatorView.this.a;
            animatable.getClass();
            a aVar = new a(animatable);
            PlayingIndicatorView.this.getClass();
            handler.postDelayed(aVar, (long) 0);
        }
    }

    public PlayingIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable b = i0.b(context, C0707R.drawable.playing_indicator);
        if (b == null) {
            throw new IllegalStateException("Can't find playing indicator drawable resource.");
        } else if (b instanceof Animatable) {
            setImageDrawable(b);
            this.a = (Animatable) b;
            c8.b(b, new a(new Handler(Looper.getMainLooper())));
        } else {
            throw new IllegalStateException("Drawable must be animatable to be registered to loop!");
        }
    }
}
