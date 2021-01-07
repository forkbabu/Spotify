package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.features.login.startview.StartFragment;

/* renamed from: go5  reason: default package */
public final /* synthetic */ class go5 implements x01 {
    public static final /* synthetic */ go5 a = new go5();

    private /* synthetic */ go5() {
    }

    @Override // defpackage.x01
    public final Fragment a(Destination destination) {
        Destination.i iVar = (Destination.i) destination;
        int i = StartFragment.u0;
        Bundle bundle = new Bundle();
        StartFragment startFragment = new StartFragment();
        startFragment.r4(bundle);
        return startFragment;
    }
}
