/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.gpt.hostdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * MyReceiver
 * 可供测试或相关功能扩展使用
 *
 * @author liuhaitao
 * @since 2017-02-21
 */
public class MyReceiver extends BroadcastReceiver {
    /**
     * DEBUG 开关
     */
    public static final boolean DEBUG = true & MainActivity.DEBUG;

    /**
     * TAG
     */
    public static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        if (DEBUG) {
            Log.d(TAG, "onReceive(Context arg0, Intent arg1): Context=" + arg0.toString()
                    + "\n Intent=" + arg1.toURI());
        }
    }
}


