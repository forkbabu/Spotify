package defpackage;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.spotify.music.podcastinteractivity.proto.Poll;
import com.spotify.music.podcastinteractivity.proto.PollOption;

/* renamed from: xvc  reason: default package */
public final /* synthetic */ class xvc implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ bwc a;
    public final /* synthetic */ Poll b;
    public final /* synthetic */ PollOption c;
    public final /* synthetic */ int f;
    public final /* synthetic */ LinearLayout n;
    public final /* synthetic */ Button o;

    public /* synthetic */ xvc(bwc bwc, Poll poll, PollOption pollOption, int i, LinearLayout linearLayout, Button button) {
        this.a = bwc;
        this.b = poll;
        this.c = pollOption;
        this.f = i;
        this.n = linearLayout;
        this.o = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.f(this.b, this.c, this.f, this.n, this.o, compoundButton, z);
    }
}
