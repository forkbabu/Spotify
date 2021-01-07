package com.spotify.encore.consumer.elements.creator;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.widget.c;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import kotlin.jvm.internal.h;

public final class CreatorButton$target$1 implements f0 {
    final /* synthetic */ CreatorButton this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CreatorButton$target$1(CreatorButton creatorButton) {
        this.this$0 = creatorButton;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        h.e(bitmap, "bitmap");
        c.h(this.this$0, new BitmapDrawable(this.this$0.getResources(), bitmap), null, null, null);
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        c.h(this.this$0, drawable, null, null, null);
    }
}
