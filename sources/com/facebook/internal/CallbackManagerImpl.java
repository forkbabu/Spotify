package com.facebook.internal;

import android.content.Intent;
import com.facebook.f;
import com.facebook.k;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl implements f {
    private static Map<Integer, a> b = new HashMap();
    private Map<Integer, a> a = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public int d() {
            return k.i() + this.offset;
        }
    }

    public interface a {
        boolean a(int i, Intent intent);
    }

    public static synchronized void c(int i, a aVar) {
        synchronized (CallbackManagerImpl.class) {
            h0.f(aVar, "callback");
            if (!b.containsKey(Integer.valueOf(i))) {
                b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    public boolean a(int i, int i2, Intent intent) {
        a aVar;
        a aVar2 = this.a.get(Integer.valueOf(i));
        if (aVar2 != null) {
            return aVar2.a(i2, intent);
        }
        Integer valueOf = Integer.valueOf(i);
        synchronized (CallbackManagerImpl.class) {
            aVar = b.get(valueOf);
        }
        if (aVar != null) {
            return aVar.a(i2, intent);
        }
        return false;
    }

    public void b(int i, a aVar) {
        h0.f(aVar, "callback");
        this.a.put(Integer.valueOf(i), aVar);
    }
}
