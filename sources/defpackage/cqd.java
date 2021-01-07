package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.player.model.PlayerState;

/* renamed from: cqd  reason: default package */
public interface cqd {

    /* renamed from: cqd$a */
    public interface a {
        View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

        void start();

        void stop();
    }

    boolean a(PlayerState playerState);

    cmf<a> b();

    String name();
}
