package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import io.branch.referral.Branch;
import io.branch.referral.f;
import io.reactivex.disposables.a;
import io.reactivex.y;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s3a  reason: default package */
public final class s3a implements y70 {
    private final z70 a;
    private final t b;
    private final Branch.c c;
    private final m3a d;
    private final y e;
    private final a f = new a();
    private final Activity g;
    private boolean h;

    public s3a(z70 z70, t tVar, m3a m3a, y yVar, Activity activity) {
        this.d = m3a;
        this.a = z70;
        this.b = tVar;
        this.e = yVar;
        this.g = activity;
        this.c = new l3a(this);
    }

    private static String b(String str) {
        if (str.contains("open.spotify.com")) {
            return str;
        }
        if (!str.contains("spotify")) {
            str = je.x0("spotify:", str);
        }
        if (str.contains("://")) {
            str = str.substring(0, str.indexOf("://")) + '/' + str.substring(str.indexOf("://") + 3);
        }
        return str.contains("/") ? str.replaceAll("/", ":") : str;
    }

    private static Optional<Bundle> c(JSONObject jSONObject) {
        String str;
        try {
            str = jSONObject.getString("~referring_link");
        } catch (JSONException unused) {
            str = null;
        }
        if (str == null) {
            return Optional.absent();
        }
        Bundle bundle = new Bundle();
        bundle.putString("short_link", str);
        bundle.putString("shortlink_source", "BranchIO");
        return Optional.of(bundle);
    }

    private void h(Intent intent) {
        this.f.b(this.d.a().I0(this.e).N0(1).subscribe(new j3a(this, intent), k3a.a));
    }

    public void a() {
        this.f.b(this.d.a().I0(this.e).N0(1).subscribe(new i3a(this), h3a.a));
    }

    public void d(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.getClass();
            Branch.y(true);
        }
    }

    public /* synthetic */ void e(JSONObject jSONObject, f fVar) {
        if (fVar != null) {
            Logger.b("BranchSDKWrapper Warning: '%s'", fVar.toString());
        } else if (this.h && jSONObject.has("+clicked_branch_link") && jSONObject.optBoolean("+clicked_branch_link")) {
            if (jSONObject.has("$full_url")) {
                this.b.g(n.a(jSONObject.optString("$full_url")).a(), c(jSONObject));
            } else if (jSONObject.has("$canonical_url")) {
                this.b.g(n.a(jSONObject.optString("$canonical_url")).a(), c(jSONObject));
            } else if (jSONObject.has("$android_deeplink_path")) {
                this.b.g(n.a(b(jSONObject.optString("$android_deeplink_path"))).a(), c(jSONObject));
            } else if (jSONObject.has("$deeplink_path")) {
                this.b.g(n.a(b(jSONObject.optString("$deeplink_path"))).a(), c(jSONObject));
            } else {
                Logger.b("BranchSDKWrapper Info: Branch link opened the app but no deep link parameter was attached to the link", new Object[0]);
            }
        }
    }

    public void f(Intent intent, Boolean bool) {
        if (bool.booleanValue()) {
            z70 z70 = this.a;
            Activity activity = this.g;
            Branch.c cVar = this.c;
            z70.getClass();
            Branch.e b0 = Branch.b0(activity);
            b0.b(cVar);
            b0.c(intent != null ? intent.getData() : null);
            b0.a();
            return;
        }
        this.b.d("spotify:home");
    }

    public boolean g(Intent intent, boolean z) {
        boolean z2;
        this.h = z;
        if (intent.getData() != null) {
            String dataString = intent.getDataString();
            if (dataString != null) {
                Iterator<String> it = p3a.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (dataString.contains(it.next())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return false;
            }
        }
        if (intent.getData() == null) {
            intent.putExtra("branch_force_new_session", true);
            h(intent);
            return false;
        }
        h(intent);
        return true;
    }
}
