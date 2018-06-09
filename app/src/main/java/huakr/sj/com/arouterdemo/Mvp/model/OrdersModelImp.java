package huakr.sj.com.arouterdemo.Mvp.model;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import huakr.sj.com.arouterdemo.Mvp.contract.OrdersContract;

public class OrdersModelImp implements OrdersContract.Model {

    String TAG="爬取数据";
    @Override
    public void getOrders(OrdersCallback callback) {
        try {
            Document doc = Jsoup.connect("http://www.jcodecraeer.com/plus/list.php?tid=18").get();
            Elements list = doc.select("archive-list");
            for (Element element : list) {
                Log.e(TAG, element.select("a").attr("href")+"" );
                Log.e(TAG, element.select("img  ").attr("src")+"" );            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
