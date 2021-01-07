package defpackage;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: i6  reason: default package */
public final class i6 {
    final Bundle a;
    List<String> b;
    List<IntentFilter> c;

    i6(Bundle bundle) {
        this.a = bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    public int b() {
        return this.a.getInt("connectionState", 0);
    }

    public String c() {
        return this.a.getString("status");
    }

    public int d() {
        return this.a.getInt("deviceType");
    }

    public Bundle e() {
        return this.a.getBundle("extras");
    }

    public List<String> f() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
        return this.b;
    }

    public Uri g() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String h() {
        return this.a.getString("id");
    }

    public String i() {
        return this.a.getString("name");
    }

    public int j() {
        return this.a.getInt("playbackStream", -1);
    }

    public int k() {
        return this.a.getInt("playbackType", 1);
    }

    public int l() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public int m() {
        return this.a.getInt("volume");
    }

    public int n() {
        return this.a.getInt("volumeHandling", 0);
    }

    public int o() {
        return this.a.getInt("volumeMax");
    }

    public boolean p() {
        return this.a.getBoolean("enabled", true);
    }

    public boolean q() {
        a();
        return !TextUtils.isEmpty(h()) && !TextUtils.isEmpty(i()) && !this.c.contains(null);
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("MediaRouteDescriptor{ ", "id=");
        Z0.append(h());
        Z0.append(", groupMemberIds=");
        Z0.append(f());
        Z0.append(", name=");
        Z0.append(i());
        Z0.append(", description=");
        Z0.append(c());
        Z0.append(", iconUri=");
        Z0.append(g());
        Z0.append(", isEnabled=");
        Z0.append(p());
        Z0.append(", isConnecting=");
        Z0.append(this.a.getBoolean("connecting", false));
        Z0.append(", connectionState=");
        Z0.append(b());
        Z0.append(", controlFilters=");
        a();
        Z0.append(Arrays.toString(this.c.toArray()));
        Z0.append(", playbackType=");
        Z0.append(k());
        Z0.append(", playbackStream=");
        Z0.append(j());
        Z0.append(", deviceType=");
        Z0.append(d());
        Z0.append(", volume=");
        Z0.append(m());
        Z0.append(", volumeMax=");
        Z0.append(o());
        Z0.append(", volumeHandling=");
        Z0.append(n());
        Z0.append(", presentationDisplayId=");
        Z0.append(l());
        Z0.append(", extras=");
        Z0.append(e());
        Z0.append(", isValid=");
        Z0.append(q());
        Z0.append(", minClientVersion=");
        Z0.append(this.a.getInt("minClientVersion", 1));
        Z0.append(", maxClientVersion=");
        Z0.append(this.a.getInt("maxClientVersion", Integer.MAX_VALUE));
        Z0.append(" }");
        return Z0.toString();
    }

    /* renamed from: i6$a */
    public static final class a {
        private final Bundle a;
        private ArrayList<String> b;
        private ArrayList<IntentFilter> c;

        public a(String str, String str2) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            bundle.putString("id", str);
            bundle.putString("name", str2);
        }

        public a a(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter intentFilter : collection) {
                        if (intentFilter != null) {
                            if (this.c == null) {
                                this.c = new ArrayList<>();
                            }
                            if (!this.c.contains(intentFilter)) {
                                this.c.add(intentFilter);
                            }
                        } else {
                            throw new IllegalArgumentException("filter must not be null");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public i6 b() {
            ArrayList<IntentFilter> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new i6(this.a);
        }

        @Deprecated
        public a c(boolean z) {
            this.a.putBoolean("connecting", z);
            return this;
        }

        public a d(String str) {
            this.a.putString("status", str);
            return this;
        }

        public a e(int i) {
            this.a.putInt("deviceType", i);
            return this;
        }

        public a f(boolean z) {
            this.a.putBoolean("enabled", z);
            return this;
        }

        public a g(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public a h(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public a i(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public a j(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public a k(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public a l(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }

        public a(i6 i6Var) {
            if (i6Var != null) {
                this.a = new Bundle(i6Var.a);
                if (!i6Var.f().isEmpty()) {
                    this.b = new ArrayList<>(i6Var.f());
                }
                i6Var.a();
                if (!i6Var.c.isEmpty()) {
                    this.c = new ArrayList<>(i6Var.c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
