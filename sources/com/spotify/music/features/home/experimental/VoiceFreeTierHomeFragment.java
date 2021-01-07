package com.spotify.music.features.home.experimental;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.f;
import com.google.common.collect.Collections2;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.music.C0707R;
import com.spotify.music.features.home.freetier.FreeTierHomeFragment;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceFreeTierHomeFragment extends FreeTierHomeFragment {
    bv3 A0;
    hp3 B0;
    cqe C0;
    gl0<u> D0;
    e E0;
    b F0;
    w52 G0;
    AndroidFeatureHomeProperties H0;

    private void L4() {
        w52 w52 = this.G0;
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(1);
        Collections.addAll(newHashSetWithExpectedSize, "android.permission.RECORD_AUDIO");
        w52.d(1, this, newHashSetWithExpectedSize);
    }

    public /* synthetic */ void K4(DialogInterface dialogInterface, int i) {
        L4();
    }

    /* access modifiers changed from: protected */
    public void M4(boolean z) {
        this.A0.d(this, false);
        gl0<u> gl0 = this.D0;
        VoiceAdLog.c q = VoiceAdLog.q();
        q.p("mic_permission_deny");
        q.r(this.C0.d());
        q.o(z ? "deny_system_prompt" : "deny_custom_prompt");
        gl0.c(q.build());
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i == 1 && i2 == -1) {
            int i3 = PermissionsRequestActivity.f;
            PermissionsRequestActivity.a aVar = (PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result");
            if (aVar == null) {
                return;
            }
            if (aVar.a()) {
                this.E0.h(true);
                this.F0.b(j4(), VoiceSourceElement.FREE_TIER_HOME, kfd.q0);
                gl0<u> gl0 = this.D0;
                VoiceAdLog.c q = VoiceAdLog.q();
                q.p("mic_permission_accept");
                q.r(this.C0.d());
                q.o("");
                gl0.c(q.build());
                return;
            }
            M4(true);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        hp3 hp3 = this.B0;
        boolean z = true;
        boolean z2 = hp3 != null && hp3.c();
        if (Build.VERSION.SDK_INT < 23) {
            z = false;
        }
        AndroidFeatureHomeProperties.VoiceMicPermissionPrompt i = this.H0.i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("never_seen_prompt", String.valueOf(z2));
            jSONObject.put("os_supported", String.valueOf(z));
            jSONObject.put("permission_flag", i.name());
        } catch (JSONException e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
        gl0<u> gl0 = this.D0;
        VoiceAdLog.c q = VoiceAdLog.q();
        q.p("mic_permission_prompt_eligibility_check");
        q.r(this.C0.d());
        q.o(jSONObject.toString());
        gl0.c(q.build());
        if (z2 && z) {
            boolean f = this.G0.f(B2(), "android.permission.RECORD_AUDIO");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("mic_permission_granted", Boolean.toString(f));
            } catch (JSONException e2) {
                Logger.e(e2, "Unable to create json data", new Object[0]);
            }
            gl0<u> gl02 = this.D0;
            VoiceAdLog.c q2 = VoiceAdLog.q();
            q2.p("mic_permission_check");
            q2.r(this.C0.d());
            q2.o(jSONObject2.toString());
            gl02.c(q2.build());
            if (!f) {
                int ordinal = i.ordinal();
                if (ordinal == 2) {
                    this.B0.b(false);
                    L4();
                } else if (ordinal == 3) {
                    this.B0.b(false);
                    f.a aVar = new f.a(j4());
                    aVar.m(C0707R.string.voice_permission_prompt_title);
                    aVar.g(C0707R.string.voice_permission_prompt_body);
                    aVar.k(C0707R.string.voice_permission_prompt_button_positive, new a(this));
                    aVar.h(C0707R.string.voice_permission_prompt_button_negative, new b(this));
                    aVar.d(false);
                    aVar.a().show();
                }
            }
        }
    }
}
