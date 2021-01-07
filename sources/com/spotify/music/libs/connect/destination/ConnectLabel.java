package com.spotify.music.libs.connect.destination;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.m;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class ConnectLabel extends ConstraintLayout {
    private final TextView a;
    private final ImageView b;
    private final m c;

    public ConnectLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void E(boolean z, boolean z2) {
        Drawable drawable;
        if (z) {
            if (z2) {
                drawable = this.c.c();
            } else {
                drawable = this.c.e();
            }
            this.b.setContentDescription(getContext().getString(C0707R.string.connect_device_tech_cast));
            this.b.setImageDrawable(drawable);
            return;
        }
        this.b.setContentDescription(getContext().getString(C0707R.string.connect_device_tech_connect));
        this.b.setImageDrawable(this.c.f());
    }

    public final void C(GaiaDevice gaiaDevice) {
        h.e(gaiaDevice, "device");
        m mVar = this.c;
        int i = R.color.green;
        mVar.h(i);
        E(Tech.isCast(gaiaDevice), true);
        String name = gaiaDevice.getName();
        h.d(name, "device.name");
        this.a.setText(name);
        this.a.setTextColor(a.b(getContext(), i));
    }

    public final void D(GaiaDevice gaiaDevice) {
        h.e(gaiaDevice, "device");
        m mVar = this.c;
        int i = R.color.white;
        mVar.h(i);
        E(Tech.isCast(gaiaDevice), false);
        String string = getContext().getString(C0707R.string.connect_device_connecting);
        h.d(string, "context.getString(R.stri…onnect_device_connecting)");
        this.a.setText(string);
        this.a.setTextColor(a.b(getContext(), i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.connect_device_label, this);
        View findViewById = findViewById(C0707R.id.connect_device_name);
        h.d(findViewById, "findViewById(R.id.connect_device_name)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0707R.id.connect_device_icon);
        h.d(findViewById2, "findViewById(R.id.connect_device_icon)");
        this.b = (ImageView) findViewById2;
        this.c = new m(context, (int) getResources().getDimension(C0707R.dimen.device_picker_volume_image_height), R.color.white);
    }
}
