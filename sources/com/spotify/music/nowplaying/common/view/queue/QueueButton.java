package com.spotify.music.nowplaying.common.view.queue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.queue.e;

public class QueueButton extends AppCompatImageView implements e {
    private e.a a;

    public QueueButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(View view) {
        e.a aVar = this.a;
        if (aVar != null) {
            ((c) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.queue.e
    public void setListener(e.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.queue.e
    public void setQueueEnabled(boolean z) {
        setEnabled(z);
    }

    public QueueButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(gqd.u(getContext()));
        setBackgroundColor(0);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.context_menu_go_to_queue));
        setOnClickListener(new a(this));
    }
}
