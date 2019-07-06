package example.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 全国所有省市县的数据都是从服务器端获取到的，因此这里和服务器的交互必不可少
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
