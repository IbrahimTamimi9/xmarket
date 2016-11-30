package me.jcala.xmarket.mvp.user.trades.add;

import android.widget.EditText;
import android.widget.TextView;
import java.util.List;


public interface TradeAddPresenter {
    void gainTagList();//获取商品分类列表

    void releaseTrade(List<String> picUrls, EditText titleContent,
                      EditText priceContent,EditText descContent,TextView tag);//调用该方法正式发布商品
}
