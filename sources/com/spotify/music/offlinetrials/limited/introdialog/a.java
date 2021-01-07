package com.spotify.music.offlinetrials.limited.introdialog;

import com.spotify.music.offlinetrials.limited.introdialog.i;
import com.spotify.music.slate.model.u;

abstract class a extends i {
    private final u a;
    private final u b;
    private final u c;

    /* renamed from: com.spotify.music.offlinetrials.limited.introdialog.a$a  reason: collision with other inner class name */
    static class C0319a extends i.a {
        private u a;
        private u b;
        private u c;

        C0319a() {
        }

        public i a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.c == null) {
                str = je.x0(str, " positiveAction");
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public i.a b(u uVar) {
            this.c = uVar;
            return this;
        }

        public i.a c(u uVar) {
            this.b = uVar;
            return this;
        }

        public i.a d(u uVar) {
            this.a = uVar;
            return this;
        }
    }

    a(u uVar, u uVar2, u uVar3) {
        if (uVar != null) {
            this.a = uVar;
            if (uVar2 != null) {
                this.b = uVar2;
                if (uVar3 != null) {
                    this.c = uVar3;
                    return;
                }
                throw new NullPointerException("Null positiveAction");
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    @Override // com.spotify.music.offlinetrials.limited.introdialog.i
    public u a() {
        return this.c;
    }

    @Override // com.spotify.music.offlinetrials.limited.introdialog.i
    public u b() {
        return this.b;
    }

    @Override // com.spotify.music.offlinetrials.limited.introdialog.i
    public u c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.c()) || !this.b.equals(iVar.b()) || !this.c.equals(iVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LimitedOfflineSlateViewModel{title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", positiveAction=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
