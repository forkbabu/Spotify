package com.spotify.music.features.connectui.picker.contextmenu;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;

public interface k {
    void a(Uri uri);

    void b();

    void c(RecyclerView.e<?> eVar);

    void close();

    boolean d(Uri uri);

    void e(String str);

    void f(int i);

    void setIcon(Drawable drawable);
}
