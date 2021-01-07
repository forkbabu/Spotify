package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.a0;
import com.facebook.login.LoginFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.d;
import com.spotify.music.C0707R;

public class FacebookActivity extends c {
    private static final String A = FacebookActivity.class.getName();
    public static final /* synthetic */ int B = 0;
    private Fragment z;

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.z;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!k.u()) {
            boolean z2 = k.n;
            k.z(getApplicationContext());
        }
        setContentView(C0707R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            setResult(0, a0.h(getIntent(), null, a0.l(a0.q(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        o v0 = v0();
        Fragment U = v0.U("SingleFragment");
        FacebookDialogFragment facebookDialogFragment = U;
        if (U == null) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                FacebookDialogFragment facebookDialogFragment2 = new FacebookDialogFragment();
                facebookDialogFragment2.B4(true);
                facebookDialogFragment2.Y4(v0, "SingleFragment");
                facebookDialogFragment = facebookDialogFragment2;
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.B4(true);
                deviceShareDialogFragment.g5((d) intent2.getParcelableExtra("content"));
                deviceShareDialogFragment.Y4(v0, "SingleFragment");
                facebookDialogFragment = deviceShareDialogFragment;
            } else {
                LoginFragment loginFragment = new LoginFragment();
                loginFragment.B4(true);
                x i = v0.i();
                i.c(C0707R.id.com_facebook_fragment_container, loginFragment, "SingleFragment");
                i.i();
                facebookDialogFragment = loginFragment;
            }
        }
        this.z = facebookDialogFragment;
    }

    public Fragment u() {
        return this.z;
    }
}
