package com.spotify.music.superbird.setup;

import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.steps.checkforupdates.CheckForUpdatesFragment;
import com.spotify.music.superbird.setup.steps.connected.ConnectedFragment;
import com.spotify.music.superbird.setup.steps.connecttocar.ConnectToCarFragment;
import com.spotify.music.superbird.setup.steps.connecttowifi.ConnectToWifiFragment;
import com.spotify.music.superbird.setup.steps.downloaded.DownloadedFragment;
import com.spotify.music.superbird.setup.steps.downloading.DownloadingFragment;
import com.spotify.music.superbird.setup.steps.everythingconnected.EverythingConnectedFragment;
import com.spotify.music.superbird.setup.steps.mountinstructions.MountInstructionsFragment;
import com.spotify.music.superbird.setup.steps.mountselection.MountSelectionFragment;
import com.spotify.music.superbird.setup.steps.ready.ReadyFragment;
import com.spotify.music.superbird.setup.steps.readywithupdate.ReadyWithUpdateFragment;
import com.spotify.music.superbird.setup.steps.reconnecting.ReconnectingFragment;
import com.spotify.music.superbird.setup.steps.searching.SearchingFragment;
import com.spotify.music.superbird.setup.steps.testsound.TestSoundFragment;
import com.spotify.music.superbird.setup.steps.welcome.WelcomeFragment;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SetupNavigator {
    private final int a = C0707R.id.content;
    private nmf<? super Fragment, f> b = SetupNavigator$onFragmentChanged$1.a;
    private final o c;

    public SetupNavigator(o oVar) {
        h.e(oVar, "fragmentManager");
        this.c = oVar;
    }

    private final void a(Fragment fragment) {
        x i = this.c.i();
        i.q(this.a, fragment, null);
        i.i();
        this.b.invoke(fragment);
    }

    public final void b(nmf<? super Fragment, f> nmf) {
        h.e(nmf, "<set-?>");
        this.b = nmf;
    }

    public final void c() {
        if (!(this.c.T(this.a) instanceof CheckForUpdatesFragment)) {
            a(new CheckForUpdatesFragment());
        }
    }

    public final void d() {
        if (!(this.c.T(this.a) instanceof ConnectToCarFragment)) {
            a(new ConnectToCarFragment());
        }
    }

    public final void e() {
        if (!(this.c.T(this.a) instanceof ConnectToWifiFragment)) {
            a(new ConnectToWifiFragment());
        }
    }

    public final void f() {
        if (!(this.c.T(this.a) instanceof ConnectedFragment)) {
            a(new ConnectedFragment());
        }
    }

    public final void g() {
        if (!(this.c.T(this.a) instanceof DownloadedFragment)) {
            a(new DownloadedFragment());
        }
    }

    public final void h() {
        if (!(this.c.T(this.a) instanceof DownloadingFragment)) {
            a(new DownloadingFragment());
        }
    }

    public final void i() {
        if (!(this.c.T(this.a) instanceof EverythingConnectedFragment)) {
            a(new EverythingConnectedFragment());
        }
    }

    public final void j() {
        if (!(this.c.T(this.a) instanceof MountInstructionsFragment)) {
            a(new MountInstructionsFragment());
        }
    }

    public final void k() {
        if (!(this.c.T(this.a) instanceof MountSelectionFragment)) {
            a(new MountSelectionFragment());
        }
    }

    public final void l() {
        if (!(this.c.T(this.a) instanceof ReadyFragment)) {
            a(new ReadyFragment());
        }
    }

    public final void m() {
        if (!(this.c.T(this.a) instanceof ReadyWithUpdateFragment)) {
            a(new ReadyWithUpdateFragment());
        }
    }

    public final void n() {
        if (!(this.c.T(this.a) instanceof ReconnectingFragment)) {
            a(new ReconnectingFragment());
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 26 && !(this.c.T(this.a) instanceof SearchingFragment)) {
            a(new SearchingFragment());
        }
    }

    public final void p() {
        if (!(this.c.T(this.a) instanceof TestSoundFragment)) {
            a(new TestSoundFragment());
        }
    }

    public final void q() {
        if (!(this.c.T(this.a) instanceof WelcomeFragment)) {
            a(new WelcomeFragment());
        }
    }
}
