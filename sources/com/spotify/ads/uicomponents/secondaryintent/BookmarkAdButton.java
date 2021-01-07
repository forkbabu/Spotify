package com.spotify.ads.uicomponents.secondaryintent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.ads.uicomponents.secondaryintent.d;
import com.spotify.music.C0707R;

public class BookmarkAdButton extends AppCompatImageButton implements d {
    private d.a a;

    public BookmarkAdButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ void g(View view) {
        d.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d
    public void setBookmarked(boolean z) {
        setActivated(z);
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d
    public void setListener(d.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public BookmarkAdButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        Context context2 = getContext();
        Drawable d = a.d(context2, C0707R.drawable.ic_bookmark_24);
        Drawable d2 = a.d(context2, C0707R.drawable.ic_bookmark_active_24);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, d2);
        stateListDrawable.addState(new int[0], d);
        setImageDrawable(stateListDrawable);
        setOnClickListener(new a(this));
    }
}
