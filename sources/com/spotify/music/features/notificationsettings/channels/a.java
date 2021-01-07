package com.spotify.music.features.notificationsettings.channels;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a implements View.OnClickListener {
    private final Channel a;
    private final nmf<Channel, f> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super com.spotify.music.features.notificationsettings.common.Channel, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Channel channel, nmf<? super Channel, f> nmf) {
        h.e(channel, "channel");
        h.e(nmf, "consumer");
        this.a = channel;
        this.b = nmf;
    }

    public void a(Context context, g90 g90) {
        String str;
        h.e(context, "context");
        h.e(g90, "binder");
        t90 t90 = (t90) g90;
        TextView Z = t90.Z();
        h.d(Z, "item.textView");
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            str = context.getString(C0707R.string.push_notifications);
        } else if (ordinal == 1) {
            str = context.getString(C0707R.string.email_notifications);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Z.setText(str);
        t90.getView().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.invoke(this.a);
    }
}
