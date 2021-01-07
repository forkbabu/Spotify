package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.f0;
import okhttp3.p;
import okhttp3.u;

public final class e {
    private final okhttp3.a a;
    private final d b;
    private final okhttp3.e c;
    private final p d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<f0> h = new ArrayList();

    public static final class a {
        private final List<f0> a;
        private int b = 0;

        a(List<f0> list) {
            this.a = list;
        }

        public List<f0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public f0 c() {
            if (b()) {
                List<f0> list = this.a;
                int i = this.b;
                this.b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public e(okhttp3.a aVar, d dVar, okhttp3.e eVar, p pVar) {
        List<Proxy> list;
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.d = pVar;
        u l = aVar.l();
        Proxy g2 = aVar.g();
        if (g2 != null) {
            this.e = Collections.singletonList(g2);
        } else {
            List<Proxy> select = aVar.i().select(l.A());
            if (select == null || select.isEmpty()) {
                list = rnf.r(Proxy.NO_PROXY);
            } else {
                list = rnf.q(select);
            }
            this.e = list;
        }
        this.f = 0;
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    public void a(f0 f0Var, IOException iOException) {
        if (!(f0Var.b().type() == Proxy.Type.DIRECT || this.a.i() == null)) {
            this.a.i().connectFailed(this.a.l().A(), f0Var.b().address(), iOException);
        }
        this.b.b(f0Var);
    }

    public boolean b() {
        return c() || !this.h.isEmpty();
    }

    public a d() {
        String str;
        int i;
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                if (c()) {
                    List<Proxy> list = this.e;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    Proxy proxy = list.get(i2);
                    this.g = new ArrayList();
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        str = this.a.l().k();
                        i = this.a.l().v();
                    } else {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                            } else {
                                str = address2.getHostAddress();
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            StringBuilder V0 = je.V0("Proxy.address() is not an InetSocketAddress: ");
                            V0.append(address.getClass());
                            throw new IllegalArgumentException(V0.toString());
                        }
                    }
                    if (i >= 1 && i <= 65535) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            this.g.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            this.d.getClass();
                            List<InetAddress> a2 = this.a.c().a(str);
                            if (!a2.isEmpty()) {
                                this.d.getClass();
                                int size = a2.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    this.g.add(new InetSocketAddress(a2.get(i3), i));
                                }
                            } else {
                                throw new UnknownHostException(this.a.c() + " returned no addresses for " + str);
                            }
                        }
                        int size2 = this.g.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            f0 f0Var = new f0(this.a, proxy, this.g.get(i4));
                            if (this.b.c(f0Var)) {
                                this.h.add(f0Var);
                            } else {
                                arrayList.add(f0Var);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
                    }
                } else {
                    StringBuilder V02 = je.V0("No route to ");
                    V02.append(this.a.l().k());
                    V02.append("; exhausted proxy configurations: ");
                    V02.append(this.e);
                    throw new SocketException(V02.toString());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
