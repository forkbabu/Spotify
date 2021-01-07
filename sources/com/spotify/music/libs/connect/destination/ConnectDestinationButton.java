package com.spotify.music.libs.connect.destination;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.music.C0707R;

public class ConnectDestinationButton extends AppCompatImageButton {
    private final jba a;
    private AnimatorSet b;
    private String c;
    private boolean f;

    public ConnectDestinationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setupContentDescription(Context context) {
        setContentDescription(context.getString(C0707R.string.connect_destination_button_normal_accessibility));
    }

    public void g(GaiaDevice gaiaDevice) {
        boolean z = this.f;
        if (z) {
            if (z) {
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                setAlpha(1.0f);
                this.c = null;
            }
            setImageDrawable(this.a.e(gaiaDevice.getType(), gaiaDevice.isGrouped()));
        } else if (Tech.isCast(gaiaDevice)) {
            setImageDrawable(this.a.c());
        } else {
            setImageDrawable(this.a.e(gaiaDevice.getType(), gaiaDevice.isGrouped()));
        }
    }

    public void h(GaiaDevice gaiaDevice) {
        if (this.f) {
            boolean equals = gaiaDevice.getPhysicalIdentifier().equals(this.c);
            this.c = gaiaDevice.getPhysicalIdentifier();
            if (!equals) {
                setImageDrawable(this.a.f(gaiaDevice.getType(), gaiaDevice.isGrouped()));
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                setAlpha(1.0f);
                AnimatorSet a2 = this.a.a(this);
                this.b = a2;
                a2.start();
            }
        } else if (Tech.isCast(gaiaDevice)) {
            kba d = this.a.d();
            setImageDrawable(d.b());
            d.a().start();
        } else {
            setImageDrawable(this.a.f(gaiaDevice.getType(), gaiaDevice.isGrouped()));
        }
    }

    public void i() {
        if (this.f) {
            AnimatorSet animatorSet = this.b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            setAlpha(1.0f);
            this.c = null;
        }
        setImageDrawable(this.a.g());
    }

    public void setUseBlinkingAnimation(boolean z) {
        this.f = z;
    }

    public ConnectDestinationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new jba(context);
        setupContentDescription(context);
        setLayerType(2, null);
    }
}
