package com.google.android.datatransport;

/* access modifiers changed from: package-private */
public final class a<T> extends c<T> {
    private final Integer a;
    private final T b;
    private final Priority c;

    a(Integer num, T t, Priority priority) {
        this.a = num;
        if (t != null) {
            this.b = t;
            this.c = priority;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    @Override // com.google.android.datatransport.c
    public Integer a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.c
    public T b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.c
    public Priority c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.b.equals(cVar.b()) && this.c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Event{code=");
        V0.append(this.a);
        V0.append(", payload=");
        V0.append((Object) this.b);
        V0.append(", priority=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
