package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class NavigationItemView extends FrameLayout {
    private static final int[] f = {16842914};
    private final SpotifyIconDrawable a;
    private final TextView b;
    private boolean c;

    public NavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsNavigationItemStyle);
    }

    public TextView getTitleView() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.c) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f);
        }
        return onCreateDrawableState;
    }

    public void setActive(boolean z) {
        this.c = z;
        refreshDrawableState();
    }

    public void setIconType(SpotifyIcon spotifyIcon) {
        if (spotifyIcon == null) {
            this.b.setCompoundDrawables(null, null, null, null);
            return;
        }
        SpotifyIconDrawable spotifyIconDrawable = this.a;
        spotifyIconDrawable.getClass();
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ADD_TO_PLAYLIST;
        spotifyIconDrawable.u(spotifyIcon.g());
        this.b.setCompoundDrawablesWithIntrinsicBounds(this.a, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setTitle(String str) {
        this.b.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        int resourceId = obtainStyledAttributes.getResourceId(6, 0);
        obtainStyledAttributes.recycle();
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(drawable);
        setMinimumHeight(dimensionPixelSize);
        setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        FrameLayout.inflate(context, C0707R.layout.paste_navigationitem, this);
        TextView textView = (TextView) findViewById(C0707R.id.title);
        this.b = textView;
        c.n(textView, resourceId);
        textView.setCompoundDrawablePadding(dimensionPixelSize2);
        textView.setDuplicateParentStateEnabled(true);
        if (dimensionPixelSize3 < 0) {
            this.a = new SpotifyIconDrawable(context, SpotifyIcon.ALBUM_32);
        } else {
            this.a = new SpotifyIconDrawable(context, SpotifyIcon.ALBUM_32, (float) dimensionPixelSize3);
        }
        this.a.s(colorStateList);
    }
}
