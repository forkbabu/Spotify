package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: jr8  reason: default package */
public class jr8 {
    private static final Pattern c = Pattern.compile("(|.+)(device_address=)([a-fA-F0-9:]+)(|&.*)");
    private static final Pattern d = Pattern.compile("(|.+)(device_name=)([^&]*)(|&.*)");
    private final Context a;
    private final h2e b;

    jr8(Context context, h2e h2e) {
        this.a = context;
        this.b = h2e;
    }

    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("remote_extra_data");
        if (stringExtra != null) {
            if (stringExtra.contains("start_app_protocol_server=true")) {
                Matcher matcher = c.matcher(stringExtra);
                String group = matcher.matches() ? matcher.group(3) : null;
                Matcher matcher2 = d.matcher(stringExtra);
                String group2 = matcher2.matches() ? matcher2.group(3) : "Samsung Watch";
                if (group != null) {
                    this.b.b(this.a, AppProtocolBluetoothService.g(this.a, group, group2), "TizenRemoteControlHelper", new Object[0]);
                } else {
                    Logger.d("has command to start app protocol server but no device address", new Object[0]);
                }
            } else {
                Logger.d("has remote_extra_data but no command to start app protocol server", new Object[0]);
            }
        }
    }
}
