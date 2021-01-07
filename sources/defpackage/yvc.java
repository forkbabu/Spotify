package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.podcastinteractivity.proto.Poll;

/* renamed from: yvc  reason: default package */
public final /* synthetic */ class yvc implements View.OnClickListener {
    public final /* synthetic */ bwc a;
    public final /* synthetic */ Poll b;
    public final /* synthetic */ LinearLayout c;

    public /* synthetic */ yvc(bwc bwc, Poll poll, LinearLayout linearLayout) {
        this.a = bwc;
        this.b = poll;
        this.c = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, this.c, view);
    }
}
