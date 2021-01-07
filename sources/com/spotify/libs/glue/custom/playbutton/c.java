package com.spotify.libs.glue.custom.playbutton;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public interface c {

    public interface a {
        c a(Context context);

        c b(Button button);
    }

    void a(boolean z);

    void b(boolean z);

    View getView();

    void setOnClickListener(View.OnClickListener onClickListener);
}
