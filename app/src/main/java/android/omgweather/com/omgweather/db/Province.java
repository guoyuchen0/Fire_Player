package android.omgweather.com.omgweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/22.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return provinceName;
    }

    public void setProviceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProviceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
