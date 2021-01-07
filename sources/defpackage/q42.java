package defpackage;

import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.ui.fragments.logic.MarketingOptInDialogFragment;
import com.spotify.mobile.android.ui.fragments.logic.OfflineSyncErrorFragment;
import com.spotify.mobile.android.ui.fragments.logic.PlaybackErrorDialogFragment;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.music.features.accountrecovery.setpassword.dialog.SetPasswordHeadlessFragment;
import com.spotify.music.features.churnlockedstate.ChurnLockedStateDetectorFragment;
import com.spotify.music.features.connect.dialogs.SwitchDeviceFragment;
import com.spotify.music.features.connect.dialogs.newdevice.NewDeviceFragment;
import com.spotify.music.features.diskalmostfull.DiskAlmostFullFragment;
import com.spotify.music.features.premiumreactivation.PremiumReactivationFragment;
import com.spotify.music.libs.googleassistantaccountlinking.GoogleAssistantAccountLinkingPresentableDialogFragment;
import com.spotify.music.offlinetrials.capped.CappedOfflineDialogFragment;
import com.spotify.music.spotlets.apprater.AppRaterFragment;
import java.util.LinkedHashMap;

/* renamed from: q42  reason: default package */
final class q42 implements qz1 {
    q42() {
    }

    @Override // defpackage.qz1
    public LinkedHashMap<String, PresentableDialogFragment> a(c cVar) {
        LinkedHashMap<String, PresentableDialogFragment> linkedHashMap = new LinkedHashMap<>();
        String simpleName = PremiumReactivationFragment.class.getSimpleName();
        PremiumReactivationFragment premiumReactivationFragment = new PremiumReactivationFragment();
        premiumReactivationFragment.r4(new Bundle());
        linkedHashMap.put(simpleName, premiumReactivationFragment);
        PlaybackErrorDialogFragment playbackErrorDialogFragment = new PlaybackErrorDialogFragment();
        d.a(playbackErrorDialogFragment, cVar);
        linkedHashMap.put("playback_error_dialog_fragment", playbackErrorDialogFragment);
        OfflineSyncErrorFragment offlineSyncErrorFragment = new OfflineSyncErrorFragment();
        d.a(offlineSyncErrorFragment, cVar);
        linkedHashMap.put("offline_sync_error_fragment", offlineSyncErrorFragment);
        linkedHashMap.put("disk_almost_full_fragment", new DiskAlmostFullFragment());
        SwitchDeviceFragment switchDeviceFragment = new SwitchDeviceFragment();
        d.a(switchDeviceFragment, cVar);
        linkedHashMap.put("tag_switch_device_fragment", switchDeviceFragment);
        NewDeviceFragment newDeviceFragment = new NewDeviceFragment();
        d.a(newDeviceFragment, cVar);
        linkedHashMap.put("tag_new_device_fragment", newDeviceFragment);
        linkedHashMap.put("app_rater_fragment", new AppRaterFragment());
        linkedHashMap.put("marketing_opt_in_fragment", new MarketingOptInDialogFragment());
        ChurnLockedStateDetectorFragment churnLockedStateDetectorFragment = new ChurnLockedStateDetectorFragment();
        churnLockedStateDetectorFragment.r4(new Bundle());
        linkedHashMap.put("churn_locked_state_detector_fragment", churnLockedStateDetectorFragment);
        try {
            linkedHashMap.put("uninstall_release_version", (PresentableDialogFragment) Class.forName("com.spotify.music.features.uninstallrelease.UninstallReleaseVersionDialogFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new AssertionError(e);
        }
        linkedHashMap.put("set_password_fragment", new SetPasswordHeadlessFragment());
        CappedOfflineDialogFragment cappedOfflineDialogFragment = new CappedOfflineDialogFragment();
        d.a(cappedOfflineDialogFragment, cVar);
        linkedHashMap.put("CappedOfflineDialogFragment", cappedOfflineDialogFragment);
        int i = GoogleAssistantAccountLinkingPresentableDialogFragment.n0;
        linkedHashMap.put("google_assistant_linking_debug_fragment", new GoogleAssistantAccountLinkingPresentableDialogFragment());
        return linkedHashMap;
    }
}
