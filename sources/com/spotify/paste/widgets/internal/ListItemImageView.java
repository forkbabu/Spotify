package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public final class ListItemImageView extends AppCompatImageView {
    public ListItemImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(getDrawable() != null);
    }

    private void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int min = Math.min(ImageView.getDefaultSize(getSuggestedMinimumWidth(), i), ImageView.getDefaultSize(getSuggestedMinimumHeight(), i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        a(bitmap != null);
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a(drawable != null);
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        a(i != 0);
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        a(uri != null && !uri.equals(Uri.EMPTY));
        super.setImageURI(uri);
    }

    public ListItemImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(getDrawable() != null);
    }
}
