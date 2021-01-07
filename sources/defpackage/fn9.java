package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.z;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: fn9  reason: default package */
public class fn9 implements en9 {
    private final SpSharedPreferences.b<Object, JSONArray> a;
    private final Context b;
    private final i c;
    private final g<SessionState> d;

    public fn9(Context context, i iVar, g<SessionState> gVar, String str) {
        this.b = context;
        this.c = iVar;
        this.d = gVar;
        SpSharedPreferences.b<Object, JSONArray> b2 = SpSharedPreferences.b.b(str);
        this.a = b2 == null ? SpSharedPreferences.b.e(str) : b2;
    }

    @Override // defpackage.en9
    public z<Queue<mm9>> a() {
        return this.d.O(bn9.a).E().A(new an9(this)).A(new zm9(this));
    }

    @Override // defpackage.en9
    public a b(Queue<mm9> queue) {
        return this.d.O(bn9.a).E().A(new xm9(this)).t(new ym9(this, queue));
    }

    public /* synthetic */ SpSharedPreferences c(String str) {
        return this.c.b(this.b, str);
    }

    public /* synthetic */ Queue d(SpSharedPreferences spSharedPreferences) {
        try {
            JSONArray g = spSharedPreferences.g(this.a, null);
            if (g == null) {
                return new LinkedList();
            }
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < g.length(); i++) {
                mm9 b2 = mm9.b(g.getJSONObject(i));
                if (b2 != null) {
                    linkedList.add(b2);
                }
            }
            return linkedList;
        } catch (JSONException unused) {
            return new LinkedList();
        }
    }

    public /* synthetic */ SpSharedPreferences e(String str) {
        return this.c.b(this.b, str);
    }

    public /* synthetic */ e f(Queue queue, SpSharedPreferences spSharedPreferences) {
        JSONArray jSONArray = new JSONArray((Collection) queue);
        SpSharedPreferences.a b2 = spSharedPreferences.b();
        b2.c(this.a, jSONArray);
        b2.i();
        return b.a;
    }
}
