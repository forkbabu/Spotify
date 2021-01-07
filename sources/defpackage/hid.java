package defpackage;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.google.common.base.Joiner;
import com.spotify.mobile.android.util.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: hid  reason: default package */
public class hid implements jhd {
    private final Context a;
    private final v b;

    public hid(Context context, v vVar) {
        this.a = context;
        this.b = vVar;
    }

    public void a(Uri uri) {
        Adjust.appWillOpenUrl(uri, this.a);
    }

    @Deprecated
    public void b(iid iid) {
        AdjustEvent adjustEvent = new AdjustEvent(iid.b);
        adjustEvent.addCallbackParameter("spotify_id", this.b.c());
        adjustEvent.addCallbackParameter("session_id", this.b.d());
        if (!iid.a.isEmpty()) {
            Joiner.MapJoiner withKeyValueSeparator = Joiner.on(",").withKeyValueSeparator(":");
            TreeMap<String, String> treeMap = iid.a;
            withKeyValueSeparator.getClass();
            Iterator<T> it = treeMap.entrySet().iterator();
            StringBuilder sb = new StringBuilder();
            try {
                withKeyValueSeparator.appendTo(sb, it);
                adjustEvent.addCallbackParameter("data", sb.toString());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        Adjust.trackEvent(adjustEvent);
    }
}
