package com.spotify.music.features.notificationsettings.channeldetails;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class CategoryItem implements CompoundButton.OnCheckedChangeListener {
    private final a a;
    private final Channel b;
    private final rmf<a, Boolean, f> c;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: rmf<? super com.spotify.music.features.notificationsettings.common.a, ? super java.lang.Boolean, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public CategoryItem(a aVar, Channel channel, rmf<? super a, ? super Boolean, f> rmf) {
        h.e(aVar, "category");
        h.e(channel, "channel");
        h.e(rmf, "consumer");
        this.a = aVar;
        this.b = channel;
        this.c = rmf;
    }

    public void a(Context context, g90 g90) {
        h.e(context, "context");
        h.e(g90, "binder");
        x90 x90 = (x90) g90;
        TextView titleView = x90.getTitleView();
        h.d(titleView, "item.titleView");
        titleView.setText(this.a.d());
        TextView subtitleView = x90.getSubtitleView();
        h.d(subtitleView, "item.subtitleView");
        subtitleView.setText(this.a.a());
        View W1 = x90.W1();
        if (W1 != null) {
            SwitchCompat switchCompat = (SwitchCompat) W1;
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(this.a.b().contains(this.b));
            switchCompat.setOnCheckedChangeListener(new a(new CategoryItem$bind$1$1(this)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c.invoke(this.a, Boolean.valueOf(z));
    }
}
