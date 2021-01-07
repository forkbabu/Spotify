package com.spotify.libs.facepile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class FaceView extends AppCompatImageView {
    public FaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(Picasso picasso, c cVar) {
        if (cVar == null) {
            setVisibility(8);
            return;
        }
        picasso.getClass();
        String c = cVar.c();
        if (c != null && !c.isEmpty()) {
            z m = picasso.m(c);
            m.g(cVar.e(getContext()));
            m.o(rwd.c(this));
        } else if (cVar.d().isEmpty()) {
            setImageDrawable(yc0.s(getContext()));
        } else {
            setImageDrawable(cVar.e(getContext()));
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setVisibility(0);
    }

    public void setAdditionalCount(int i) {
        setImageDrawable(new e(getContext(), getContext().getString(C0707R.string.face_overflow_template, Integer.valueOf(i)), a.b(getContext(), C0707R.color.face_pile_counter_bg)));
        rwd.c(this);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setVisibility(0);
    }

    public FaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
    }
}
