package com.spotify.music.imagepicker;

import android.content.Intent;

public interface a {
    void finish();

    void setResult(int i);

    void setResult(int i, Intent intent);

    void startActivityForResult(Intent intent, int i);
}
