package com.spotify.music.podcast.ui.topic;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;

public final class e implements g90 {
    private final Button a;

    private e(Context context) {
        Button button = (Button) LayoutInflater.from(context).inflate(C0707R.layout.podcast_topic_chip, (ViewGroup) null);
        this.a = button;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(nud.g(8.0f, context.getResources()));
        } else {
            layoutParams.rightMargin = nud.g(8.0f, context.getResources());
        }
        layoutParams.topMargin = nud.g(8.0f, context.getResources());
        layoutParams.bottomMargin = nud.g(8.0f, context.getResources());
        button.setLayoutParams(layoutParams);
    }

    public static e b(Context context) {
        return new e(context);
    }

    public void c(f fVar, String str) {
        this.a.setOnClickListener(new a(fVar, str));
    }

    public void d(String str) {
        this.a.setText(str);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
