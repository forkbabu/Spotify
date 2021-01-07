package com.spotify.mobile.android.cosmos.router;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Router;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CosmosRequestQueue {
    protected final ConcurrentLinkedQueue<QueuedRequest> mQueuedRequests = new ConcurrentLinkedQueue<>();

    public static final class QueuedRequest {
        private final ResolveCallback mCallback;
        private final Request mRequest;

        QueuedRequest(Request request, ResolveCallback resolveCallback) {
            this.mRequest = request;
            this.mCallback = resolveCallback;
        }

        public ResolveCallback getCallback() {
            return this.mCallback;
        }

        public Request getRequest() {
            return this.mRequest;
        }
    }

    public final void destroy() {
        this.mQueuedRequests.clear();
    }

    public final Lifetime queue(Request request, ResolveCallback resolveCallback) {
        QueuedRequest queuedRequest = new QueuedRequest(request, resolveCallback);
        this.mQueuedRequests.add(queuedRequest);
        return new a(this, queuedRequest);
    }

    public final void replayRequests(Router router) {
        Iterator<QueuedRequest> it = this.mQueuedRequests.iterator();
        while (it.hasNext()) {
            QueuedRequest next = it.next();
            router.resolve(next.mRequest, next.mCallback);
        }
        this.mQueuedRequests.clear();
    }
}
