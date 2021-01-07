package com.spotify.cosmos.router.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.mobile.android.util.Assertion;

public class CosmosServiceRxRouterClient extends RxRouterClient {
    private final Context mContext;
    private final CosmosServiceIntentBuilder mCosmosServiceIntentBuilder;
    private final ServiceConnection mServiceConnection = new ServiceConnection() {
        /* class com.spotify.cosmos.router.internal.CosmosServiceRxRouterClient.AnonymousClass1 */

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CosmosServiceRxRouterClient.this.notifyOnConnected(new RemoteNativeRxRouter((RemoteNativeRouter) iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            CosmosServiceRxRouterClient.this.notifyOnDisconnected();
        }
    };

    CosmosServiceRxRouterClient(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        this.mContext = context.getApplicationContext();
        this.mCosmosServiceIntentBuilder = cosmosServiceIntentBuilder;
    }

    @Override // com.spotify.cosmos.router.internal.RxRouterClient
    public void connect() {
        super.connect();
        Assertion.k(this.mContext.getApplicationContext().bindService(this.mCosmosServiceIntentBuilder.createCosmosServiceIntent(this.mContext).setAction(Cosmos.ACTION_COSMOS_PROXY), this.mServiceConnection, 1), "Could not bind to the service.", new Object[0]);
    }

    @Override // com.spotify.cosmos.router.internal.RxRouterClient
    public void disconnect() {
        super.disconnect();
        this.mContext.getApplicationContext().unbindService(this.mServiceConnection);
    }
}
