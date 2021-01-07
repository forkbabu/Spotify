package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import io.branch.referral.ServerRequest;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class a0 {
    private static a0 d;
    private static final Object e = new Object();
    private SharedPreferences a;
    private SharedPreferences.Editor b;
    private final List<ServerRequest> c;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject A;
            JSONArray jSONArray = new JSONArray();
            synchronized (a0.e) {
                for (ServerRequest serverRequest : a0.this.c) {
                    if (serverRequest.p() && (A = serverRequest.A()) != null) {
                        jSONArray.put(A);
                    }
                }
            }
            try {
                a0.this.b.putString("BNCServerRequestQueue", jSONArray.toString()).commit();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private a0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
        String string = this.a.getString("BNCServerRequestQueue", null);
        List<ServerRequest> synchronizedList = Collections.synchronizedList(new LinkedList());
        synchronized (e) {
            if (string != null) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    int min = Math.min(jSONArray.length(), 25);
                    for (int i = 0; i < min; i++) {
                        ServerRequest e2 = ServerRequest.e(jSONArray.getJSONObject(i), context);
                        if (e2 != null) {
                            synchronizedList.add(e2);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.c = synchronizedList;
    }

    public static a0 i(Context context) {
        if (d == null) {
            synchronized (a0.class) {
                if (d == null) {
                    d = new a0(context);
                }
            }
        }
        return d;
    }

    private void n() {
        new Thread(new a()).start();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        synchronized (e) {
            try {
                this.c.clear();
                n();
            } catch (UnsupportedOperationException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        synchronized (e) {
            for (ServerRequest serverRequest : this.c) {
                if (serverRequest != null && serverRequest.k().equals(Defines$RequestPath.RegisterClose.d())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        synchronized (e) {
            for (ServerRequest serverRequest : this.c) {
                if (serverRequest instanceof y) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public ServerRequest g() {
        ServerRequest serverRequest;
        synchronized (e) {
            ServerRequest serverRequest2 = null;
            try {
                serverRequest = this.c.remove(0);
                try {
                    n();
                } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                    serverRequest2 = serverRequest;
                }
            } catch (IndexOutOfBoundsException | NoSuchElementException unused2) {
                serverRequest = serverRequest2;
                return serverRequest;
            }
        }
        return serverRequest;
    }

    /* access modifiers changed from: package-private */
    public void h(ServerRequest serverRequest) {
        synchronized (e) {
            if (serverRequest != null) {
                this.c.add(serverRequest);
                if (j() >= 25) {
                    this.c.remove(1);
                }
                n();
            }
        }
    }

    public int j() {
        int size;
        synchronized (e) {
            size = this.c.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public void k(ServerRequest serverRequest, int i) {
        synchronized (e) {
            try {
                if (this.c.size() < i) {
                    i = this.c.size();
                }
                this.c.add(i, serverRequest);
                n();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ServerRequest l() {
        ServerRequest serverRequest;
        synchronized (e) {
            try {
                serverRequest = this.c.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    /* access modifiers changed from: package-private */
    public ServerRequest m(int i) {
        ServerRequest serverRequest;
        synchronized (e) {
            try {
                serverRequest = this.c.get(i);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    public boolean o(ServerRequest serverRequest) {
        boolean z;
        synchronized (e) {
            z = false;
            try {
                z = this.c.remove(serverRequest);
                n();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (e) {
            for (ServerRequest serverRequest : this.c) {
                if (serverRequest != null && (serverRequest instanceof y)) {
                    serverRequest.a(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (e) {
            for (ServerRequest serverRequest : this.c) {
                if (serverRequest != null) {
                    serverRequest.w(process_wait_lock);
                }
            }
        }
    }
}
