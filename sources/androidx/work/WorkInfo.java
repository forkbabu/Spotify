package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {
    private UUID a;
    private State b;
    private d c;
    private Set<String> d;
    private d e;
    private int f;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean d() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public WorkInfo(UUID uuid, State state, d dVar, List<String> list, d dVar2, int i) {
        this.a = uuid;
        this.b = state;
        this.c = dVar;
        this.d = new HashSet(list);
        this.e = dVar2;
        this.f = i;
    }

    public State a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.a.equals(workInfo.a) && this.b == workInfo.b && this.c.equals(workInfo.c) && this.d.equals(workInfo.d)) {
            return this.e.equals(workInfo.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return ((this.e.hashCode() + je.c(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31) + this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("WorkInfo{mId='");
        V0.append(this.a);
        V0.append('\'');
        V0.append(", mState=");
        V0.append(this.b);
        V0.append(", mOutputData=");
        V0.append(this.c);
        V0.append(", mTags=");
        V0.append(this.d);
        V0.append(", mProgress=");
        V0.append(this.e);
        V0.append('}');
        return V0.toString();
    }
}
