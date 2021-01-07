package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.impl.utils.l;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    private Context a;
    private WorkerParameters b;
    private boolean c;
    private boolean f;

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.a = context;
            this.b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.a;
    }

    public Executor c() {
        return this.b.a();
    }

    public final UUID d() {
        return this.b.c();
    }

    public final d e() {
        return this.b.d();
    }

    public na g() {
        return this.b.e();
    }

    public s h() {
        return this.b.f();
    }

    public boolean i() {
        return this.f;
    }

    public final boolean j() {
        return this.c;
    }

    public void k() {
    }

    public final ListenableFuture<Void> l(e eVar) {
        this.f = true;
        return ((l) this.b.b()).a(this.a, d(), eVar);
    }

    public final void m() {
        this.c = true;
    }

    public abstract ListenableFuture<a> n();

    public final void o() {
        k();
    }

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0051a extends a {
            private final d a = d.c;

            public d a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0051a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0051a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0051a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder V0 = je.V0("Failure {mOutputData=");
                V0.append(this.a);
                V0.append('}');
                return V0.toString();
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        a() {
        }

        public static final class c extends a {
            private final d a;

            public c() {
                this.a = d.c;
            }

            public d a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder V0 = je.V0("Success {mOutputData=");
                V0.append(this.a);
                V0.append('}');
                return V0.toString();
            }

            public c(d dVar) {
                this.a = dVar;
            }
        }
    }
}
