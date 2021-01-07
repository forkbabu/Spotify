package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsFragment;
import com.spotify.music.features.notificationsettings.channels.ChannelsFragment;
import com.spotify.music.features.notificationsettings.combined.fragments.CategoriesAndChannelsFragment;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.navigation.k;
import com.spotify.remoteconfig.NotificationSettingsProperties;
import kotlin.jvm.internal.h;

/* renamed from: gs5  reason: default package */
public final class gs5 implements blb {
    private final NotificationSettingsProperties a;

    /* renamed from: gs5$a */
    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            Channel channel;
            Uri uri = l0Var.a;
            h.d(uri, "link.mUri");
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int hashCode = lastPathSegment.hashCode();
                if (hashCode != 3452698) {
                    if (hashCode == 96619420 && lastPathSegment.equals("email")) {
                        channel = Channel.EMAIL;
                    }
                } else if (lastPathSegment.equals(Constants.PUSH)) {
                    channel = Channel.PUSH;
                }
                h.e(channel, "channel");
                ChannelDetailsFragment channelDetailsFragment = new ChannelDetailsFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("SELECTED_CHANNEL", channel);
                channelDetailsFragment.r4(bundle);
                return channelDetailsFragment;
            }
            throw new IllegalArgumentException("Unknown channel");
        }
    }

    /* renamed from: gs5$b */
    static final class b implements k {
        final /* synthetic */ gs5 a;

        b(gs5 gs5) {
            this.a = gs5;
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            NotificationSettingsProperties.StartingPage b = this.a.a.b();
            if (b != null && b.ordinal() == 1) {
                return new ChannelsFragment();
            }
            return new CategoriesAndChannelsFragment();
        }
    }

    public gs5(NotificationSettingsProperties notificationSettingsProperties) {
        h.e(notificationSettingsProperties, "properties");
        this.a = notificationSettingsProperties;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.CONFIG_PUSH_NOTIFICATION, "Show notification settings fragment", new b(this));
        xkb.i(LinkType.NOTIFICATION_SETTINGS_CHANNEL_DETAILS, "Show channel details fragment", a.a);
    }
}
