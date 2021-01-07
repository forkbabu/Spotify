package com.spotify.encore.consumer.elements.playbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlayButtonView extends ConstraintLayout implements PlayButton {
    private final String pauseContentDescription;
    private final SpotifyIconDrawable pauseDrawable;
    private final ImageButton playAndPauseButton;
    private final float playAndPauseIconScale;
    private final String playContentDescription;
    private final SpotifyIconDrawable playDrawable;
    private final ImageButton shuffleBadgeButton;
    private final String shuffleContentDescription;
    private final SpotifyIconDrawable shuffleDrawable;
    private final float shuffleIconScale;

    /* access modifiers changed from: private */
    public enum ColorTheme {
        PRIMARY,
        SECONDARY
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PlayState.values();
            int[] iArr = new int[4];
            $EnumSwitchMapping$0 = iArr;
            PlayState playState = PlayState.PAUSE;
            iArr[2] = 1;
            PlayState playState2 = PlayState.PLAY_WITH_SHUFFLE;
            iArr[0] = 2;
            PlayState playState3 = PlayState.PLAY_WITHOUT_SHUFFLE;
            iArr[1] = 3;
            PlayState playState4 = PlayState.GONE;
            iArr[3] = 4;
        }
    }

    public PlayButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlayButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setColorTheme(ColorTheme colorTheme) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (colorTheme == ColorTheme.PRIMARY) {
            colorStateList = a.c(getContext(), R.color.encore_accessory_green);
            colorStateList2 = a.c(getContext(), R.color.encore_accessory_white);
        } else {
            colorStateList = a.c(getContext(), R.color.encore_accessory_white);
            colorStateList2 = a.c(getContext(), R.color.encore_accessory_black);
        }
        ImageButton imageButton = this.playAndPauseButton;
        Drawable background = imageButton.getBackground();
        h.d(background, "playAndPauseButton.background");
        imageButton.setBackground(tintDrawable(background, colorStateList));
        this.playDrawable.s(colorStateList2);
        this.pauseDrawable.s(colorStateList2);
    }

    private final Drawable tintDrawable(Drawable drawable, ColorStateList colorStateList) {
        Drawable l = androidx.core.graphics.drawable.a.l(drawable);
        androidx.core.graphics.drawable.a.i(l, colorStateList);
        h.d(l, "wrappedDrawable");
        return l;
    }

    private final void updatePlayAndPauseButton(Drawable drawable, String str) {
        this.playAndPauseButton.setImageDrawable(drawable);
        this.playAndPauseButton.setContentDescription(str);
    }

    public final int getPlayButtonHeightWithoutShuffleBadge() {
        return this.playAndPauseButton.getHeight();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new PlayButtonView$onEvent$1(nmf));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            float f = ((float) getLayoutParams().width) * this.playAndPauseIconScale;
            if (this.pauseDrawable.q() != f) {
                this.pauseDrawable.w(f);
                this.playDrawable.w(f);
                this.shuffleDrawable.w(((float) getLayoutParams().width) * this.shuffleIconScale);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View.inflate(context, R.layout.encore_elements_play_button_view, this);
        View G = q4.G(this, R.id.button_play);
        h.d(G, "requireViewById(this, R.id.button_play)");
        ImageButton imageButton = (ImageButton) G;
        this.playAndPauseButton = imageButton;
        View G2 = q4.G(this, R.id.image_shuffle);
        h.d(G2, "requireViewById(this, R.id.image_shuffle)");
        ImageButton imageButton2 = (ImageButton) G2;
        this.shuffleBadgeButton = imageButton2;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.encore_play_button_play_icon_scale, typedValue, true);
        float f = typedValue.getFloat();
        this.playAndPauseIconScale = f;
        context.getResources().getValue(R.dimen.encore_play_button_play_shuffle_icon_scale, typedValue, true);
        float f2 = typedValue.getFloat();
        this.shuffleIconScale = f2;
        float dimension = context.getResources().getDimension(R.dimen.encore_play_button_default_view_size);
        float f3 = f * dimension;
        this.pauseDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, f3);
        this.playDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, f3);
        ColorTheme colorTheme = ColorTheme.PRIMARY;
        int[] iArr = R.styleable.PlayButtonView;
        h.d(iArr, "R.styleable.PlayButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ColorTheme colorTheme2 = ColorTheme.values()[obtainStyledAttributes.getInt(R.styleable.PlayButtonView_playButtonColorTheme, 0)];
        obtainStyledAttributes.recycle();
        setColorTheme(colorTheme2);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHUFFLE, dimension * f2);
        this.shuffleDrawable = spotifyIconDrawable;
        spotifyIconDrawable.s(a.c(context, R.color.encore_accessory_green));
        imageButton2.setImageDrawable(spotifyIconDrawable);
        String string = context.getString(R.string.play_button_default_play_content_description);
        h.d(string, "context.getString(R.stri…play_content_description)");
        this.playContentDescription = string;
        String string2 = context.getString(R.string.play_button_default_pause_content_description);
        h.d(string2, "context.getString(R.stri…ause_content_description)");
        this.pauseContentDescription = string2;
        String string3 = context.getString(R.string.play_button_default_shuffle_content_description);
        h.d(string3, "context.getString(R.stri…ffle_content_description)");
        this.shuffleContentDescription = string3;
        dvd.a(imageButton2).a();
        dvd.a(imageButton).a();
    }

    public void render(PlayState playState) {
        h.e(playState, "model");
        int ordinal = playState.ordinal();
        if (ordinal == 0) {
            updatePlayAndPauseButton(this.playDrawable, this.shuffleContentDescription);
            setVisibility(0);
            this.shuffleBadgeButton.setVisibility(0);
        } else if (ordinal == 1) {
            updatePlayAndPauseButton(this.playDrawable, this.playContentDescription);
            setVisibility(0);
            this.shuffleBadgeButton.setVisibility(4);
        } else if (ordinal == 2) {
            updatePlayAndPauseButton(this.pauseDrawable, this.pauseContentDescription);
            setVisibility(0);
            this.shuffleBadgeButton.setVisibility(4);
        } else if (ordinal == 3) {
            setVisibility(8);
        }
    }
}
