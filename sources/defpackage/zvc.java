package defpackage;

import android.view.View;
import com.spotify.music.podcastinteractivity.proto.PollOption;

/* renamed from: zvc  reason: default package */
public final /* synthetic */ class zvc implements View.OnClickListener {
    public final /* synthetic */ bwc a;
    public final /* synthetic */ PollOption b;

    public /* synthetic */ zvc(bwc bwc, PollOption pollOption) {
        this.a = bwc;
        this.b = pollOption;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b, view);
    }
}
