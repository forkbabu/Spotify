package com.spotify.nowplaying.ui.components.controls.seekbackward.poc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.encore.Element;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SeekBackwardButton extends AppCompatImageButton implements Element {

    static final class a implements View.OnClickListener {
        final /* synthetic */ nmf a;

        a(nmf nmf) {
            this.a = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke(f.a);
        }
    }

    public SeekBackwardButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super f, f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new a(nmf));
    }

    @Override // com.spotify.encore.Item
    public void render(Object obj) {
        setEnabled(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekBackwardButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setBackground(null);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setImageDrawable(gqd.r(context));
        setContentDescription(getResources().getString(C0707R.string.player_content_description_skip_back_15));
    }
}
