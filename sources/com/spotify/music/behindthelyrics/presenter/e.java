package com.spotify.music.behindthelyrics.presenter;

import android.widget.ImageView;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.behindthelyrics.view.f;

public class e implements f {
    private final String a;
    private final h b;

    public e(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    @Override // com.spotify.music.behindthelyrics.view.f
    public void a(ImageView imageView) {
        this.b.h(imageView, this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
