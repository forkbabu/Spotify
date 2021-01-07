package defpackage;

import io.netty.buffer.k;
import io.netty.channel.ChannelException;
import io.netty.channel.e;
import io.netty.channel.m0;
import io.netty.channel.p;
import io.netty.channel.p0;
import io.netty.channel.x0;
import io.netty.channel.y;
import io.netty.util.internal.PlatformDependent;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: pkf  reason: default package */
public class pkf extends y implements rkf {
    protected final Socket n;
    private volatile boolean o;

    public pkf(qkf qkf, Socket socket) {
        super(qkf);
        if (socket != null) {
            this.n = socket;
            if (PlatformDependent.c()) {
                try {
                    socket.setTcpNoDelay(true);
                } catch (SocketException e) {
                    throw new ChannelException(e);
                } catch (Exception unused) {
                }
            }
        } else {
            throw new NullPointerException("javaSocket");
        }
    }

    @Override // io.netty.channel.y, io.netty.channel.e
    public <T> boolean a(p<T> pVar, T t) {
        x(pVar, t);
        if (pVar == p.C) {
            try {
                this.n.setReceiveBufferSize(t.intValue());
            } catch (SocketException e) {
                throw new ChannelException(e);
            }
        } else if (pVar == p.B) {
            try {
                this.n.setSendBufferSize(t.intValue());
            } catch (SocketException e2) {
                throw new ChannelException(e2);
            }
        } else if (pVar == p.G) {
            try {
                this.n.setTcpNoDelay(t.booleanValue());
            } catch (SocketException e3) {
                throw new ChannelException(e3);
            }
        } else if (pVar == p.A) {
            try {
                this.n.setKeepAlive(t.booleanValue());
            } catch (SocketException e4) {
                throw new ChannelException(e4);
            }
        } else if (pVar == p.D) {
            try {
                this.n.setReuseAddress(t.booleanValue());
            } catch (SocketException e5) {
                throw new ChannelException(e5);
            }
        } else if (pVar == p.E) {
            int intValue = t.intValue();
            if (intValue < 0) {
                try {
                    this.n.setSoLinger(false, 0);
                } catch (SocketException e6) {
                    throw new ChannelException(e6);
                }
            } else {
                this.n.setSoLinger(true, intValue);
            }
        } else if (pVar == p.F) {
            try {
                this.n.setTrafficClass(t.intValue());
            } catch (SocketException e7) {
                throw new ChannelException(e7);
            }
        } else if (pVar != p.x) {
            return super.a(pVar, t);
        } else {
            this.o = t.booleanValue();
        }
        return true;
    }

    @Override // io.netty.channel.y, io.netty.channel.e
    public <T> T b(p<T> pVar) {
        if (pVar == p.C) {
            try {
                return (T) Integer.valueOf(this.n.getReceiveBufferSize());
            } catch (SocketException e) {
                throw new ChannelException(e);
            }
        } else if (pVar == p.B) {
            try {
                return (T) Integer.valueOf(this.n.getSendBufferSize());
            } catch (SocketException e2) {
                throw new ChannelException(e2);
            }
        } else if (pVar == p.G) {
            try {
                return (T) Boolean.valueOf(this.n.getTcpNoDelay());
            } catch (SocketException e3) {
                throw new ChannelException(e3);
            }
        } else if (pVar == p.A) {
            try {
                return (T) Boolean.valueOf(this.n.getKeepAlive());
            } catch (SocketException e4) {
                throw new ChannelException(e4);
            }
        } else if (pVar == p.D) {
            try {
                return (T) Boolean.valueOf(this.n.getReuseAddress());
            } catch (SocketException e5) {
                throw new ChannelException(e5);
            }
        } else if (pVar == p.E) {
            try {
                return (T) Integer.valueOf(this.n.getSoLinger());
            } catch (SocketException e6) {
                throw new ChannelException(e6);
            }
        } else if (pVar != p.F) {
            return pVar == p.x ? (T) Boolean.valueOf(this.o) : (T) super.b(pVar);
        } else {
            try {
                return (T) Integer.valueOf(this.n.getTrafficClass());
            } catch (SocketException e7) {
                throw new ChannelException(e7);
            }
        }
    }

    @Override // io.netty.channel.y
    public e m(k kVar) {
        super.m(kVar);
        return this;
    }

    @Override // io.netty.channel.y
    public e n(boolean z) {
        super.n(z);
        return this;
    }

    @Override // io.netty.channel.y
    public e o(boolean z) {
        super.o(z);
        return this;
    }

    @Override // io.netty.channel.y
    public e p(int i) {
        super.p(i);
        return this;
    }

    @Override // io.netty.channel.y
    @Deprecated
    public e q(int i) {
        super.q(i);
        return this;
    }

    @Override // io.netty.channel.y
    public e r(m0 m0Var) {
        super.r(m0Var);
        return this;
    }

    @Override // io.netty.channel.y
    public e s(p0 p0Var) {
        super.s(p0Var);
        return this;
    }

    @Override // io.netty.channel.y
    public e t(int i) {
        super.t(i);
        return this;
    }

    @Override // io.netty.channel.y
    public e u(int i) {
        super.u(i);
        return this;
    }

    @Override // io.netty.channel.y
    public e v(x0 x0Var) {
        super.v(x0Var);
        return this;
    }

    @Override // io.netty.channel.y
    public e w(int i) {
        super.w(i);
        return this;
    }

    public int y() {
        try {
            return this.n.getSoLinger();
        } catch (SocketException e) {
            throw new ChannelException(e);
        }
    }
}
