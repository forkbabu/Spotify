package com.spotify.zero.tracker.eventsender;

import android.util.Base64;
import com.spotify.messages.ZeroFrictionAuthentication;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class d implements a {
    private static final SpSharedPreferences.b<Object, String> b;
    private final SpSharedPreferences<Object> a;

    static {
        SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("messages_held_till_auth");
        h.d(c, "SpSharedPreferences.Pref…messages_held_till_auth\")");
        b = c;
    }

    public d(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "prefs");
        this.a = spSharedPreferences;
    }

    private final List<ZeroFrictionAuthentication> b() {
        EmptyList emptyList = EmptyList.a;
        String m = this.a.m(b, null);
        if (m == null) {
            return emptyList;
        }
        h.e(m, "string");
        try {
            List<String> v = e.v(m, new char[]{';'}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(v, 10));
            for (String str : v) {
                arrayList.add(Base64.decode(str, 0));
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.d.e(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ZeroFrictionAuthentication.q((byte[]) it.next()));
            }
            return arrayList2;
        } catch (Exception unused) {
            return emptyList;
        }
    }

    private final void c(List<ZeroFrictionAuthentication> list) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        SpSharedPreferences.b<Object, String> bVar = b;
        h.e(list, "list");
        b2.f(bVar, list.isEmpty() ^ true ? kotlin.collections.d.p(list, ";", null, null, 0, null, SharedPrefAuthenticatedMessageQueue$Companion$encodeMessageString$1$1.a, 30, null) : null);
        b2.i();
    }

    @Override // com.spotify.zero.tracker.eventsender.a
    public void a(ZeroFrictionAuthentication zeroFrictionAuthentication) {
        h.e(zeroFrictionAuthentication, "message");
        synchronized ("authenticated_message_lock") {
            List<ZeroFrictionAuthentication> W = kotlin.collections.d.W(b());
            ((ArrayList) W).add(zeroFrictionAuthentication);
            c(W);
        }
    }

    @Override // com.spotify.zero.tracker.eventsender.a
    public List<ZeroFrictionAuthentication> remove() {
        List<ZeroFrictionAuthentication> Q;
        synchronized ("authenticated_message_lock") {
            Q = kotlin.collections.d.Q(b());
            c(EmptyList.a);
        }
        return Q;
    }
}
