package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.u;
import okhttp3.y;
import retrofit2.a;
import retrofit2.c;
import retrofit2.j;

public final class w {
    private final Map<Method, x<?>> a = new ConcurrentHashMap();
    final e.a b;
    final u c;
    final List<j.a> d;
    final List<c.a> e;
    final Executor f;
    final boolean g;

    /* access modifiers changed from: package-private */
    public class a implements InvocationHandler {
        private final s a = s.f();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.h(method)) {
                return this.a.g(method, this.c, obj, objArr);
            }
            x<?> e = w.this.e(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return e.a(objArr);
        }
    }

    w(e.a aVar, u uVar, List<j.a> list, List<c.a> list2, Executor executor, boolean z) {
        this.b = aVar;
        this.c = uVar;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = z;
    }

    public u a() {
        return this.c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("returnType == null");
        } else if (annotationArr != null) {
            int indexOf = this.e.indexOf(null) + 1;
            int size = this.e.size();
            for (int i = indexOf; i < size; i++) {
                c<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
                if (a2 != null) {
                    return a2;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.e.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.e.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    public List<c.a> c() {
        return this.e;
    }

    public <T> T d(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length <= 0) {
            if (this.g) {
                s f2 = s.f();
                Method[] declaredMethods = cls.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    if (!f2.h(method) && !Modifier.isStatic(method.getModifiers())) {
                        e(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        } else {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* access modifiers changed from: package-private */
    public x<?> e(Method method) {
        x<?> xVar;
        x<?> xVar2 = this.a.get(method);
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (this.a) {
            xVar = this.a.get(method);
            if (xVar == null) {
                xVar = x.b(this, method);
                this.a.put(method, xVar);
            }
        }
        return xVar;
    }

    public b f() {
        return new b(this);
    }

    public <T> j<T, c0> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr == null) {
            throw new NullPointerException("parameterAnnotations == null");
        } else if (annotationArr2 != null) {
            int indexOf = this.d.indexOf(null) + 1;
            int size = this.d.size();
            for (int i = indexOf; i < size; i++) {
                j<T, c0> jVar = (j<T, c0>) this.d.get(i).a(type, annotationArr, annotationArr2, this);
                if (jVar != null) {
                    return jVar;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("methodAnnotations == null");
        }
    }

    public <T> j<e0, T> h(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr != null) {
            int indexOf = this.d.indexOf(null) + 1;
            int size = this.d.size();
            for (int i = indexOf; i < size; i++) {
                j<e0, T> jVar = (j<e0, T>) this.d.get(i).b(type, annotationArr, this);
                if (jVar != null) {
                    return jVar;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    public <T> j<T, String> i(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.get(i).getClass();
            }
            return a.d.a;
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    public static final class b {
        private final s a;
        private e.a b;
        private u c;
        private final List<j.a> d = new ArrayList();
        private final List<c.a> e = new ArrayList();
        private Executor f;
        private boolean g;

        public b() {
            s f2 = s.f();
            this.a = f2;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.e;
            if (aVar != null) {
                list.add(aVar);
                return this;
            }
            throw new NullPointerException("factory == null");
        }

        public b b(j.a aVar) {
            this.d.add(aVar);
            return this;
        }

        public b c(String str) {
            if (str != null) {
                d(u.j(str));
                return this;
            }
            throw new NullPointerException("baseUrl == null");
        }

        public b d(u uVar) {
            if (uVar != null) {
                List<String> q = uVar.q();
                if ("".equals(q.get(q.size() - 1))) {
                    this.c = uVar;
                    return this;
                }
                throw new IllegalArgumentException("baseUrl must end in /: " + uVar);
            }
            throw new NullPointerException("baseUrl == null");
        }

        public w e() {
            if (this.c != null) {
                e.a aVar = this.b;
                if (aVar == null) {
                    aVar = new y();
                }
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.c();
                }
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.addAll(this.a.a(executor));
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.e());
                arrayList2.add(new a());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.d());
                return new w(aVar, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(e.a aVar) {
            if (aVar != null) {
                this.b = aVar;
                return this;
            }
            throw new NullPointerException("factory == null");
        }

        public b g(y yVar) {
            if (yVar != null) {
                this.b = yVar;
                return this;
            }
            throw new NullPointerException("client == null");
        }

        public List<j.a> h() {
            return this.d;
        }

        b(w wVar) {
            s f2 = s.f();
            this.a = f2;
            this.b = wVar.b;
            this.c = wVar.c;
            int size = wVar.d.size() - f2.e();
            for (int i = 1; i < size; i++) {
                this.d.add(wVar.d.get(i));
            }
            int size2 = wVar.e.size() - this.a.b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.add(wVar.e.get(i2));
            }
            this.f = wVar.f;
            this.g = wVar.g;
        }
    }
}
